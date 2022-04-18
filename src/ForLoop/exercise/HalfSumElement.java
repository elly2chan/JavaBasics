package ForLoop.exercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;
        int maxElement = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            sum += number;

            if (number > maxElement) {
                maxElement = number;
            }
        }
        int sumWithoutMaxElement = sum - maxElement;
        if (maxElement == sumWithoutMaxElement) {
            System.out.println("Yes");
            System.out.println("Sum = " + maxElement);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(maxElement - sumWithoutMaxElement));
        }
    }
}
