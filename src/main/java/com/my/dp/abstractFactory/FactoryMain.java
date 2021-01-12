package com.my.dp.abstractFactory;

import com.my.dp.abstractFactory.entity.Department;
import com.my.dp.abstractFactory.factory.IFactory;
import com.my.dp.abstractFactory.factory.SqlserverFactory;
import com.my.dp.abstractFactory.entity.User;
import com.my.dp.abstractFactory.table.IDeparment;
import com.my.dp.abstractFactory.table.IUser;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/12 10:52
 */

/**
 *
 * 增加一个表：如果增加一个Department需要增加IDepartment,
 *                      SqlserverDepartment,AccessDepartment
 * IFactory增加一个方法： IFactory增加createDepartment方法，
 *                      同时IFactory的所有实现类都得修改
 *
 * 增加一个数据库oracle：只需要增加一个OracleFactory工厂类
 *                      而DataAccess需要在每个方法增加一个case分支
 *
 *
 *
 */
public class FactoryMain {

    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();

        //factory根据实际替换
        IFactory factory = new SqlserverFactory();
        IUser user1 = factory.createUser();

        user1.insert(user);
        user1.getUser(1);

        IDeparment department1 = factory.createDepartment();
        department1.insertDepartment(department);
        department1.getDepartment(1);
    }
}
