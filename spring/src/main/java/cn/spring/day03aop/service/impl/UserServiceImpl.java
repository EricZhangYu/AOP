package cn.spring.day03aop.service.impl;

import cn.spring.day03aop.dao.IUserDao;
import cn.spring.day03aop.entity.User;
import cn.spring.day03aop.service.IUserService;

public class UserServiceImpl implements IUserService {
    //准备接口类型，接口类型的实现类，由配置文件确定
    private IUserDao userDao;
    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }
}
