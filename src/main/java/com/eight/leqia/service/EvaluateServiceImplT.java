package com.eight.leqia.service;

import com.eight.leqia.entity.Evaluate;
import com.eight.leqia.mapper.EvaluateMapperT;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class EvaluateServiceImplT implements EvaluateServiceT {

    @Resource
    private EvaluateMapperT evaluateMapperT;
    @Override
    public int addEvaluate(Evaluate evaluate) {
        return evaluateMapperT.addEvaluate(evaluate);
    }

    @Override
    public List<Evaluate> selAllEvaluate() {
        return evaluateMapperT.selAllEvaluate();
    }

    @Override
    public List<Evaluate> selEvaluateOrderID(String OrderId) {
        return evaluateMapperT.selEvaluateOrderID(OrderId);
    }
}
