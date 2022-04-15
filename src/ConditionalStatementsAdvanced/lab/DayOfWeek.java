package ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner scan = new Scanner(System.in);
        int dayIndex = Integer.parseInt(scan.nextLine());

        if (dayIndex >= 1 & dayIndex <= 7) {
            System.out.println(days[dayIndex - 1]);
        } else {
            System.out.println("Error");
        }
    }
}
