public class LAB6_Task_4 {
    public static void main(String[] args) {
//   Math.random() generates a double value between 0.01 to 1.0, we need to type cast it into integer
        int n = (int)(Math.random() * 26);
        char letter = (char) ('A' + n);
        System.out.println("Random Upper Case letter is " + letter);
    }
}
