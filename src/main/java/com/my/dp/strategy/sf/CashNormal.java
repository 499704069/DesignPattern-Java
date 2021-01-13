package com.my.dp.strategy.sf;

/**
 * 正常返回
 * @author zy
 * @version 1.0
 * @date 2021/1/13 16:20
 */
public class CashNormal implements CashSuper{

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
