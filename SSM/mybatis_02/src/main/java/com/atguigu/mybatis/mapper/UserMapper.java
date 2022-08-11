package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

public interface UserMapper {

    User getUserByUsername(String username);

    User checkLogin(String username, String password);

}
