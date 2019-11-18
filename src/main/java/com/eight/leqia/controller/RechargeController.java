package com.eight.leqia.controller;

import com.eight.leqia.entity.Recharge;
import com.eight.leqia.service.RechargeServiceT;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping("qt")
public class RechargeController {
    @Autowired
    private RechargeServiceT rechargeServiceT;

    @RequestMapping("addRecharge")
    @ResponseBody
    public  int addRecharge(Recharge recharge){

        return  rechargeServiceT.addRecharge(recharge);
    }

    @RequestMapping("selRecharge")
    @ResponseBody
    public List<Recharge> selRecharge(int cId){
        List<Recharge> list= rechargeServiceT.selAllRecharge(cId);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getRegistration());
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = format.format(list.get(i).getRegistration());
            list.get(i).setCzsj(dateString);
        }
        return  list;
    }

    @RequestMapping("findAllRecharge")
    public String findAllRecharge(Integer currentPage, Model model){
        if(currentPage==null){
            currentPage  = 1;
        }
        PageHelper.startPage(currentPage,11);
        List<Recharge> recharges = rechargeServiceT.findAllRecharge();
        PageInfo pageInfo = new PageInfo(recharges);
        model.addAttribute("pageInfo",pageInfo);

        return "complaints";
    }

    @RequestMapping("findAllRechargeID")
    public String findAllRechargeID(Integer currentPage, Model model,String UserName){
        if(currentPage==null){
            currentPage  = 1;
        }
        PageHelper.startPage(currentPage,11);
        List<Recharge> recharges = rechargeServiceT.findAllRechargeID(UserName);
        PageInfo pageInfo = new PageInfo(recharges);
        model.addAttribute("pageInfo",pageInfo);

        return "complaints";
    }
}
