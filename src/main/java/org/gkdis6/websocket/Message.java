package org.gkdis6.websocket;

public class Message {
    private String sender;
    private String content;

    // 기본 생성자
    public Message() {}

    // 생성자
    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    // Getters and Setters
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}