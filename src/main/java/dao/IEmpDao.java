package dao;

import entity.Dept;
import entity.Emp;

public interface IEmpDao {
    //多对一，单条sql 根据员工编号 检索 员工名称和所属部门
    public Emp getEmpInfoByNo(int empno) throws Exception;
    //多对一，单条sql  根据员工编号  检索 员工名称和 所属部门
    public Emp getEmpInfoByNoMutilSQL(int empno) throws Exception;
}
