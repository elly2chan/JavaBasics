package ForLoop.exercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tournamentsCount = Integer.parseInt(scan.nextLine());
        int startingPoints = Integer.parseInt(scan.nextLine());

        int wonPoints = 0;
        int tournamentsWon = 0;
        for (int i = 1; i <= tournamentsCount; i++) {
            String tournamentStatus = scan.nextLine();

            switch (tournamentStatus) {
                case "W":
                    startingPoints += 2000;
                    wonPoints += 2000;
                    tournamentsWon++;
                    break;
                case "F":
                    startingPoints += 1200;
                    wonPoints += 1200;
                    break;
                case "SF":
                    startingPoints += 720;
                    wonPoints += 720;
                    break;
            }
        }
        System.out.printf("Final points: %d\n", startingPoints);
        double averagePoints = Math.floor((double) wonPoints / tournamentsCount);
        System.out.printf("Average points: %d\n", (int) averagePoints);
        double winsPercentage = ((double) tournamentsWon / tournamentsCount) * 100;
        System.out.printf("%.2f%%", winsPercentage);
    }
}
