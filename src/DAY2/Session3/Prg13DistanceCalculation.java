package DAY2.Session3;
import java.util.Scanner;

public class Prg13DistanceCalculation {

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
    }

    public static double distance(double speed, double time) {
        return speed * time;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1, y1, x2, y2 for 2D distance: ");
        double d2 = distance(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.printf("2D Distance = %.2f%n", d2);

        System.out.print("Enter x1, y1, z1, x2, y2, z2 for 3D distance: ");
        double d3 = distance(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.printf("3D Distance = %.2f%n", d3);

        System.out.print("Enter speed and time: ");
        double dSpeed = distance(sc.nextDouble(), sc.nextDouble());
        System.out.printf("Distance = %.2f%n", dSpeed);

        sc.close();
    }
}


