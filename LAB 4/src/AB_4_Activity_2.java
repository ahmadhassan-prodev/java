import java.util.Scanner;

public class AB_4_Activity_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num = s.nextInt();
        if(num % 5 == 0)
        {
            System.out.println("Hifive");
        }
        else if(num % 2==0)
        {
            System.out.println("HiEven");
        }
    }
}
