package com.eight.leqia.service;

import com.eight.leqia.entity.Customer;
import com.eight.leqia.mapper.CustomerMapperT;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class CustomerServiceImpT implements CustomerServiceT {
    @Resource
    private CustomerMapperT customerMapperT;


    @Override
    public int add(String UserName, String HeadPortrait, String openid) {
        return customerMapperT.add(UserName,HeadPortrait,openid);
    }

    @Override
    public Customer selCustom(String openid) {
        return customerMapperT.selCustom(openid);
    }


    @Override
    public Customer selCusById(int CId) {
        return customerMapperT.selCusById(CId);
    }

    @Override
    public int updateById(Customer customer) {
        return customerMapperT.updateById(customer);
    }

    @Override
    public int upbalance(Customer customer) {
        return customerMapperT.upbalance(customer);
    }


}
