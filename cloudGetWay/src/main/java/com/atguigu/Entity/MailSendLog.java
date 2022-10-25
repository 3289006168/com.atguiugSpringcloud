package com.atguigu.Entity;


public class MailSendLog {

  private String msgId;
  private long empId;
  private long status;
  private String routeKey;
  private String exchange;
  private long count;
  private java.sql.Date tryTime;
  private java.sql.Date createTime;
  private java.sql.Date updateTime;


  public String getMsgId() {
    return msgId;
  }

  public void setMsgId(String msgId) {
    this.msgId = msgId;
  }


  public long getEmpId() {
    return empId;
  }

  public void setEmpId(long empId) {
    this.empId = empId;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public String getRouteKey() {
    return routeKey;
  }

  public void setRouteKey(String routeKey) {
    this.routeKey = routeKey;
  }


  public String getExchange() {
    return exchange;
  }

  public void setExchange(String exchange) {
    this.exchange = exchange;
  }


  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }


  public java.sql.Date getTryTime() {
    return tryTime;
  }

  public void setTryTime(java.sql.Date tryTime) {
    this.tryTime = tryTime;
  }


  public java.sql.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Date createTime) {
    this.createTime = createTime;
  }


  public java.sql.Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Date updateTime) {
    this.updateTime = updateTime;
  }

}
