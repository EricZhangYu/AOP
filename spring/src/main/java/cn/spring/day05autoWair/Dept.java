package cn.spring.day05autoWair;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/11 12:20
 **/
public class Dept {
    private String deptno;
    private String deptname;

    @Override
    public String toString() {
        return "Dept{" +
                "deptno='" + deptno + '\'' +
                ", deptname='" + deptname + '\'' +
                '}';
    }

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
}
