import java.util.Scanner;

public class AB_4_Activity_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Enter 1, 2, or 3");
        num = s.nextInt();
        switch (num) {
            case 1:
                System.out.println("You have entered 1");
                break;
            case 2:
                System.out.println("You have entered 2");
                break;
            case 3:
                System.out.println("You have entered 3");
                break;
            default:
                System.out.println("That's not 1, 2 0r 3");
        }
    }
}
