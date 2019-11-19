package com.eight.leqia.service;


import com.eight.leqia.entity.FoodTypeVo;
import com.eight.leqia.entity.Foods;
import com.eight.leqia.mapper.FoodMapperT;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class FoodServiceImpT implements FoodServiceT {
    @Resource
   private FoodMapperT foodMapperT;
    @Override
    public List<FoodTypeVo> findAll() {
        return foodMapperT.findAll();
    }

    @Override
    public List<Foods> selAllByFl(int FtId) {
        return foodMapperT.selAllByFl(FtId);
    }

    @Override
    public FoodTypeVo selFoodsById(String goodsId) {
        return foodMapperT.selFoodsById(goodsId);
    }

    @Override
    public List<Foods> selAllByName(String name) {
        return foodMapperT.selAllByName(name);
    }
}
