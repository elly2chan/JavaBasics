package ConditionalStatements.exercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String seriesName = scan.nextLine();
        int episodeLength = Integer.parseInt(scan.nextLine());
        int lunchBreakLength = Integer.parseInt(scan.nextLine());

        double lunchLength = lunchBreakLength / 8.0;
        double restLength = lunchBreakLength / 4.0;

        double timeLeft = lunchBreakLength - (lunchLength + restLength);

        if (timeLeft >= episodeLength) {
            System.out.printf("You have enough time to watch %s and left with" +
                    " %.0f minutes free time.", seriesName, Math.ceil(timeLeft - episodeLength));
        } else {
            System.out.printf("You don't have enough time to watch %s," +
                    " you need %.0f more minutes.", seriesName, Math.ceil(episodeLength - timeLeft));
        }
    }
}
