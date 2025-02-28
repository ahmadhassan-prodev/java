import java.util.Scanner;

public class LAB_5_Activity_2 {
    public static void main(String[] args) {
        int numbers;
        int limit;
        int counter = 0;
        int sum = 0;
        int avg = 0;
        System.out.println("Enter the number of integers in list: ");
        Scanner s = new Scanner(System.in);
        limit = s.nextInt();
        while(counter < limit)
        {
            System.out.println("Enter the integer " + (counter+1));
            numbers = s.nextInt();
            sum += numbers;
            counter++;
        }
        avg = sum/ counter;
        System.out.println("The sum of " + limit + " intergers is " + sum);
        if (counter != 0)
        {
            System.out.println("Average of " + limit + " numbers is " + avg);
        }
        else{
            System.out.println("No Input!");
        }
    }
}
