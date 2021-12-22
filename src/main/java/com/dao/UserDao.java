package com.dao;

import com.pojo.User;

/**
 \* Created with IntelliJ IDEA.
 \* User: ygc
 \* Date: 2021/12/22
 \* Description: 
 \*/
public interface UserDao {
    User selectByName(String name);
}
