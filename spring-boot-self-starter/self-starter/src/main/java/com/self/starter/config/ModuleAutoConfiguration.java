package com.self.starter.config;

import com.spring.valueobject.Dog;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lihao
 */
@Configuration
@EnableConfigurationProperties(ModuleConfig.class)
public class ModuleAutoConfiguration {

    /**
     * @Bean 如果没有指定bean name,默认方法名为bean name,此处为snoopy
     * @ConditionalOnProperty 满足条件,就会加载该Bean,springboot就是根据这种特性做自动化
     * 这里是根据配置文件是否配置了com.self.spring.name&age来判定是否加载该Dog Bean
     */
    @Bean
    @ConditionalOnProperty(name = {"com.self.spring.name","com.self.spring.age"})
    public Dog snoopy(ModuleConfig moduleConfig){
        Dog snoopy = new Dog();
        snoopy.setName(moduleConfig.getName());
        snoopy.setAge(moduleConfig.getAge());
        return snoopy;
    }
}