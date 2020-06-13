package com.boot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.boot.domain.User;
import com.boot.service.TestService;

import java.text.SimpleDateFormat;
import java.util.Date;
@Service
public class TestServiceImpl implements TestService {


    @Override
    public String sayHello(String str) {
        SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return date.format(new Date()+":"+str);
    }

    @Override
    public User findUser() {

        User user=new User();
        user.setId(1001);
        user.setName("lq");
        user.setPassword("lqlzh");
        user.setAge(20);
        user.setGender(0);
        return user;
    }
}
