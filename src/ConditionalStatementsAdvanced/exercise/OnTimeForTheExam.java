package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int examHour = Integer.parseInt(scan.nextLine());
        int examMinutes = Integer.parseInt(scan.nextLine());
        int hourOfArrival = Integer.parseInt(scan.nextLine());
        int minuteOfArrival = Integer.parseInt(scan.nextLine());

        int examTime=examHour * 60 + examMinutes;
        int arrivalTime = hourOfArrival * 60 + minuteOfArrival;
        String typeOfArrival = "";
        String output = "";
        int difference = 0;

        if (arrivalTime < examTime - 30) {
            typeOfArrival = "Early";
            difference = examTime - arrivalTime;
            if (difference < 60) {
                output = String.format("%02d minutes before the start", difference);
            } else {
                int hour = difference / 60;
                int minutes = difference % 60;
                output=String.format("%d:%02d hours before the start", hour, minutes);
            }
        } else if (arrivalTime <= examTime) {
            typeOfArrival = "On time";
            difference = examTime - arrivalTime;
            output = String.format("%d minutes before the start", difference);

        } else {
            typeOfArrival = "Late";
            difference = arrivalTime - examTime;
            if (difference < 60) {
                output = String.format("%d minutes after the start", difference);
            } else {
                int hour = difference / 60;
                int minutes = difference % 60;
                output = String.format("%d:%02d hours after the start", hour, minutes);
            }
        }
        System.out.println(typeOfArrival);
        System.out.println(output);
    }
}
