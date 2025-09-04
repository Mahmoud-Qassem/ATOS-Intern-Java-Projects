package org.example.operations;

public class Division implements Operation {
    public double perform(double... operands){
        if (operands[0] < 0) {
            throw new ArithmeticException("Square root of negative number is not allowed!");
        }
        return operands[0] / operands[1];
    }
    @Override
    public String toString() {
        return "Division";
    }
}
