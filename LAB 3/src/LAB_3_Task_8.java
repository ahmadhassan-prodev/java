import java.util.Scanner;

public class LAB_3_Task_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000");
        int num = s.nextInt();
        int digit1 = num%10;
        num = num/10;
        int digit2 = num % 10;
        num = num/10;
        int digit3 = num % 10;
        num = num/10;
        int sum_of_digits = digit1 + digit2 + digit3;
        System.out.println("The sum of the digits is " + sum_of_digits);
    }
}
