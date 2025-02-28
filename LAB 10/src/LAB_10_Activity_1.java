import java.util.Scanner;

public class LAB_10_Activity_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] arr = new int[3][4];
        int sum = 0;
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print("Enter array element [" + i+ "][" + j + "] :");
                arr[i][j] = s.nextInt();
            }
        }
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<4; j++)
            {
                sum = arr[i][j];
            }
            System.out.println("The sum of row " + (i+1) + " is " + sum);
            sum = 0;
        }
    }
}
