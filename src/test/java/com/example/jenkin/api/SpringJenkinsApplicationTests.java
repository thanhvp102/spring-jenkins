package com.example.jenkin.api;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest


class SpringJenkinsApplicationTests {
    public static Logger logger= LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
    @Test
     contextLoads() {
        logger.info("Test case excuting ");
        logger.info("Test case excuting 2");
        Assert.assertEquals(true,true);
    }

}
