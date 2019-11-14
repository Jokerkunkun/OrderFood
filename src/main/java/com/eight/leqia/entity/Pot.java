package com.eight.leqia.entity;

public class Pot {
    private Integer PId;
    private String PUrl;
    private String PName;

    public Integer getPId() {
        return PId;
    }

    public void setPId(Integer PId) {
        this.PId = PId;
    }

    public String getPUrl() {
        return PUrl;
    }

    public void setPUrl(String PUrl) {
        this.PUrl = PUrl;
    }

    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    @Override
    public String toString() {
        return "Boiler{" +
                "PId=" + PId +
                ", PUrl='" + PUrl + '\'' +
                ", PName='" + PName + '\'' +
                '}';
    }
}
