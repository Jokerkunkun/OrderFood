package com.eight.leqia.controller;

import com.eight.leqia.entity.Pot;
import com.eight.leqia.service.IPotService;
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
@RequestMapping("pot")
public class PotController {

    @Autowired
    private IPotService iPotService;

    /**
     * 锅具查询
     * @param currentPage 分页
     * @param model
     * @return
     */
    @RequestMapping("findAll")
    public String findAll( Integer currentPage, Model model){

        if(currentPage==null){
            currentPage  = 1;
        }
        PageHelper.startPage(currentPage,8);
        List<Pot> pots = iPotService.findAll();
        PageInfo pageInfo = new PageInfo(pots);
        model.addAttribute("pageInfo",pageInfo);
        return "potMgr";
    }

    /**
     * 模糊查询餐具
     * @param currentPage
     * @param model
     * @param PName
     * @return
     */
    @RequestMapping("findNameAll")
    public String findNameAll(Integer currentPage, Model model,String PName){
        if(currentPage == null){
            currentPage =1;
        }
        PageHelper.startPage(currentPage,8);
        List<Pot> pots = iPotService.findNameAll(PName);
        PageInfo pageInfo = new  PageInfo(pots);

        model.addAttribute("pageInfo",pageInfo);
        return "potMgr";
    }

    /**
     * 跳转新增页面
     * @return
     */
    @RequestMapping("addHtml")
    public String addHtml(){
        return "addPot";
    }

    /**
     * 新增锅具
     * @param pot
     * @return
     */
    @RequestMapping("add")
    public String add(@PathVariable("img") MultipartFile img, Pot pot){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
        String filename=sdf.format(new Date())+img.getOriginalFilename();
        Path path= Paths.get("E:\\S3Down\\S3Project\\upload\\",filename);
        try {
            Files.write(path,img.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        pot.setPUrl(filename);
        iPotService.add(pot);
        return "redirect:findAll";
    }

    /**
     * 删除该锅具
     * @param PId
     * @return
     */
    @RequestMapping("delete")
    public String delete(Integer PId){
        iPotService.delete(PId);
        return "redirect:findAll";
    }

    /**
     * 查询需要修改的锅具
     * @param PId
     * @param model
     * @return
     */
    @RequestMapping("updateFind")
    public String updateFind(Integer PId,Model model){
        Pot pot = iPotService.updateFind(PId);
        model.addAttribute("pot",pot);
        return "updatePot";
    }

    /**
     * 修改锅具
     * @param pot
     * @return
     */
    @RequestMapping("update")
    public String update(Pot pot){
        iPotService.update(pot);
        return "redirect:findAll";
    }


}
