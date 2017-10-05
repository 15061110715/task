package com.ptteng.service.impl;

import com.ptteng.dao.StudentMapper;
import com.ptteng.pojo.Category;
import com.ptteng.pojo.Student;
import com.ptteng.service.StudentService;
import com.ptteng.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 包子 on 2017/10/1.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    public void add(Student s){
        studentMapper.add(s);
    }
    public void delete(Student s){
        studentMapper.delete(s.getId());
    }
    public void update(Student s){
        studentMapper.update(s);
    }
    public Student get(int id){
        return studentMapper.get(id);
    }
    public List<Student> list(){
        return studentMapper.list();
    }
    public List<Student>list(Page page){
        return studentMapper.list(page);
    }
    public int total(){
        return studentMapper.total();
    }

    @Override
    public Category Login(String username, String password) {
        return studentMapper.Login(username,password);
    }
}
