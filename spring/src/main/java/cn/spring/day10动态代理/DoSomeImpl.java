package cn.spring.day10动态代理;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/15 10:49
 **/
public class DoSomeImpl implements DoSome {
    @Override
    public String dosome() {
        return "嘿 那傻狗！";
    }
}
