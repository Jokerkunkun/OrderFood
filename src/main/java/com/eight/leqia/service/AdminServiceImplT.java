package com.eight.leqia.service;

import com.eight.leqia.entity.Admin;
import com.eight.leqia.mapper.AdminMapperT;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class AdminServiceImplT implements AdminMapperService  {
    @Resource
    private AdminMapperT adminMapperT;
    @Override
    public List<Admin> selAllyg() {
        return adminMapperT.selAllyg();
    }
}
