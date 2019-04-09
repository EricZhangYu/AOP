import dao.IDeptDao;
import entity.Dept;
import entity.Emp;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MybatisUtil;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/8 9:47
 **/

public class TestOneToMulti {

    @Test
    //一对多单条SQL
    public void testOneToManySingleSQL() throws Exception {

        SqlSession session = MybatisUtil.getSession();

        IDeptDao dao=session.getMapper(IDeptDao.class);

        Dept dept = dao.getDeptById(1);

        System.out.println(dept.getDeptname());

        for (Emp emp:dept.getEmps()){
            System.out.println(emp.getEmpName());
        }
    }

    @Test
    //一对多多条SQL
    public void testOneToManyMultiSQL() throws Exception {

        SqlSession session = MybatisUtil.getSession();

        IDeptDao dao=session.getMapper(IDeptDao.class);

        Dept dept = dao.getDeptByIdMultiSQL(1);

        System.out.println(dept.getDeptname());

        for (Emp emp:dept.getEmps()){
            System.out.println(emp.getEmpName());
        }
    }
}
