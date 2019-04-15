package cn.spring.day13aop02;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/15 11:43
 **/
 public class MyAfterAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("我是AOP代理工厂的后置增强===================");
    }
}
