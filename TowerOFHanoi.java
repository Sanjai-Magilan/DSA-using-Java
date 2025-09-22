import java.util.Stack;

class TowerOFHanoi {

    public static void moveDisk(Stack<Integer> source, Stack<Integer> target, String sName, String tName) {
        int disk = source.pop();
        target.push(disk);
        System.out.println("Move disk " + disk + " from " + sName + " to " + tName);
    }

    public static void hanoi(int n, Stack<Integer> source, Stack<Integer> auxiliary, Stack<Integer> target,
                             String sName, String aName, String tName) {
        if (n == 1) {
            moveDisk(source, target, sName, tName);
        } else {
            hanoi(n - 1, source, target, auxiliary, sName, tName, aName);
            moveDisk(source, target, sName, tName);
            hanoi(n - 1, auxiliary, source, target, aName, sName, tName);
        }
    }

    public static void main(String[] args) {
        int n = 4; // number of disks

        Stack<Integer> source = new Stack<>();
        Stack<Integer> auxiliary = new Stack<>();
        Stack<Integer> target = new Stack<>();

        // Initialize source tower
        for (int i = n; i >= 1; i--) {
            source.push(i);
        }

        System.out.println("Source: " + source);
        System.out.println("Auxiliary: " + auxiliary);
        System.out.println("Target: " + target);
        System.out.println("   ");

        hanoi(n, source, auxiliary, target, "Source", "Auxiliary", "Target");

        System.out.println("   ");
        System.out.println("Source: " + source);
        System.out.println("Auxiliary: " + auxiliary);
        System.out.println("Target: " + target);
    }
}
