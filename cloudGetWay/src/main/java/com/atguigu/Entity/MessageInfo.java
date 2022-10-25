package com.atguigu.Entity;


public class MessageInfo {

  private long messageId;
  private String messageContent;
  private java.sql.Timestamp messageTime;
  private String messageName;
  private String messageMark;


  public long getMessageId() {
    return messageId;
  }

  public void setMessageId(long messageId) {
    this.messageId = messageId;
  }


  public String getMessageContent() {
    return messageContent;
  }

  public void setMessageContent(String messageContent) {
    this.messageContent = messageContent;
  }


  public java.sql.Timestamp getMessageTime() {
    return messageTime;
  }

  public void setMessageTime(java.sql.Timestamp messageTime) {
    this.messageTime = messageTime;
  }


  public String getMessageName() {
    return messageName;
  }

  public void setMessageName(String messageName) {
    this.messageName = messageName;
  }


  public String getMessageMark() {
    return messageMark;
  }

  public void setMessageMark(String messageMark) {
    this.messageMark = messageMark;
  }

}
