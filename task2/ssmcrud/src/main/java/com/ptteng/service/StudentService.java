package com.ptteng.service;

import com.ptteng.pojo.Category;
import com.ptteng.pojo.Student;
import com.ptteng.util.Page;

import java.util.List;

/**
 * Created by 包子 on 2017/10/1.
 */
public interface StudentService {
    void add(Student s);
    void delete(Student s);
    void update(Student s);
    Student get(int id);
    List<Student> list();
    List<Student> list(Page page);
    int total();
    Category Login(String username, String password);
}
