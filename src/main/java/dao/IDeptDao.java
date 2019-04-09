package dao;

import entity.Dept;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/8 9:41
 **/
public interface IDeptDao {
    //单条SQL  一对多
    public Dept getDeptById(int deptno) throws Exception;
    //多条SQL单表
    public Dept getDeptByIdMultiSQL(int BuMenNo) throws Exception;
}
