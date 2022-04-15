package ConditionalStatements.exercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double movieBudget = Double.parseDouble(scan.nextLine());
        int extraCount = Integer.parseInt(scan.nextLine());
        double clothesPricePerExtra = Double.parseDouble(scan.nextLine());

        double movieDecor = movieBudget * 0.1;
        double extraClothesTotal = extraCount * clothesPricePerExtra;

        if (extraCount > 150) {
            double discount = extraClothesTotal * 0.1;
            extraClothesTotal -= discount;
        }

        double totalExpenses = movieDecor + extraClothesTotal;

        if (totalExpenses > movieBudget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalExpenses - movieBudget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", movieBudget - totalExpenses);
        }
    }
}
