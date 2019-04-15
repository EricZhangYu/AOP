package cn.spring.day15;

import cn.spring.day15aop04.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestThrow {
    //01.自动装配
    @Test
    public void testAutoWire(){
        //创建一个SPring容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day15.xml");
        //2.从容器中获取指定的bean

        SomeService service= (SomeService)ctx.getBean("proxyService");

        try {
            service.add();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}