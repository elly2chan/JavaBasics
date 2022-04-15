package FirstStepsInJava.exercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yearlyTrainingTax = Integer.parseInt(scan.nextLine());
        double basketballShoesPrice = yearlyTrainingTax * 0.6;
        double basketballClothesPrice = basketballShoesPrice * 0.8;
        double basketballPrice = basketballClothesPrice / 4;
        double basketballAccessoriesPrice = basketballPrice / 5;

        double totalExpenses = yearlyTrainingTax + basketballShoesPrice +
                basketballClothesPrice + basketballPrice + basketballAccessoriesPrice;

        System.out.println(totalExpenses);
    }
}
