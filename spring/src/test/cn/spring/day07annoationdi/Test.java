package cn.spring.day07annoationdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/12 10:25
 **/
public class Test {
@org.junit.Test
//记得在实体类中添加注解
    public void testAnnoationdi(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-day07.xml");
        Book book=ctx.getBean("book",Book.class);
        System.out.println(book.getBookId());
        System.out.println(book.getBookName());
        System.out.println(book.getBookPrice());
        System.out.println(book.getPub().getPubliName());

    }
}
