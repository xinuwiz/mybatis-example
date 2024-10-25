package com.github.xinuwiz.mybatis.example.data.model;

public abstract class Model {

    private final long id;

    public Model(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
