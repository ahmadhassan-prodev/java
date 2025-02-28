import java.util.Scanner;

public class LAB_7_Task_9 {
    static double power(double a , int n)
    {
        if(n!=0)
            return a * power(a , n-1);
        else return 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the real number: ");
        double real = s.nextDouble();
        System.out.print("Enter the power of " + real + " : ");
        int power = s.nextInt();
        System.out.print("The result of " + real + " to the power " + power + " is ");
        System.out.print((int)(power(real,power)*100)/100.0);
    }
}
