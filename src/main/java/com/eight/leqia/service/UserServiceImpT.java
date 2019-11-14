package com.eight.leqia.service;

import com.eight.leqia.entity.User;
import com.eight.leqia.mapper.UserMapperT;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserServiceImpT implements UserServiceT {
    @Resource
    private UserMapperT userMapperT;
    @Override
    public List<User> findAll() {
        return userMapperT.findAll();
    }
}
