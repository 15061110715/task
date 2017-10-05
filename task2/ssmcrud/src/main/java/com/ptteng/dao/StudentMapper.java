package com.ptteng.dao;

import com.ptteng.pojo.Category;
import com.ptteng.pojo.Student;
import com.ptteng.util.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 包子 on 2017/10/1.
 */
public interface StudentMapper {
    public int add(Student student);//增加
    public void delete(int id);//删除
    public int update(Student student);//修改
    public Student get(int id);//查询
    public List<Student>list();//列出表
    public List<Student>list(Page page);//分页
    public int total();
    Category Login(@Param("username")String username, @Param("password")String password);
}
