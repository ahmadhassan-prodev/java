import java.util.Scanner;

public class LAB_5_Task_7 {
    public static void main(String[] args) {
        int num;
        int evencount= 0;
        int counter=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number "+ counter);
        num = s.nextInt();
        while(num!=0)
        {
            if(num%2==0)
            {
                evencount++;
            }
            counter++;
            System.out.println("Enter number "+ counter);
            num = s.nextInt();
        }
        System.out.println("Number of even integers = " + evencount);
    }
}
