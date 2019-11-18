package com.eight.leqia.mapper;

import com.eight.leqia.entity.FdTaste;
import com.eight.leqia.entity.FoodOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodOrderMapper {
    //查询订单
     List<FoodOrder> findAllOrder();

    /**
     * 查询最新一条的订单
     * @return
     */
    List<FoodOrder> findAllOrderNew();

    /**
     * 查询总条数
     * @return
     */
    FoodOrder findCount();


    /**
     * 模糊查询订单
     * @param OrderId
     * @return
     */
    List<FoodOrder> findOrderIdAll(String OrderId);

    /**
     * 查询订单详情
     * @param OrderId
     * @return
     */
    List<FoodOrder> findOrderId(String OrderId);


    List<FoodOrder> findCId(Integer CId);

    FoodOrder find1M();
    FoodOrder find2M();
    FoodOrder find3M();
    FoodOrder find4M();
    FoodOrder find5M();
    FoodOrder find6M();
    FoodOrder find7M();
    FoodOrder find8M();
    FoodOrder find9M();
    FoodOrder find10M();
    FoodOrder find11M();
    FoodOrder find12M();
}
