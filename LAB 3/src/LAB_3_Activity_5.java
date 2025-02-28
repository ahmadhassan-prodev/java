import java.util.Scanner;

public class LAB_3_Activity_5 {
    public static void main(String[] args) {
        double purchaseAmount, tax;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the purchase amount");
        purchaseAmount = s.nextDouble();
        tax = purchaseAmount * 0.06;
        System.out.println("Sale tax is $" + (int)(tax * 100)/100.0);
    }
}
