package com.eight.leqia.service;

import com.eight.leqia.entity.Admin;
import com.eight.leqia.mapper.AdminMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class AdminServiceImpl implements IAdminService {

    @Resource
    private AdminMapper adminMapper;

    /**
     * 后台登陆
     * @param AUserName
     * @param APassword
     * @return
     */
    @Override
    public Admin login(String AUserName, String APassword) {
        return adminMapper.login(AUserName,APassword);
    }

    /**
     * 查询所有管理员
     * @return
     */
    @Override
    public List<Admin> findAll() {
        return adminMapper.findAll();
    }

    /**
     *查询需要修改密码的管理员
     * @param AdId
     * @return
     */
    @Override
    public Admin updatePasswordFind(Integer AdId) {
        return adminMapper.updatePasswordFind(AdId);
    }

    /**
     *修改管理员密码
     * @param admin
     * @return
     */
    @Override
    public int updatePassword(Admin admin) {
        return adminMapper.updatePassword(admin);
    }

    /**
     * 禁用该管理员
     * @param AdId
     * @return
     */
    @Override
    public int updateStatusForbidden(Integer AdId) {
        return adminMapper.updateStatusForbidden(AdId);
    }

    /**
     * 启用该管理员
     * @param AdId
     * @return
     */
    @Override
    public int updateStatusStart(Integer AdId) {
        return adminMapper.updateStatusStart(AdId);
    }

    /**
     * 删除该管理员
     * @param AdId
     * @return
     */
    @Override
    public int delete(Integer AdId) {
        return adminMapper.delete(AdId);
    }

    /**
     * 新增管理员
     * @param admin
     * @return
     */
    @Override
    public int add(Admin admin) {
        return adminMapper.add(admin);
    }

    /**
     * 根据name查询
     * @param AUserName
     * @return
     */
    @Override
    public List<Admin> findNameAll(String AUserName) {
        return adminMapper.findNameAll(AUserName);
    }

    /**
     * 根据选择的日期进行查询
     * @param registration1
     * @param registration2
     * @return
     */
    @Override
    public List<Admin> findDateAll(String registration1, String registration2) {
        return adminMapper.findDateAll(registration1,registration2);
    }

    /**
     * 根据选择的日期和name进行查询
     * @param registration1
     * @param registration2
     * @return
     */
    @Override
    public List<Admin> findDateNameAll(String registration1, String registration2,String AUserName) {
        return adminMapper.findDateNameAll(registration1,registration2,AUserName);
    }

    @Override
    public Admin findCount() {
        return adminMapper.findCount();
    }

}
