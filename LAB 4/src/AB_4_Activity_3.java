import java.util.Scanner;

public class AB_4_Activity_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the worked hours");
        double hours = s.nextDouble();
        System.out.println("Enter pay rate");
        double rate = s.nextDouble();
        double pay;
        if(hours > 40)
        {
            pay = 40.0 * rate + 1.5 *rate * (hours - 40.0);
        }
        else {
            pay = hours * rate;
        }
        System.out.printf("Wages are $%.2f %n", pay);
        System.out.println();
    }
}
