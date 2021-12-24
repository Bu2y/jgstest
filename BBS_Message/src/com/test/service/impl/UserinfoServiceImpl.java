package com.test.service.impl;

import com.test.dao.UserinfoDao;
import com.test.dao.impl.UserinfoDaoImpl;
import com.test.entity.Userinfo;
import com.test.service.UserinfoService;

import java.util.List;

public class UserinfoServiceImpl implements UserinfoService {
    UserinfoDao userinfoDao = new UserinfoDaoImpl();
    @Override
    public int addUser(Userinfo userinfo) {
        return userinfoDao.addUser(userinfo);
    }

    @Override
    public List<Userinfo> denlu(String username, String password) {
        return userinfoDao.denlu(username,password);
    }

    @Override
    public int getByname(String username) {
        return userinfoDao.getByname(username);
    }

    @Override
    public List<Userinfo> userAll() {
        return userinfoDao.userAll();
    }
}
