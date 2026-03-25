public class MathMethods {

    public static int findMin(int a, int b) {
        return Math.min(a, b);
    }

    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public static double findSqrt(double a) {
        return Math.sqrt(a);
    }

    public static double findPower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double findAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static int findAbsolute(int a) {
        return Math.abs(a);
    }

    public static void main(String[] args) {
        System.out.println("Min: " + findMin(10, 20));
        System.out.println("Max: " + findMax(10, 20));
        System.out.println("Sqrt: " + findSqrt(25));
        System.out.println("Power: " + findPower(2, 3));
        System.out.println("Average: " + findAverage(10, 20, 30));
        System.out.println("Absolute: " + findAbsolute(-10));
    }
}
