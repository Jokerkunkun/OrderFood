package com.eight.leqia.controller;

import com.eight.leqia.entity.FoodType;
import com.eight.leqia.entity.Foods;
import com.eight.leqia.service.FoodServiceT;
import com.eight.leqia.service.FoodTypeServiceT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("qt")
public class FoodTypeControllerT {
    @Autowired
    private FoodTypeServiceT foodTypeService;
    @Autowired
    private FoodServiceT foodService;
    @ResponseBody
    @RequestMapping("selFl")
    public List<FoodType> selAllType(){
       List<FoodType> FTList= foodTypeService.selAllType();

         for (int i = 0; i <FTList.size(); i++) {
             //分类id
           int FtId=   FTList.get(i).getFtId();
           // System.out.println(FTList.get(i));
            System.out.println(FtId);
            //根据分类id查询商品
         List<Foods> foods= foodService.selAllByFl(FtId);
             System.out.println(foods);
         if(foods!=null){
             //给该分类下添加商品
          FTList.get(i).setFoods(foods);
         }
             }
        return FTList;
    }
}
