package com.eight.leqia.controller;

import com.eight.leqia.entity.*;
import com.eight.leqia.service.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("permission")
public class PermissionController {

    @Autowired
    private IPermissionService iPermissionService;

    @Autowired
    private ICustomerService iCustomerService;

    @Autowired
    private FoodService foodService;

    @Autowired
    private IAdminService iAdminService;

    @Autowired
    private IStaffService iStaffService;

    @RequestMapping("findAll")
    public String findAll(Integer currentPage, Model model){
        if(currentPage == null){
            currentPage =1;
        }
        PageHelper.startPage(currentPage,8);
        List<Permission> permissions = iPermissionService.findAll();
        PageInfo pageInfo = new  PageInfo(permissions);

        model.addAttribute("pageInfo",pageInfo);
        return "permissionMgr";
    }

    @RequestMapping("findUser")
    public String findUser(Integer currentPage, Model model){
        if(currentPage == null){
            currentPage =1;
        }
        PageHelper.startPage(currentPage,8);
        List<Customer> customers = iCustomerService.findAll();
        PageInfo pageInfo = new  PageInfo(customers);

        model.addAttribute("pageInfo",pageInfo);
        return "staffuserMgr";
    }

    @RequestMapping("findFood")
    public String findFood(Integer currentPage, Model model){
        if(currentPage == null){
            currentPage =1;
        }
        PageHelper.startPage(currentPage,8);
        List<Food> foods = foodService.findall();
        PageInfo pageInfo = new  PageInfo(foods);

        model.addAttribute("pageInfo",pageInfo);
        return "stafffoodMgr";
    }

    @RequestMapping("updateUp")
    public String updateUp(int pId){
        iPermissionService.updateUp(pId);
        return "redirect:findAll";
    }

    @RequestMapping("updateDn")
    public String updateDn(int pId){
        iPermissionService.updateDn(pId);
        return "redirect:findAll";
    }

    @RequestMapping("findAdmin")
    public String findAdmin(Integer currentPage, Model model){
        if(currentPage == null){
            currentPage =1;
        }
        PageHelper.startPage(currentPage,8);
        List<Admin> admins = iAdminService.findAll();
        PageInfo pageInfo = new  PageInfo(admins);

        model.addAttribute("pageInfo",pageInfo);
        return "staffadminMgr";
    }

    @RequestMapping("findStaff")
    public String findStaff(Integer currentPage, Model model){
        if(currentPage == null){
            currentPage =1;
        }
        PageHelper.startPage(currentPage,8);
        List<Staff> staffs = iStaffService.findAll();
        PageInfo pageInfo = new  PageInfo(staffs);

        model.addAttribute("pageInfo",pageInfo);
        return "stafflist";
    }


}
