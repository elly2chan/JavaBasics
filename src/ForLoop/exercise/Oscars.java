package ForLoop.exercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String actorName = scan.nextLine();
        double actorPoints = Double.parseDouble(scan.nextLine());
        int academyEvaluators = Integer.parseInt(scan.nextLine());

        boolean isNominated = false;
        for (int i = 1; i <= academyEvaluators; i++) {
            String evaluatorName = scan.nextLine();
            double evaluatorPoints = Double.parseDouble(scan.nextLine());
            double pointsToAdd = (evaluatorName.length() * evaluatorPoints) / 2;
            actorPoints += pointsToAdd;

            if (actorPoints > 1250.5) {
                isNominated = true;
                break;
            }
        }
        if (isNominated) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, actorPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - actorPoints);
        }
    }
}
