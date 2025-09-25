public class quick {

        static void swap(int arr[], int i,int j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        static int part(int arr[],int low,int high){
            int pivot=arr[high];
            int i=low-1;

            for(int j=low;j<high;j++){
                if(arr[j]<pivot){
                    i++;
                    swap(arr,i,j);
                }
            }
            swap(arr,i+1,high);
            return i+1;
        }

    static void Quick(int arr[],int low,int high){
            if(low<high){
                int pivot= part(arr,low,high);

                Quick(arr,low,pivot-1);
                Quick(arr,pivot+1,high);
            }
    }

        static void print(int[] arr){
            for(int i:arr){
                System.out.print(i+" ");
            }
        }
        public static void main(String[] args) {
            int arr[] ={1,5,0,1,8,9,4,2};
            Quick(arr,0,arr.length-1);
            print(arr);
        }
    }