package org.example.operations;

public class Power implements Operation {
    @Override
    public double perform(double... operands) {
        return Math.pow(operands[0], operands[1]);
    }
    @Override
    public String toString() {
        return "Power";

    }
}
