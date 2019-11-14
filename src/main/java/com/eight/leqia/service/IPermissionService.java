package com.eight.leqia.service;

import com.eight.leqia.entity.Permission;

import java.util.List;

public interface IPermissionService {

    /**
     * 查询显示所有权限
     * @return
     */
    List<Permission> findAll();

    List<Permission> findAll_1();

    /**
     * 修改权限状态
     * @return
     */
    int updateUp(int pId);
    int updateDn(int pId);
}
