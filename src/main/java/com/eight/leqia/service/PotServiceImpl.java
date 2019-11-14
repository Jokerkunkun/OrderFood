package com.eight.leqia.service;

import com.eight.leqia.entity.Pot;
import com.eight.leqia.mapper.PotMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class PotServiceImpl implements IPotService {

    @Resource
    private PotMapper potMapper;

    /**
     * 查询所有餐具
     * @return
     */
    @Override
    public List<Pot> findAll() {
        return potMapper.findAll();
    }

    /**
     * 模糊查询餐具
     * @param PName
     * @return
     */
    @Override
    public List<Pot> findNameAll(String PName) {
        return potMapper.findNameAll(PName);
    }

    /**
     * 查询需要修改的餐具
     * @param PId
     * @return
     */
    @Override
    public Pot updateFind(Integer PId) {
        return potMapper.updateFind(PId);
    }

    /**
     * 新增锅具
     * @param pot
     * @return
     */
    @Override
    public int add(Pot pot) {
        return potMapper.add(pot);
    }

    /**
     * 修改锅具
     * @param pot
     * @return
     */
    @Override
    public int update(Pot pot) {
        return potMapper.update(pot);
    }

    /**
     * 删除锅具
     * @param PId
     * @return
     */
    @Override
    public int delete(Integer PId) {
        return potMapper.delete(PId);
    }
}
