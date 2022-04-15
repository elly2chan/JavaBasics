package FirstStepsInJava.exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tankLength = Integer.parseInt(scan.nextLine());
        int tankWidth = Integer.parseInt(scan.nextLine());
        int tankHeight = Integer.parseInt(scan.nextLine());
        double percentage = Double.parseDouble(scan.nextLine());

        int fishTankCapacity = tankLength * tankWidth * tankHeight;
        double fishTankLitersCapacity = fishTankCapacity * 0.001;
        double occupiedSpace = fishTankLitersCapacity * (percentage / 100.0);

        double usableFishTankSpace = fishTankLitersCapacity - occupiedSpace;

        System.out.println(usableFishTankSpace);
    }
}
