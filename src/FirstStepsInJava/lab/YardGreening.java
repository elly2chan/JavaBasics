package FirstStepsInJava.lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double squareMeters = Double.parseDouble(scan.nextLine());
        double priceWithoutDiscount = squareMeters * 7.61;
        double discount = priceWithoutDiscount * 0.18;
        double finalPriceWithDiscount = priceWithoutDiscount - discount;
        System.out.println("The final price is: " + finalPriceWithDiscount + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
