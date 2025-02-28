import java.util.Scanner;
public class LAB_8_Task_2 {
    static int[] modify(int[] a)
    {
        for(int i=0; i<a.length; i++)
        {
            a[i] = a[i] * 3;
        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 elements in Array:");
        for(int i=0; i<10; i++)
        {
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i] = s.nextInt();
        }
        int[] b = modify(arr);
//    display array elements
        System.out.println("Array elements after modification are as follows:");
        for(int i=0; i<10; i++)
        {
            System.out.println("A [" + i + "] = " + b[i]);
        }
    }
}
