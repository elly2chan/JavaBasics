package ForLoop.exercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int groupsCount = Integer.parseInt(scan.nextLine());

        double percentageMusala = 0.0;
        double percentageMonblan = 0.0;
        double percentageKilimandzharo = 0.0;
        double percentageK2 = 0.0;
        double percentageEverest = 0.0;

        int peopleTotal = 0;
        for (int i = 1; i <= groupsCount; i++) {
            int peopleInGroup = Integer.parseInt(scan.nextLine());
                if (peopleInGroup <= 5) {
                    percentageMusala += peopleInGroup;
                } else if (peopleInGroup <= 12) {
                    percentageMonblan += peopleInGroup;
                } else if (peopleInGroup <= 25) {
                    percentageKilimandzharo += peopleInGroup;
                } else if (peopleInGroup <= 40) {
                    percentageK2 += peopleInGroup;
                } else {
                    percentageEverest += peopleInGroup;
                } peopleTotal += peopleInGroup;
        }
        percentageMusala = percentageMusala / peopleTotal * 100;
        percentageMonblan = percentageMonblan / peopleTotal * 100;
        percentageKilimandzharo = percentageKilimandzharo / peopleTotal * 100;
        percentageK2 = percentageK2 / peopleTotal * 100;
        percentageEverest = percentageEverest / peopleTotal * 100;

        System.out.printf("%.2f%%\n", percentageMusala);
        System.out.printf("%.2f%%\n", percentageMonblan);
        System.out.printf("%.2f%%\n", percentageKilimandzharo);
        System.out.printf("%.2f%%\n", percentageK2);
        System.out.printf("%.2f%%", percentageEverest);
    }
}
