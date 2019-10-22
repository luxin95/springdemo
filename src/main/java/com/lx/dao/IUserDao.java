package com.lx.dao;

import com.lx.bean.User;

/**
 * @author luxin
 * @create 2019-10-22 14:51
 */
public interface IUserDao {
    User selectUser(Integer id);
}
