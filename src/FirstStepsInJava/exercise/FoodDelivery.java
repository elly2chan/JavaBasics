package FirstStepsInJava.exercise;

import java.util.Scanner;

public class FoodDelivery {
    static double chickenMenuPrice = 10.35;
    static double fishMenuPrice = 12.40;
    static double vegMenuPrice = 8.15;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chickenMenuCount = Integer.parseInt(scan.nextLine());
        int fishMenuCount = Integer.parseInt(scan.nextLine());
        int vegMenuCount = Integer.parseInt(scan.nextLine());

        double chickenTotalPrice = chickenMenuCount * chickenMenuPrice;
        double fishTotalPrice = fishMenuCount * fishMenuPrice;
        double vegTotalPrice = vegMenuCount * vegMenuPrice;
        double totalMenusPrice = chickenTotalPrice + fishTotalPrice + vegTotalPrice;
        double desertPrice = totalMenusPrice * 0.2;
        double totalBill = totalMenusPrice + desertPrice + 2.50;

        System.out.println(totalBill);
    }
}
