package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String typeOfFlowers = scan.nextLine();
        int countOfFlowers = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        double totalPrice = 0.0;
        switch (typeOfFlowers) {
            case "Roses":
                totalPrice = countOfFlowers * 5;
                if (countOfFlowers > 80) {
                    totalPrice -= totalPrice * 0.1;
                }
                break;
            case "Dahlias":
                totalPrice = countOfFlowers * 3.80;
                if (countOfFlowers > 90) {
                    totalPrice -= totalPrice * 0.15;
                }
                break;
            case "Tulips":
                totalPrice = countOfFlowers * 2.80;
                if (countOfFlowers > 80) {
                    totalPrice -= totalPrice * 0.15;
                }
                break;
            case "Narcissus":
                totalPrice = countOfFlowers * 3;
                if (countOfFlowers < 120) {
                    totalPrice += totalPrice * 0.15;
                }
                break;
            case "Gladiolus":
                totalPrice = countOfFlowers * 2.50;
                if (countOfFlowers < 80) {
                    totalPrice += totalPrice * 0.2;
                }
                break;
        }
        if (budget >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d" +
                    " %s and %.2f leva left.", countOfFlowers, typeOfFlowers, budget - totalPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", totalPrice - budget);
        }
    }
}

