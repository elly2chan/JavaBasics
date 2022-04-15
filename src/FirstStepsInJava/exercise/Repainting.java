package FirstStepsInJava.exercise;
import java.util.Scanner;

public class Repainting {
    static double protectiveNylonPricePerSquare = 1.50;
    static double paintPricePerLiter = 14.50;
    static double paintThinnerPricePerLiter = 5.00;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int squareMetersNylonNeeded = Integer.parseInt(scan.nextLine());
        int litersPaintNeeded = Integer.parseInt(scan.nextLine());
        int litersPaintThinnerNeeded = Integer.parseInt(scan.nextLine());
        int workHoursNeeded = Integer.parseInt(scan.nextLine());

        double totalNylonPrice = (squareMetersNylonNeeded + 2) * protectiveNylonPricePerSquare;
        double additionalPaint = litersPaintNeeded * 0.1;
        double totalPaintPrice = (litersPaintNeeded + additionalPaint) * paintPricePerLiter;
        double totalPaintThinnerPrice = litersPaintThinnerNeeded * paintThinnerPricePerLiter;
        double totalMaterialsPrice = totalNylonPrice + totalPaintPrice + totalPaintThinnerPrice + 0.40;
        double workersPricePerHour = totalMaterialsPrice * 0.30;
        double totalWorkersPrice = workHoursNeeded * workersPricePerHour;
        double totalPrice = totalMaterialsPrice + totalWorkersPrice;

        System.out.println(totalPrice);
    }
}
