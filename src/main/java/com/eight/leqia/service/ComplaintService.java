package com.eight.leqia.service;


import com.eight.leqia.entity.Complaint;

import java.util.List;

public interface ComplaintService {
    //添加投诉
    public int addComplaint(Complaint complaint);

    List<Complaint> findAllComplaint();

    List<Complaint> findAllComplaintID(String UserName);
}
