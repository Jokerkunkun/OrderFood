package com.eight.leqia.service;

import com.eight.leqia.entity.Permission;
import com.eight.leqia.mapper.PermissionMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class PermissionServiceImpl implements IPermissionService {

    @Resource
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> findAll() {
        return permissionMapper.findAll();
    }

    @Override
    public List<Permission> findAll_1() {
        return permissionMapper.findAll_1();
    }

    @Override
    public int updateUp(int pId) {
        return permissionMapper.updateUp(pId);
    }

    @Override
    public int updateDn(int pId) {
        return permissionMapper.updateDn(pId);
    }
}
