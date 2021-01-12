package com.my.dp.abstractFactory.factory;

import com.my.dp.abstractFactory.table.AccessDepartment;
import com.my.dp.abstractFactory.table.AccessUser;
import com.my.dp.abstractFactory.table.IDeparment;
import com.my.dp.abstractFactory.table.IUser;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/12 10:48
 */
public class AccessFactory implements IFactory {

    public IUser createUser() {
        return new AccessUser();
    }

    public IDeparment createDepartment() {
        return new AccessDepartment();
    }
}
