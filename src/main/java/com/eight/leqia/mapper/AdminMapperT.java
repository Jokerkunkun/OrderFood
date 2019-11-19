package com.eight.leqia.mapper;

import com.eight.leqia.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapperT {
    //查询员工
    public List<Admin> selAllyg();

}
