import java.util.Scanner;

public class LAB6_Task_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string which contains 'h' atleast twice");
        String s1 = s.nextLine();
        int index1 = s1.indexOf('h');
        int indexL = s1.lastIndexOf('h');
        if(index1 != -1 && indexL != -1 && index1 != indexL)
        {
            String result = s1.substring(0, index1) + s1.substring(indexL+1);
            System.out.println("Resulting string = " + result);
        }
        else
        {
            System.out.println("The string must contain the letter 'h' at least twice.");
        }
    }
}
