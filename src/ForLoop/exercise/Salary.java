package ForLoop.exercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int openedTabs = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());

        boolean isLost = false;
        for (int i = 1; i <= openedTabs; i++) {
            String website = scan.nextLine();

            switch (website) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
            if (salary <= 0) {
                isLost = true;
                break;
            }
        }
        if (isLost) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}
