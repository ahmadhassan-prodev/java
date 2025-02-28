import java.util.Scanner;

public class LAB_5_Task_10 {
    public static void main(String[] args) {
        int year, firstday, leapyear = 0;
        String[] months = {"January","Febraury","March","April","May","June","july","August","September","October","November","December"};
        String[] week = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        int[] daysinmonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year");
        year = s.nextInt();
        System.out.println("Enter the first day of year(1 for Monday, 2 for Tuesday and so on)");
        firstday = s.nextInt();
        firstday = firstday + 1;
        if((year%4==0 && year%100 != 0) || (year%400==0))
        {
            leapyear = year;
        }
        if(year == leapyear)
        {
            daysinmonth[1] = 29;
        }
        System.out.println("*** Calender for the year "+ year +" ***\n");
        for(int i=0; i<12; i++)
        {
            System.out.println("\t\t" + months[i] + " " + year);
            System.out.println("----------------------------");
            for(int a=0; a<7; a++)
            {
                System.out.print(week[a] + "\t");
            }
            System.out.println();
            for(int b=0;b<(firstday-1)%7; b++)
            {
                System.out.print("\t");
            }
            for(int day=1; day<=daysinmonth[i]; day++)
            {
                System.out.printf("%2d",day);
                if((firstday+day-1)%7==0)
                    System.out.println();
                else
                    System.out.print("\t");
            }
            System.out.println("\n");
            firstday = (firstday + daysinmonth[i]-1)%7+1;
        }
    }
}
