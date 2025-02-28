import java.util.Scanner;

public class LAB_4_Task_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1,  num2;
        System.out.println("Please enter two numbers to check which is smaller");
        System.out.println("Enter number 1");
        num1 = s.nextInt();
        System.out.println("Enter number 2");
        num2 = s.nextInt();
        int min = num1;
        if(num2<num1)
        {
            min = num2;
        }
        System.out.println("Minimum of two numbers: " + min);
        System.out.println("Chcek whether the number is positive(1), negative(-1) or zero(0)");
        System.out.println("Enter the integer");
        int x = s.nextInt();
        if(x > 0)
        {
            System.out.println("1");
        }
        else if (x<0)
        {
            System.out.println("-1");
        }
        else {
            System.out.println("0");
        }
        System.out.println("Please enter three numbers to check which is smaller");
        System.out.println("Enter number 1");
        num1 = s.nextInt();
        System.out.println("Enter number 2");
        num2 = s.nextInt();
        System.out.println("Enter number 3");
        int num3 = s.nextInt();
        min = num1;
        if(num2<min && num2<num3)
        {
            min = num2;
        } else if (num3 < min && num3 < num2) {
            min = num3;
        }
        System.out.println("Minimum of three numbers: " + min);
    }
}
