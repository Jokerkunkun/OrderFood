package com.eight.leqia.controller;

import com.eight.leqia.entity.FdTaste;
import com.eight.leqia.entity.Ingredient;
import com.eight.leqia.service.IFdTasteService;
import com.eight.leqia.service.IngredientService;
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
@RequestMapping("Ingredient")
public class IngredientController {
    @Autowired
    private IngredientService ingredientService;
    @Autowired
    private IFdTasteService iFdTasteService;


    @RequestMapping("findall")
    public String findall(Integer currentPage,Model model){
        if(currentPage==null){
            currentPage  = 1;
        }
        PageHelper.startPage(currentPage,8);
        List<Ingredient> ig = ingredientService.findAllig();
        PageInfo pageInfo = new PageInfo(ig);
        model.addAttribute("pageInfo",pageInfo);
        return "qsb/Selingre";
    }

    /**
     * 模糊查询配料查询这个配料都用到了什么材料
     * @param currentPage
     * @param model
     * @param IngName
     * @return
     */
    @RequestMapping("findNameAll")
    public String findNameAll(Integer currentPage, Model model,String IngName){
        if(currentPage == null){
            currentPage =1;
        }
        PageHelper.startPage(currentPage,8);
        List<Ingredient> ingredients = ingredientService.findNameAll(IngName);
        PageInfo pageInfo = new  PageInfo(ingredients);

        model.addAttribute("pageInfo",pageInfo);
        return "qsb/Selingre";
    }

    @RequestMapping("delete")
    public String delete(Integer Ingid){
        ingredientService.delete(Ingid);
        return "redirect:findall";
    }

    @RequestMapping("update")
    public String update(Integer Ingid,Model model){
      Ingredient ig = ingredientService.findbyid(Ingid);
        List<FdTaste> fd=iFdTasteService.findAll();
        model.addAttribute("fd",fd);
        model.addAttribute("ig",ig);
        return "qsb/updateIg";
    }

    @RequestMapping("updateIg")
    public String updateIg(/*@PathVariable("img")MultipartFile img,*/Ingredient ingredient){

        /*if (!img.isEmpty()){
            SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
            String filename=sdf.format(new Date())+img.getOriginalFilename();
            Path path= Paths.get("E:\\S3Down\\S3Project\\upload\\",filename);
            try {
                Files.write(path,img.getBytes());

            } catch (IOException e) {
                e.printStackTrace();
            }
            ingredient.setIngurl(filename);
            ingredientService.updateimg(ingredient);
            return "redirect:findall";
        }else {
            System.out.println(ingredient.getIngurl());

        }*/
        ingredientService.update(ingredient);
        return "redirect:findall";
    }

    @RequestMapping("add")
    public String add(Model model){
        List<FdTaste> fd=iFdTasteService.findAll();
        model.addAttribute("fd",fd);
        return "qsb/addIg";
    }


    @RequestMapping("addIg")
    public String addfood(@PathVariable("Igimg")MultipartFile Igimg,Ingredient ingredient) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
        String filename=sdf.format(new Date())+Igimg.getOriginalFilename();
        Path path= Paths.get("E:\\S3Down\\S3Project\\upload\\",filename);
        try {
            Files.write(path,Igimg.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        ingredient.setIngurl(filename);
        ingredientService.add(ingredient);
        return "redirect:findall";
    }
}
