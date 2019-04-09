import dao.StudentDao;
import entity.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MybatisUtil;

import java.util.List;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/9 9:54
 **/
public class TestManyToMany {
    @Test
    public void testManyToMany() throws  Exception{
        SqlSession session= MybatisUtil.getSession();
        StudentDao dao=session.getMapper(StudentDao.class);
        List<Student> list=dao.findAllStudentByid(1);
        for(Student stu:list){
            System.out.println(stu);
        }
    }
}
