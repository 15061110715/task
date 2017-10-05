package com.ptteng.service;

import com.ptteng.pojo.Category;
import com.ptteng.util.Page;

import java.util.List;

/**
 * Created by 包子 on 2017/9/28.
 */
public interface CategoryService {

    List<Category> list();
    int total();
    List<Category>list(Page page);
    void add(Category c);
    void update(Category c);
    void delete(Category c);
    Category get(int id);
//    ????????????????????????????????
public boolean login(String name);
//    ??????????????????????????????
}