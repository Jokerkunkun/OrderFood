package com.eight.leqia.service;


import com.eight.leqia.entity.Customer;

public interface CustomerServiceT {
    public int add(String UserName, String HeadPortrait, String openid);
    public Customer selCustom(String openid);
    public Customer selCusById(int CId);
    public int updateById(Customer customer);
    // 根据用户id修改用户的余额
    public int upbalance(Customer customer);


}
