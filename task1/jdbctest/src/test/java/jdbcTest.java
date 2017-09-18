import com.mysql.jdbc.PreparedStatement;
import dao.User;
import dao.UserDao;
import dao.UserDaoImp;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

public class jdbcTest {
public static void main(String[] args) throws SQLException {
   // PreparedStatement pstm =null;
    long startTime=System.currentTimeMillis();
 //   conn.setAutoCommit(false);
        UserDao sd=new UserDaoImp();
        sd.addStudent(new User("测试6", 9, "male", "浙江"));//添加
    //    pstm.addBatch();
   // conn.commit();
  //  pstm.executeBatch();
    long endTime=System.currentTimeMillis();
//    sd.deleteStudent(3);//删除
//    sd.updateStudent(new User(5,"测试",20,"male","江苏"));//修改
//    List<User> students=sd.getAllStudent();
//    Iterator<User> it=students.iterator();
//    while(it.hasNext()){
//        User stu=it.next();
//        System.out.println(stu.getId()+","+stu.getName()+","+stu.getAge()+","+stu.getSex()+","+stu.getLocation());
//    }
    long time=(endTime-startTime)/1000;
    System.out.println("用时："+time+"秒");
}
}
