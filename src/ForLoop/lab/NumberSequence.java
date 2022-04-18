package ForLoop.lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            numbers.add(number);
        }
        System.out.printf("Max number: %d\n", Collections.max(numbers));
        System.out.printf("Min number: %d", Collections.min(numbers));
    }
}
