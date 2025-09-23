import java.util.Arrays;
public class BinarySearch {
    static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 89, 15, 0, 69, 100, 20, 6};
        int target = 100;
        Arrays.sort(arr);
        int res = binarySearch( arr, target );
        if (res == -1) System.out.println("not found");
        else System.out.println("found at " + res);
    }
}
