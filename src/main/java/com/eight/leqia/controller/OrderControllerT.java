package com.eight.leqia.controller;


import com.eight.leqia.entity.FoodOrder;
import com.eight.leqia.entity.FoodTypeVo;
import com.eight.leqia.entity.Foods;
import com.eight.leqia.entity.OrderGoods;
import com.eight.leqia.service.FoodServiceT;
import com.eight.leqia.service.OrderServiceT;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("qt")
public class OrderControllerT {



    @Autowired
    private OrderServiceT orderService;
    @Autowired
    private FoodServiceT foodService;

    @RequestMapping("addOrder")
    @ResponseBody
    public int addOrder(FoodOrder foodOrder){
        //生成6位随机数字
        String OrderId =(int)((Math.random()*9+1)*100000)+"";

        foodOrder.setOrderId(OrderId);
        String a=foodOrder.getA();
        //将json 转换为 list对象
        Gson gson = new Gson();


        List<Foods> list = gson.fromJson(a, new TypeToken<List<Foods>>(){}.getType());
        for(int i = 0; i < list.size() ; i++)  {
            Foods food = list.get(i);
            //设置商品id
            foodOrder.setFId(food.getGoodsid());
            //设置商品数量
            foodOrder.setGoodsNum(food.getNum());
               orderService.addOrder(foodOrder);
        }

        return  1;
    }



    @RequestMapping("selAllOrder")
    @ResponseBody
    public  List<OrderGoods> selAllOrder(int CId){


        List<OrderGoods> orderGoodsList=new ArrayList<OrderGoods>();
        List<FoodOrder> orderList= orderService.selAllOrder(CId);
        selorder(orderGoodsList, orderList);


        return  orderGoodsList;
    }

    private void selorder(List<OrderGoods> orderGoodsList, List<FoodOrder> orderList) {
        for (int i = 0; i < orderList.size(); i++) {
            OrderGoods orderGoods = new OrderGoods();
            String OrderId = orderList.get(i).getOrderId();
            String FIds = orderList.get(i).getFIds();
            System.out.println(OrderId);
            //设置订单编号
            orderGoods.setOrderId(OrderId);

            List<FoodOrder> foodOrderList = orderService.selOrderById(OrderId);
            //设置订单价格
            orderGoods.setOrderPrice(foodOrderList.get(0).getOrderPrice());
            //订单状态
            orderGoods.setOrderStatus(foodOrderList.get(0).getOrderStatus());
            //座位号
            orderGoods.setSeat(foodOrderList.get(0).getSeat());
            System.out.println(FIds);
            String[] FId = FIds.split(",");
            //商品
            List<FoodTypeVo> foodsList = new ArrayList<FoodTypeVo>();
            for (int j = 0; j < FId.length; j++) {
                System.out.println(FId[j]);
                FoodTypeVo foods = foodService.selFoodsById(FId[j]);
                FoodOrder foodOrder = orderService.setGoodsNum(OrderId, FId[j]);
                foods.setGoodsNum(foodOrder.getGoodsNum());

                foodsList.add(foods);
            }
            //设置商品
            orderGoods.setFoods(foodsList);

            orderGoodsList.add(orderGoods);

            System.out.println(orderGoods.getOrderId());
        }
        System.out.println(orderGoodsList);
    }

    @RequestMapping("selOrder")
    @ResponseBody
    public  List<OrderGoods> selOrder(int CId,int OrderStatus){


        List<OrderGoods> orderGoodsList=new ArrayList<OrderGoods>();
       List<FoodOrder> orderList= orderService.selOrder(CId,OrderStatus);
        selorder(orderGoodsList, orderList);


        return  orderGoodsList;
    }


    @RequestMapping("delOrderBy")
    @ResponseBody
    public int  del(String OrderId){
        orderService.delOrderById(OrderId);
        return 1;
    }

    @RequestMapping("selFirstOrder")
    @ResponseBody
    public FoodOrder  selFirstOrder(int CId){
        return orderService.selFirstOrder(CId);
    }

    @RequestMapping("upOrderStatus")
    @ResponseBody
    public int  upOrderStatus(FoodOrder foodOrder){
        return orderService.upOrderStatus(foodOrder);
    }

    @RequestMapping("selOrderT")
    @ResponseBody
    public List<FoodOrder> selOrderT(FoodOrder foodOrder){
        return orderService.selOrderT(foodOrder);
    }

    @RequestMapping("upOrderStatusT")
    @ResponseBody
    public int  upOrderStatusT(FoodOrder foodOrder){
        return orderService.upOrderStatusT(foodOrder);
    }

    @RequestMapping("upOrderT")
    @ResponseBody
    public int  upOrderT(FoodOrder foodOrder){
        return orderService.upOrderT(foodOrder);
    }



}

