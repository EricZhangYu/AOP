package cn.spring.day05;

import cn.spring.day05autoWair.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/11 12:05
 **/
public class autoWairTest {
    @Test
    public void testAutoWair() {
        //构造一个Spring容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-day05.xml");
        //从容器中获取指定的bean
        Emp emp = ctx.getBean("emp", Emp.class);
        System.out.println(emp.toString());
    }
}
