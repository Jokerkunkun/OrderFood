package com.eight.leqia.controller;

import com.eight.leqia.entity.Staff;
import com.eight.leqia.service.IStaffService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("staff")
public class StaffController {

    @Autowired
    private IStaffService iStaffService;

    @RequestMapping("findAll")
    public String findAll(Integer currentPage, Model model){
        if(currentPage == null){
            currentPage =1;
        }
        PageHelper.startPage(currentPage,8);
        List<Staff> staffs = iStaffService.findAll();
        PageInfo pageInfo = new  PageInfo(staffs);

        model.addAttribute("pageInfo",pageInfo);
        return "staffMgr";
    }

    /**
     * 跳转新增页面
     * @return
     */
    @RequestMapping("addHtml")
    public String addHtml(){
        return "staffAdd";
    }

    /**
     * 新增员工
     * @param staff
     * @return
     */
    @RequestMapping("add")
    public String add(Staff staff){
        iStaffService.add(staff);
        return "redirect:findAll";
    }

    /**
     * 删除该员工
     * @param AdId
     * @return
     */
    @RequestMapping("delete")
    public String delete(Integer AdId){
        iStaffService.delete(AdId);
        return "redirect:findAll";
    }

    /**
     * 禁用该员工
     * @param AdId
     * @return
     */
    @RequestMapping("updateStatusForbidden")
    public String updateStatusForbidden(Integer AdId){
        iStaffService.updateStatusForbidden(AdId);
        return "redirect:findAll";
    }

    /**
     * 启用该员工
     * @param AdId
     * @return
     */
    @RequestMapping("updateStatusStart")
    public String updateStatusStart(Integer AdId){
        iStaffService.updateStatusStart(AdId);
        return "redirect:findAll";
    }

    /**
     * 根据注册日期查询员工
     * @param currentPage
     * @param registration1
     * @param registration2
     * @param model
     * @return
     */
    @RequestMapping("findDateNameAll")
    public String findDateNameAll(Integer currentPage, String registration1, String registration2,String AUserName,Model model){
        if(currentPage == null){
            currentPage =1;
        }
        PageHelper.startPage(currentPage,8);
        if(AUserName != "" && registration1 == "" && registration2 == ""){
            List<Staff> admins = iStaffService.findNameAll(AUserName);
            PageInfo pageInfo = new  PageInfo(admins);
            model.addAttribute("pageInfo",pageInfo);
            return "staffMgr";
        }else if(registration1 != "" && registration2 != "" && AUserName == ""){
            List<Staff> admins = iStaffService.findDateAll(registration1,registration2);
            PageInfo pageInfo = new  PageInfo(admins);
            model.addAttribute("pageInfo",pageInfo);
            return "staffMgr";
        }else if(registration1 != "" && registration2 != "" && AUserName != ""){
            List<Staff> admins = iStaffService.findDateNameAll(registration1,registration2,AUserName);
            PageInfo pageInfo = new  PageInfo(admins);
            model.addAttribute("pageInfo",pageInfo);
            return "staffMgr";
        }else {
            return "redirect:findAll";
        }
    }
}
