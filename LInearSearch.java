public class LInearSearch {
    static int linearSearch(int arr[], int b) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == b) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={1,89,15,0,69,100,20,6};
        int target = 20;
        System.out.print(linearSearch(arr,target));
    }
}
