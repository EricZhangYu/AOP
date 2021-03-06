package cn.spring.day01;

import cn.spring.day01.entity.Person;
import cn.spring.day02printer.Printer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/10 11:33
 **/
public class SpringTestDay01 {
    @Test
    public void testBean(){
        //01,我要装载applicationContext.xml文件
        //这就是传说中的Spring容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloService service=(HelloService)ctx.getBean("helloService");
        System.out.println(service.getInfo());
    }

    @Test
    public void testPrinter(){
        //创建一个SPring容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day02.xml");
        //2.从容器中获取指定的bean
        Printer printer = ctx.getBean("printer", Printer.class);
        printer.print();
    }
    @Test
    public void testIOCBase(){
        //创建一个SPring容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从容器中获取指定的bean
        Person person = ctx.getBean("person", Person.class);
        System.out.printf("名称是%s\t年龄是%d\t开的是%s\t颜色是%s",person.getName(),person.getAge(),person.getCar().getBrand(),person.getCar().getColor());
    }


}
