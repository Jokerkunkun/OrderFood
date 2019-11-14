package com.eight.leqia.entity;

public class Evaluate {
    private Integer evid;
    private String evcontent;
    private Integer CId;
    private Integer OId;
    private Integer deleteStatus;

    public Integer getEvid() {
        return evid;
    }

    public void setEvid(Integer evid) {
        this.evid = evid;
    }

    public String getEvcontent() {
        return evcontent;
    }

    public void setEvcontent(String evcontent) {
        this.evcontent = evcontent;
    }

    public Integer getCId() {
        return CId;
    }

    public void setCId(Integer CId) {
        this.CId = CId;
    }

    public Integer getOId() {
        return OId;
    }

    public void setOId(Integer OId) {
        this.OId = OId;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }
}
