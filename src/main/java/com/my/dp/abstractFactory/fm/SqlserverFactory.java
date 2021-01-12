package com.my.dp.abstractFactory.fm;

import com.my.dp.abstractFactory.table.IUser;
import com.my.dp.abstractFactory.table.SqlserverUser;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/12 10:46
 */
public class SqlserverFactory implements IFactory {

    public IUser createUser() {
        return new SqlserverUser();
    }
}
