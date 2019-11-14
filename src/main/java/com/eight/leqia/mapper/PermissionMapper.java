package com.eight.leqia.mapper;

import com.eight.leqia.entity.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PermissionMapper {

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
