package dao.impl;

import dao.UserDao;
import entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import utils.MybatisUtil;

import java.io.InputStream;
import java.util.List;

public class UserDaoImpl {

    public List<User> findAll() throws Exception {
        //写具体代码
        String path="mybatis-config.xml";
        InputStream is = Resources.getResourceAsStream(path);
        //01。SQLSessionFactoryBuilder
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        //02.工厂
        SqlSessionFactory factory = builder.build(is);
        //03.交互通道 session
        SqlSession session = factory.openSession();
        //04.调度session执行SQL
        List<User> list = session.selectList("findAll");

        return list;
    }

    public User findById(Integer id) throws Exception {
        //调用工具类中的方法
        SqlSession session= MybatisUtil.getSession();
        User user=session.selectOne("findById",id);
        return user;
    }

    public int addUser(User user) {
        return 0;
    }

    public int update(User user) {
        return 0;
    }

    public int delete(Integer id) {
        return 0;
    }
}
