package com.eight.leqia.mapper;

import com.eight.leqia.entity.Recharge;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RechargeMapperT {
    public int addRecharge(Recharge recharge);

    public List<Recharge> selAllRecharge(int cId);

    List<Recharge> findAllRecharge();

    List<Recharge> findAllRechargeID(String UserName);
}
