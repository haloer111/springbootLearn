package com.gexiao.redis.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

/**
 * @author gexiao
 * @date 2019/1/18 11:33
 */
@Repository
public class RedisDao {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void setKey(String key,String value){
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        ops.set(key,value,1, TimeUnit.HOURS);//一个小时后过期
    }

    public String getValue(String key){
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        String value = ops.get(key);
        return value;
    }
}
