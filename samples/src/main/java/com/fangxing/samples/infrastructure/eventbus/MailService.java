package com.fangxing.samples.infrastructure.eventbus;

import com.fangxing.samples.service.register.RegisterService;
import com.google.common.eventbus.Subscribe;

public class MailService {

    @Subscribe
    public void  listenRegister(RegisterService registerService){
        System.out.printf(registerService.getName());
    }

}
