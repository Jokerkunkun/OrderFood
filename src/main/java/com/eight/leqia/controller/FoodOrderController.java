package com.eight.leqia.controller;

import com.eight.leqia.entity.FoodOrder;
import com.eight.leqia.service.FoodOrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("foodOrder")
public class FoodOrderController {
    @Autowired
    private FoodOrderService foodOrderService;


    /**
     * 分页查询
     * @param currentPage 分页
     * @param model
     * @return
     */
    @RequestMapping("findallOrder")
    public String findall(Integer currentPage,Model model){
        if(currentPage==null){
            currentPage  = 1;
        }
        PageHelper.startPage(currentPage,11);
        List<FoodOrder>foodOrders = foodOrderService.findAllOrder();
        PageInfo pageInfo = new PageInfo(foodOrders);
        model.addAttribute("pageInfo",pageInfo);
        return "qsb/foodOrderMgr";
    }


    @RequestMapping("findOrderIdAll")
    public String findOrderIdAll(String OrderId,Integer currentPage,Model model){
        if(currentPage==null){
            currentPage  = 1;
        }
        PageHelper.startPage(currentPage,11);
        List<FoodOrder>foodOrders = foodOrderService.findOrderIdAll(OrderId);
        PageInfo pageInfo = new PageInfo(foodOrders);
        model.addAttribute("pageInfo",pageInfo);

        return "qsb/foodOrderMgr";
    }

    @RequestMapping("findOrderId")
    public String findOrderId(String OrderId,Model model){

        String str = OrderId.substring(0,6);
        List<FoodOrder>foodOrders = foodOrderService.findOrderId(str);

        model.addAttribute("foodOrders",foodOrders);

        return "orderdetails";
    }

    @RequestMapping("chart")
    public String chart(Model model){
        FoodOrder f1 = foodOrderService.find1M();
        FoodOrder f2 = foodOrderService.find2M();
        FoodOrder f3 = foodOrderService.find3M();
        FoodOrder f4 = foodOrderService.find4M();
        FoodOrder f5 = foodOrderService.find5M();
        FoodOrder f6 = foodOrderService.find6M();
        FoodOrder f7 = foodOrderService.find7M();
        FoodOrder f8 = foodOrderService.find8M();
        FoodOrder f9 = foodOrderService.find9M();
        FoodOrder f10 = foodOrderService.find10M();
        FoodOrder f11 = foodOrderService.find11M();
        FoodOrder f12 = foodOrderService.find12M();

        model.addAttribute("f1",f1.getPrice());
        model.addAttribute("f2",f2.getPrice());
        model.addAttribute("f3",f3.getPrice());
        model.addAttribute("f4",f4.getPrice());
        model.addAttribute("f5",f5.getPrice());
        model.addAttribute("f6",f6.getPrice());
        model.addAttribute("f7",f7.getPrice());
        model.addAttribute("f8",f8.getPrice());
        model.addAttribute("f9",f9.getPrice());
        model.addAttribute("f10",f10.getPrice());
        model.addAttribute("f11",f11.getPrice());
        model.addAttribute("f12",f12.getPrice());

        return "chart";
    }



/*
    @RequestMapping("findOrder")
    public String findOrder(int foodorderid,Model model){
        FoodOrder foodOrder = foodOrderService.findOrder(foodorderid);
        model.addAttribute("foodOrder",foodOrder);
        return "OrderDetails";
    }
*/

}
