package com.lan.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lan.dao.UserDao;
import com.lan.pojo.User;
import com.lan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public String sayHello(String str) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return dateFormat.format(new Date()) + ": " + str;
    }

    @Override
    public List<User> getUser() {
        try {
            return userDao.getUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
