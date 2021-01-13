package com.my.dp.strategy.sf;

import com.my.dp.strategy.st.Context;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/13 16:54
 */
public class CashContext2 {

    private CashSuper cashSuper;

    public CashContext2(String type){
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
    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
