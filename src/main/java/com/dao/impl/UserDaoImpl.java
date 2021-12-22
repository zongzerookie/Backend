package com.dao.impl;

import com.dao.UserDao;
import com.mapper.UserMapper;
import com.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ygc
 * \* Date: 2021/12/22
 * \* Description:
 * \
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    public User selectByName(String name) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        UserMapper userMapper = ac.getBean(UserMapper.class);
        return userMapper.selectByName(name);
    }
}
