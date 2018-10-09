package com.itheima.service;

import com.itheima.dao.LoginDao;
import com.itheima.domian.User;

import java.sql.SQLException;

public class LoginService {

    public User login(User user) throws SQLException {
        LoginDao loginDao = new LoginDao();
        return loginDao.login(user);
    }
}
