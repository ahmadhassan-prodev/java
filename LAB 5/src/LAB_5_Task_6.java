import java.util.Scanner;

public class LAB_5_Task_6 {
    public static void main(String[] args) {
    int num;
    int index;
    int max;
    int counter=1;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number "+ counter);
    num = s.nextInt();
    max = num;
    index = counter;
    while(num!=0)
    {
        counter++;
        System.out.println("Enter number "+ counter);
        num = s.nextInt();
            if(num>max)
            {
                max = num;
                index= counter;
            }
        }
        System.out.println("Index of largest number of sequence is " + index);
    }
}
