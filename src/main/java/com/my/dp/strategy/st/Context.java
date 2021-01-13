package com.my.dp.strategy.st;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/13 16:36
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void ContextInterface(){
        strategy.algorithmInterface();
    }

}
