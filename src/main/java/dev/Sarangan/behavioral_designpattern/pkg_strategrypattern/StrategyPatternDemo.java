package dev.Sarangan.behavioral_designpattern.pkg_strategrypattern;

import dev.Sarangan.behavioral_designpattern.pkg_strategrypattern.strategies.OperationAdd;
import dev.Sarangan.behavioral_designpattern.pkg_strategrypattern.strategies.OperationMultiply;
import dev.Sarangan.behavioral_designpattern.pkg_strategrypattern.strategies.OperationSubtract;
import dev.Sarangan.behavioral_designpattern.pkg_strategrypattern.strategies.Strategy;

import java.util.Arrays;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Strategy addStrategy = new OperationAdd();
        StrategyContext strategyAddContext = new StrategyContext(addStrategy);
        System.out.println("Addition Strategy is: " + strategyAddContext.executeStrategy(10, 5));

        Strategy subStrategy = new OperationSubtract();
        StrategyContext strategySubContext = new StrategyContext(subStrategy);
        System.out.println("Subtraction Strategy is: " + strategySubContext.executeStrategy(10, 5));

        Strategy mulStrategy = new OperationMultiply();
        StrategyContext strategyMulContext = new StrategyContext(mulStrategy);
        System.out.println("Multiplication Strategy is: " + strategyMulContext.executeStrategy(10, 5));
    }
}
