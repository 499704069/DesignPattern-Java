package com.my.dp.abstractFactory.factory;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/12 15:07
 */

import com.my.dp.abstractFactory.table.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 反射 + 抽象工厂
 */
public class DataAccess2 {

    private final static String db= "Sqlserver";
    private final static String TABLE_USER = "User";
    private final static String TABLE_DEPARTMENTD= "Department";

    private final static Map<String,Class<?>> MAP = new HashMap<String,Class<?>>() {{
        put("Sqlserver"+".User", SqlserverUser.class);
        put("Sqlserver"+".Department", SqlserverDepartment.class);
        put("Access"+".User", AccessUser.class);
        put("Access"+".Department", AccessDepartment.class);
    }};


    public IUser createUser() throws IllegalAccessException, InstantiationException {
        Class<?> aClass = MAP.get(db + "." + TABLE_USER);
        IUser ret = (IUser) aClass.newInstance();
        return ret;
    }

    public IDeparment createDepartment() throws IllegalAccessException, InstantiationException {
        Class<?> aClass = MAP.get(db + "." + TABLE_DEPARTMENTD);
        IDeparment ret = (IDeparment) aClass.newInstance();
        return ret;
    }
}
