package com.test.dao;

import com.test.entity.Userinfo;

public interface userinfodao {
    public int add(Userinfo userinfo);
    public int getbyname(String name);
    public Userinfo findUser(String name,String pwd);
}
