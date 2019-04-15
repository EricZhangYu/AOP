package cn.spring.day08staticproxy;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/12 12:21
 **/
public class Test {
    //静态代理
    public static void main(String[] args) {
        RealSubject realSubject=new RealSubject();
        ProxuSubject proxuSubject=new ProxuSubject();
        proxuSubject.setRealSubject(realSubject);
        String result = proxuSubject.request();
        System.out.println(result);
    }
}
