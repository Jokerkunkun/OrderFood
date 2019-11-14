package com.eight.leqia.service;

import com.eight.leqia.entity.FoodType;
import com.eight.leqia.mapper.FoodTypeMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class FoodTypeServiceImpl implements FoodTypeService {
    @Resource
    private FoodTypeMapper foodTypeMapper;

    /**
     * 查询所有分类
     * @return
     */
    @Override
    public List<FoodType> findall() {
        return foodTypeMapper.findall();
    }

    /**
     * 查询需要修改的分类
     * @param FtId
     * @return
     */
    @Override
    public FoodType updateFind(Integer FtId) {
        return foodTypeMapper.updateFind(FtId);
    }

    /**
     * 模糊查询分类
     * @param FtName
     * @return
     */
    @Override
    public List<FoodType> findNameAll(String FtName) {
        return foodTypeMapper.findNameAll(FtName);
    }

    @Override
    public FoodType findSole(String FtName) {
        return foodTypeMapper.findSole(FtName);
    }

    /**
     * 修改分类
     * @param foodType
     * @return
     */
    @Override
    public int update(FoodType foodType) {
        return foodTypeMapper.update(foodType);
    }

    /**
     * 删除所选分类
     * @param FtId
     * @return
     */
    @Override
    public int delete(Integer FtId) {
        return foodTypeMapper.delete(FtId);
    }

    /**
     * 新增分类
     * @param foodType
     * @return
     */
    @Override
    public int add(FoodType foodType) {
        return foodTypeMapper.add(foodType);
    }

    @Override
    public FoodType findCount() {
        return foodTypeMapper.findCount();
    }

    @Override
    public int deleteS(Integer FtId) {
        return foodTypeMapper.deleteS(FtId);
    }

    @Override
    public List<FoodType> findFtId(Integer FtId) {
        return foodTypeMapper.findFtId(FtId);
    }
}
