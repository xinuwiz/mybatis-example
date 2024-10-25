package com.github.xinuwiz.mybatis.example.data.model;

public final class User extends Model {

    private final String name;

    public User(long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
