import java.util.Scanner;

public class LAB_5_Activity_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number, max;
        System.out.println("*** Finding maximum number ***");
        System.out.println("Enter the number:");
        number = s.nextInt();
        max = number;
        do{
            if(number>max)
            {
                max = number;
            }
            System.out.println("Enter number again.(Enter 0 to end finding)");
            number = s.nextInt();
        }while(number != 0);
        System.out.println("Maximum number is " + max);
    }
}
