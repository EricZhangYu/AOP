package cn.spring.day14aop03;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/15 11:43
 **/
 public class MyArroundAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        //环绕增强中的前置增强
        System.out.println("我是AOP代理工厂的前置增强===================");

        //想当于隔离点
        Object result = invocation.proceed();

        //环绕增强中的后置增强
        System.out.println("我是AOP代理工厂的后置增强===================");

        return result;
    }
}
