package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        String typeOfHousing = "";
        String destination = "";
        double housingPrice = 0.0;

        if (budget <= 100) {
            destination = "Bulgaria";
            if ("summer".equals(season)) {
                typeOfHousing = "Camp";
                housingPrice = budget * 0.3;
            } else if ("winter".equals(season)) {
                typeOfHousing = "Hotel";
                housingPrice = budget * 0.7;
            }
        } else if (budget > 100 && budget <= 1000) {
            destination = "Balkans";
            if ("summer".equals(season)) {
                typeOfHousing = "Camp";
                housingPrice = budget * 0.4;
            } else if ("winter".equals(season)) {
                typeOfHousing = "Hotel";
                housingPrice = budget * 0.8;
            }
        } else if (budget > 1000) {
            destination = "Europe";
            typeOfHousing = "Hotel";
            housingPrice = budget * 0.9;
        }

        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f", typeOfHousing, housingPrice);
    }
}
