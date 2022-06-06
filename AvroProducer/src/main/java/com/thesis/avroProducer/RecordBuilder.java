package com.thesis.avroProducer;

import org.apache.avro.generic.GenericRecord;
import avro_generated_types.*;

public class RecordBuilder {

    public GenericRecord build_bid(GenericRecord record){
        Bid bid = new Bid();

        bid.setId((CharSequence) record.get("id"));

        boolean x = (boolean) record.get("__deleted");
        if(x){
            bid.setAccountId("x");
            bid.setDeleted$1(true);
            bid.setRefused(false);
            bid.setTimestamp(0L);
            bid.setAmount("x");
            bid.setPropertyId("x");
        }
        else{
            bid.setAccountId((CharSequence) record.get("accountId"));
            bid.setDeleted$1(false);
            bid.setRefused((Boolean) record.get("refused"));
            bid.setTimestamp((Long) record.get("event_ts"));
            bid.setAmount((CharSequence) record.get("amount"));
            bid.setPropertyId((CharSequence) record.get("propertyId"));
        }
        return bid;
    }

    public Account build_account(GenericRecord record){
        Account account = new Account();
        account.setId((CharSequence) record.get("id"));
        account.setActive((Boolean) record.get("active"));
        account.setDeleted$1((Boolean) record.get("__deleted"));
        account.setTimestamp((Long) record.get("event_ts"));

        GenericRecord x = (GenericRecord) record.get("profile");
        if(x!= null){
            account.setLanguage((CharSequence) x.get("language"));
            x = (GenericRecord) x.get("notificationPreferences");
            if(x != null){
                account.setEmailEnabled((Boolean) x.get("emailEnabled"));
            }
        }

        return account;
    }

    public View build_view(GenericRecord record){
        View view = new View();
        GenericRecord rec = (GenericRecord) record.get("property");

        if(rec != null){
            view.setPropertyId((CharSequence) rec.get("propertyId"));
            view.setNumberOfViews((Long) rec.get("numberOfViews"));
        }
        view.setTimestamp((Long) record.get("event_ts"));
        return view;
    }
}
