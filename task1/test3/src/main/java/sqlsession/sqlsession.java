package sqlsession;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class sqlsession {
    public static SqlSessionFactory getSqlSessionFactory(){
        String resource="configuration.xml";
        InputStream is=sqlsession.class.getClassLoader().getResourceAsStream(resource);
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        return factory;
    }
    public static SqlSession getSqlSession(){ return getSqlSessionFactory().openSession();
    }
    public static SqlSession getSqlSession(boolean isAutoCommit){
        return getSqlSessionFactory().openSession(isAutoCommit);
    }
}
