package cn.spring.day04;

import cn.spring.day04xmldi.UserInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/11 12:05
 **/
public class ConstructTest {
    @Test
    public void testDiConstructot(){
        //构造一个Spring容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day04.xml");
        //从容器中获取指定的bean
        UserInfo userInfo=ctx.getBean("uinfo",UserInfo.class);
        System.out.println(userInfo);
    }
}
