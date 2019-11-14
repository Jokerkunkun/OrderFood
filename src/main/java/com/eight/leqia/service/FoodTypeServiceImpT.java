package com.eight.leqia.service;

import com.eight.leqia.entity.FoodType;
import com.eight.leqia.mapper.FoodTypeMapperT;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class FoodTypeServiceImpT implements FoodTypeServiceT {

    @Resource
    private FoodTypeMapperT foodTypeMapperT;
    @Override
    public List<FoodType> selAllType() {
        return foodTypeMapperT.selAllType();
    }
}
