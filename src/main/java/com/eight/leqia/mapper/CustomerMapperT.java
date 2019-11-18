package com.eight.leqia.mapper;

import com.eight.leqia.entity.Customer;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapperT {
    //根据用户唯一id查询用户
    public Customer selCustom(String openid);
    //添加新用户
    public int add(String UserName,String HeadPortrait,String openid);
    //根据用户id查询用户
    public Customer selCusById(int CId);
    //修改用户信息
    public int updateById(Customer customer);
    // 根据用户id修改用户的余额
    public int upbalance(Customer customer);
}
