package FirstStepsInJava.exercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double depositSum = Double.parseDouble(scan.nextLine());
        int depositTerm = Integer.parseInt(scan.nextLine());
        double interest = Double.parseDouble(scan.nextLine());
        double yearlyInterest = depositSum * (interest / 100);
        double monthlyInterest = yearlyInterest / 12;
        double totalSum = depositSum + depositTerm * monthlyInterest;
        System.out.println(totalSum);
    }
}
