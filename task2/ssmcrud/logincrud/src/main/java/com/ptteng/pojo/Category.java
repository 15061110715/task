package com.ptteng.pojo;

/**
 * Created by 包子 on 2017/9/28.
 */
public class Category {
    private int id;
    private String name;

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
    @Override
    public String toString(){return "Category[id="+ id +",name="+ name +"]";
    }
}
