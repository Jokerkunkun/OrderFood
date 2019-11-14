package com.eight.leqia.controller;

import com.eight.leqia.entity.Food;
import com.eight.leqia.entity.FoodType;
import com.eight.leqia.service.FoodService;
import com.eight.leqia.service.FoodTypeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("foodtype")
public class FoodTypeController {

    @Autowired
    private FoodTypeService foodTypeService;

    @Autowired
    private FoodService foodService;


    /**
     * 分页查询
     * @param currentPage 分页
     * @param model
     * @return
     */
    @RequestMapping("findAll")
    public String findAll(Integer currentPage, Model model){
        if(currentPage==null){
            currentPage  = 1;
        }
        PageHelper.startPage(currentPage,10);
        List<FoodType> foodTypes = foodTypeService.findall();
        PageInfo pageInfo = new PageInfo(foodTypes);
        model.addAttribute("pageInfo",pageInfo);
        return "typeMgr";
    }

    /**
     * 跳转新增页面
     * @return
     */
    @RequestMapping("addHtml")
    public String addHtml(){
        return "addFoodType";
    }

    /**
     * 新增分类
     * @param foodType
     * @return
     */
    @RequestMapping("add")
    public String add(FoodType foodType/*,Model model*/){
        /*String msg = "该分类已经存在!";
        FoodType foodType1 = foodTypeService.findSole(foodType.getFtName());
        if(foodType1.getFtName() == ""){
            foodTypeService.add(foodType);
            return "redirect:findAll";
        }else{
            model.addAttribute("msg",msg);
            return "redirect:findAll";
        }*/
        foodTypeService.add(foodType);
        return "redirect:findAll";
    }

    /**
     * 模糊查询分类
     * @param currentPage
     * @param model
     * @param FtName
     * @return
     */
    @RequestMapping("findNameAll")
    public String findNameAll(Integer currentPage, Model model,String FtName){
        if(currentPage == null){
            currentPage =1;
        }
        PageHelper.startPage(currentPage,8);
        List<FoodType> foodTypes = foodTypeService.findNameAll(FtName);
        PageInfo pageInfo = new  PageInfo(foodTypes);

        model.addAttribute("pageInfo",pageInfo);
        return "typeMgr";
    }

    /**
     * 删除该分类
     * @param FtId
     * @return
     */
    @RequestMapping("delete")
    public String delete(Integer FtId){
        List<Food> foods = foodService.findFtId(FtId);
        if (foods == null || foods.size() ==0){
            foodTypeService.delete(FtId);
            return "redirect:findAll";

        }else{
            return "redirect:findAll";
        }
    }

    /**
     * 查询需要修改的分类
     * @param FtId
     * @param model
     * @return
     */
    @RequestMapping("updateFind")
    public String updateFind(Integer FtId,Model model){
        FoodType foodType = foodTypeService.updateFind(FtId);
        model.addAttribute("foodType",foodType);
        return "updateFoodType";
    }

    /**
     * 修改分类
     * @param foodType
     * @return
     */
    @RequestMapping("update")
    public String update(FoodType foodType){
        foodTypeService.update(foodType);
        return "redirect:findAll";
    }
}
