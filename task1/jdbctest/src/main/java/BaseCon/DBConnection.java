package BaseCon;

import java.sql.*;


public class DBConnection {
        //获取数据库连接
        public static Connection getConnection() {
            Connection conn = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");//将驱动加载，供给jmv使用，开始执行静态初始化代码时，会自动新建一个Driver的对象，并调用DriverManager.registerDriver把自己注册到DriverManager中去。
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chenh?useUnicode=true&characterEncoding=utf-8&useSSL=false&amp;rewriteBatchedStatements=true", "root", "123456");
            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();//在命令行打印异常信息在程序中出错的位置及原因
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return conn;
        }
       //关闭所有资源
        public static void closeAll(ResultSet rs,Statement stmt,Connection conn){
            try {
                if(rs!=null)
                    rs.close();//result set
                if(stmt!=null)
                    stmt.close();
                if(conn!=null)
                    conn.close();//connection
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
