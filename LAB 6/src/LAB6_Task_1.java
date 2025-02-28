import java.util.Scanner;

public class LAB6_Task_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = s.nextDouble();
        double y1 = s.nextDouble();
//        x = latitude , y = longitude
        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = s.nextDouble();
        double y2 = s.nextDouble();
        final double radius = 6371.01;
        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);
        y1 = Math.toRadians(y1);
        y2 = Math.toRadians(y2);
        double distance = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.println("The distance between two points is " + distance + " km");
    }
}
