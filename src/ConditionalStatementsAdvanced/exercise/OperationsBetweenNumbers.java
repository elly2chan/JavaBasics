package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();

        double result = 0.0;
        String typeOfNumber = "";
        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                if (result % 2 == 0) {
                    typeOfNumber = "even";
                } else {
                    typeOfNumber = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s",
                        firstNumber, operator, secondNumber, result, typeOfNumber);
                break;
            case "-":
                result = firstNumber - secondNumber;
                if (result % 2 == 0) {
                    typeOfNumber = "even";
                } else {
                    typeOfNumber = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s",
                        firstNumber, operator, secondNumber, result, typeOfNumber);
                break;
            case "*":
                result = firstNumber * secondNumber;
                if (result % 2 == 0) {
                    typeOfNumber = "even";
                } else {
                    typeOfNumber = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s",
                        firstNumber, operator, secondNumber, result, typeOfNumber);
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.printf("Cannot divide %d by zero", firstNumber);
                } else {
                    result = (double) firstNumber / (double) secondNumber;
                    System.out.printf("%d / %d = %.2f", firstNumber, secondNumber, result);
                }
                break;
            case "%":
                if (secondNumber == 0) {
                    System.out.printf("Cannot divide %d by zero", firstNumber);
                } else {
                    result = firstNumber % secondNumber;
                    System.out.printf("%d %% %d = %.0f", firstNumber, secondNumber, result);
                }
        }
    }
}
