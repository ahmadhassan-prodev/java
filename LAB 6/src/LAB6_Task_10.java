import java.util.Scanner;

public class LAB6_Task_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s1 = s.nextLine();
        System.out.println(s1.charAt(2));
        System.out.println(s1.substring(1));
        System.out.println(s1.substring(0,5));
        System.out.println(s1.substring(0,s1.length()-2));
        for(int i=0; i<s1.length(); i+=2)
        {
            System.out.print(s1.charAt(i));
        }
        System.out.println();
        for(int i=1; i<s1.length(); i+=2)
        {
            System.out.print(s1.charAt(i));
        }
        System.out.println();
        for(int i=s1.length()-1; i>=0; i--)
        {
            System.out.print(s1.charAt(i));
        }
        System.out.println();
        for(int i=s1.length()-1; i>=0; i-=2)
        {
            System.out.print(s1.charAt(i));
        }
        System.out.println();
        System.out.println(s1.length());
    }
}
