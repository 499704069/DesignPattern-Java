package com.my.dp.abstractFactory.factory;

import com.my.dp.abstractFactory.table.IDeparment;
import com.my.dp.abstractFactory.table.IUser;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/12 10:42
 */
public interface IFactory {

    IUser createUser();

    IDeparment createDepartment();
}
