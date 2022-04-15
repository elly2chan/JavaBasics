package ConditionalStatements.exercise;

import java.util.Scanner;

public class Shopping {
    public static int graphicsPrice = 250;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int graphicsCount = Integer.parseInt(scan.nextLine());
        int processorsCount = Integer.parseInt(scan.nextLine());
        int ramCount = Integer.parseInt(scan.nextLine());

        double totalGraphicsPrice = graphicsPrice * graphicsCount;
        double totalProcessorsPrice = (totalGraphicsPrice * 0.35) * processorsCount;
        double totalRamPrice = (totalGraphicsPrice * 0.1) * ramCount;

        double totalExpenses = totalGraphicsPrice + totalProcessorsPrice + totalRamPrice;

        if (graphicsCount > processorsCount) {
            double discount = totalExpenses * 0.15;
            totalExpenses -= discount;
        }

        if (budget >= totalExpenses) {
            System.out.printf("You have %.2f leva left!", budget - totalExpenses);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalExpenses - budget);
        }
    }
}
