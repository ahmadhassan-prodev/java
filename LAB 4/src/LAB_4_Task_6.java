import java.util.Scanner;

public class LAB_4_Task_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number from 1-10");
        int num = s.nextInt();
        switch (num)
        {
            case 1:
                System.out.println("Roman version of 1: i");
                break;
            case 2:
                System.out.println("Roman version of 2: ii");
                break;
            case 3:
                System.out.println("Roman version of 3: iii");
                break;
            case 4:
                System.out.println("Roman version of 4: iv");
                break;
            case 5:
                System.out.println("Roman version of 5: v");
                break;
            case 6:
            System.out.println("Roman version of 6: vi");
                break;
            case 7:
            System.out.println("Roman version of 7: vii");
                break;
            case 8:
                System.out.println("Roman version of 8: viii");
                break;
            case 9:
                System.out.println("Roman version of 9: ix");
                break;
            case 10:
                System.out.println("Roman version of 10: x");
            default:
                System.out.println("Entered number is not in a range (1-10)");
        }
    }
}
