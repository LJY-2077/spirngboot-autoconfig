package com.org;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author lijingyang
 * @Title:
 * @Package
 * @Description:
 * @date 2020/11/109:25
 */
@ConfigurationProperties(prefix = "spring.hello")
public class HelloWorldProperties {

    private static final String MSG = "Hello";

    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
