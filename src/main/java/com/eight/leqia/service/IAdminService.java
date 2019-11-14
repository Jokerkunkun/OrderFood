package com.eight.leqia.service;

import com.eight.leqia.entity.Admin;

import java.util.List;

public interface IAdminService {

    /**
     * 后台登陆
     * @param AUserName
     * @param APassword
     * @return
     */
    Admin login(String AUserName,String APassword);

    /**
     *查询所有管理员
     * @return
     */
    List<Admin> findAll();

    /**
     *查询需要修改密码的管理员
     * @param AdId
     * @return
     */
    Admin updatePasswordFind(Integer AdId);

    /**
     *修改管理员密码
     * @param admin
     * @return
     */
    int updatePassword(Admin admin);

    /**
     * 禁用该管理员
     * @param AdId
     * @return
     */
    int updateStatusForbidden(Integer AdId);

    /**
     * 启用该管理员
     * @param AdId
     * @return
     */
    int updateStatusStart(Integer AdId);

    /**
     * 删除该管理员
     * @param AdId
     * @return
     */
    int delete(Integer AdId);

    /**
     * 新增管理员
     * @param admin
     * @return
     */
    int add(Admin admin);

    /**
     * 根据name查询
     * @param AUserName
     * @return
     */
    List<Admin> findNameAll(String AUserName);

    /**
     * 根据选择的日期进行查询
     * @param registration1
     * @param registration2
     * @return
     */
    List<Admin> findDateAll(String registration1,String registration2);

    /**
     * 根据选择的日期和name进行查询
     * @param registration1
     * @param registration2
     * @return
     */
    List<Admin> findDateNameAll(String registration1,String registration2,String AUserName);

    /**
     * 查询总条数
     * @return
     */
    Admin findCount();


}
