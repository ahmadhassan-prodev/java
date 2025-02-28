import java.util.Scanner;

public class LAB_7_Activity_3 {
    static void swap(int a , int b)
    {
        System.out.println("Before swaping, number 1 is " + a + " and number 2 is " + b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swaping, number 1 is " + a + " and number 2 is " + b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1");
        int n1 = s.nextInt();
        System.out.println("Enter number 2");
        int n2 = s.nextInt();
        swap(n1, n2);
    }
}
