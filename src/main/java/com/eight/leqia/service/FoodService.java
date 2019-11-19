package com.eight.leqia.service;

import com.eight.leqia.entity.Food;
import com.eight.leqia.entity.FoodType;

import java.util.List;

public interface FoodService {
    /**
     * 查询菜品
     * @return
     */
    List<Food> findall();

    Food findbyname(String FName);

    /**
     * 根据菜的id查询单个
     * @param fid
     * @return
     */
    Food findbyid(Integer fid);

    /**
     * 模糊查询菜品
     * @param FName
     * @return
     */
    List<Food> findNameAll(String FName);

    /**
     * 添加菜
     * @param food
     * @return
     */
    int add(Food food);

    /**
     * 根据id删除菜品
     * @param fid
     * @return
     */
    int delete(Integer fid);

    /**
     * 修改菜品，可修改 名称，价格评分，所属类别
     * @param Food
     * @return
     */
    int update(Food Food);

    /**
     * 下架
     * @param FId
     * @return
     */
    int updateStatusForbidden(Integer FId);

    /**
     * 上架
     * @param FId
     * @return
     */
    int updateStatusStart(Integer FId);

    /**
     * 查询总条数
     * @return
     */
    Food findCount();

    /**
     * 查询最新一个菜品
     * @return
     */
    List<Food> findFoodNew();

    List<Food> findFtId(Integer FtId);

}
