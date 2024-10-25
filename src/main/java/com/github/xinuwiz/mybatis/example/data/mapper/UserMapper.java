package com.github.xinuwiz.mybatis.example.data.mapper;

import com.github.xinuwiz.mybatis.example.data.model.User;

public interface UserMapper {

    void createTable();

    void save(User user);

    User getWithIdentifier(long id);

}
