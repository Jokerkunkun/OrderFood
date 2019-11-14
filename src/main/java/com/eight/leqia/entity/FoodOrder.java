package com.eight.leqia.entity;

import java.util.Date;

public class FoodOrder {

    private String seat;
    private int foodorderid;
    private String OrderId;
    private int CId;
    private String UserName;
    private double OrderPrice;
    private Date OrderTime;
    private Date PaymentTime;
    private String Ordercomment;
    private int OrderStatus;
    private int FId;
    private String FName;
    private Double FPrice;
    private String a;
    private String FIds;
    private String fNames;
    private int goodsNum;
    private Integer Count;
    private Double price;



    public String getfNames() {
        return fNames;
    }

    public void setfNames(String fNames) {
        this.fNames = fNames;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public int getFoodorderid() {
        return foodorderid;
    }

    public void setFoodorderid(int foodorderid) {
        this.foodorderid = foodorderid;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public int getCId() {
        return CId;
    }

    public void setCId(int CId) {
        this.CId = CId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public double getOrderPrice() {
        return OrderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        OrderPrice = orderPrice;
    }

    public Date getOrderTime() {
        return OrderTime;
    }

    public void setOrderTime(Date orderTime) {
        OrderTime = orderTime;
    }

    public Date getPaymentTime() {
        return PaymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        PaymentTime = paymentTime;
    }

    public String getOrdercomment() {
        return Ordercomment;
    }

    public void setOrdercomment(String ordercomment) {
        Ordercomment = ordercomment;
    }

    public int getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        OrderStatus = orderStatus;
    }

    public int getFId() {
        return FId;
    }

    public void setFId(int FId) {
        this.FId = FId;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public Double getFPrice() {
        return FPrice;
    }

    public void setFPrice(Double FPrice) {
        this.FPrice = FPrice;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getFIds() {
        return FIds;
    }

    public void setFIds(String FIds) {
        this.FIds = FIds;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Integer getCount() {
        return Count;
    }

    public void setCount(Integer count) {
        Count = count;
    }
}
