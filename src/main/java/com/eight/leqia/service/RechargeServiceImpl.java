package com.eight.leqia.service;

import com.eight.leqia.entity.Recharge;
import com.eight.leqia.mapper.RechargeMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class RechargeServiceImpl implements IRechargeService {

    @Resource
    private RechargeMapper rechargeMapper;

    @Override
    public List<Recharge> findAll() {
        return rechargeMapper.findAll();
    }
}
