import java.util.Scanner;

public class LAB_3_Task_4 {
    public static void main(String[] args) {
        int minutes, clockhours, clockminutes;
        System.out.print("Enter minutes: ");
        Scanner s = new Scanner(System.in);
        minutes = s.nextInt();
        clockhours = minutes / 60;
        clockminutes = minutes % 60;
        System.out.println("Time: " + clockhours + ":" + clockminutes);
    }
}
