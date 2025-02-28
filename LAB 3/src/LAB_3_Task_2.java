import java.util.Scanner;

public class LAB_3_Task_2 {
    public static void main(String[] args) {
        int students, apples, distributed_apples;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of students");
        students = s.nextInt();
        System.out.println("Enter the number of apples");
        apples = s.nextInt();
        distributed_apples = apples / students;
        int basket = apples%students;
        System.out.println("Apples for each student: " + distributed_apples);
        System.out.println("Remaining apples: "+ basket);
    }
}
