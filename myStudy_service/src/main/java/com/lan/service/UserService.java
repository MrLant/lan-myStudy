package com.lan.service;

import com.lan.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    String sayHello(String str);

    List<User> getUser();
}
