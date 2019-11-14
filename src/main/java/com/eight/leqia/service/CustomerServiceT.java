package com.eight.leqia.service;

import com.eight.leqia.entity.Customer;

public interface CustomerServiceT {
    public int add(String UserName, String HeadPortrait);
    public Customer selCustom(String UserName, String HeadPortrait);
}
