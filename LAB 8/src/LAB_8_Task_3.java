import java.util.Scanner;

public class LAB_8_Task_3 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        int[] copied = new int[10];
        int counter = 9;
        System.out.println("Enter 10 elements in Array:");
        for(int i=0; i<10; i++)
        {
            System.out.print("Enter element " + (i+1) + " : ");
            arr[i] = s.nextInt();
        }
        for(int i=0; i<10; i++)
        {
            copied[i] = arr[counter];
            counter--;
        }
        System.out.println("Array elements in reverse are as follows:");
        for(int i=0; i<10; i++)
        {
            System.out.println("A [" + i + "] = " + copied[i]);
        }
    }
}
