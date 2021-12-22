package com.service.impl;

import com.dao.UserDao;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ygc
 * \* Date: 2021/12/22
 * \* Description:
 * \
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User login(User u) {
        User user = userDao.selectByName(u.getName());
        if (user == null)
            return new User();
        if (user.getPassword().isEmpty() || u.getPassword().isEmpty())
            return new User();
        if (user.getPassword().equals(u.getPassword()))
            return user;
        else
            return new User();
    }
}
