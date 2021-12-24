package com.news.entity;


public class Newsuser {

  private long uid;
  private String username;

  public Newsuser(String username, String upwd) {
    this.username = username;
    this.upwd = upwd;
  }

  private String upwd;


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getUpwd() {
    return upwd;
  }

  public void setUpwd(String upwd) {
    this.upwd = upwd;
  }

}
