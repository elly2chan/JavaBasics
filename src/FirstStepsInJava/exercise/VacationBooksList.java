package FirstStepsInJava.exercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int currentBookPages = Integer.parseInt(scan.nextLine());
        int pagesPerHour = Integer.parseInt(scan.nextLine());
        int daysPerBook = Integer.parseInt(scan.nextLine());
        int hoursNeededPerBook = currentBookPages / pagesPerHour;
        int hoursNeededPerDay = hoursNeededPerBook / daysPerBook;
        System.out.println(hoursNeededPerDay);
    }
}
