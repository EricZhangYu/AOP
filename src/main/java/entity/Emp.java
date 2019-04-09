package entity;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/8 9:40
 **/

//在部门和员工中，员工的emp属于多的一方，我们如果希望在检索员工的同时能检索出多的一方植入的一方的一个对象
//就是植入一个dept对象
public class Emp {
        private Integer empno;
        private String empName;
        private Dept dept;

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
