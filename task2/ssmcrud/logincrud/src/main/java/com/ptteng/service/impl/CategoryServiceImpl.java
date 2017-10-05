package com.ptteng.service.impl;

import com.ptteng.dao.CategoryMapper;
import com.ptteng.pojo.Category;
import com.ptteng.service.CategoryService;
import com.ptteng.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 包子 on 2017/9/28.
 */
@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    CategoryMapper categoryMapper;
    public List<Category> list(){
        return categoryMapper.list();
    }
    @Override//标注的意思是什么？
    public List<Category>list(Page page){
        return categoryMapper.list(page);
    }
    @Override
    public int total(){
        return categoryMapper.total();
    }
    @Override
    public void add(Category c){
        categoryMapper.add(c);
    }
    @Override
    public void update(Category c){
        categoryMapper.update(c);
    }
    @Override
    public void delete(Category c){
        categoryMapper.delete(c.getId());
    }
    @Override
    public Category get (int id){
        return categoryMapper.get(id);
    }
//    ????????????????????????????????
@Override

    public boolean login(String name ){
    Category  category = categoryMapper.selectByName(name);
        if( category!=null){
            if(  category.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
//    ????????????????????????????????
}
