public class recursion {

    static void show(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println("Hello");
            show(n - 1);
        }
    }

    public static void main(String[] args) {
        show(10);
    }
}
