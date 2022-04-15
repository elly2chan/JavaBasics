package ConditionalStatements.exercise;

import java.util.Scanner;

public class TimeAnd15Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        if (minutes + 15 == 60) {
            hour += 1;
            minutes = 0;
        } else if (minutes + 15 > 60) {
            hour += 1;
            minutes = (minutes + 15) - 60;

        } else {
            minutes += 15;
        }

        if (hour == 24) {
            hour = 0;
        }

        if (minutes < 10) {
            System.out.printf("%d:0%d", hour, minutes);
        } else {
            System.out.printf("%d:%d", hour, minutes);
        }
    }
}
