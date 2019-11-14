package com.eight.leqia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class TestController {



    @RequestMapping("typeMgr")
    public String typeMgr(){
        return "typeMgr";
    }

    @RequestMapping("adminMgr")
    public String adminMgr(){
        return "adminMgr";
    }

    @RequestMapping("chart")
    public String chart(){
        return "chart";
    }

    @RequestMapping("pot")
    public String pot(){
        return "pot";
    }

    @RequestMapping("123")
    public String test123(){

        return "123";
    }
}
