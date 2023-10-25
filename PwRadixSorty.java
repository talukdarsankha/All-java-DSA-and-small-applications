

             // Radix sort  ------------>>>>>>>>>>>


public class PwRadixSorty {

     public static void printArr(int [] arr){
         for (int e: arr){
             System.out.print(e+" ");
         }
     }


     public static int findMax(int[]arr){
         int max =Integer.MIN_VALUE;
         for (int e: arr){
             if (max<e){
                 max=e;
             }
         }
         return max;
     }



     public static void countSort(int[] arr,int place){
       //  int max = findMax(arr);
         int[] count = new int[10];
         for (int i =0;i<arr.length;i++){
             count[(arr[i]/place)%10]++;
         }

         for (int i=1;i<count.length;i++){
             count[i]+=count[i-1];
         }

         int [] output = new int[arr.length];
         for (int i =arr.length-1;i>=0;i--){
            int output_idx = count[(arr[i]/place)%10]-1;
            output[output_idx]= arr[i];
            count[(arr[i]/place)%10]--;
         }



         for (int i =0;i<arr.length;i++){
             arr[i]=output[i];
         }
     }



     public static void RadixSort(int [] arr){
         int max = findMax(arr);

         for (int palce = 1; (max/palce)>0 ; palce*=10){
             countSort(arr,palce);
         }

     }
    public static void main(String[] args) {

        int[] arr = {340,54,8,225,691,336};
       RadixSort(arr);
        printArr(arr);
    }
}
