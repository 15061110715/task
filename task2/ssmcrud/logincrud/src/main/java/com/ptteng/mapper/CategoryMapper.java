package com.ptteng.dao;

/**
 * Created by 包子 on 2017/9/28.
 */

import com.ptteng.pojo.Category;
import com.ptteng.util.Page;
import java.util.List;

public interface CategoryMapper {
    public int add(Category category);//为什么这里的形式都是一个大写一个小写
    public void delete(int id);
    public Category get(int id);
    public int update(Category category);
    public List<Category>list();
    public List<Category>list(Page page);
    public int total();
    public Category selectByName(String name);
}
