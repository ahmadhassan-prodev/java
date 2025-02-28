import java.util.Scanner;

public class LAB1_2nd_task {
    public static void main(String[] args) {
    double hours, pay_rate, total;
        System.out.println("What are your worked hours?");
        Scanner scan = new Scanner(System.in);
        hours = scan.nextDouble();
        System.out.println("What is your pay rate?");
        pay_rate = scan.nextDouble();
        if (hours <= 40){
            total = hours * pay_rate;
        }
        else{
            total = (hours - 40)*(1.5 * pay_rate)+(40 * pay_rate);
        }
        System.out.println("\" Your total pay is " + total + " Dollars \"");
    }
}
