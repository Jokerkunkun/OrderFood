package com.eight.leqia.entity;

import java.util.Date;

/**
 * 管理员表
 */
public class Admin {
    private Integer AdId;
    private String AUserName;
    private String APassword;
    private String NewPassword;
    private Integer ALevel;
    private Integer AStatus;
    private Date registration;
    private Integer Count;
    private Integer deleteStatus;


    public Integer getCount() {
        return Count;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer elegetCount() {
        return Count;
    }

    public void setCount(Integer count) {
        Count = count;
    }

    public Integer getAdId() {
        return AdId;
    }

    public void setAdId(Integer adId) {
        AdId = adId;
    }

    public String getAUserName() {
        return AUserName;
    }

    public void setAUserName(String AUserName) {
        this.AUserName = AUserName;
    }

    public String getAPassword() {
        return APassword;
    }

    public void setAPassword(String APassword) {
        this.APassword = APassword;
    }

    public String getNewPassword() {
        return NewPassword;
    }

    public void setNewPassword(String newPassword) {
        NewPassword = newPassword;
    }

    public Integer getALevel() {
        return ALevel;
    }

    public void setALevel(Integer ALevel) {
        this.ALevel = ALevel;
    }

    public Integer getAStatus() {
        return AStatus;
    }

    public void setAStatus(Integer AStatus) {
        this.AStatus = AStatus;
    }

    public Date getRegistration() {
        return registration;
    }

    public void setRegistration(Date registration) {
        this.registration = registration;
    }
}
