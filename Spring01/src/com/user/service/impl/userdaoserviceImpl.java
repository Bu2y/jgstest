package com.user.service.impl;
import com.user.dao.userdao;
import com.user.pojo.user;
import com.user.service.userdaoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userdaoserviceImpl implements userdaoservice {
    @Autowired
    private userdao userdao;
    @Override
    public void add(user user) {
        System.out.println("service中add");
        userdao.add(user);
    }
}
