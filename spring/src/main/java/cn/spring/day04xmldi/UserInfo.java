package cn.spring.day04xmldi;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/11 11:54
 **/
public class UserInfo {
    private Integer id;
    private String name;
    private Address Address;

    //继承的时候，子类的构造默认先调度父类的无参构造
    //框架  实例化  框架用的
    public UserInfo(){}

    public UserInfo(Integer id, String name, cn.spring.day04xmldi.Address address) {
        this.id = id;
        this.name = name;
        Address = address;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Address=" + Address +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public cn.spring.day04xmldi.Address getAddress() {
        return Address;
    }

    public void setAddress(cn.spring.day04xmldi.Address address) {
        Address = address;
    }
}
