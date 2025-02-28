public class LAB_7_Activity_1 {

    static int max(int a, int b)
    {
        if(a>b)
            return a;
        else
            return b;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int max = max(a,b);
        System.out.println("Max number of " + a + " and " + b + " is" + max);
    }
}
