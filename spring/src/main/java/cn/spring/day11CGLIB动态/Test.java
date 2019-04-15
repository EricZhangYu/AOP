package cn.spring.day11CGLIB动态;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/15 11:13
 **/
public class Test {
    public static void main(final String[] args) {
        final HelloService helloService=new HelloService();
        //CHLIB动态
        Enhancer enhancer=new Enhancer();
        //1.设置superClass父类
        enhancer.setSuperclass(helloService.getClass());
        //2.设置setCallback
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("before");
                Object result=methodProxy.invoke(helloService,args);
                System.out.println("after"+result);
                return result;
            }
        });
        /*
        * 目标对象
        * 目标对象的方法
        * 参数聚合
        * methodProxy代理对象方法
        * return 返回值
        * */

        //3.create创建对象
        HelloService proxy=(HelloService)enhancer.create();
        proxy.DoSome();



    }
}
