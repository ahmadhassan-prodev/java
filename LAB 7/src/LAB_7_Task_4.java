import java.util.Scanner;

public class LAB_7_Task_4 {
    public static int numberOfDaysInAYear(int year)
    {
        int days;
        if(year%4==0)
            days = 366;
        else
            days = 365;
        return days;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = s.nextInt();
        System.out.println("The number of days in year " + year + " are " + numberOfDaysInAYear(year));
    }
}
