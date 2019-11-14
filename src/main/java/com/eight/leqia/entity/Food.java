package com.eight.leqia.entity;

/**
 * 菜品表
 */
public class Food {
    private Integer FId;
    private String FName;
    private String FUrl;
    private Double FPrice;
    private String FDesc;
    private Double FEvaluation;
    private Integer FStatu;
    private Integer FInventory;
    private Integer FtId;
    private String FtName;
    private Integer FdtId;
    private String FdtName;
    private String FoodMain;
    private Integer Count;


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

    public String getFtName() {
        return FtName;
    }

    public void setFtName(String ftName) {
        FtName = ftName;
    }

    public Integer getFdtId() {
        return FdtId;
    }

    public void setFdtId(Integer fdtId) {
        FdtId = fdtId;
    }

    public String getFdtName() {
        return FdtName;
    }

    public void setFdtName(String fdtName) {
        FdtName = fdtName;
    }

    public String getFoodMain() {
        return FoodMain;
    }

    public void setFoodMain(String foodMain) {
        FoodMain = foodMain;
    }

    public Integer getCount() {
        return Count;
    }

    public void setCount(Integer count) {
        Count = count;
    }

    @Override
    public String toString() {
        return "Food{" +
                "FId=" + FId +
                ", FName='" + FName + '\'' +
                ", FUrl='" + FUrl + '\'' +
                ", FPrice=" + FPrice +
                ", FDesc='" + FDesc + '\'' +
                ", FEvaluation=" + FEvaluation +
                ", FStatu=" + FStatu +
                ", FInventory=" + FInventory +
                ", FtId=" + FtId +
                ", FtName='" + FtName + '\'' +
                ", FdtId=" + FdtId +
                ", FdtName='" + FdtName + '\'' +
                ", FoodMain='" + FoodMain + '\'' +
                ", Count=" + Count +
                '}';
    }
}
