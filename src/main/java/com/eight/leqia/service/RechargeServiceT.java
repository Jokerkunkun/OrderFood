package com.eight.leqia.service;



import com.eight.leqia.entity.Recharge;
import com.eight.leqia.mapper.RechargeMapperT;

import java.util.List;

public interface RechargeServiceT {
    public int addRecharge(Recharge recharge);

    public List<Recharge> selAllRecharge(int cId);

    List<Recharge> findAllRecharge();

    List<Recharge> findAllRechargeID(String UserName);
}
