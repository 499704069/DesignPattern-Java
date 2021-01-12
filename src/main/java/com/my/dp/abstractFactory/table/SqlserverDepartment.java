package com.my.dp.abstractFactory.table;

import com.my.dp.abstractFactory.entity.Department;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/12 11:34
 */
public class SqlserverDepartment implements IDeparment{
    public void insertDepartment(Department user) {
        System.out.println("在Sqlserver给Department表增加一条记录");
    }

    public Department getDepartment(int id) {
        System.out.println("在Sqlserver根据id获取Department表中一条记录");
        return null;
    }
}
