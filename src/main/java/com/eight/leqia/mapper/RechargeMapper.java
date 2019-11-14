package com.eight.leqia.mapper;

import com.eight.leqia.entity.Recharge;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RechargeMapper {

    List<Recharge> findAll();
}
