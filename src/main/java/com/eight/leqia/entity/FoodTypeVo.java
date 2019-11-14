package com.eight.leqia.entity;

public class FoodTypeVo {
    private Integer FId;
    private String FName;
    private String FUrl;
    private Double FPrice;
    private String FDesc;
    private Double FEvaluation;
    private Integer FStatu;
    private Integer FInventory;
    private int FdtId;
    private String FoodMain;
    private String FoodCooking;
    private String FtName;
    private String FdtName;
    private Integer FtId;
    private int goodsNum;

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public int getFdtId() {
        return FdtId;
    }

    public void setFdtId(int fdtId) {
        FdtId = fdtId;
    }

    public String getFoodMain() {
        return FoodMain;
    }

    public void setFoodMain(String foodMain) {
        FoodMain = foodMain;
    }

    public String getFoodCooking() {
        return FoodCooking;
    }

    public void setFoodCooking(String foodCooking) {
        FoodCooking = foodCooking;
    }

    public String getFdtName() {
        return FdtName;
    }

    public void setFdtName(String fdtName) {
        FdtName = fdtName;
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

    public Integer getFtId() {
        return FtId;
    }

    public void setFtId(Integer ftId) {
        FtId = ftId;
    }

    public String getFtName() {
        return FtName;
    }

    public void setFtName(String ftName) {
        FtName = ftName;
    }
}
