public class MergeSort {
    static void merg(int arr[],int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            merg(arr,left,mid);
            merg(arr,mid+1,right);
            mergSort(arr,left,mid,right);
        }
    }

    static void mergSort(int arr[],int left,int mid,int right){
        int L = mid -left+1;
        int R = right-mid;

        int[]  Larr=new int[L];
        int[] Rarr=new int[R];
        for(int i=0;i<L;i++){
            Larr[i]=arr[left+i];
        }
        for(int j=0;j<R;j++){
            Rarr[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=left;
        while(i<L&&j<R){
            if(Larr[i]<=Rarr[j]){
                arr[k]=Larr[i];
                i++;
            }else{
                arr[k]=Rarr[j];
                j++;
            }k++;
        }

        while(i<L){
            arr[k]=Larr[i];
            k++;
            i++;
        }
        while(j<R){
            arr[k]=Rarr[j];
            k++;
            j++;
        }
    }

    static void print(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
    int arr[] ={1,5,0,1,8,9,4,2};
    merg(arr,0,arr.length-1);
    print(arr);
    }
}
