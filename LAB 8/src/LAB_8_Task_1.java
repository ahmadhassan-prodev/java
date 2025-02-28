import java.util.Scanner;

public class LAB_8_Task_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] rating = new int[10];
        int awful = 0, good = 0, excellent = 0;
        for(int i=0; i<rating.length; i++)
        {
            System.out.println("Enter the Rating of student " + (i+1));
            rating[i] = s.nextInt();
            if(rating[i]>=0 && rating[i] <=3)
                awful ++;
            else if(rating[i]>3 && rating[i] <=8)
                good ++;
            else if(rating[i]==9 || rating[i] ==10)
                excellent ++;
        }
        if(awful > good && awful > excellent)
            System.out.println("The quality of food is awful");
        else if(good > awful && good > excellent)
            System.out.println("The quality of food is good");
        else if(excellent > good && excellent > awful)
            System.out.println("The quality of good is awful");
    }
}
