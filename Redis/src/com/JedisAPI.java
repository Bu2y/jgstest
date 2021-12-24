package com;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisAPI {

    private  static JedisPool jedisPool;
    static {
        JedisPoolConfig config = new JedisPoolConfig();
        //连接池最大活动链接数
        config.setMaxTotal(50);
        //连接池最大空闲数
        config.setMaxIdle(10);
        //连接池最小空闲数
        config.setMinIdle(7);
        //资源等待时间
        config.setMaxWaitMillis(1000);
        //获取资源是否验证资源的有效
        config.setTestOnBorrow(true);

        jedisPool = new JedisPool(
          config,
                "127.0.0.1",
                6379,
                10000,
                "123456",
                0
        );
    }

    public void destroy(){
        if (!(jedisPool == null || jedisPool.isClosed())){
            jedisPool.close();
        }
    }

    public boolean set(String key,String value){
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.set(key,value);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }finally {
            if (jedis !=null){ jedis.close(); }
        }

    }

    public String get(String key){
        String value = null;
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            value = jedis.get(key);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (jedis !=null){ jedis.close(); }
        }
        return value;
    }

    public static void main(String[] args){
        JedisAPI jedisAPI = new JedisAPI();
        jedisAPI.set("a","b");
        System.out.println(jedisAPI.get("a"));
        jedisAPI.destroy();
    }



}
