public class QuickShort{

    public static int partition(int[] arr, int low , int heigh){
        int pivot = arr[heigh];
        int i = low-1;

        for(int j = low; j<heigh; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[heigh] = temp;

        return i;
    }
    public static void quickshort(int[] arr , int low ,int heigh){
        if(low < heigh){
            int pivot = partition(arr, low, heigh);
            quickshort(arr, low , pivot-1);
            quickshort(arr,pivot+1,heigh);
        }
    }


    public static void main(String args[]){
        int[] arr = {4,5,63,6,2,1,9};

        quickshort(arr, 0, arr.length -1);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+",");
        }
    }
} 