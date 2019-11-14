package com.eight.leqia.mapper;

import com.eight.leqia.entity.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface UserMapperT {
    List<User> findAll();
}
