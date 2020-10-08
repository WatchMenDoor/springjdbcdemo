package com.bjsxt.dao;

import com.bjsxt.pojo.Users;

import java.util.List;

/**
 * @Auther: liuxw
 * @Date: 2020-10-08
 * @Description: com.bjsxt.dao
 * @version: 1.0
 */
public interface UsersDao2 {
    List<Users> selectUsersByName2(String username);
}
