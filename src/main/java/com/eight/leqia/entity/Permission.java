package com.eight.leqia.entity;

public class Permission {
    private Integer pId;
    private String pName;
    private String pUrl;
    private Integer pStatu;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpUrl() {
        return pUrl;
    }

    public void setpUrl(String pUrl) {
        this.pUrl = pUrl;
    }

    public Integer getpStatu() {
        return pStatu;
    }

    public void setpStatu(Integer pStatu) {
        this.pStatu = pStatu;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pUrl='" + pUrl + '\'' +
                ", pStatu=" + pStatu +
                '}';
    }
}
