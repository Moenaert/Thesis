def query_table_ordered(project, dataset, table, suffix):
    from google.cloud import bigquery
    client = bigquery.Client()
    table_id_org = "{}.{}.{}".format(project, dataset, table)
    table_id_dest = "{}.{}.{}".format(project, dataset, table+suffix)
    print(table_id_org)
    print(table_id_dest)

    # table_id = "your-project.your_dataset.your_table_name"
    job_config = bigquery.QueryJobConfig(destination=table_id_dest)

    sql = """
        WITH basis_event_ts AS (
            SELECT *, COALESCE(TIMESTAMP_ADD(_src.ts_ms, INTERVAL _src.ord MICROSECOND), _src.ts) as event_ts
            FROM `{}.{}.{}`
        ) SELECT * from basis_event_ts ORDER BY event_ts ASC
    """.format(project, dataset, table)

    # Start the query, passing in the extra configuration.
    query_job = client.query(sql, job_config=job_config)  # Make an API request.
    query_job.result()  # Wait for the job to complete.

def delete_table(project, dataset, table):
    from google.cloud import bigquery
    client = bigquery.Client()
    # table_id = 'your-project.your_dataset.your_table'

    # If the table does not exist, delete_table raises
    # google.api_core.exceptions.NotFound unless not_found_ok is True.
    client.delete_table(table_id, not_found_ok=True)  # Make an API request.
    print("Deleted table '{}'.".format(table_id))

def export_table_to_avro(project, dataset, table, bucket_name, bucket_folder, bucket_file):
    from google.cloud import bigquery

    client = bigquery.Client()

    print(project)
    destination_uri = 'gs://{}/{}/{}'.format(bucket_name, bucket_folder,bucket_file +  ".avro")
    print(destination_uri)
    dataset_ref = bigquery.DatasetReference(project, dataset)
    print(dataset_ref)
    print(dataset_ref.project)
    table_ref = dataset_ref.table(table)
    print(table_ref)



    job_config = bigquery.job.ExtractJobConfig()
    job_config.destination_format = bigquery.DestinationFormat.AVRO

    extract_job = client.extract_table(
        table_ref,
        destination_uri,
        job_config=job_config,
        location="EU",
    )
    extract_job.result()

    print(
        "Exported {}:{}.{} to {}".format(project, dataset, table, destination_uri)
    )

def export_tables_to_avro(project, dataset, bucket_name, bucket_folder):
    import re
    from google.cloud import bigquery
    client = bigquery.Client()
    tables = client.list_tables("{}.{}".format(project, dataset))
    print("Tables contained in {}.{}".format(project, dataset))
    for table in tables:
        print(table)
        fullTableName = table.project + "." + table.dataset_id + "." + table.table_id
        if (m := re.match('(.*)(?<!_v)(?<!_cv)$', fullTableName)):
            print(table)
            suffix = "_temp"
            query_table_ordered(project, dataset, table.table_id, suffix)
            export_table_to_avro(project, dataset, table.table_id + suffix, bucket_name, bucket_folder, table.table_id + "_ordered" )
            delete_table(project, dataset, table.table_id + suffix)

if __name__ == "__main__":
    export_tables_to_avro("fednot-acc-datalake", "land_biddit_red", "datalake_consumers_mp", "acc")