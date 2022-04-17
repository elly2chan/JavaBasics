package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();
        int nightsCount = Integer.parseInt(scan.nextLine());

        double totalStudioPrice = 0.0;
        double totalApartmentPrice = 0.0;
        switch (month) {
            case "May": case "October":
                totalStudioPrice = nightsCount * 50;
                totalApartmentPrice = nightsCount * 65;
                if (nightsCount > 7 && nightsCount <= 14) {
                    totalStudioPrice -= totalStudioPrice * 0.05;
                } else if (nightsCount > 14) {
                    totalStudioPrice -= totalStudioPrice * 0.3;
                }
                break;
            case "June": case "September":
                totalStudioPrice = nightsCount * 75.2;
                totalApartmentPrice = nightsCount * 68.7;
                if (nightsCount > 14) {
                    totalStudioPrice -= totalStudioPrice * 0.2;
                }
                break;
            case "July": case "August":
                totalStudioPrice = nightsCount * 76;
                totalApartmentPrice = nightsCount * 77;
                break;
        }
        if (nightsCount > 14) {
            totalApartmentPrice -= totalApartmentPrice * 0.1;
        }
        System.out.printf("Apartment: %.2f lv.\n", totalApartmentPrice);
        System.out.printf("Studio: %.2f lv.", totalStudioPrice);
    }
}
