public class palindrom {
    public static void main(String[] args) {
        String name = "karur";
        String palindrom = new StringBuilder(name).reverse().toString();
        System.out.print(palindrom);
    }
}