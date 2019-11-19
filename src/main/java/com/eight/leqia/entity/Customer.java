package com.eight.leqia.entity;

import java.util.Date;

/**
 * 顾客表
 */
public class Customer {
    private Integer CId;
    private String CMobile;
    private String UserName;
    private String CSex;
    private Date birthday;
    private String icardId;
    private String CPassword;
    private Integer viplevel;
    private Double balance;
    private String HeadPortrait;
    private Integer CStatus;
    private Date registration;
    private Integer Count;
    private Integer deleteStatus;
    private String openid;
    private Integer age;
    private String paymentcode;

    public String getPaymentcode() {
        return paymentcode;
    }

    public void setPaymentcode(String paymentcode) {
        this.paymentcode = paymentcode;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer getCount() {
        return Count;
    }

    public void setCount(Integer count) {
        Count = count;
    }

    public Integer getCId() {
        return CId;
    }

    public void setCId(Integer CId) {
        this.CId = CId;
    }

    public String getCMobile() {
        return CMobile;
    }

    public void setCMobile(String CMobile) {
        this.CMobile = CMobile;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getCSex() {
        return CSex;
    }

    public void setCSex(String CSex) {
        this.CSex = CSex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIcardId() {
        return icardId;
    }

    public void setIcardId(String icardId) {
        this.icardId = icardId;
    }

    public String getCPassword() {
        return CPassword;
    }

    public void setCPassword(String CPassword) {
        this.CPassword = CPassword;
    }

    public Integer getViplevel() {
        return viplevel;
    }

    public void setViplevel(Integer viplevel) {
        this.viplevel = viplevel;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getHeadPortrait() {
        return HeadPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        HeadPortrait = headPortrait;
    }

    public Integer getCStatus() {
        return CStatus;
    }

    public void setCStatus(Integer CStatus) {
        this.CStatus = CStatus;
    }

    public Date getRegistration() {
        return registration;
    }

    public void setRegistration(Date registration) {
        this.registration = registration;
    }
}
