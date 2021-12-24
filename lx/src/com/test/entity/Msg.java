package com.test.entity;


public class Msg {

  private long msgid;
  private String username;
  private String title;
  private String msgcontent;
  private long state;
  private String sendto;
  private java.sql.Timestamp msg_Create_Date;


  public long getMsgid() {
    return msgid;
  }

  public void setMsgid(long msgid) {
    this.msgid = msgid;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getMsgcontent() {
    return msgcontent;
  }

  public void setMsgcontent(String msgcontent) {
    this.msgcontent = msgcontent;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }


  public String getSendto() {
    return sendto;
  }

  public void setSendto(String sendto) {
    this.sendto = sendto;
  }


  public java.sql.Timestamp getMsg_Create_Date() {
    return msg_Create_Date;
  }

  public void setMsg_Create_Date(java.sql.Timestamp msg_Create_Date) {
    this.msg_Create_Date = msg_Create_Date;
  }

}
