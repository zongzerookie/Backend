package com.mapper;

import com.pojo.User;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ygc
 * \* Date: 2021/12/22
 * \* Description:
 * \
 */
public interface UserMapper {
    User selectByName(String name);
}
