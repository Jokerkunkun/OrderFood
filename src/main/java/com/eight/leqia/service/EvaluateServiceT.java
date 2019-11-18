package com.eight.leqia.service;



import com.eight.leqia.entity.Evaluate;

import java.util.List;

public interface EvaluateServiceT {
    public int addEvaluate(Evaluate evaluate);
    public List<Evaluate> selAllEvaluate();
    List<Evaluate> selEvaluateOrderID(String OrderId);
}
