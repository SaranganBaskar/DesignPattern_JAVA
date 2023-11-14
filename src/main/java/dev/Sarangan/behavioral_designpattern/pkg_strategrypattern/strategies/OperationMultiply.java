package dev.Sarangan.behavioral_designpattern.pkg_strategrypattern.strategies;

public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
