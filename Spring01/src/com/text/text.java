package com.text;

import com.springdemo.hello;
import com.printer.dayinji.dayinji;
import com.springdemo.HelloSpring;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text {
    @Test
    public void ceshi() {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        dayinji dayinji = (dayinji) applicationContext.getBean("dayinji");
//        dayinji.show();
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("aa");
        helloSpring.show();
//        hello hello = (hello) applicationContext.getBean("hello");
//        hello.show();
    }
}
