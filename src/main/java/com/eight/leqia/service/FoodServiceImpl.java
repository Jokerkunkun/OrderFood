package com.eight.leqia.service;

import com.eight.leqia.entity.Food;
import com.eight.leqia.entity.FoodType;
import com.eight.leqia.mapper.FoodMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service
@Transactional
public class FoodServiceImpl implements FoodService {
    @Resource
    private FoodMapper foodMapper;
    @Override
    public List<Food> findall() {
        return foodMapper.findall();
    }

    @Override
    public Food findbyname(String FName) {
        return foodMapper.findbyname(FName);
    }

    @Override
    public Food findbyid(Integer fid) {
        return foodMapper.findbyid(fid);
    }

    /**
     * 模糊查询菜品
     * @param FName
     * @return
     */
    @Override
    public List<Food> findNameAll(String FName) {
        return foodMapper.findNameAll(FName);
    }

    @Override
    public int add(Food food) {
        return foodMapper.add(food);
    }

    @Override
    public int delete(Integer fid) {
        return foodMapper.delete(fid);
    }

    @Override
    public int update(Food Food) {
        return foodMapper.update(Food);
    }

    @Override
    public int updateStatusForbidden(Integer FId) {
        return foodMapper.updateStatusForbidden(FId);
    }

    @Override
    public int updateStatusStart(Integer FId) {
        return foodMapper.updateStatusStart(FId);
    }

    @Override
    public Food findCount() {
        return foodMapper.findCount();
    }

    @Override
    public List<Food> findFoodNew() {
        return foodMapper.findFoodNew();
    }

    @Override
    public List<Food> findFtId(Integer FtId) {
        return foodMapper.findFtId(FtId);
    }
}
