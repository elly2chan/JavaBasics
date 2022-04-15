package ConditionalStatements.exercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double recordBySeconds = Double.parseDouble(scan.nextLine());
        double distanceByMeters = Double.parseDouble(scan.nextLine());
        double secondsPerMeter = Double.parseDouble(scan.nextLine());

        double totalSwimTime = distanceByMeters * secondsPerMeter;
        double delay = Math.floor(distanceByMeters / 15);
        delay = delay * 12.5;
        double totalTime = totalSwimTime + delay;

        if (recordBySeconds > totalTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - recordBySeconds);
        }
    }
}
