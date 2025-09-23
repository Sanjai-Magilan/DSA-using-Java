public class BubbleShort {
    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void Bubble(int arr[]) {
        int n;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    n = arr[i];
                    arr[i] = arr[j];
                    arr[j] = n;
                }
            }
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 0, 4, 6, 5, 42, 13, 846, 16, 864, 651, 616, 69};
        Bubble(arr);
    }
}
