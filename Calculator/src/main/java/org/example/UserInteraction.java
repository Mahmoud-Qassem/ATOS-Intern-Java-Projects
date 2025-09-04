package org.example;

import java.util.Scanner;

public class UserInteraction {
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean validChoice=false;
    private static int choice, playing =0;


    public static int menuChoice() {
        validChoice = false;
        choice = 0;
        playing =0;
        while(!validChoice) {
            if(playing>5){
                return 0;
            }
            playing ++;
            System.out.println("Welcome to Java Calculator");
            System.out.println("-------------------------");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square Root");
            System.out.println("8. History");
            System.out.println("9. Clear History");
            System.out.println("0. Exit");
            System.out.println("-------------------------");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            if (choice < 0 || choice > 9) {
                System.out.println("Invalid choice");
            }
            else {
                validChoice = true;
            }
        }
        return choice;
    }

    public static void exit() {
        System.out.println("Thank you for using Java Calculator");
        System.exit(0);
    }

    public static double[] getTwoOperands() {
        double[] operands = new double[2];
        System.out.print("Enter the first number: ");
        operands[0] = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        operands[1] = scanner.nextDouble();
        return operands;
    }

    public static double[] getOneOperand() {
        double[] operands = new double[1];
        System.out.print("Enter the number: ");
        operands[0] = scanner.nextDouble();
        return operands;
    }
}
