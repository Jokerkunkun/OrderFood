package com.eight.leqia.service;


import com.eight.leqia.entity.Recharge;
import com.eight.leqia.mapper.RechargeMapperT;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RechargeServiceImpT implements  RechargeServiceT{
    @Resource
    private RechargeMapperT rechargeMapperT;
    @Override
    public int addRecharge(Recharge recharge) {
        return rechargeMapperT.addRecharge(recharge);
    }

    @Override
    public List<Recharge> selAllRecharge(int cId) {
        return rechargeMapperT.selAllRecharge(cId);
    }

    @Override
    public List<Recharge> findAllRecharge() {
        return rechargeMapperT.findAllRecharge();
    }

    @Override
    public List<Recharge> findAllRechargeID(String UserName) {
        return rechargeMapperT.findAllRechargeID(UserName);
    }


}
