package com.example.gymstyem.entity;

public class Gym_card {
  private Long id;
  private String user_name;
  private Long card_type_id;
  private Long status;
  private String phone;
  private String balance;
  private java.sql.Date open_date;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUser_name() {
    return user_name;
  }

  public void setUser_name(String user_name) {
    this.user_name = user_name;
  }

  public Long getCard_type_id() {
    return card_type_id;
  }

  public void setCard_type_id(Long card_type_id) {
    this.card_type_id = card_type_id;
  }

  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public java.sql.Date getOpen_date() {
    return open_date;
  }

  public void setOpen_date(java.sql.Date open_date) {
    this.open_date = open_date;
  }
}
