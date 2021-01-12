package com.my.dp.abstractFactory.factory;

import com.my.dp.abstractFactory.table.IDeparment;
import com.my.dp.abstractFactory.table.IUser;
import com.my.dp.abstractFactory.table.SqlserverDepartment;
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

    public IDeparment createDepartment() {
        return new SqlserverDepartment();
    }
}
