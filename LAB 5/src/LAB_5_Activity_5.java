import java.util.Scanner;

public class LAB_5_Activity_5 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("*** Enter 5 numbers for Sum ***");
        for(int i=0; i<5; i++)
        {
            System.out.println("Enter number " + (i+1));
            int number = s.nextInt();
            sum += number;
        }
        System.out.println("Sum of 5 numbers is " + sum);
    }
}
