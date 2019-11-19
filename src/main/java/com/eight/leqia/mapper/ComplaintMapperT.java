package com.eight.leqia.mapper;


import com.eight.leqia.entity.Complaint;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ComplaintMapperT {
    //添加投诉
    public int addComplaint(Complaint complaint);

    List<Complaint> findAllComplaint();

    List<Complaint> findAllComplaintID(String UserName);
}
