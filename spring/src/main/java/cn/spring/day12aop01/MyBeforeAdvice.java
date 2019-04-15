package cn.spring.day12aop01;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/15 11:43
 **/
 public class MyBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("我是AOP代理工厂的前置增强===================");
    }
}
