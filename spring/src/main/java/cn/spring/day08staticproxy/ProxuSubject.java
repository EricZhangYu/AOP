package cn.spring.day08staticproxy;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/12 12:19
 **/
public class ProxuSubject implements Subject{
    private RealSubject realSubject;

    @Override
    public String request() {
//        System.out.println("bbbbbbbbbbbbb");
        String content="aaaaaaaaaaaaaaaa";
        String request=realSubject.request();
        return request+content;
    }

    public RealSubject getRealSubject() {
        return realSubject;
    }

    public void setRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }
}
