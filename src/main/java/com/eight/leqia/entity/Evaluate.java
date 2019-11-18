package com.eight.leqia.entity;

public class Evaluate {
    private int evid;
    private int CId;
    private  int grade;
    private String evlabel;
    private String evimage;
    private String evcontent;
    private String OrderId;
    private String addtime;
    private  String[] evimages;
    private Customer customer;
    private String UserName;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String[] getEvimages() {
        return evimages;
    }

    public void setEvimages(String[] evimages) {
        this.evimages = evimages;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public int getEvid() {
        return evid;
    }

    public void setEvid(int evid) {
        this.evid = evid;
    }

    public int getCId() {
        return CId;
    }

    public void setCId(int CId) {
        this.CId = CId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getEvlabel() {
        return evlabel;
    }

    public void setEvlabel(String evlabel) {
        this.evlabel = evlabel;
    }

    public String getEvimage() {
        return evimage;
    }

    public void setEvimage(String evimage) {
        this.evimage = evimage;
    }

    public String getEvcontent() {
        return evcontent;
    }

    public void setEvcontent(String evcontent) {
        this.evcontent = evcontent;
    }
}
