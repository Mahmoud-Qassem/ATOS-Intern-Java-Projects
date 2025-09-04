package org.example.operations;

public class Subtraction implements Operation {
    public double perform(double... operands){
        return operands[0] - operands[1];
    }
    @Override
    public String toString() {
        return "Subtraction";
    }
}
