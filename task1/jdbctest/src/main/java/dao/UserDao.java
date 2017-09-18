package dao;

import java.util.List;

public interface UserDao {
    public void addStudent(User stu);//添加学生
    public void deleteStudent(int id);//删除学生
    public void updateStudent(User stu);//修改信息
    public List<User> getAllStudent();//全部查询
}
