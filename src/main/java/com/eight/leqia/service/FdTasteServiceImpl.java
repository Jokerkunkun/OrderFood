package com.eight.leqia.service;

import com.eight.leqia.entity.FdTaste;
import com.eight.leqia.mapper.FdTasteMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class FdTasteServiceImpl implements IFdTasteService{

    @Resource
    private FdTasteMapper fdTasteMapper;

    @Override
    public List<FdTaste> findAll() {
        return fdTasteMapper.findAll();
    }

    @Override
    public List<FdTaste> findNameAll(String FdtName) {
        return fdTasteMapper.findNameAll(FdtName);
    }

    @Override
    public int addFdTaste(FdTaste fdTaste) {
        return fdTasteMapper.addFdTaste(fdTaste);
    }

    @Override
    public int deleteFdTaste(Integer FdtId) {
        return fdTasteMapper.deleteFdTaste(FdtId);
    }

    @Override
    public int updateFdTaste(FdTaste fdTaste) {
        return fdTasteMapper.updateFdTaste(fdTaste);
    }

    @Override
    public FdTaste findbyid(Integer FdtId) {
        return fdTasteMapper.findbyid(FdtId);
    }

    @Override
    public FdTaste findCount() {
        return fdTasteMapper.findCount();
    }

    @Override
    public int deleteS(Integer FdtId) {
        return fdTasteMapper.deleteS(FdtId);
    }
}
