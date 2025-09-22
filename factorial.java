public class factorial {
    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fact(n - 1) * n;
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is: " + fact(5));
    }
}
