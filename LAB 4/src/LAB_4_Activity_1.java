import java.util.Scanner;

public class LAB_4_Activity_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = s.nextInt();
        boolean leapyear = (year%4 == 0 && year%100 != 0) || (year % 400==0);
        System.out.println("Is " + year + " a leap year?" + leapyear);
    }
}
