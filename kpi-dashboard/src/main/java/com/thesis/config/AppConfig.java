package com.thesis.config;

public class AppConfig {

    public final static String bootstrapServers = "kafka-1:9091";
    public final static String schemaRegistryServers = "http://schema-registry:8081";
    public final static int window_1_duration_ms = 1000*60*15;
    public final static int window_2_duration_ms = 1000*60*60;
    public final static int window_3_duration_ms = 1000*60*60*24;
    public final static String bids_window_1_topic = "bids_window_1_topic";
    public final static String bids_window_2_topic = "bids_window_2_topic";
    public final static String bids_window_3_topic = "bids_window_3_topic";
    public final static String accounts_window_1_topic = "accounts_window_1_topic";
    public final static String accounts_window_2_topic = "accounts_window_2_topic";
    public final static String accounts_window_3_topic = "accounts_window_3_topic";
    public final static String views_window_1_topic = "views_window_1_topic";
    public final static String views_window_2_topic = "views_window_2_topic";
    public final static String views_window_3_topic = "views_window_3_topic";
}
