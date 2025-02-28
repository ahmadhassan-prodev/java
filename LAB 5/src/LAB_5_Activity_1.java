import java.util.Scanner;

public class LAB_5_Activity_1 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        Scanner s = new Scanner(System.in);
        System.out.println("Sum of " + number1 + " and " + number2 +" is ");
        int answer = s.nextInt();
        while ( number1 + number2 != answer)
        {
            System.out.println("You are wrong.");
            System.out.println("Sum of " + number1 + " and " + number2 +" is ");
            answer = s.nextInt();
        }
        System.out.println("You got it!");
    }
}
