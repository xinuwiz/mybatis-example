package com.github.xinuwiz.mybatis.example;

import com.github.xinuwiz.mybatis.example.data.mapper.UserMapper;
import com.github.xinuwiz.mybatis.example.data.model.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public final class Main {

    public static void main(String[] args) {
        InputStream is = Main.class.getResourceAsStream("/mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.createTable();
        User user = new User(1, "name");
        mapper.save(user);
        User lookup = mapper.getWithIdentifier(1);
        System.out.println(lookup.getName());
    }
}