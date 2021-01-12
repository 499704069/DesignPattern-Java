package com.my.dp.abstractFactory;

import com.my.dp.abstractFactory.fm.IFactory;
import com.my.dp.abstractFactory.fm.SqlserverFactory;
import com.my.dp.abstractFactory.entity.User;
import com.my.dp.abstractFactory.table.IUser;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/12 10:52
 */
public class FactoryMain {

    public static void main(String[] args) {
        User user = new User();

        //factory根据实际替换
        IFactory factory = new SqlserverFactory();
        IUser user1 = factory.createUser();

        user1.insert(user);
        user1.getUser(1);
    }
}
