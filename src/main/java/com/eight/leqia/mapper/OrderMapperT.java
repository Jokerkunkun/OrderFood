package com.eight.leqia.mapper;

import com.eight.leqia.entity.FoodOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapperT {
    //添加订单
    public int addOrder(FoodOrder foodOrder);
    //根据用户id，订单状态 查询订单
    public List<FoodOrder> selOrder(int CId,int OrderStatus);
    //根据订单编号查询订单
    public  List<FoodOrder> selOrderById(String OrderId);
    //根据订单编号商品id查询商品数量
    public FoodOrder setGoodsNum(String OrderId,String FId);
    //根据用户id查询订单
    public List<FoodOrder> selAllOrder(int CId);
    //根据订单编号删除订单
    public int delOrderById(String OrderId);
    //查询用户最新的一条订单
    public FoodOrder selFirstOrder(int CId);
    //根据用户id 订单编号 修改订单的状态为已支付
    public int upOrderStatus(FoodOrder order);
    //根据用户id 订单编号 修改订单的状态为已取消
    public int upOrderStatusT(FoodOrder order);
    //根据用户id 订单编号  订单状态  修改订单
    public int upOrderT(FoodOrder order);
    //根据订单编号 用户id 查询订单信息
    public List<FoodOrder> selOrderT(FoodOrder order);


}
