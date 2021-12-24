package com.user.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class user {
    @Value("aa")
    private String name;
    @Value("18")
    private String age;

    public void show(){
        System.out.println(name+"and"+age);
    }
}
