package com.test.service;

import com.test.dao.impl.userinfodaoimlp;
import com.test.dao.userinfodao;
import com.test.entity.Userinfo;

public class userinfoservice implements userinfodao {
    userinfodaoimlp userinfodaoimpl = new userinfodaoimlp();
    public Userinfo findUser(String name,String pwd){ return userinfodaoimpl.findUser(name,pwd); }
    public int add(Userinfo userinfo){
        return userinfodaoimpl.add(userinfo);
    }
    public int getbyname(String name){ return userinfodaoimpl.getbyname(name); }
}
