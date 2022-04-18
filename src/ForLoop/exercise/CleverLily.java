package ForLoop.exercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        double washingMachinePrice = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());

        int savedMoney = 0;
        int toysCount = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                savedMoney += (i * 10) / 2;
                savedMoney--;
            } else {
                toysCount++;
            }
        }
        savedMoney += toyPrice * toysCount;

        if (savedMoney >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", savedMoney - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f", washingMachinePrice - savedMoney);
        }
    }
}
