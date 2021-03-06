package com.my.dp.abstractFactory.factory;

import com.my.dp.abstractFactory.table.*;

/**
 *  简单工厂代替抽象工厂
 *  DataAccess替代IFacotry,AccessFactory,SqlserverFactory
 */

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/12 14:24
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

    public static IDepartment createDepartment(){
        IDepartment result = null;
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
