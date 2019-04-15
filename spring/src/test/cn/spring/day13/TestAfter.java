package cn.spring.day13;

import cn.spring.day13aop02.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/15 11:52
 **/
public class TestAfter {
    @org.junit.Test
    public void testAOPFactory(){
        //创建一个Spring容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day13.xml");
        //从容器中获得指定的bean
        SomeService someService=(SomeService)ctx.getBean("proxyService");
        someService.add();
    }
}
