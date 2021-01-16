package com.kkaj.chatapplication.entities;

public class ChatMessagePojo {

    private MessageType type;
    private String content;
    private String sender;


    public ChatMessagePojo() {
    }

    public ChatMessagePojo(MessageType type, String content, String sender) {
        this.type = type;
        this.content = content;
        this.sender = sender;
    }

    public ChatMessagePojo(String content, String sender) {
        this.content = content;
        this.sender = sender;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
