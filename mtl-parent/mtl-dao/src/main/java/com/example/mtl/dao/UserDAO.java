package com.example.mtl.dao;

import com.example.mtl.beans.User;

/**
 * @Description
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
public interface UserDAO {

    public User selectUserByUserName(String userName);

}
