public class LAB_7_Task_10 {
    public static void main(String[] args) {
        printIncreasingStars(1, 5);
        System.out.println();
        printDecreasingStars(5);
    }

    public static void printIncreasingStars(int current, int limit) {
        if (current > limit) {
            return;
        }
        printStars(current);
        System.out.println();
        printIncreasingStars(current + 1, limit);
    }

    public static void printDecreasingStars(int n) {
        if (n < 1) {
            return;
        }
        printStars(n);
        System.out.println();
        printDecreasingStars(n - 1);
    }

    public static void printStars(int count) {
        if (count <= 0) {
            return;
        }
        System.out.print("* ");
        printStars(count - 1);
    }
}
