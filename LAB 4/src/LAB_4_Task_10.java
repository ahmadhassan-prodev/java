import java.util.Scanner;

public class LAB_4_Task_10 {
    public static void main(String[] args) {
        int books;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of books that you have purchased this month");
        books = s.nextInt();
        if(books==0)
        {
            System.out.println("You have earned 0 points");
        }
        else if(books==1)
        {
            System.out.println("You have earned 5 points");
        }
        else if(books==2)
        {
            System.out.println("You have earned 15 points");
        }
        else if(books==3)
        {
            System.out.println("You have earned 30 points");
        }
        else if(books==4)
        {
            System.out.println("You have earned 60 points");
        }
    }
}
