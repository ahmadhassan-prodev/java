import java.util.Scanner;

public class LAB_5_Task_1 {
    public static void main(String[] args) {
        // a)
        int a = 5;
        int b = 10;
        while (a <= b)
        {
            System.out.println(a);
            a++;
        }
        Scanner s = new Scanner(System.in);
        // b)
        System.out.println("Enter number A");
        a = s.nextInt();
        System.out.println("Enter number B");
        b = s.nextInt();
        System.out.println("Numbers from "+ a + " to " + b + " are: ");
        while (a!=b)
        {
            if(a<=b)
            {
                System.out.println(a);
                a++;
            }
            else if(a>b)
            {
                System.out.println(a);
                a--;
            }
        }
        System.out.println(b);
        // c)
        System.out.println("How many integers do you want to sum?");
        int limit = s.nextInt();
        int counter = 0;
        int num, sum = 0;
        while(counter != limit)
        {
            System.out.println("Enter number " + (counter+1));
            num = s.nextInt();
            sum += num;
            counter++;
        }
        System.out.println("Sum of " + limit + " numbers is " + sum);
        // d)
        double n;
        double counter2 = 1;
        double power = 3;
        double product = 1;
        sum = 0;
        System.out.println("Enter the integer N");
        n = s.nextDouble();
        while(counter2 != (n+1))
        {
            product = Math.pow(counter2,power);
            sum += product;
            counter2++;
        }
        System.out.println("Sum of 1 to " + (int)n + " raised to the power 3 = " + sum);
    }
}
