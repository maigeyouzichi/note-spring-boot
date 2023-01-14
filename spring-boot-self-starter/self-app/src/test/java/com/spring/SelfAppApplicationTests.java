package com.spring;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SelfAppApplication.class)
class SelfAppApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    /**
     * 判断Dog对象是否被加入到ioc容器中
     */
    @Test
    void contextLoads() {
        System.out.println(applicationContext.containsBean("snoopy"));
    }

}
