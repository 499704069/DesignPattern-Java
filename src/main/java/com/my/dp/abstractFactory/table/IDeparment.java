package com.my.dp.abstractFactory.table;

import com.my.dp.abstractFactory.entity.Department;
import com.my.dp.abstractFactory.entity.User;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/12 10:58
 */
public interface IDeparment {

    void insertDepartment(Department user);

    Department getDepartment(int id);
}
