package cn.spring.day09Bean;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/10 11:26
 **/
public class HelloService {
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public HelloService(){

        System.out.println("Spring容器已经创建了HelloService实例");

    }

    public void work(){

        System.out.println("Work"+info);

    }
}
