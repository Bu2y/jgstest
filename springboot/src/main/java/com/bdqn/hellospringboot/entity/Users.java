package com.bdqn.hellospringboot.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "user")
public class Users {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
//    @Value("${user.username}")
    private String username;
//    @Value("${user.password}")
    private String password;

    public void show(){
        System.out.println("用户名"+username+",密码"+password);
    }
}
