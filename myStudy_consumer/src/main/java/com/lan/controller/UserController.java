package com.lan.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lan.pojo.User;
import com.lan.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Reference
    private UserService userService;

    private final static Logger log = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/vue_day01")
    public String hello() {
        log.info("访问成功");
        return "vue_day01";
    }

    @GetMapping("getUser")
    @ResponseBody
    public List<User> getUser() {
        List<User> userList = userService.getUser();
        if (userList != null && userList.size() > 0) {
            return userList;
        } else {
            return null;
        }
    }
}
