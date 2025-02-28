import java.util.Scanner;

public class LAB2_Activity_5 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number for radius: ");
        double radius = s.nextDouble();
        double area = radius * radius * PI;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
