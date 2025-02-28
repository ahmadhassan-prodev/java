import java.util.Scanner;
public class LAB_5_Task_8 {
    public static void main(String[] args) {
        int num1, num2;
        int greatercount = 0;
        int counter=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number "+ counter);
        num2 = s.nextInt();
        num1 = num2;
        while(num2!=0)
        {
            counter++;
            System.out.println("Enter number "+ counter);
            num2 = s.nextInt();
            if(num2>num1)
            {
                greatercount++;
            }
            num1 = num2;
        }
        System.out.println("No of elements greater than their previous one = " + greatercount);
    }
}
