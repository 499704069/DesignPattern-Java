package com.my.dp.abstractFactory.factory;

import com.my.dp.abstractFactory.table.*;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/12 14:24
 */

/**
 *
 *  简单工厂代替抽象工厂
 *  DataAccess替代IFacotry,AccessFactory,SqlserverFactory
 */
public class DataAccess {

    private final static String DB = "Sqlserver";

    public static IUser createUser(){
        IUser result = null;
        switch (DB){
            case "Sqlserver" :
                result = new SqlserverUser();
                break;
            case "access":
                result = new AccessUser();
                break;
            default:
                break;
        }
        return result;
    }

    public static IDeparment createDepartment(){
        IDeparment result = null;
        switch (DB){
            case "Sqlserver":
                result = new SqlserverDepartment();
                break;
            case "access":
                result = new AccessDepartment();
                break;
            default:
                break;
        }
        return result;
    }
}
