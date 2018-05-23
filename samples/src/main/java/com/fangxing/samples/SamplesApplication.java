package com.fangxing.samples;

import com.fangxing.samples.infrastructure.eventbus.MailService;
import com.fangxing.samples.infrastructure.sevlet.JobScheduleSevlet;
import com.fangxing.samples.service.register.RegisterService;
import com.google.common.eventbus.EventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SamplesApplication {

    @Autowired
    RegisterService registerService;

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

    @Bean
    public String registerEventBus(){
        //注册EventBus
        //博客：https://blog.csdn.net/top_code/article/details/51283461
        //博客：https://www.cnblogs.com/liushilin/p/6089785.html
        EventBus eventBus = new EventBus("ricky");
        eventBus.register(new MailService());
        eventBus.post(new RegisterService());
        //registerService.getName();
        return "";
    }

}
