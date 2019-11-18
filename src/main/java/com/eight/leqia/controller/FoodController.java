package com.eight.leqia.controller;

import com.eight.leqia.entity.FdTaste;
import com.eight.leqia.entity.Food;
import com.eight.leqia.entity.FoodType;
import com.eight.leqia.service.FoodService;
import com.eight.leqia.service.FoodTypeService;
import com.eight.leqia.service.IFdTasteService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodTypeService foodTypeService;

    @Autowired
    private FoodService foodService;

    @Autowired
    private IFdTasteService iFdTasteService;

    /**
     * 模糊查询菜品
     * @param currentPage
     * @param model
     * @param FName
     * @return
     */
    @RequestMapping("findNameAll")
    public String findNameAll(Integer currentPage, Model model,String FName){
        if(currentPage == null){
            currentPage =1;
        }
        PageHelper.startPage(currentPage,6);
        List<Food> foods = foodService.findNameAll(FName);
        PageInfo pageInfo = new  PageInfo(foods);

        model.addAttribute("pageInfo",pageInfo);
        return "qsb/foodMgr";
    }


    /**
     * 分页查询
     * @param currentPage 分页
     * @param model
     * @return
     */
    @RequestMapping("findall")
    public String findall(Integer currentPage, Model model){
        if(currentPage==null){
            currentPage  = 1;
        }
        PageHelper.startPage(currentPage,6);
        List<Food> foods = foodService.findall();
        PageInfo pageInfo = new PageInfo(foods);
        model.addAttribute("pageInfo",pageInfo);
        return "qsb/foodMgr";
    }

    /**
     * 根据id删除
     * @param FId
     * @return
     */
    @RequestMapping("delete")
    public String delete(Integer FId){
        foodService.delete(FId);
        return "redirect:findall";
    }

    /**
     *修改跳转页面
     * @param FId
     * @param model
     * @return
     */
    @RequestMapping("update")
    public String update(Integer FId,Model model){
        Food food = foodService.findbyid(FId);
        List<FoodType> foodTypes =foodTypeService.findall();
        List<FdTaste> fdTastes = iFdTasteService.findAll();
        model.addAttribute("food",food);
        model.addAttribute("foodTypes",foodTypes);
        model.addAttribute("fdTastes",fdTastes);
        return "qsb/foodUpdate";
    }

    /**
     * 修改以后跳转到查询页面
     * 可修改 名称，价格评分，所属类别
     * @param food
     * @return
     */
    @RequestMapping("update_do")
    public String update_do(Food food){
        foodService.update(food);
        return "redirect:findall";
    }

    @RequestMapping("add")
    public String add(Model model){
        List<FoodType> foodTypes =foodTypeService.findall();
        List<FdTaste> fdTastes = iFdTasteService.findAll();
        model.addAttribute("foodTypes",foodTypes);
        model.addAttribute("fdTastes",fdTastes);
        return "qsb/foodAdd";
    }

    @RequestMapping("addfood")
    public String addfood(@PathVariable("img") MultipartFile img, Food food) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
        String filename=sdf.format(new Date())+img.getOriginalFilename();
        Path path= Paths.get("E:\\S3Down\\S3Project\\miniprogram-7\\images\\goods\\",filename);
        try {
            Files.write(path,img.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        food.setFUrl(filename);
        foodService.add(food);
        return "redirect:findall";
    }

    /**
     * 下架
     * @param FId
     * @return
     */
    @RequestMapping("updateStatusForbidden")
    public String updateStatusForbidden(Integer FId){
        foodService.updateStatusForbidden(FId);
        return "redirect:findall";
    }

    /**
     * 上架
     * @param FId
     * @return
     */
    @RequestMapping("updateStatusStart")
    public String updateStatusStart(Integer FId){
        foodService.updateStatusStart(FId);
        return "redirect:findall";
    }

}
