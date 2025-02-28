import java.util.Scanner;

public class LAB6_Task_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String w1 = s.nextLine();
        int palindrome = 1;
        int left = 0;
        int right = w1.length()-1;
        while (left < right)
        {
            if(w1.charAt(left) != w1.charAt(right))
            {
                palindrome = 0;
            }
            left++;
            right--;
        }
        if(palindrome == 1)
            System.out.println(w1 + " is a palindrome");
        else
            System.out.println(w1 + " is a not a palindrome");
    }
}
