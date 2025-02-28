
public class LAB_7_Task_2 {
    public static int reverse(int num)
    {
        int reversed = 0;
        while(num!=0)
        {
            int digit = num%10;
            reversed = reversed * 10 + digit;// This formula is used to get the reversed number
            num = num/10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse(2345));
    }
}
