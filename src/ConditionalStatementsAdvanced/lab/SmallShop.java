package ConditionalStatementsAdvanced.lab;

import java.util.Objects;
import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String city = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        double bill = 0;

        if (product.equals("coffee")) {
            if (city.equals("Sofia")) {
                bill = quantity * 0.5;
            } else if (city.equals("Plovdiv")) {
                bill = quantity * 0.4;
            } else {
                bill = quantity * 0.45;
            }
        } else if (product.equals("water")) {
            if (city.equals("Sofia")) {
                bill = quantity * 0.8;
            } else if (city.equals("Plovdiv")) {
                bill = quantity * 0.7;
            } else {
                bill = quantity * 0.7;
            }
        } else if (product.equals("beer")) {
            if (city.equals("Sofia")) {
                bill = quantity * 1.2;
            } else if (city.equals("Plovdiv")) {
                bill = quantity * 1.15;
            } else {
                bill = quantity * 1.1;
            }
        } else if (product.equals("sweets")) {
            if (city.equals("Sofia")) {
                bill = quantity * 1.45;
            } else if (city.equals("Plovdiv")) {
                bill = quantity * 1.3;
            } else {
                bill = quantity * 1.35;
            }
        } else {
            if (city.equals("Sofia")) {
                bill = quantity * 1.6;
            } else if (city.equals("Plovdiv")) {
                bill = quantity * 1.5;
            } else {
                bill = quantity * 1.55;
            }
        }
        System.out.println(bill);
    }
}
