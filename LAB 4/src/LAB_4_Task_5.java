import java.util.Scanner;
public class LAB_4_Task_5 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1");
        num1 = s.nextInt();
        System.out.println("Enter number 2");
        num2 = s.nextInt();
        System.out.println("Enter number 3");
        num3 = s.nextInt();
        if(num1 == num2 && num1 == num3 && num2 == num3)
        {
            System.out.println("Numbers equal to each other: 3");
        }
        else if (num1 == num2 || num1 == num3 || num2 == num3) {
        System.out.println("Numbers equal to each other: 2");
        }
        else {
            System.out.println("Numbers equal to each other: 0");
        }
    }
}
