package com.eight.leqia.controller;

import com.eight.leqia.entity.FoodTypeVo;
import com.eight.leqia.entity.Foods;
import com.eight.leqia.service.FoodServiceT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("qt")
public class FoodControllerT {

    @Autowired
    private FoodServiceT foodService;
    @ResponseBody
    @RequestMapping("list")
    public List<FoodTypeVo> selAll(){

        return foodService.findAll();
    }


    @ResponseBody
    @RequestMapping("selById")
    public FoodTypeVo selById(String goodsId){

        return foodService.selFoodsById(goodsId);
    }

    @ResponseBody
    @RequestMapping("selByName")
    public List<Foods> selByName(String name){

        return foodService.selAllByName(name);
    }

}
