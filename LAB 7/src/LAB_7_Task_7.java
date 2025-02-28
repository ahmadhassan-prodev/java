import java.util.Scanner;

public class LAB_7_Task_7 {
    public static void printMatrix(int n)
    {
        System.out.println("The " + n + " by " + " matric is as follows:");
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                System.out.print((int) (Math.random()*2) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();
        printMatrix(n);
    }
}
