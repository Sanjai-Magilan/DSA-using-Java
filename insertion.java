public class insertion {
    static void Insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        print(arr);
    }

    static void print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,8,9,1,5,0};
        Insertion(arr);
    }
}