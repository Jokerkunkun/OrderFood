package com.eight.leqia.controller;

import com.eight.leqia.entity.Customer;
import com.eight.leqia.entity.FoodOrder;
import com.eight.leqia.service.FoodOrderService;
import com.eight.leqia.service.ICustomerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private ICustomerService iCustomerService;

    @Autowired
    private FoodOrderService foodOrderService;

    /**
     * 查询所有用户
     * @param currentPage
     * @param model
     * @return
     */
    @RequestMapping("findAll")
    public String findAll(Integer currentPage, Model model){
        if(currentPage == null){
            currentPage =1;
        }
        PageHelper.startPage(currentPage,11);
        List<Customer> customers = iCustomerService.findAll();
        PageInfo pageInfo = new  PageInfo(customers);

        model.addAttribute("pageInfo",pageInfo);
        return "userMgr";
    }

    /**
     * 禁用该用户
     * @param CId
     * @return
     */
    @RequestMapping("updateStatusForbidden")
    public String updateStatusForbidden(Integer CId){
        iCustomerService.updateStatusForbidden(CId);
        return "redirect:findAll";
    }

    /**
     * 删除用户
     * @param CId
     * @return
     */
    @RequestMapping("delete1")
    public String delete1(Integer CId){
        List<FoodOrder> foodOrders = foodOrderService.findCId(CId);
        /*System.out.println(foodOrders);*/
        if (foodOrders == null || foodOrders.size() ==0){
            iCustomerService.delete(CId);
            return "redirect:findAll";

        }else{
            return "redirect:findAll";
        }
    }

    /**
     * 启用该用户
     * @param CId
     * @return
     */
    @RequestMapping("updateStatusStart")
    public String updateStatusStart(Integer CId){
        iCustomerService.updateStatusStart(CId);
        return "redirect:findAll";
    }

    /**
     * 根据注册日期查询管理员
     * @param currentPage
     * @param registration1
     * @param registration2
     * @param UserName
     * @param model
     * @return
     */
    @RequestMapping("findDateNameAll")
    public String findDateNameAll(Integer currentPage, String registration1, String registration2,String UserName,Model model){
        if(currentPage == null){
            currentPage =1;
        }
        PageHelper.startPage(currentPage,11);
        if(UserName != "" && registration1 == "" && registration2 == ""){
            List<Customer> customers = iCustomerService.findNameAll(UserName);
            PageInfo pageInfo = new  PageInfo(customers);
            model.addAttribute("pageInfo",pageInfo);
            return "userMgr";
        }else if(registration1 != "" && registration2 != "" && UserName == ""){
            List<Customer> customers = iCustomerService.findDateAll(registration1,registration2);
            PageInfo pageInfo = new  PageInfo(customers);
            model.addAttribute("pageInfo",pageInfo);
            return "userMgr";
        }else if(registration1 != "" && registration2 != "" && UserName != ""){
            List<Customer> customers = iCustomerService.findDateNameAll(registration1,registration2,UserName);
            PageInfo pageInfo = new  PageInfo(customers);
            model.addAttribute("pageInfo",pageInfo);
            return "userMgr";
        }else {
            return "redirect:findAll";
        }
    }
}
