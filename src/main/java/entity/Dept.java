package entity;

import java.util.List;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/8 9:39
 **/
public class Dept {
        private Integer deptno;
        private String deptname;
        //一对多的过程中，一的一方对多的一方的时候，就要将多的一方存进集合中
        private List<Emp> emps;

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
}
