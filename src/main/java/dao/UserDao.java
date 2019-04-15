package dao;

import entity.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    public List<User> findAll() throws Exception;

    public User findById(Integer id)throws  Exception;

    //在进行增删改的接口的编写的时候，记住返回值的类型是int类型  即受影响的行数  别忘记在写实现类的时候
    //最后要写int count=userDao.addUser(user);
    //增
    public int addUser(User user);
    //改
    public int update(User user);
    //删
    public int delete(Integer id);
    //添加成功后返回主键值
    public int addStudentAndReturnMax(User user);

    //模糊查询
    public List<User> likeSelect(String userName);

    //多条件查询 试图model
    public List<User> selectByCondition(User user);

    //多条件查询  Map
    public List<User> selectByMap(Map<String,Object> map);

    //智能标签
    // if  通过用户姓名查询用户信息
    public List<User> ifTag(User user);

    //choose     通过用户姓名查询用户信息
    public List<User> chooseTag(User user);

    //foreach   通过用户id数组  查询用户信息
    public List<User> foreachTag(int[] nums);
    //fireach   通过用户编号 List Integer 查询学生信息
    public List<User> foreachTagList(List<Integer> list);

    public List<User> foreachTagListUser(List<User> list);
}
