public class fib {
    static int fibb(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fibb(n - 1) + fibb(n - 2);
    }

    public static void main(String[] args) {
        int num = 10;
        for (int i = 0; i <= num; i++) {
            System.out.print(fibb(i) + " ");
        }
    }
}