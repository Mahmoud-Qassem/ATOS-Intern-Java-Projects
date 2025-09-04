package org.example;

import org.example.history.HistoryManager;
import org.example.operations.Operation;

public class Calculator {
    public Calculator() {
        HistoryManager.loadHistory("history.txt");
    }
    public Double perform(Operation operation, double ... operands){
        double result = operation.perform(operands);
        return result;
    }

}
