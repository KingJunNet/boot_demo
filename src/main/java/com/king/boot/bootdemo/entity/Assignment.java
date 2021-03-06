package com.king.boot.bootdemo.entity;

public class Assignment {
    private int id;
    private String name;
    private int type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Assignment(int id, String name, int type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
}
