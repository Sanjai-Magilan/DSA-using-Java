public class SelectionSort {
    static void printarr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
static void selectionsort(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int min =i;
            for(int j = 0; j < arr.length; j++){
                if (arr[j]>arr[min]) {
                    min = j;
                }
                int temp = arr[i];
                  arr[i]=arr[min];
                  arr[min]=temp;
            }
        } printarr(arr);
}
    public static void main(String[] args) {
    int arr[]={1,5,0,1,8,9,-1};
    selectionsort(arr);
    }
}
