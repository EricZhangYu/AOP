import dao.UserDao;
import dao.impl.UserDaoImpl;
import entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MybatisUtil;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class TestDemo {
    @Test
    public  void t1() throws Exception {
//        UserDao dao=new UserDaoImpl();
//        List<User> list = dao.findAll();
//        for (User user:list){
//            System.out.println(user);
//        }
    }
    @Test
    public  void t2() throws Exception {
//        UserDao dao=new UserDaoImpl();
//        User user = dao.findById(1);
//        System.out.println(user);
    }

}
