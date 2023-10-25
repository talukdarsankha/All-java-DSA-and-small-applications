

public class PwQuickSort {

    public static void swap(int[]arr,int x, int y){
        int temp = arr[x];
        arr[x]= arr[y];
        arr[y]=temp;
    }

    public static int partition(int[]arr,int sta,int end){
        int pivot = arr[sta];
        int count =0;
        for (int i=sta+1;i<=end;i++){
            if (pivot>arr[i]){
                count++;
            }
        }
        int pivot_idx = sta+count;
        swap(arr,sta,pivot_idx);
        int i=sta;
        int j = end;
        while (i<pivot_idx && j>pivot_idx) {
            while (arr[i++] <= pivot){
               // i++;
            }
            while (arr[j--] > pivot) {
               // j--;
            }
            if (i < pivot_idx && j > pivot_idx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivot_idx;
    }
    public static void quickSort(int[] arr,int sta,int end){
        if (sta>=end){
            return;
        }
        int pivot = partition(arr,sta,end);
        quickSort(arr,sta,pivot-1);
        quickSort(arr,pivot+1,end);
    }
    public static void main(String[] args) {

        int[]arr ={78,1,6,29,35,8};
        quickSort(arr,0,arr.length-1);
        for (int e: arr){
            System.out.print(e+" ");
        }
    }
}


