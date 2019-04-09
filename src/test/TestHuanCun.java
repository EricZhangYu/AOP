import dao.IDeptDao;
import dao.StudentDao;
import entity.Dept;
import entity.Student;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MybatisUtil;

import java.util.List;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/9 11:56
 **/
public class TestHuanCun {

    //二级缓存
    @Test
    public void testSecondLevel()throws Exception {
        SqlSession session = MybatisUtil.getSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        List<Student> list = dao.findAll();
        for (Student item : list) {
            System.out.println(item.getSname());
        }
        MybatisUtil.closeSession(session);

        System.out.println("===================122222222222222");

        SqlSession session2=MybatisUtil.getSession();
        StudentDao dao2=session2.getMapper(StudentDao.class);
        List<Student> list2 = dao2.findAll();
        for (Student item : list2) {
            System.out.println(item.getSname());
        }
        MybatisUtil.closeSession(session2);

        System.out.println("===================");

        SqlSession session3=MybatisUtil.getSession();
        StudentDao dao3=session3.getMapper(StudentDao.class);
        List<Student> list3 = dao3.findAll();
        for (Student item : list3) {
            System.out.println(item.getSname());
        }
        MybatisUtil.closeSession(session3);
    }


    //增删改对一级缓存的影响------一级缓存失效
    @Test
    public void testUpdateHasSomeThingToOneLevelCache()throws Exception {
        SqlSession session = MybatisUtil.getSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        List<Student> list = dao.findAll();
        for (Student item : list) {
            System.out.println(item.getSname());
        }
        Student stu=new Student();
        stu.setSname("嘿  那傻狗");
        stu.setTid(2);

        dao.addUser(stu);
        session.commit();
        System.out.println("================");

        List<Student> list2=dao.findAll();
        for (Student item : list2) {
            System.out.println(item.getSname());
        }

    }

    //一级缓存存在性的证明
    @Test
    public void testLazyLoading()throws Exception{
        SqlSession session= MybatisUtil.getSession();
        StudentDao dao=session.getMapper(StudentDao.class);
        List<Student>list=dao.findAll();
        for(Student stu:list){
            System.out.println(stu.getSname());
        }
        System.out.println("========================");

        //第二次和第三次直接从缓存中获取  不再执行sql语句
        List<Student>list2=dao.findAll();
        for(Student stu:list2){
            System.out.println(stu.getSname());
        }
        System.out.println("========================");

        List<Student>list3=dao.findAll();
        for(Student stu:list3){
            System.out.println(stu.getSname());
        }
    }

    @Test
    public void testLazyLoad()throws Exception{
        SqlSession session= MybatisUtil.getSession();
        IDeptDao dao=session.getMapper(IDeptDao.class);
        //前提条件  先决条件  单条SQL不会有延迟  立即加载  只有多条sql才会延迟加载
        Dept dept=dao.getDeptByIdMultiSQL(1);
        //调度部门的名称属性，使用主对象属性，关联对象也会别加载出来，会发送第二条sql
        System.out.println(dept.getDeptname());
        //如果是深度延迟的话 （aggressiveLazyLoading  value值是false） 只有在需要调用别的表的时候才会进行调用slq语句
        System.out.println(dept.getEmps());
    }
}
