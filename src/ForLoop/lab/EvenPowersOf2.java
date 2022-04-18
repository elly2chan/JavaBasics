package ForLoop.lab;

import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <= n; i += 2) {
            double result = Math.pow(2, i);
            if ((int) result == 1) {
                System.out.println((int) result);
            } else if ((int) result % 2 == 0) {
                System.out.println((int) result);
            }
        }
    }
}
