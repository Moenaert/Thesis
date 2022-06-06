# Real-time event streaming template project

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Docker-compose](#docker-compose)
* [Setup](#setup)

## General info
This project serves as a proof of concept and can be used as a template project to demonstrate how to implement real-time event streaming with Kafka as a pub/sub messaging system. This project can be used to set up a Kafka cluster locally on your machine using Docker Compose. This project also includes a schema registry for producing and consuming Avro messages. The project also includes a number of extra services, such as administration and monitoring tools, to assist you in managing your cluster. To demonstrate the capabilities of real-time data streaming, we created a client application that uses the Kafka Streams API to perform simple aggregations on an incoming event stream in order to compute KPIs. The KPIs are calculated for each topic and sent to new topics with varying window sizes. The values from these KPI topics will then be plotted in a real-time graph by another client applicaiton.
	
## Technologies
This project is build with:
* Docker 4.5.1
* Apache Maven 3.8.4

And makes use of the following technologies:
* Kafka 2.0
* Kafka Streams API
* Avro
* Spring framework

## Docker-compose
You can pull the images from my docker hub repository (https://hub.docker.com/repository/docker/gilles98/thesis) to run a Kafka cluster with schema registry locally on your machine for fast prototyping or testing functionalities. The recommended way of doing this is by using docker-compose to create a closed network and expose ports to services inside the network. The cluster can be configured to your needs by editing the configuration files yourself or by setting the environment variables in the docker-compose YAML file (recommended way  for set up as it allows for trying out different configurations faster then editing the config files yourself). You can use `docker-compose.yml` as starting point. Besides running a Kafka cluster this repository also includes images for services that allow for easy administration (cluster view, topic creation, partition distribution,... ) and monitoring (prometheus + grafana) of your Kafka cluster. 

### Overview
#### Zookeeper
Apache ZooKeeper provides an open source distributed configuration service, synchronization service, and naming registry for large distributed systems. In Kafka world we use zookeeper to manage our kafka brokers to behave as a coherent cluster.
#### Kafka (with prometheus-jmx exporter included)
Kafka is a distributed streaming platform designed to build real-time pipelines and can be used as a message broker or as a replacement for a log aggregation solution for big data applications. The image also includes the prometheus jmx-exporter wich exposes the internal Kafka metrics to an http endpoint.
#### Schema-registry
Schema Registry provides a centralized repository for schemas and metadata, allowing services to flexibly interact and exchange data with each other without the challenge of managing and sharing schemas between them. Schema Registry has support for multiple underlying schema representations (Avro, JSON, etc.)
#### Zoonavigator
ZooNavigator is a web-based ZooKeeper UI and editor/browser with many features.
#### Kafka-mangager
Kafka Manager is a tool for managing Apache Kafka clusters and allows for easy inspection of cluster state (topics, consumers, offsets, brokers, replica distribution, partition distribution).
#### Kafka-monitor
Kafka-monitor is a framework to implement and execute kafka system tests in a cluster. It allows you to monitor your Kafka cluster using end-to-end pipelines to obtain a number of derived vital stats such as end-to-end latency, Service availability, Kafka message loss rate and many more.
#### Prometheus
Prometheus is a time-series database that can collect metrics from configured targets at given intervals. In this project we use the kafka-prometheus-jmx-exporter to expose internal kafka metrics of a broker to be scraped by Prometheus.
#### Grafana
Grafana allows you to query, visualize, alert on and understand your metrics no matter where they are stored. Create, explore, and share dashboards with your team and foster a data-driven culture.
Repository image comes with a prebuild grafana dashboard for most important metrics.
#### Lenses.io
Lenses lets you operate data in your Apache Kafka in seconds, through safe self-service access. Explore metadata live in the stream, protect it with policies, then move and transform it with SQL - wherever your streams live.
## Setup
To launch this project, run this docker-compose command:

```
$ docker-compose -f .\docker-compose.yml up
```

With this set up you can focus on building your own client applications that produces to and consumes from a kafka cluster with administration and monitoring tools at your disposal.
