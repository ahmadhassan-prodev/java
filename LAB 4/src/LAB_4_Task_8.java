import java.util.Scanner;

public class LAB_4_Task_8 {
    public static void main(String[] args) {
        int date, month , year;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter month:");
        month = s.nextInt();
        System.out.println("Enter date:");
        date = s.nextInt();
        System.out.println("Enter year in two digits (eg, 1920 -> 20");
        year = s.nextInt();
        if((date*month) == year)
        {
            System.out.println("The date is magic");
        }
        else {
            System.out.println("The date is not magic");
        }
    }
}
