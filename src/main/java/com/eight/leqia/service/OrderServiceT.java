package com.eight.leqia.service;

import com.eight.leqia.entity.FoodOrder;

import java.util.List;

public interface OrderServiceT {
    public int addOrder(FoodOrder foodOrder);
    //根据用户id查询订单
    public List<FoodOrder> selOrder(int CId, int OrderStatus);
    //根据订单编号查询订单
    public  List<FoodOrder> selOrderById(String OrderId);
    //根据订单编号商品id查询商品数量
    public FoodOrder setGoodsNum(String OrderId, String FId);
    //根据用户id查询订单
    public List<FoodOrder> selAllOrder(int CId);
    //根据订单编号删除订单
    public int delOrderById(String OrderId);

}
