package com.eight.leqia.mapper;

import com.eight.leqia.entity.Customer;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapperT {
    Customer selCustom(String UserName, String HeadPortrait);
    int add(String UserName, String HeadPortrait);


}
