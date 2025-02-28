import java.util.Scanner;

public class LAB_4_Task_9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of pennies");
        int pennies = s.nextInt();
        System.out.println("Enter the number of nickles");
        int nickles = s.nextInt();
        System.out.println("Enter the number of dims");
        int dims = s.nextInt();
        System.out.println("Enter the number of quarters");
        int quarters = s.nextInt();
        nickles = nickles * 5;
        dims = dims * 10;
        quarters = quarters * 25;
        int total = pennies+nickles+dims+quarters;
        if(total == 100)
        {
            System.out.println("Congratulations, you win the game");
        } else if (total < 100) {
            System.out.println("The amount entered was less than 1 dollar");
        }
        else {
            System.out.println("The amount entered was more than 1 dollar");
        }
    }
}
