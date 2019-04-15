package cn.spring.day10动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/15 10:50
 **/
public class Test {
    //JDK动态代理
    public static void main(String[] args) {
       final DoSome doSome=new DoSomeImpl();
       //proxy
        DoSome proxy=(DoSome) Proxy.newProxyInstance(doSome.getClass().getClassLoader(),
                doSome.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("log");
                        Object result=method.invoke(doSome);
                        System.out.println("================"+result);
                        return result;
                    }
                });
        proxy.dosome();
    }
}
