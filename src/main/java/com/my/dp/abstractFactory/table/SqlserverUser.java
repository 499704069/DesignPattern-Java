package com.my.dp.abstractFactory.table;

import com.my.dp.abstractFactory.entity.User;
import com.my.dp.abstractFactory.table.IUser;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/12 10:37
 */
public class SqlserverUser implements IUser {

    public void insert(User user) {
        System.out.println("在SQL Server中给User表增加一条记录");
    }

    public User getUser(int id) {
        System.out.println("在SQL Server中根据ID得到一条记录");
        return null;
    }
}
