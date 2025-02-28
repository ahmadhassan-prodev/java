import java.util.Scanner;

public class LAB__8_Task_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] rating = new int[10];
        int sum = 0;
        double ratings;
        System.out.println("Give Ratings between 1-10");
        for(int i=0; i<rating.length; i++)
        {
            System.out.println("Enter the Rating of student " + (i+1));
            rating[i] = s.nextInt();
            sum += rating[i];
        }
        ratings = sum/10;
        System.out.println("The ratings of food quality is " + ratings);
    }
}
