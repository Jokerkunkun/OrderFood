package com.eight.leqia.mapper;


import com.eight.leqia.entity.Food;
import com.eight.leqia.entity.FoodType;
import org.apache.ibatis.annotations.Mapper;



import java.util.List;

@Mapper
public interface FoodMapper {
    /**
     * 查询菜品
     * @return
     */
    List<Food> findall();

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
     * 添加菜品
     * @param food
     * @return
     */
    int add(Food food);

    /**
     * 删除菜品
     * @param fid
     * @return
     */
    int delete(Integer fid);

    /**
     * 修改菜品
     * @param food
     * @return
     */
    int update(Food food);

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
