import java.util.Scanner;

public class LAB_7_Activity_2 {

    static void printGrade(int marks)
    {
        if(marks>=90)
            System.out.println("The Grade is A");
        else if(marks>=80)
            System.out.println("The Grade is B");
        else if(marks>=70)
            System.out.println("The Grade is C");
        else if(marks>=60)
            System.out.println("The Grade is D");
        else
            System.out.println("The Grade is F");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Marks");
        int marks = s.nextInt();
        printGrade(marks);
    }
}
