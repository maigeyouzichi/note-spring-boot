package com.self.starter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author lihao
 */
@ConfigurationProperties(prefix = "com.self.spring")
public class ModuleConfig {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}