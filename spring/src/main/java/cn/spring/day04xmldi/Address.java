package cn.spring.day04xmldi;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/11 11:55
 **/
public class Address {
    private String position;

    @Override
    public String toString() {

        return "Address{" +
                "position='" + position + '\'' +
                '}';
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
