package com.eight.leqia.mapper;

import com.eight.leqia.entity.Ingredient;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IngredientMapper {
    //查询配料
     List<Ingredient> findAllig();

    /**
     * 模糊查询配料
     * @param IngName
     * @return
     */
     List<Ingredient> findNameAll(String IngName);

    //根据配料的id查询单个
    Ingredient findbyid(Integer Ingid);
    //添加配料
     int add(Ingredient ingredient);
    //根据id删除配料
     int delete(Integer Ingid);
    //修改配料
    int update(Ingredient ingredient);

    int updateimg(Ingredient ingredient);

}
