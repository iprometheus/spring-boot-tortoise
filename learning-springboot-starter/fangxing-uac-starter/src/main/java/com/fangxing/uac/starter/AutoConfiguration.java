package com.fangxing.uac.starter;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
//@EnableAutoConfiguration(UacConfiguration.class)
@EnableConfigurationProperties(UacConfiguration.class)
public class AutoConfiguration {

    @Resource
    UacConfiguration uacConfiguration;

    public String init(){
        return uacConfiguration.getUrl();
    }

}
