package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int daysStay = Integer.parseInt(scan.nextLine());
        String typeOfRoom = scan.nextLine();
        String feedback = scan.nextLine();

        int nightsStay = daysStay - 1;
        double totalPrice = 0.0;
        switch (typeOfRoom) {
            case "room for one person":
                totalPrice = nightsStay * 18;
                break;
            case "apartment":
                totalPrice = nightsStay * 25;
                if (daysStay < 10) {
                    totalPrice -= totalPrice * 0.3;
                } else if (daysStay <= 15) {
                    totalPrice -= totalPrice * 0.35;
                } else {
                    totalPrice /= 2;
                }
                break;
            case "president apartment":
                totalPrice = nightsStay * 35;
                if (daysStay < 10) {
                    totalPrice -= totalPrice * 0.1;
                } else if (daysStay <= 15) {
                    totalPrice -= totalPrice * 0.15;
                } else {
                    totalPrice -= totalPrice * 0.2;
                }
                break;
        }
        if ("positive".equals(feedback)) {
            totalPrice += totalPrice * 0.25;
        } else {
            totalPrice -= totalPrice * 0.1;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
