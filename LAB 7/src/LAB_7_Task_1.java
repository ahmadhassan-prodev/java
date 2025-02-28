import java.util.Scanner;

public class LAB_7_Task_1 {
//    for sum of digits
    public static int sumDigits(int n)
    {
        int sum = 0;
        int digit;
        while (n!=0)
        {
            digit = n % 10;
            sum += digit;
            n = n/10;
        }
        return sum;
    }
//    for reverse printing of number
    public static void reverse(int n)
    {
        int nOut = n;
//        for getting the length of number
        String numstr = String.valueOf(n);
        int len = numstr.length();
        int n2 ;
        int[] digit = new int[len];
        for(int i=0; i<len; i++)
        {
            digit[i] = n % 10;
            n = n/10;
        }
        System.out.println("The reverse of " + nOut + " is ");
        for(int i= 0; i<len; i++)
        {
            System.out.print(digit[i]);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int n = s.nextInt();
        System.out.println("Sum of digits " + n + " = " + sumDigits(n));
//        for reverse printing of number
        System.out.println("Enter number");
        int r = s.nextInt();
        reverse(r);

    }
}
