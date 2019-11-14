package com.eight.leqia.entity;

/**
 * 配料表
 */
public class Ingredient {

    private int Ingid;
    private String Ingurl;
    private String IngName;
    private double Ingprice;
    private int FdtId;
    private String IngDesc;
    private String FdtName;

    public int getIngid() {
        return Ingid;
    }

    public void setIngid(int ingid) {
        Ingid = ingid;
    }

    public String getIngurl() {
        return Ingurl;
    }

    public void setIngurl(String ingurl) {
        Ingurl = ingurl;
    }

    public String getIngName() {
        return IngName;
    }

    public void setIngName(String ingName) {
        IngName = ingName;
    }

    public double getIngprice() {
        return Ingprice;
    }

    public void setIngprice(double ingprice) {
        Ingprice = ingprice;
    }

    public int getFdtId() {
        return FdtId;
    }

    public void setFdtId(int fdtId) {
        FdtId = fdtId;
    }

    public String getIngDesc() {
        return IngDesc;
    }

    public void setIngDesc(String ingDesc) {
        IngDesc = ingDesc;
    }

    public String getFdtName() {
        return FdtName;
    }

    public void setFdtName(String fdtName) {
        FdtName = fdtName;
    }
}
