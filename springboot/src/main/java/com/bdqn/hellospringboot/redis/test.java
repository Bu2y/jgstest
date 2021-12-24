package com.bdqn.hellospringboot.redis;

import org.junit.Test;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class test implements CommandLineRunner {
    @Resource
    private redisutil redisutil;
    @Override
    public void run(String... strings) throws Exception{
        System.out.println("启动");
        redisutil.set("key","testValue");
        System.out.println("获取值,"+redisutil.get("key"));
    }

}
