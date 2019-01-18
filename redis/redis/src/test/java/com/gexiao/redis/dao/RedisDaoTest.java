package com.gexiao.redis.dao;

import com.gexiao.redis.RedisApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author gexiao
 * @date 2019/1/18 11:36
 */
public class RedisDaoTest extends RedisApplicationTests {

    @Autowired
    private RedisDao redisDao;

    @Test
    public void setKey() {
        redisDao.setKey("niubi","niubi");
    }

    @Test
    public void getValue() {
        String niubi = redisDao.getValue("niubi");
        Assert.assertEquals("niubi",niubi);
    }
}