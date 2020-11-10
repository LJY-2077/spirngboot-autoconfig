package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lijingyang
 * @Title:
 * @Package
 * @Description:
 * @date 2020/11/109:27
 */
@Configuration
@EnableConfigurationProperties(HelloWorldProperties.class)
@ConditionalOnClass()
@ConditionalOnProperty(prefix = "spring.hello", value = "enabled", matchIfMissing = true)
public class HelloWordConfiguration {
    @Autowired
    private HelloWorldProperties helloWorldProperties;

    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService() {
        HelloService helloService = new HelloService();
        helloService.setMsg(helloWorldProperties.getMsg());
        return helloService;
    }
}
