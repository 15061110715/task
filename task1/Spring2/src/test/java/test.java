import com.action.Action;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class test{
    @Test
    public void testQuick(){
        ApplicationContext ctx=new FileSystemXmlApplicationContext("classpath:bean.xml");
        Action action=(Action)ctx.getBean("TheAction");
        System.out.println(action.execute(" Rod Johnson"));
    }
}