import java.util.Scanner;

public class LAB_5_Task_3 {
    public static void main(String[] args) {
        int number;
        int counter = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the list for numbers");
        int limit = s.nextInt();
        for(int i=1; i<=limit; i++)
        {
            System.out.println("Enter number " + i);
            number = s.nextInt();
            if(number==0)
            {
                counter++;
            }
        }
        System.out.println("Entered numbers that are equal to zero: " + counter);
    }
}
