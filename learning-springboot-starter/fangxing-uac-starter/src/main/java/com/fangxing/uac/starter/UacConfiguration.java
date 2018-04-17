package com.fangxing.uac.starter;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Starter的配置类
 */
@ConfigurationProperties(prefix = "fangxing.uac")
@Setter
@Getter
public class UacConfiguration {


    private String url = "http://www.baidu.com/";


}
