import java.util.Scanner;

public class LAB1_3rd_task {
    public static void main(String[] args){
        double TAX_RATE = 0.055;
        double price, tax, total;
        String item;
        Scanner scan = new Scanner(System.in);
        System.out.println("\"Item description:   \"");
        item = scan.nextLine();
        System.out.println("\" Item price:  $\"");
        price = scan.nextDouble();
        tax = price * TAX_RATE;
        total = price + tax;
        System.out.println("Item description: " + item);
        System.out.println("Item price: " + price +" $");
        System.out.println("Item tax: " + tax +" $");
        System.out.println("Item total price: " + total +" $");


    }
}
