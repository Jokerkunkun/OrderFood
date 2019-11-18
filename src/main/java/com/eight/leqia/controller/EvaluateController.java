package com.eight.leqia.controller;



import com.eight.leqia.entity.Admin;
import com.eight.leqia.entity.Customer;
import com.eight.leqia.entity.Evaluate;
import com.eight.leqia.service.CustomerServiceT;
import com.eight.leqia.service.EvaluateServiceT;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("qt")
public class EvaluateController {

    @Autowired
    private EvaluateServiceT evaluateServiceT;

    @Autowired
    private CustomerServiceT customerServiceT;
    @RequestMapping("addEvaluate")
    @ResponseBody
    public  int addEvaluate(Evaluate evaluate){
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateNowStr = sdf.format(d);
        System.out.println("格式化后的日期：" + dateNowStr);

        evaluate.setAddtime(dateNowStr);

        return evaluateServiceT.addEvaluate(evaluate);
    }
    @RequestMapping("selEvaluate")
    @ResponseBody
    public List<Evaluate> selEvaluate(){
        List<Evaluate> list=evaluateServiceT.selAllEvaluate();

        for(int i=0;i<list.size();i++){
            int cid=list.get(i).getCId();
          Customer customer= customerServiceT.selCusById(cid);
          list.get(i).setCustomer(customer);
           String evimage= list.get(i).getEvimage();
            String[] evimages = evimage.split(",");
            list.get(i).setEvimages(evimages);

        }

        return list;
    }

    @RequestMapping("findAllEvaluate")
    public String findAllEvaluate(Integer currentPage, Model model){
        if(currentPage == null){
            currentPage =1;
        }
        PageHelper.startPage(currentPage,11);
        List<Evaluate> evaluates = evaluateServiceT.selAllEvaluate();
        PageInfo pageInfo = new  PageInfo(evaluates);

        model.addAttribute("pageInfo",pageInfo);
        return "orderevaluate";
    }

    @RequestMapping("selEvaluateOrderID")
    public String selEvaluateOrderID(Integer currentPage, Model model,String OrderId){
        if(currentPage == null){
            currentPage =1;
        }
        PageHelper.startPage(currentPage,11);
        List<Evaluate> evaluates = evaluateServiceT.selEvaluateOrderID(OrderId);
        PageInfo pageInfo = new  PageInfo(evaluates);

        model.addAttribute("pageInfo",pageInfo);
        return "orderevaluate";
    }


}
