package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String projection = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());

        double income = 0.0;
        if ("Premiere".equals(projection)) {
            income = rows * cols * 12;
        } else if ("Normal".equals(projection)) {
            income = rows * cols * 7.50;
        } else if ("Discount".equals(projection)) {
            income = rows * cols * 5;
        }

        System.out.printf("%.2f leva", income);
    }
}
