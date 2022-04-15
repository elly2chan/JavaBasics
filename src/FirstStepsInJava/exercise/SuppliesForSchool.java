package FirstStepsInJava.exercise;

import java.util.Scanner;

public class SuppliesForSchool {
    static double penPrice = 5.80;
    static double markerPrice = 7.20;
    static double detergentPricePerLiter = 1.20;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int penPacketsCount = Integer.parseInt(scan.nextLine());
        int markerPacketsCount = Integer.parseInt(scan.nextLine());
        int detergentLiters = Integer.parseInt(scan.nextLine());
        int percentageDiscount = Integer.parseInt(scan.nextLine());

        double totalPenPrice = penPrice * penPacketsCount;
        double totalMarkerPrice = markerPrice * markerPacketsCount;
        double totalDetergentPrice = detergentPricePerLiter * detergentLiters;

        double totalPrice = totalPenPrice + totalMarkerPrice + totalDetergentPrice;
        double totalDiscount = percentageDiscount / 100.0;
        double totalPriceWithDiscount = totalPrice - (totalPrice * totalDiscount);
        System.out.println(totalPriceWithDiscount);
    }
}
