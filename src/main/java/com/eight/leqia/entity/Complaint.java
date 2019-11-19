package com.eight.leqia.entity;

public class Complaint {
    private int cpId;
    private String cpContent;
    private int AdId;
    private int cId;
    private String AUserName;
    private String UserName;

    public String getAUserName() {
        return AUserName;
    }

    public void setAUserName(String AUserName) {
        this.AUserName = AUserName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getCpId() {
        return cpId;
    }

    public void setCpId(int cpId) {
        this.cpId = cpId;
    }

    public String getCpContent() {
        return cpContent;
    }

    public void setCpContent(String cpContent) {
        this.cpContent = cpContent;
    }

    public int getAdId() {
        return AdId;
    }

    public void setAdId(int adId) {
        AdId = adId;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }
}
