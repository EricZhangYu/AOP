package cn.spring.day15aop04;


import org.springframework.aop.ThrowsAdvice;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/15 11:43
 **/
public class MyThrowAdvice implements ThrowsAdvice{
    public void afterThrowing(Exception ex){
        System.out.println(ex.getMessage()+"===============出错了");
    }
}
