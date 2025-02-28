import java.util.Scanner;

public class LAB2_task_2 {
    public static void main(String[] args) {
        int width, length, area , perimeter;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length: ");
        length = s.nextInt();
        System.out.println("Enter the width: ");
        width = s.nextInt();
        area = length * width;
        perimeter = 2 * (length + width);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
