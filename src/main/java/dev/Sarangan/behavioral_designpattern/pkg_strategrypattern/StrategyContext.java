package dev.Sarangan.behavioral_designpattern.pkg_strategrypattern;

import dev.Sarangan.behavioral_designpattern.pkg_strategrypattern.strategies.Strategy;

public class StrategyContext {
    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
