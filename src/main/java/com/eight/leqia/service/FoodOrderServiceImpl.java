package com.eight.leqia.service;

import com.eight.leqia.entity.FoodOrder;
import com.eight.leqia.mapper.FoodOrderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FoodOrderServiceImpl implements FoodOrderService {
    @Resource
    private FoodOrderMapper foodOrderMapper;
    @Override
    public List<FoodOrder> findAllOrder() {
        return foodOrderMapper.findAllOrder();
    }

    @Override
    public List<FoodOrder> findAllOrderNew() {
        return foodOrderMapper.findAllOrderNew();
    }

    @Override
    public FoodOrder findCount() {
        return foodOrderMapper.findCount();
    }

    @Override
    public List<FoodOrder> findOrderIdAll(String OrderId) {
        return foodOrderMapper.findOrderIdAll(OrderId);
    }

    @Override
    public List<FoodOrder> findCId(Integer CId) {
        return foodOrderMapper.findCId(CId);
    }


    @Override
    public FoodOrder find1M() {
        return foodOrderMapper.find1M();
    }

    @Override
    public FoodOrder find2M() {
        return foodOrderMapper.find2M();
    }

    @Override
    public FoodOrder find3M() {
        return foodOrderMapper.find3M();
    }

    @Override
    public FoodOrder find4M() {
        return foodOrderMapper.find4M();
    }

    @Override
    public FoodOrder find5M() {
        return foodOrderMapper.find5M();
    }

    @Override
    public FoodOrder find6M() {
        return foodOrderMapper.find6M();
    }

    @Override
    public FoodOrder find7M() {
        return foodOrderMapper.find7M();
    }

    @Override
    public FoodOrder find8M() {
        return foodOrderMapper.find8M();
    }

    @Override
    public FoodOrder find9M() {
        return foodOrderMapper.find9M();
    }

    @Override
    public FoodOrder find10M() {
        return foodOrderMapper.find10M();
    }

    @Override
    public FoodOrder find11M() {
        return foodOrderMapper.find11M();
    }

    @Override
    public FoodOrder find12M() {
        return foodOrderMapper.find12M();
    }

    /*@Override
    public FoodOrder findOrder(int foodorderid) {
        return foodOrderMapper.findOrder(foodorderid);
    }*/
}
