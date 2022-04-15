package ConditionalStatements.exercise;

import java.util.Scanner;

public class ToyShop {
    public static double puzzlePrice = 2.60;
    public static double dollPrice = 3.00;
    public static double teddyBearPrice = 4.10;
    public static double minionPrice = 8.20;
    public static double truckPrice = 2.00;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double excursionPrice = Double.parseDouble(scan.nextLine());
        int puzzleCount = Integer.parseInt(scan.nextLine());
        int dollCount = Integer.parseInt(scan.nextLine());
        int teddyBearCount = Integer.parseInt(scan.nextLine());
        int minionCount = Integer.parseInt(scan.nextLine());
        int truckCount = Integer.parseInt(scan.nextLine());

        int toysCount = puzzleCount + dollCount + teddyBearCount + minionCount + truckCount;
        double puzzleTotalPrice = puzzlePrice * puzzleCount;
        double dollTotalPrice = dollPrice * dollCount;
        double teddyTotalPrice = teddyBearPrice * teddyBearCount;
        double minionTotalPrice = minionPrice * minionCount;
        double truckTotalPrice = truckPrice * truckCount;

        double totalToysPrice = puzzleTotalPrice + dollTotalPrice + teddyTotalPrice +
                minionTotalPrice + truckTotalPrice;
        double discount = 0;

        if (toysCount >= 50) {
            discount = totalToysPrice * 0.25;
            totalToysPrice -= discount;
        }

        double rentPrice = totalToysPrice * 0.1;
        totalToysPrice -= rentPrice;

        if (excursionPrice <= totalToysPrice) {
            System.out.printf("Yes! %.2f lv left.", totalToysPrice - excursionPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", excursionPrice - totalToysPrice);
        }
    }
}
