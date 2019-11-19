package com.eight.leqia.service;



import com.eight.leqia.entity.FoodTypeVo;
import com.eight.leqia.entity.Foods;

import java.util.List;

public interface FoodServiceT {
    List<FoodTypeVo> findAll();
    //根据分类id查询商品
    List<Foods> selAllByFl(int FtId);
    //根据商品id查询商品
    FoodTypeVo selFoodsById(String goodsId);
    //根据商品名字模糊查询
    List<Foods> selAllByName(String   name);
}
