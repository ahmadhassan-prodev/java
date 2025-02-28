import java.util.Scanner;
public class LAB_5_Task_5 {
    public static void main(String[] args) {
        int num;
        int max;
        int counter=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number "+ counter);
        num = s.nextInt();
        max = num;
        while(num!=0)
        {
            counter++;
            System.out.println("Enter number "+ counter);
            num = s.nextInt();
            if(num>max)
            {
                max = num;
            }
        }
        System.out.println("Largest number of sequence is " + max);
    }
}
