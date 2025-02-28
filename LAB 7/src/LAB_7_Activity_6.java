import java.util.Scanner;

public class LAB_7_Activity_6 {
    static int fibronacci(int index)
    {
        if (index == 0)
            return 0;
        else if(index == 1)
            return 1;
        else
            return fibronacci(index-1) + fibronacci(index-2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter index of fibronacci number");
        int n = s.nextInt();
        System.out.println("Fibronacci number at index " + n + " is " + fibronacci(n));
    }
}
