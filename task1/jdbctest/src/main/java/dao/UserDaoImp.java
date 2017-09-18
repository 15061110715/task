package dao;

import BaseCon.DBConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.ArrayList;


public class UserDaoImp implements UserDao {
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

 @Override
public  void addStudent(User stu){
    String sql="insert into people values(null,?,?,?,?)";
    try{
        conn= DBConnection.getConnection();
pstmt=conn.prepareStatement(sql);
//pstmt.setInt(1,stu.getId());
conn.setAutoCommit(false);
for(int j=1;j<=1000;j++){
for(int i=1;i<=1000;i++) {
    pstmt.setString(1, stu.getName());
    pstmt.setInt(2, stu.getAge());
    pstmt.setString(3, stu.getSex());
    pstmt.setString(4, stu.getLocation());
   // pstmt.executeUpdate();
    pstmt.addBatch();
}}  System.out.println("添加成功");
        pstmt.executeBatch();
        conn.commit();
    }catch (SQLException e){
        e.printStackTrace();
    }
    finally{

        DBConnection.closeAll(rs,pstmt,conn);
    }
}
     @Override
    public void deleteStudent(int id) {
        String sql="delete from people where id=?";
        try {
            conn=DBConnection.getConnection();
            pstmt=conn.prepareStatement(sql);
            pstmt.setObject(1, id);
            pstmt.executeUpdate();
            System.out.println("删除學生成功！");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBConnection.closeAll(rs, pstmt, conn);
        }
    }
    @Override
    public void updateStudent(User stu){
    String sql="update people set name=?,age=?,sex=?,location=? where id=?";
    try {
     conn=DBConnection.getConnection();
     pstmt=conn.prepareStatement(sql);
     pstmt.setString(1,stu.getName());
     pstmt.setInt(2,stu.getAge());
     pstmt.setString(3,stu.getSex());
     pstmt.setString(4,stu.getLocation());
     pstmt.setInt(5,stu.getId());
     pstmt.executeUpdate();
     System.out.println("修改学生成功");
    }catch(SQLException e){
        e.printStackTrace();
    }
    finally{
        DBConnection.closeAll(rs,pstmt,conn);
    }
    }
    @Override
    public List<User> getAllStudent(){
        List<User> people =new ArrayList<User>();
        String sql="select *from people";
        try{
            conn=DBConnection.getConnection();
            pstmt=conn.prepareStatement(sql);
            rs=pstmt.executeQuery();
            while(rs.next()){
         User stu=new User(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5));
          people.add(stu);
            }
        }catch(SQLException e){
        e.printStackTrace();
        }finally{
            DBConnection.closeAll(rs,pstmt,conn);
        }
        return people;
    }
}

