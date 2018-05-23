package com.fangxing.samples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import com.fangxing.samples.infrastructure.sevlet.*;

@SpringBootApplication
public class SamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SamplesApplication.class, args);
    }

    /**
     * 通过ServletRegistrztionBean注册URL请求映射
     * 可以跟使用SpringMVC的Swagger组件相比较
     * @return
     */
    @Bean
    public ServletRegistrationBean registrationBean(){
        System.out.printf("abc");
        ServletRegistrationBean registrationBean=new ServletRegistrationBean(new JobScheduleSevlet());
        registrationBean.addUrlMappings("/schedule/run");
        return registrationBean;
    }

}
