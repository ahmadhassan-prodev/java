import java.util.Scanner;

public class LAB6_Task_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String f = s.nextLine();
        if(f.indexOf('f') > 0)
        {
            System.out.println("Index of first 'f' in " + f + " is " + f.indexOf('f') +
                    " and last 'f' is " + f.lastIndexOf('f'));
        }
    }
}
