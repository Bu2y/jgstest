package com.test.mapper;

import com.test.entity.Userinfo;

import java.util.List;

public interface UserinfoMapper {
    /**
     * 新增用户
     * @param userinfo
     * @return
     */
    public int addUser(Userinfo userinfo);

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    public List<Userinfo> denlu(String username, String password);

    /**
     * 用于验证用户是否存在
     * @param username
     * @return
     */
    public int getByname(String username);

    /**
     * 查询所有用户
     * @return
     */
    public List<Userinfo> userAll();
}
