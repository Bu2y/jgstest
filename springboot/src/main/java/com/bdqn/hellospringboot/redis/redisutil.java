package com.bdqn.hellospringboot.redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class redisutil {
    @Resource
    private RedisTemplate<String,Object> redisTemplate;
    public boolean set(String key, Object object){
        ValueOperations<String,Object> a = redisTemplate.opsForValue();
        a.set(key, object);
        return true;
    }
    public Object get(String key){
        ValueOperations<String,Object> a = redisTemplate.opsForValue();
        return a.get(key);
    }

}
