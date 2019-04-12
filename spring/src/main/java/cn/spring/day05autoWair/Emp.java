package cn.spring.day05autoWair;

import java.util.Date;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/11 12:21
 **/
public class Emp {
    private Integer empno;
    private String empname;
    private Dept dept;

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", empname='" + empname + '\'' +
                ", dept=" + dept +
                '}';
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpnam(String empname) {
        this.empname = empname;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
