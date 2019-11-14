package com.eight.leqia.entity;

public class Foods {
    private Integer FId;
    private String FName;
    private String FUrl;
    private Double FPrice;
    private String FDesc;
    private Double FEvaluation;
    private Integer FStatu;
    private Integer FInventory;
    private Integer FtId;
    private int goodsid;
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(int goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getFId() {
        return FId;
    }

    public void setFId(Integer FId) {
        this.FId = FId;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getFUrl() {
        return FUrl;
    }

    public void setFUrl(String FUrl) {
        this.FUrl = FUrl;
    }

    public Double getFPrice() {
        return FPrice;
    }

    public void setFPrice(Double FPrice) {
        this.FPrice = FPrice;
    }

    public String getFDesc() {
        return FDesc;
    }

    public void setFDesc(String FDesc) {
        this.FDesc = FDesc;
    }

    public Double getFEvaluation() {
        return FEvaluation;
    }

    public void setFEvaluation(Double FEvaluation) {
        this.FEvaluation = FEvaluation;
    }

    public Integer getFStatu() {
        return FStatu;
    }

    public void setFStatu(Integer FStatu) {
        this.FStatu = FStatu;
    }

    public Integer getFInventory() {
        return FInventory;
    }

    public void setFInventory(Integer FInventory) {
        this.FInventory = FInventory;
    }

    public Integer getFtId() {
        return FtId;
    }

    public void setFtId(Integer ftId) {
        FtId = ftId;
    }
}
