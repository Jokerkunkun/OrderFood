package com.eight.leqia.service;

import com.eight.leqia.entity.Admin;
import com.eight.leqia.entity.Staff;
import com.eight.leqia.mapper.StaffMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class StaffServiceImpl implements IStaffService {

    @Resource
    private StaffMapper staffMapper;

    @Override
    public List<Staff> findAll() {
        return staffMapper.findAll();
    }

    @Override
    public int add(Staff staff) {
        return staffMapper.add(staff);
    }

    @Override
    public Staff findUpdate(int AdId) {
        return staffMapper.findUpdate(AdId);
    }

    @Override
    public int update(Staff staff) {
        return staffMapper.update(staff);
    }

    @Override
    public int delete(int AdId) {
        return staffMapper.delete(AdId);
    }

    @Override
    public int updateStatusForbidden(int AdId) {
        return staffMapper.updateStatusForbidden(AdId);
    }

    @Override
    public int updateStatusStart(int AdId) {
        return staffMapper.updateStatusStart(AdId);
    }

    @Override
    public Staff SelAdmin(String AUserName) {
        return staffMapper.SelAdmin(AUserName);
    }

    @Override
    public List<Staff> findNameAll(String AUserName) {
        return staffMapper.findNameAll(AUserName);
    }

    @Override
    public List<Staff> findDateAll(String registration1, String registration2) {
        return staffMapper.findDateAll(registration1,registration2);
    }

    @Override
    public List<Staff> findDateNameAll(String registration1, String registration2, String AUserName) {
        return staffMapper.findDateNameAll(registration1,registration2,AUserName);
    }

    @Override
    public Staff findCount() {
        return staffMapper.findCount();
    }

    @Override
    public int deleteS(Integer AdId) {
        return staffMapper.deleteS(AdId);
    }
}
