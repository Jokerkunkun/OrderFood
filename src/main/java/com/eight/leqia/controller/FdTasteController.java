package com.eight.leqia.controller;

import com.eight.leqia.entity.FdTaste;
import com.eight.leqia.mapper.FdTasteMapper;
import com.eight.leqia.service.IFdTasteService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("FdTaste")
public class FdTasteController {
    @Autowired
    private IFdTasteService iFdTasteService;

    @RequestMapping("findAllFd")
    public String findAllFd(Integer currentPage,Model model){
        if(currentPage==null){
            currentPage  = 1;
        }
        PageHelper.startPage(currentPage,11);
        List<FdTaste> fdTastes = iFdTasteService.findAll();
        PageInfo pageInfo = new PageInfo(fdTastes);
        model.addAttribute("pageInfo",pageInfo);
        return "qsb/SelFdTaste";
    }

    @RequestMapping("deleteS")
    public String deleteS(Integer FdtId){
        iFdTasteService.deleteS(FdtId);
        return "redirect:findAllFd";
    }

    /**
     * 模糊查询口味
     * @param currentPage
     * @param model
     * @param FdtName
     * @return
     */
    @RequestMapping("findNameAll")
    public String findNameAll(Integer currentPage, Model model,String FdtName){
        if(currentPage == null){
            currentPage =1;
        }
        PageHelper.startPage(currentPage,11);
        List<FdTaste> fdTastes = iFdTasteService.findNameAll(FdtName);
        PageInfo pageInfo = new  PageInfo(fdTastes);
        model.addAttribute("pageInfo",pageInfo);
        return "qsb/SelFdTaste";
    }

    @RequestMapping("add")
    public String add(){
        return "qsb/addFdTaste";
    }

    @RequestMapping("addFd")
    public String addFd(FdTaste fdTaste) {

        FdTaste fdTaste1 = iFdTasteService.findbyname(fdTaste.getFdtName());

        if(fdTaste1 == null){
            iFdTasteService.addFdTaste(fdTaste);
            return "redirect:findAllFd";
        }else{
            return "redirect:findAllFd";
        }

    }

    @RequestMapping("update")
    public String update(Integer FdtId,Model model){
        FdTaste fd = iFdTasteService.findbyid(FdtId);
        model.addAttribute("fd",fd);
        return "qsb/updateFdTaste";
    }


    @RequestMapping("updateFdTaste")
    public String updateFd(FdTaste fdTaste){
        iFdTasteService.updateFdTaste(fdTaste);
        return "redirect:findAllFd";
    }
}
