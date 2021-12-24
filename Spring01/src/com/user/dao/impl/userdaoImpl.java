package com.user.dao.impl;

import com.user.dao.userdao;
import com.user.pojo.user;
import org.springframework.stereotype.Repository;

@Repository
public class userdaoImpl implements userdao {
    @Override
    public void add(user user) {
        System.out.println("dao中add");
        user.show();
    }
}
