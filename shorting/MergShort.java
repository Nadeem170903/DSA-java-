import java.util.*;
public class MergShort{


    public static void conquror(int arr[], int si, int mid, int ei){

         int[] merge = new int[ei-si + 1];

         int idx1 = si;
         int idx2 = mid+1;
         int x = 0;

         while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                merge[x++] = arr[idx1++];
            }else {
                merge[x++] = arr[idx2++];
            }
         }


         while(idx1 <= mid){
            merge[x++] = arr[idx1++];
         }

         while(idx2 <= ei){
            merge[x++] = arr[idx2++];
         }



         for(int i = 0, j = si; i<merge.length; i++ , j++){
            arr[j] = merge[i];
         }
    }



    public static void devide(int arr[], int si, int ei){

       if(si >= ei){
        return;
       }

        int mid = (si+ei)/2;
        devide(arr, si, mid);
        devide(arr, mid+1, ei);
        conquror(arr, si, mid, ei);
    }

    
    public static void main(String args[]){
        int[] arr = {7,5,4,5,8,9,6,2};
        int si = 0;
        int n = arr.length;

        devide(arr,si,n-1);

        for(int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    
}