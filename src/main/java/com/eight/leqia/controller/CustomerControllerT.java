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
    private CustomerServiceT customerServicetT;

    @RequestMapping("addUser")
    @ResponseBody
    public Customer add(String UserName, String HeadPortrait, String openid){
        Customer customer2=new Customer();
        Customer customer= customerServicetT.selCustom(openid);
        if(customer!=null){
            if(customer.getCStatus()==0){
                System.out.println("用户被禁用");
                return customer2;
            }
        }
        if (customer==null){
            System.out.println("添加用户");
            customerServicetT.add(UserName,HeadPortrait,openid);
             return customerServicetT.selCustom(openid);
        }else{
            return  customerServicetT.selCustom(openid);
        }


    }
    @RequestMapping("selUserById")
    @ResponseBody
    public Customer selCusById(int CId){
        return  customerServicetT.selCusById(CId);
    }

    @RequestMapping("upUserById")
    @ResponseBody
    public int upCusById(Customer customer){
        return  customerServicetT.updateById(customer);
    }


    @RequestMapping("upbalan")
    @ResponseBody
    public int upbalance(Customer customer){

        return  customerServicetT.upbalance(customer);
    }





}
