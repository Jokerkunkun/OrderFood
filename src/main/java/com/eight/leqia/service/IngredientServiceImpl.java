package com.eight.leqia.service;

import com.eight.leqia.entity.Ingredient;
import com.eight.leqia.mapper.IngredientMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService {
    @Resource
    private IngredientMapper ingredientMapper;
    @Override
    public List<Ingredient> findAllig() {
        return ingredientMapper.findAllig();
    }

    /**
     * 模糊查询配料
     * @param IngName
     * @return
     */
    @Override
    public List<Ingredient> findNameAll(String IngName) {
        return ingredientMapper.findNameAll(IngName);
    }

    @Override
    public Ingredient findbyid(Integer Ingid) {
        return ingredientMapper.findbyid(Ingid);
    }

    @Override
    public int add(Ingredient ingredient) {
        return ingredientMapper.add(ingredient);
    }

    @Override
    public int delete(Integer Ingid) {
        return ingredientMapper.delete(Ingid);
    }

    @Override
    public int update(Ingredient ingredient) {
        return ingredientMapper.update(ingredient);
    }

    @Override
    public int updateimg(Ingredient ingredient) {
        return ingredientMapper.updateimg(ingredient);
    }

}
