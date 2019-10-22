package com.lx.service;

import com.lx.bean.User;

/**
 * @author luxin
 * @create 2019-10-22 14:50
 */
public interface IUserService {
    public User selectUser(Integer userId);
}
