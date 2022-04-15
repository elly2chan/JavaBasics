package FirstStepsInJava.lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogFoodPacketsCount = Integer.parseInt(scan.nextLine());
        int catFoodPacketsCount = Integer.parseInt(scan.nextLine());
        double dogFoodTotalPrice = dogFoodPacketsCount * 2.50;
        int catFoodTotalPrice = catFoodPacketsCount * 4;
        double totalSum = dogFoodTotalPrice + catFoodTotalPrice;
        System.out.println(totalSum + " lv.");
    }
}
