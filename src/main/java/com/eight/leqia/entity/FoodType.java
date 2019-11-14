package com.eight.leqia.entity;

import java.util.List;

/**
 * 分类表
 */
public class FoodType {
    private Integer FtId;
    private String FtName;
    private List<Foods> foods;
    private Integer Count;
    private Integer deleteStatus;


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

    public List<Foods> getFoods() {
        return foods;
    }

    public void setFoods(List<Foods> foods) {
        this.foods = foods;
    }

}
