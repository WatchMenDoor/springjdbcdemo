package com.bjsxt.dao.impl;

import com.bjsxt.dao.UsersDao;
import com.bjsxt.dao.UsersDao2;
import com.bjsxt.pojo.Users;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class UsersDaoImplSupport extends JdbcDaoSupport implements UsersDao2 {
        @Override
        public List<Users> selectUsersByName2(String username) {
        String sql = "select * from users where username = ?";
        Object[] param = new Object[]{username};
        return this.getJdbcTemplate().query(sql,param,new BeanPropertyRowMapper<>(Users.class));
        }
}