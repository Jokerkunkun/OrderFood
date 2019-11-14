package com.eight.leqia.mapper;

import com.eight.leqia.entity.FoodOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapperT {
//添加订单
    int addOrder(FoodOrder foodOrder);
    //根据用户id，订单状态 查询订单
    List<FoodOrder> selOrder(int CId, int OrderStatus);
    //根据订单编号查询订单
    List<FoodOrder> selOrderById(String OrderId);
    //根据订单编号商品id查询商品数量
    FoodOrder setGoodsNum(String OrderId, String FId);
    //根据用户id查询订单
    List<FoodOrder> selAllOrder(int CId);
    //根据订单编号删除订单
    int delOrderById(String OrderId);


}
