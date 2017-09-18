package tset;

import java.io.IOException;
import java.io.InputStream;

import mybatis.user;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import sqlsession.sqlsession;
import org.junit.Test;
import java.util.List;
import org.apache.log4j.Logger;


public class tset {
    public static Logger lo=Logger.getLogger(tset.class);
@Test
        //添用户
        //Logger log = Logger.getLogger(tset.class);

    public void testAdd() {
    for(int i=1;i<=10;i++){
        SqlSession sqlSession = sqlsession.getSqlSession(true);
        String statement = "user.addUser";//映射sql的标识字符串
        user user = new user("小明", 10);
        int retResult = sqlSession.insert(statement, user);
        sqlSession.close();
        lo.info(retResult);
        lo.info("插入信息的id为"+user.getId());
        // / System.out.println(retResult);
        lo.info("添加完成");
        //System.out.println("添加成功");
    }
}
    @Test//删除用户
    public void testDelete(){
    SqlSession sqlSession=sqlsession.getSqlSession(true);
    String statement ="user.deleteUser";
    int retResult =sqlSession.delete(statement,1);
    sqlSession.close();
    System.out.println(retResult);
    System.out.println("删除成功");
    }
    @Test//更新
    public void testupdate(){
        SqlSession sqlSession=sqlsession.getSqlSession(true);
        String statement="user.updateUser";
        user user=new user(3,"小红",20);
        int reResult =sqlSession.update(statement,user);
        sqlSession.close();
        System.out.println(reResult);
        System.out.println("修改成功");
    }
    @Test//按id查找
    public  void testget(){
        SqlSession sqlSession=sqlsession.getSqlSession(true);
        String statement="user.getUser";
        user reReslut =sqlSession.selectOne(statement,6);
        sqlSession.close();
        System.out.println(reReslut);
        System.out.println("查找成功");
    }
    @Test//查找全部
    public void testall(){
        SqlSession sqlSession=sqlsession.getSqlSession(true);
        String statement="user.allUser";
        List<user> listuser=sqlSession.selectList(statement);
        sqlSession.close();
        System.out.println(listuser);
        System.out.println("查找成功");
    }
}
    /*public static void main(String[] args) throws IOException {
        String resource = "configuration.xml";
        InputStream is = user.class.getClassLoader().getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sessionFactory.openSession();
        String statement = "user.getUser";
        user user = session.selectOne(statement, 1);
        System.out.println(user);
    }
    */
