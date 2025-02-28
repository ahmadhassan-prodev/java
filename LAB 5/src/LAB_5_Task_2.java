import java.util.Scanner;

public class LAB_5_Task_2 {
    public static void main(String[] args) {
        int n;
        int factorial = 1;
        System.out.println("Enter integer N");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for(int i=1; i<=n; i++)
        {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " = " + factorial);
    }
}
