package com.eight.leqia.entity;

/**
 * 口味表
 */
public class FdTaste {
    private Integer FdtId;
    private String FdtName;
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
}
