package com.eight.leqia.entity;

import java.util.List;

public class OrderGoods {
    private String OrderId;
    private double OrderPrice;
    private int OrderStatus;
    private List<FoodTypeVo> foods;
    private String Fname;
    private String FUrl;
    private String seat;

    public List<FoodTypeVo> getFoods() {
        return foods;
    }

    public void setFoods(List<FoodTypeVo> foods) {
        this.foods = foods;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public double getOrderPrice() {
        return OrderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        OrderPrice = orderPrice;
    }

    public int getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        OrderStatus = orderStatus;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getFUrl() {
        return FUrl;
    }

    public void setFUrl(String FUrl) {
        this.FUrl = FUrl;
    }
}
