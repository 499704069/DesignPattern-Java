package com.my.dp.strategy.sf;

/**
 *
 * 返利收费
 * @author zy
 * @version 1.0
 * @date 2021/1/13 16:24
 */
public class CashReturn implements CashSuper {

    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;

    public CashReturn(double moneyCondition,double moneyReturn){
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money>moneyCondition){
            result = money - moneyReturn*(money/moneyReturn);
        }

        return result;
    }
}
