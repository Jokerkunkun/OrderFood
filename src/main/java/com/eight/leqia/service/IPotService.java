package com.eight.leqia.service;

import com.eight.leqia.entity.Pot;

import java.util.List;

public interface IPotService {

    /**
     * 查询所有餐具
     * @return
     */
    List<Pot> findAll();

    /**
     * 模糊查询餐具
     * @return
     */
    List<Pot> findNameAll(String PName);

    /**
     * 查询需要修改的餐具
     * @param PId
     * @return
     */
    Pot updateFind(Integer PId);

    /**
     * 新增锅具
     * @param pot
     * @return
     */
    int add(Pot pot);

    /**
     * 修改锅具
     * @param pot
     * @return
     */
    int update(Pot pot);

    /**
     * 删除锅具
     * @param PId
     * @return
     */
    int delete(Integer PId);
}
