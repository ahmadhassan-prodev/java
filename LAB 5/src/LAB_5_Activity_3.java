import java.util.Scanner;

public class LAB_5_Activity_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number, counter = 0;
        int sum = 0;
        int avg = 0;
        final int SENTINEL = -999;
        System.out.println("** Get Average of numbers **");
        System.out.println("Enter the positive integers ,ending with -999");
        number = s.nextInt();
        while (number != SENTINEL)
        {
            sum += number;
            number = s.nextInt();
            counter++;
        }
        System.out.println("Sum of " + counter + " numbers = " + sum);
        avg = sum / counter;
        if(sum != 0)
        {
            System.out.println("Average = " + avg);
        }
        else{
            System.out.println("No Input!");
        }
    }
}
