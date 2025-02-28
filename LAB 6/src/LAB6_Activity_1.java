import java.util.Scanner;

public class LAB6_Activity_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        program to calculate the angles of a triangle
        System.out.println("Enter three points in a triangle:");
        double x1 = s.nextDouble();
        double y1 = s.nextDouble();
        double x2 = s.nextDouble();
        double y2 = s.nextDouble();
        double x3 = s.nextDouble();
        double y3 = s.nextDouble();
//       Compute three sides
        double a = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        double b = Math.sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3));
        double c = Math.sqrt((x1-x3)*(x1-x3) + (y1-y3)*(y1-y3));
//        for computing angles
        double A = Math.toDegrees((Math.acos((a*a - b*b - c*c)/(-2*b*c))));
        double B = Math.toDegrees((Math.acos(( b*b - a*a - c*c)/(-2*a*c))));
        double C = Math.toDegrees((Math.acos(( c*c - a*a - b*b)/(-2*b*a))));

        System.out.println("Three angles are: " + Math.round(A*100)/100.0 + " "+ Math.round(B*100)/100.0 +
                " "+ Math.round(C*100)/100.0);
    }
}
