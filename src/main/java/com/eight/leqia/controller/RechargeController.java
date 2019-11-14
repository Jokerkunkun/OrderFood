package com.eight.leqia.controller;

import com.eight.leqia.entity.Recharge;
import com.eight.leqia.service.IRechargeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("recharge")
public class RechargeController {

    @Autowired
    private IRechargeService iRechargeService;


    /**
     * 充值记录查询
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
        List<Recharge> recharges = iRechargeService.findAll();
        PageInfo pageInfo = new PageInfo(recharges);
        model.addAttribute("pageInfo",pageInfo);
        return "recharge";
    }
}
