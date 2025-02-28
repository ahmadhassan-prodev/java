import java.util.Scanner;

public class LAB_8_Activity_2 {
    static void sum(int[] a)
    {
        int sum = 0;
        for(int i=0; i<a.length; i++)
        {
            sum+= a[i];
        }
        System.out.println("Sum of given array is " + sum);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter the 5 elements of Array");
        for(int i=0; i<a.length; i++)
        {
            a[i] = s.nextInt();
        }
        sum(a);
    }
}
