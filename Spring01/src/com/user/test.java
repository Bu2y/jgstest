package com.user;

import com.user.pojo.user;
import com.user.service.impl.userdaoserviceImpl;
import com.user.service.userdaoservice;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void cs(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        userdaoservice userdaoservice = (userdaoservice)applicationContext.getBean("userdaoserviceImpl");
        user user=(user) applicationContext.getBean("user");
        userdaoservice.add(user);

    }

}
