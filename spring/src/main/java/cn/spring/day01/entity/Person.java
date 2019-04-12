package cn.spring.day01.entity;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/10 12:30
 **/
public class Person {
    private String name;
    private Integer age;
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
