import java.util.Scanner;

public class LAB_8_Activity_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] num = new int[10];
        for(int i=0; i<10; i++)
        {
            System.out.println("Enter element " + (i+1));
            num[i] = s.nextInt();
        }
        int large = num[0];
        int large2 = num[0];
        for(int i=1; i<num.length; i++) {
            if (num[i] > large)
                large = num[i];
        }
        for(int i=1; i<num.length; i++){
            if(num[i]>large2)
            {
                if( num[i]<large)
                    large2 = num[i];
            }
        }
        System.out.println("Largest number = " + large);
        System.out.println("2nd Largest number = " + large2);
    }
}
