package com.eight.leqia.mapper;

import com.eight.leqia.entity.FoodType;
import com.eight.leqia.entity.FoodTypeVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodTypeMapperT {
    List<FoodType> selAllType();
}
