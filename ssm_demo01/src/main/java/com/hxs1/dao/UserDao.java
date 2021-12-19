package com.hxs1.dao;

import com.hxs1.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserDao {
    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return
     */
    public User login(@Param("username") String username, @Param("password") String password);
}
