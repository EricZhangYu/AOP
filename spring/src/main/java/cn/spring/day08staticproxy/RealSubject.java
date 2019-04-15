package cn.spring.day08staticproxy;

import org.omg.PortableInterceptor.SUCCESSFUL;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/12 12:18
 **/
public class RealSubject implements Subject {

    @Override
    public String request() {
        return "request";
    }
}
