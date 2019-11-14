package com.eight.leqia.service;


import com.eight.leqia.entity.Customer;
import com.eight.leqia.mapper.CustomerMapperT;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class CustomerServiceImpT implements CustomerServiceT {
    @Resource
    private CustomerMapperT customerMapperT;
    @Override
    public int add(String UserName, String HeadPortrait) {
        return customerMapperT.add(UserName,HeadPortrait);
    }

    @Override
    public Customer selCustom(String UserName, String HeadPortrait) {
        return customerMapperT.selCustom(UserName,HeadPortrait);
    }
}
