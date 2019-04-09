import dao.RoleDao;
import dao.UserDao;
import dao.impl.UserDaoImpl;
import entity.Role;
import entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MybatisUtil;

import java.util.List;

public class TestRole {

    @Test
    public void test() throws Exception {
        //不需要写实现方法
        SqlSession session= MybatisUtil.getSession();
        RoleDao roleDao=session.getMapper(RoleDao.class);
        List<Role> list=roleDao.findAllRole();
        for(Role item:list){
            System.out.println(item);
        }
    }
}
