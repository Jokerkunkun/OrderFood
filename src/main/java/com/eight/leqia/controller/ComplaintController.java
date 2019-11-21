package com.eight.leqia.controller;


import com.eight.leqia.entity.Complaint;
import com.eight.leqia.entity.Recharge;
import com.eight.leqia.service.ComplaintService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("qt")
public class ComplaintController {

    @Autowired
    private ComplaintService complaintService;
    @RequestMapping("addComplaint")
    @ResponseBody
    public int addComplaint(Complaint complaint) {
        return complaintService.addComplaint(complaint);
    }

    @RequestMapping("findAllComplaint")
    public String findAllComplaint(Integer currentPage, Model model){
        if(currentPage == null){
            currentPage =1;
        }
        PageHelper.startPage(currentPage,11);
        List<Complaint> complaints = complaintService.findAllComplaint();
        PageInfo pageInfo = new  PageInfo(complaints);

        model.addAttribute("pageInfo",pageInfo);
        return "complaintlist";
    }

    @RequestMapping("findAllComplaintID")
    public String findAllComplaintID(Integer currentPage, Model model,String UserName){
        if(currentPage==null){
            currentPage  = 1;
        }
        PageHelper.startPage(currentPage,11);
        List<Complaint> complaints = complaintService.findAllComplaintID(UserName);
        PageInfo pageInfo = new PageInfo(complaints);
        model.addAttribute("pageInfo",pageInfo);

        return "complaintlist";
    }
}
