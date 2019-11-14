package com.eight.leqia.service;

import com.eight.leqia.entity.FoodType;


import java.util.List;

public interface FoodTypeService {
    /**
     * 查询所有分类
     * @return
     */
    List<FoodType> findall();

    /**
     * 查询需要修改的分类
     * @param FtId
     * @return
     */
    FoodType updateFind(Integer FtId);

    /**
     * 模糊查询分类
     * @param FtName
     * @return
     */
    List<FoodType> findNameAll(String FtName);

    FoodType findSole(String FtName);

    /**
     * 修改分类
     * @param foodType
     * @return
     */
    int update(FoodType foodType);

    /**
     * 删除所选分类
     * @param FtId
     * @return
     */
    int delete(Integer FtId);

    /**
     * 新增分类
     * @param foodType
     * @return
     */
    int add(FoodType foodType);

    /**
     * 查询总条数
     * @return
     */
    FoodType findCount();

    int deleteS(Integer FtId);

    List<FoodType> findFtId(Integer FtId);
}
