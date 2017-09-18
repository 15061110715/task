package ptteng.model.test;
import ptteng.model.domain.User;
import ptteng.model.service.UserServiceI;
//import me.gacl.service.UserServiceI;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBatisTest {
    private UserServiceI userService;

            /**
       * 这个before方法在所有的测试方法之前执行，并且只执行一次
       * 所有做Junit单元测试时一些初始化工作可以在这个方法里面进行
       * 比如在before方法里面初始化ApplicationContext和userService
       */
             @Before
     public void before(){
                //使用"spring.xml"和"spring-mybatis.xml"这两个配置文件创建Spring上下文
                 ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml","spring-mybatis.xml"});
                //从Spring容器中根据bean的id取出我们要使用的userService对象
                 userService = (UserServiceI) ac.getBean("userService");
             }

             @Test
     public void testAddUser(){
                 //ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
                 //UserServiceI userService = (UserServiceI) ac.getBean("userService");
                 User user = new User();
                 user.setId("53");
                 user.setUsername("小唐");
                 user.setAge(20);
                 userService.addUser(user);
                 System.out.println("好了好了");
             }
}
