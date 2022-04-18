package ForLoop.exercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int p1Counter = 0;
        int p2Counter = 0;
        int p3Counter = 0;
        int p4Counter = 0;
        int p5Counter = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scan.nextLine());

            if (number < 200) {
                p1Counter++;
            } else if (number <= 399) {
                p2Counter++;
            } else if (number <= 599) {
                p3Counter++;
            } else if (number <= 799) {
                p4Counter++;
            } else {
                p5Counter++;
            }
        }
        double p1Percentage = (double) p1Counter / n * 100;
        double p2Percentage = (double) p2Counter / n * 100;
        double p3Percentage = (double) p3Counter / n * 100;
        double p4Percentage = (double) p4Counter / n * 100;
        double p5Percentage = (double) p5Counter / n * 100;

        System.out.printf("%.2f%%\n", p1Percentage);
        System.out.printf("%.2f%%\n", p2Percentage);
        System.out.printf("%.2f%%\n", p3Percentage);
        System.out.printf("%.2f%%\n", p4Percentage);
        System.out.printf("%.2f%%\n", p5Percentage);
    }
}
