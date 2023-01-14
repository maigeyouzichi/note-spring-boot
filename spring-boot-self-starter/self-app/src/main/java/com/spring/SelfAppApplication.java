package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 依赖中引入了 <artifactId>self-starter</artifactId>,该starter中包含了自动加载bean的逻辑,会根据使用方的配置文件的内容来判定
 * 是否加载引入的Jar包中的Bean
 * @author lihao
 */
@SpringBootApplication
public class SelfAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SelfAppApplication.class, args);
    }

}
