package com.eight.leqia.service;

import com.eight.leqia.entity.Complaint;
import com.eight.leqia.mapper.ComplaintMapperT;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ComplaintServiceImp implements ComplaintService {

    @Resource
    private ComplaintMapperT complaintMapperT;
    @Override
    public int addComplaint(Complaint complaint) {
        return complaintMapperT.addComplaint(complaint);
    }

    @Override
    public List<Complaint> findAllComplaint() {
        return complaintMapperT.findAllComplaint();
    }

    @Override
    public List<Complaint> findAllComplaintID(String UserName) {
        return complaintMapperT.findAllComplaintID(UserName);
    }

}
