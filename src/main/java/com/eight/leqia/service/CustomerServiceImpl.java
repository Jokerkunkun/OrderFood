package com.eight.leqia.service;

import com.eight.leqia.entity.Customer;
import com.eight.leqia.mapper.CustomerMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {

    @Resource
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> findAll() {
        return customerMapper.findAll();
    }

    @Override
    public int updateStatusForbidden(Integer CId) {
        return customerMapper.updateStatusForbidden(CId);
    }

    @Override
    public int updateStatusStart(Integer CId) {
        return customerMapper.updateStatusStart(CId);
    }

    @Override
    public int delete(Integer CId) {
        return customerMapper.delete(CId);
    }

    @Override
    public List<Customer> findNameAll(String UserName) {
        return customerMapper.findNameAll(UserName);
    }

    @Override
    public List<Customer> findDateAll(String registration1, String registration2) {
        return customerMapper.findDateAll(registration1,registration2);
    }

    @Override
    public List<Customer> findDateNameAll(String registration1, String registration2, String UserName) {
        return customerMapper.findDateNameAll(registration1,registration2,UserName);
    }

    @Override
    public Customer findCount() {
        return customerMapper.findCount();
    }

    @Override
    public int deleteS(Integer CId) {
        return customerMapper.deleteS(CId);
    }
}
