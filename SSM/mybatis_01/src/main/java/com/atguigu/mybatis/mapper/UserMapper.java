package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    int insertUser();

    int updateUser();

    int deleteUser();

    User getUserById();

    List<User> getAllUser();
}
