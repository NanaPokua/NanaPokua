package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Command Line Calculator");
        System.out.println("Enter two numbers:");

        double num1 ;
        double num2;

        try {
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error! Please enter valid numeric values.");
            return;
        }

        System.out.println("Choose an operation (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0)
                    result = num1 / num2;
                else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error! Invalid operator.");
                return;
        }

        System.out.println("Result of " + num1 + "" + operator + "" + num2 + " = " + result);
    }
}
