package com.eight.leqia.service;

import com.eight.leqia.entity.FdTaste;

import java.util.List;

public interface IFdTasteService {
    /**
     * 查询所有口味
     * @return
     */
    List<FdTaste> findAll();

    FdTaste findbyname(String FdtName);

    /**
     * 模糊查询口味
     * @param FdtName
     * @return
     */
    List<FdTaste> findNameAll(String FdtName);

    int addFdTaste(FdTaste fdTaste);
    int deleteFdTaste(Integer FdtId);
    int updateFdTaste(FdTaste fdTaste);
    FdTaste findbyid(Integer FdtId);

    /**
     * 查询总条数
     * @return
     */
    FdTaste findCount();

    /**
     * 删除口味
     * @param FdtId
     * @return
     */
    int deleteS(Integer FdtId);
}
