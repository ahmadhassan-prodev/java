import java.util.Scanner;
public class LAB_3_Task_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number (eg.18.29)");
        double num =s.nextDouble();
        num = num * 100;
        int dollars =(int) num / 100;
        num = num%100;
        int cents = (int)num%100;
        int quarters = cents/25;
        int remainin_cents = cents%25;
        int dims = remainin_cents/10;
        remainin_cents = remainin_cents%10;
        int nickles = remainin_cents/5;
        remainin_cents = remainin_cents%5;
        int pennies = remainin_cents;
        System.out.println("Dollars: " + dollars);
        System.out.println("Cents: " + cents);
        System.out.println("Dims: " + dims);
        System.out.println("Pennies: " + pennies);
    }
}
