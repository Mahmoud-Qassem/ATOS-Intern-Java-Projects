package org.example.operations;

public class SquareRoot implements Operation {
    @Override
    public double perform(double... operands) {
        return Math.sqrt(operands[0]);
    }
    @Override
    public String toString() {
        return "SquareRoot";
    }
}
