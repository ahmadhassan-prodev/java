public class LAB_3_Task_10 {
    public static void main(String[] args) {
        System.out.println("Degrees   Radians   sine     Cosine    Tangent");
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tangent = Math.tan(radians);
        System.out.print(degrees);
        System.out.print("        ");
        System.out.printf("%5.4f",radians);
        System.out.print("    ");
        System.out.printf("%5.4f",sin);
        System.out.print("   ");
        System.out.printf("%5.4f",cos);
        System.out.print("    ");
        System.out.printf("%5.4f \n",tangent);
        degrees = 60;
        radians = Math.toRadians(degrees);
        sin = Math.sin(radians);
        cos = Math.cos(radians);
        tangent = Math.tan(radians);
        System.out.print(degrees + "        ");
        System.out.printf("%5.4f",radians);
        System.out.print("    ");
        System.out.printf("%5.4f",sin);
        System.out.print("   ");
        System.out.printf("%5.4f",cos);
        System.out.print("    ");
        System.out.printf("%5.4f",tangent);
    }
}
