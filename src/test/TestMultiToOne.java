import dao.IDeptDao;
import dao.IEmpDao;
import entity.Dept;
import entity.Emp;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MybatisUtil;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/8 15:11
 **/
public class TestMultiToOne {
    @Test
    //多对一单条SQL
    public void testManyToOneSingleSQL() throws Exception {

        SqlSession session = MybatisUtil.getSession();

        IEmpDao dao=session.getMapper(IEmpDao.class);

        Emp emp = dao.getEmpInfoByNo(1);

        System.out.println(emp.getEmpName());

        System.out.println(emp.getDept().getDeptname());
    }

    @Test
    //多对一的多条SQL
    public void testManyToManySingleSQL() throws Exception {

        SqlSession session = MybatisUtil.getSession();

        IEmpDao dao=session.getMapper(IEmpDao.class);

        Emp emp = dao.getEmpInfoByNoMutilSQL(1);

        System.out.println(emp.getEmpName());

        System.out.println(emp.getDept().getDeptname());
    }
}
