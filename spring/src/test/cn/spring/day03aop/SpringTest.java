package cn.spring.day03aop;

import cn.spring.day03aop.entity.User;
import cn.spring.day03aop.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/11 10:26
 **/
public class SpringTest {
    @Test
    public void testSpring(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day03.xml");
        IUserService service = ctx.getBean("userService", IUserService.class);
        service.saveUser(new User());
    }
}
