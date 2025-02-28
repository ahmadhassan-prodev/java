public class LAB_7_Activity_4 {
    static int max(int a, int b)
    {
        if(a>b)
            return a;
        else
            return b;
    }
    static double max(double a, double b)
    {
        if(a>b)
            return a;
        else
            return b;
    }
    static double max(double a, double b, double c)
    {
        return(max(max(a,b),c));
    }
    public static void main(String[] args) {
        int a =7, b=19;
        System.out.println("Max of " + a + " and " + b + " is " + max(a,b));
        double x = 3.14, y = 7.53, z = 5.23;
        System.out.println("Max of 7.43 and 8.93 is " + max(7.43, 8.93));
        System.out.println("Max of " + x + " , " + y + " and " + z +" is " + max(x,y,z));
    }
}
