package com.lan.dao;

import com.lan.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {
    List<User> getUser() throws Exception;
}
