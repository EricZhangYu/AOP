package cn.spring.day03aop.dao.impl;

import cn.spring.day03aop.dao.IUserDao;
import cn.spring.day03aop.entity.User;

public class UserDAOImpl implements IUserDao {

    @Override
    public void saveUser(User user) {
        System.out.println("save user ok!");
    }
}
