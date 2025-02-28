import java.util.Scanner;

public class LAB_7_Activity_5 {
    static int factorial(int a)
    {
        if(a>1)
            return a * factorial(a-1);
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number ( Non negative )");
        int n = s.nextInt();
        int fac = factorial(n);
        System.out.println("Factorial of " + n + " is " + fac);

    }
}
