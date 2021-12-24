package com.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("aa")
// 注解整个类，可以使用自定义名称，默认名称为类名首字母小写，相当于<bean id = "aa" class="">的操作
//用于较为简单的配置
public class HelloSpring {
//    public String getHello() {
//        return hello;
//    }
//
//    public void setHello(String hello) {
//        this.hello = hello;
//    }
    @Value("时间")
    private String hello;
//    public HelloSpring(){}
//    public HelloSpring(String hello) { this.hello=hello; }
    public void show(){ System.out.println(hello); }
}
