package com.my.dp.strategy.st;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/13 16:35
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("algorithm A");
    }
}
