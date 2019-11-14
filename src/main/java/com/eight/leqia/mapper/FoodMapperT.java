package com.eight.leqia.mapper;

import com.eight.leqia.entity.FoodTypeVo;

import com.eight.leqia.entity.Foods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodMapperT {
    List<FoodTypeVo> findAll();
    //根据分类id查询商品
    List<Foods> selAllByFl(int FtId);
    //根据商品id查询商品
    FoodTypeVo selFoodsById(String goodsId);
}
