package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int groupBudget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int fishermenCount = Integer.parseInt(scan.nextLine());

        double totalPrice = 0.0;
        switch (season) {
            case "Spring":
                totalPrice = 3000;
                break;
            case "Summer": case "Autumn":
                totalPrice = 4200;
                break;
            case "Winter":
                totalPrice = 2600;
                break;
        }
        if (fishermenCount <= 6) {
            totalPrice -= totalPrice * 0.1;
        } else if (fishermenCount <= 11) {
            totalPrice -= totalPrice * 0.15;
        } else {
            totalPrice -= totalPrice * 0.25;
        }
        if (fishermenCount % 2 == 0) {
            if ("Spring".equals(season) || "Summer".equals(season) || "Winter".equals(season)) {
                totalPrice -= totalPrice * 0.05;
            }
        }

        if (groupBudget >= totalPrice) {
            System.out.printf("Yes! You have %.2f leva left.", groupBudget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", totalPrice - groupBudget);
        }
    }
}
