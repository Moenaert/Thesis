package com.thesis.avroConsumer;


public class Message {

    private Long endWindow;
    private Long value;

    public Message() {
    }

    public Message(Long endWindow, Long value) {
        this.endWindow = endWindow;
        this.value = value;
    }

    public Long getEndWindow() {
        return endWindow;
    }

    public void setEndWindow(Long endWindow) {
        this.endWindow = endWindow;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }
}
