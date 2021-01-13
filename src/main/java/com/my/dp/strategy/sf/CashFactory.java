package com.my.dp.strategy.sf;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/13 16:27
 */
public class CashFactory {

    public static CashSuper createCashAccept(String type){

        CashSuper cashSuper = null;
        switch (type){
            case "normal":
                cashSuper = new CashNormal();
                break;
            case "rebate":
                cashSuper = new CashRebate(0.8);
                break;
            case "return":
                cashSuper = new CashReturn(300,100);
                break;
            default:
                break;
        }
        return cashSuper;
    }
}
