package ConditionalStatements.lab;

import java.util.Objects;
import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String figureType = scan.nextLine();

        double area = 0;

        if (figureType.equals("square")) {
            double side = Double.parseDouble(scan.nextLine());
            area = side * side;
        } else if (figureType.equals("rectangle")) {
            double firstSide = Double.parseDouble(scan.nextLine());
            double secondSide = Double.parseDouble(scan.nextLine());
            area = firstSide * secondSide;
        } else if (figureType.equals("circle")) {
            double radius = Double.parseDouble(scan.nextLine());
            area = Math.PI * (radius * radius);
        } else if (figureType.equals("triangle")) {
            double side = Double.parseDouble(scan.nextLine());
            double height = Double.parseDouble(scan.nextLine());
            area = (side * height) / 2;
        }

        System.out.printf("%.3f", area);
    }
}
