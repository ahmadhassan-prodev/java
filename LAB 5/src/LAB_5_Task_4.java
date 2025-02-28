import java.util.Scanner;

public class LAB_5_Task_4 {
    public static void main(String[] args) {
        int num;
        int counter=0;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("Enter number "+ (counter+1));
            num = s.nextInt();
            counter++;
        }while(num!=0);

        System.out.println("Lenght of sequence= " + (counter-1));
    }
}
