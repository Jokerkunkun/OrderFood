package com.eight.leqia.controller;

import com.eight.leqia.entity.Admin;
import com.eight.leqia.service.AdminMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("qt")
public class AdminControllerT {
    @Autowired
    private AdminMapperService adminMapperService;
    @RequestMapping("selAllyg")
    @ResponseBody
    private List<Admin> selAllyg(){
        return adminMapperService.selAllyg();
    }
}