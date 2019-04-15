package dao;

import entity.Dept;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/8 9:41
 **/
public interface IDeptDao {
    //一对多 单条sql语句
    public Dept getDeptById(int deptno) throws Exception;
    //一对多 多条sql语句
    public Dept getDeptByIdMultiSQL(int BuMenNo) throws Exception;
}
