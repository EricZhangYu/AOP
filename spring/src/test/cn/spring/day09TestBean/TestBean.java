package cn.spring.day09TestBean;

import cn.spring.day09Bean.HelloService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/15 10:00
 **/
public class TestBean {
    @Test
    public void testyBean(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-day09.xml");
        HelloService service1=(HelloService)ctx.getBean("helloService");
        System.out.println(service1);


        HelloService service2=(HelloService)ctx.getBean("helloService");
        System.out.println(service2);

    }

}
