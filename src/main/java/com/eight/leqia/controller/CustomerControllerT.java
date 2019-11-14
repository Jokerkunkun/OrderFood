package com.eight.leqia.controller;

import com.eight.leqia.entity.Customer;
import com.eight.leqia.service.CustomerServiceT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("qt")
public class CustomerControllerT {

    @Autowired
    private CustomerServiceT customerService;

    @RequestMapping("addUser")
    @ResponseBody
    public Customer add(String UserName,String HeadPortrait){

        Customer customer= customerService.selCustom(UserName,HeadPortrait);
        if(customer==null){
             customerService.add(UserName,HeadPortrait);
             return customerService.selCustom(UserName,HeadPortrait);
        }else{
            return  customerService.selCustom(UserName,HeadPortrait);
        }


    }

}
