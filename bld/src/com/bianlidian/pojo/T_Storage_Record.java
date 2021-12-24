package com.bianlidian.pojo;


public class T_Storage_Record {

  private long id;
  private String srcode;
  private String goodsname;
  private String goodsdesc;
  private String goodsunit;
  private double goodscount;
  private double totalamount;
  private long paystatus;
  private long createduserid;
  private java.sql.Timestamp createdtime;
  private long updateduserid;
  private java.sql.Timestamp updatedtime;
  private long supplierid;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getSrcode() {
    return srcode;
  }

  public void setSrcode(String srcode) {
    this.srcode = srcode;
  }


  public String getGoodsname() {
    return goodsname;
  }

  public void setGoodsname(String goodsname) {
    this.goodsname = goodsname;
  }


  public String getGoodsdesc() {
    return goodsdesc;
  }

  public void setGoodsdesc(String goodsdesc) {
    this.goodsdesc = goodsdesc;
  }


  public String getGoodsunit() {
    return goodsunit;
  }

  public void setGoodsunit(String goodsunit) {
    this.goodsunit = goodsunit;
  }


  public double getGoodscount() {
    return goodscount;
  }

  public void setGoodscount(double goodscount) {
    this.goodscount = goodscount;
  }


  public double getTotalamount() {
    return totalamount;
  }

  public void setTotalamount(double totalamount) {
    this.totalamount = totalamount;
  }


  public long getPaystatus() {
    return paystatus;
  }

  public void setPaystatus(long paystatus) {
    this.paystatus = paystatus;
  }


  public long getCreateduserid() {
    return createduserid;
  }

  public void setCreateduserid(long createduserid) {
    this.createduserid = createduserid;
  }


  public java.sql.Timestamp getCreatedtime() {
    return createdtime;
  }

  public void setCreatedtime(java.sql.Timestamp createdtime) {
    this.createdtime = createdtime;
  }


  public long getUpdateduserid() {
    return updateduserid;
  }

  public void setUpdateduserid(long updateduserid) {
    this.updateduserid = updateduserid;
  }


  public java.sql.Timestamp getUpdatedtime() {
    return updatedtime;
  }

  public void setUpdatedtime(java.sql.Timestamp updatedtime) {
    this.updatedtime = updatedtime;
  }


  public long getSupplierid() {
    return supplierid;
  }

  public void setSupplierid(long supplierid) {
    this.supplierid = supplierid;
  }

}
