package com.my.dp.strategy.sf;

/**
 * 打折类
 * @author zy
 * @version 1.0
 * @date 2021/1/13 16:20
 */
public class CashRebate implements CashSuper {

    private double moneyRebate = 1d;

    public CashRebate(double moneyRebate){
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }
}
