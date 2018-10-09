package com.itheima.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.itheima.domian.User;
import com.itheima.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;


public class LoginDao {

	public User login(User user) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		String sql = "select * from user where username = ? and password = ? ";
		Object [] params = {user.getUsername(), user.getPassword()};
		Object [] params1 = {user.getUsername(), user.getPassword()};
        return queryRunner.query(sql, new BeanHandler<User>(User.class), params);
    }
}
