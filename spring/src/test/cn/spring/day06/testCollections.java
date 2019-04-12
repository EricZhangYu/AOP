package cn.spring.day06;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/11 16:21
 **/
public class testCollections {
    @Test
    public void testCollections(){
        //构造一个Spring容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-day06.xml");
        MyCollections myCollections=ctx.getBean("MyCollections",MyCollections.class);

        for(String item:myCollections.getArray()){
            System.out.println(item);
        }

        for(String item:myCollections.getList()){
            System.out.println(item);
        }

        for(String item:myCollections.getSet()){
            System.out.println(item);
        }

        for(String item:myCollections.getMap().keySet()){
            System.out.println(item+"\t"+myCollections.getMap().get(item));
        }

        for(Object item:myCollections.getProperties().keySet()){
            System.out.println(item+"\t"+myCollections.getProperties().get(item));
        }
    }
}
