package com.my.dp.strategy.sf;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/13 16:42
 */
public class CashContext {

    private CashSuper cashSuper;

    public CashContext(CashSuper cashSuper){
        this.cashSuper = cashSuper;
    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
