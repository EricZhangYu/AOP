import dao.UserDao;
import dao.impl.UserDaoImpl;
import entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MybatisUtil;

import java.util.*;

public class TestUser {
@Test
    public void add(){
    SqlSession session=MybatisUtil.getSession();
    UserDao userDao=session.getMapper(UserDao.class);
    User user=new User();
    user.setUserCode("zhaomin");
    user.setUserName("赵敏");
    user.setUserPassword(1234567);
    int count=userDao.addUser(user);
    //不要忘记手动提交事务
    session.commit();
    if(count>0){
        System.out.println("添加成功");
    }else{
        System.out.println("添加失败");
    }
}
@Test
    public void update() {
        SqlSession session = MybatisUtil.getSession();
        UserDao userDao = session.getMapper(UserDao.class);
        User user = new User();
        user.setUserName("周驰若");
        user.setId(16);
        int count = userDao.update(user);
        //提交事务
        session.commit();
        if (count > 0) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }
    }
@Test
    public void delete() {
        SqlSession session = MybatisUtil.getSession();
        UserDao userDao = session.getMapper(UserDao.class);
        User user = new User();
        user.setUserName("周芷若");
        int count = userDao.delete(15);
        //提交事务
        session.commit();
        if (count > 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败=========");
        }
    }

 @Test
 //添加后返回自增列的值
    public void addStudentAndReturnMax(){
        SqlSession session= MybatisUtil.getSession();
        UserDao userDao=session.getMapper(UserDao.class);
        User user=new User();
        user.setUserCode("zhangwuji");
        user.setUserName("张无忌");
        user.setUserPassword(1234567);
        user.setBirthday(new Date());
        System.out.println(user.getId());

        int count=userDao.addStudentAndReturnMax(user);
        //提交事务
        session.commit();
        System.out.println(user.getId());
        if(count>0){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
    }

@Test
//模糊查询
    public void likeSelect() {
        SqlSession session = MybatisUtil.getSession();
        UserDao userDao = session.getMapper(UserDao.class);
        List<User> list = userDao.likeSelect("张");
        for(User user:list){
            System.out.println(user.getUserName());
        }
    }

    @Test
    public void selectByCondition() {
        SqlSession session = MybatisUtil.getSession();
        UserDao userDao = session.getMapper(UserDao.class);
        User user=new User();
        user.setUserName("孙");
        user.setAddress("北京");
        List<User>list=userDao.selectByCondition(user);
        for(User item:list){
            System.out.println(item.getUserName());
        }
    }

@Test
    public void selectByMap() {
        SqlSession session = MybatisUtil.getSession();
        UserDao userDao = session.getMapper(UserDao.class);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("myuserName","孙");
        map.put("myaddress","北京");
        List<User>list=userDao.selectByMap(map);
        for(User item:list){
            System.out.println(item.getUserName());
        }
    }

@Test
     public void ifTag() {
        SqlSession session = MybatisUtil.getSession();
        UserDao userDao = session.getMapper(UserDao.class);
        User user=new User();
        List<User>list=userDao.ifTag(user);
        for(User item:list){
            System.out.println(item.getUserName());
        }
    }

@Test
    public void chooseTag() {
        SqlSession session = MybatisUtil.getSession();
        UserDao userDao = session.getMapper(UserDao.class);
        User user=new User();
        user.setUserName("李明");
        user.setAddress("北京市东城区前门东大街9号");
        List<User>list=userDao.chooseTag(user);
        for(User item:list){
            System.out.println(item.getUserName());
        }
    }

@Test//数组形式
    public void foreachTag() {
        SqlSession session = MybatisUtil.getSession();
        UserDao userDao = session.getMapper(UserDao.class);
        int[] nums={1,2,5};
        List<User>list=userDao.foreachTag(nums);
        for(User item:list){
            System.out.println(item.getUserName());
        }
    }

    //集合形式 list<Integer>
    @Test
    public void foreachTagList() {
        SqlSession session = MybatisUtil.getSession();
        UserDao userDao = session.getMapper(UserDao.class);
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        List<User>userList=userDao.foreachTagList(list);
        for(User item:userList){
            System.out.println(item.getUserName());
        }
    }

    //集合形式 list<User>
    @Test
    public void foreachTagListUser() {
        SqlSession session = MybatisUtil.getSession();
        UserDao userDao = session.getMapper(UserDao.class);
        User user1=new User();user1.setId(1);
        User user2=new User();user2.setId(2);
        User user3=new User();user3.setId(5);
        List<User> list=new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        List<User>userList=userDao.foreachTagListUser(list);
        for(User item:userList){
            System.out.println(item.getUserName());
        }
    }
}
