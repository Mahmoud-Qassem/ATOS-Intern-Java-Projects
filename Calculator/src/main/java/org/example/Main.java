package org.example;


import org.example.history.HistoryManager;
import org.example.history.HistoryRecord;
import org.example.operations.*;

import java.time.LocalDateTime;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // to separate binary and unary operations
        final int BINARY_OPERATIONS = 6;
        Operation operation = null;
        double operands[] = {0};


        int choice;
        while (true) {
            choice = UserInteraction.menuChoice();

            if (choice == 0) {
                HistoryManager.saveHistory();
                UserInteraction.exit();
            }
            else if (choice == 8) {
                HistoryManager.getHistory().forEach(System.out::println);
            }
            else {
                operation = getOperation(choice);
                if (choice <= BINARY_OPERATIONS) {
                    operands = UserInteraction.getTwoOperands();
                } else {
                    operands = UserInteraction.getOneOperand();
                }

                double result = calculator.perform(operation, operands);
                String historyRecord = new HistoryRecord(result, operation.toString(), operands, LocalDateTime.now()).toString();
                HistoryManager.addHistoryRecord(historyRecord);
                System.out.println(result);

            }

            System.out.println("Press any key to continue...");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
        }


    }

    private static Operation getOperation(int choice) {
        return switch (choice) {
            case 1 -> new Addition();
            case 2 -> new Subtraction();
            case 3 -> new Multiplication();
            case 4 -> new Division();
            case 5 -> new Modulus();
            case 6 -> new Power();
            case 7 -> new SquareRoot();
            default -> throw new IllegalArgumentException("Invalid operation choice!");
        };
    }
}