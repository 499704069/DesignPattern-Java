package com.my.dp.abstractFactory.table;

import com.my.dp.abstractFactory.entity.User;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/12 10:35
 */
public interface IUser {

    void insert(User user);

    User getUser(int id);
}
