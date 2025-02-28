import java.util.Scanner;

public class LAB6_Task_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two words separated by space");
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        System.out.println("Words before swapping are " + s1 + " , " + s2);
        String s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println("Words after swapping are " + s1 + " , " + s2);
    }
}
