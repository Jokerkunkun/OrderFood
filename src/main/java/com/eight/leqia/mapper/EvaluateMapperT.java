package com.eight.leqia.mapper;

import com.eight.leqia.entity.Evaluate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EvaluateMapperT {
    public int addEvaluate(Evaluate evaluate);

    public List<Evaluate> selAllEvaluate();

    List<Evaluate> selEvaluateOrderID(String OrderId);
}

