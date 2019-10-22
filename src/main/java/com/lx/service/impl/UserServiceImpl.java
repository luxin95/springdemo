package com.lx.service.impl;

import com.lx.bean.User;
import com.lx.dao.IUserDao;
import com.lx.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author luxin
 * @create 2019-10-22 14:51
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(Integer userId) {
        return this.userDao.selectUser(userId);
    }

}
