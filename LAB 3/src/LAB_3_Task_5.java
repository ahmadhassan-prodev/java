import java.util.Scanner;

public class LAB_3_Task_5 {
    public static void main(String[] args) {
        int milk_cartons;
        double profit, cost, milk;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the total amount of milk produced: ");
        milk = s.nextDouble();
        milk_cartons = (int) (milk/3.78);
        cost =(int)(100 * milk * 0.38)/100.0;
        profit = (int)(100 * milk_cartons * 0.27)/100.0;
        System.out.println("Number of milk cartons: " + milk_cartons);
        System.out.println("Producing cost: $" + cost);
        System.out.println("Profit: $" + profit);
    }
}
