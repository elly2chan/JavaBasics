package ForLoop.lab;

import java.util.Scanner;

public class NumbersTo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }
}