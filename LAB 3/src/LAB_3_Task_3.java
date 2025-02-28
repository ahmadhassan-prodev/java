import java.util.Scanner;

public class LAB_3_Task_3 {
    public static void main(String[] args) {
        int class1, class2, class3, desks;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of students in class 1");
        class1 = s.nextInt();
        System.out.println("Enter the no of students in class 2");
        class2 = s.nextInt();
        System.out.println("Enter the no of students in class 3");
        class3 = s.nextInt();
        desks = class1/2 + class1%2 + class2/2 + class2%2 + class3/2 + class3%2;
        System.out.println("No of desks required: " + desks);
    }
}
