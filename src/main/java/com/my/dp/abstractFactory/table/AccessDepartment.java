package com.my.dp.abstractFactory.table;

import com.my.dp.abstractFactory.entity.Department;
import com.my.dp.abstractFactory.entity.User;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/12 11:32
 */
public class AccessDepartment implements IDeparment {
    public void insertDepartment(Department department) {
        System.out.println("在Access给Department表增加一条记录");
    }

    public Department getDepartment(int id) {
        System.out.println("在Access根据id获取Department表中一条记录");
        return null;
    }
}
