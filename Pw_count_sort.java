

                //   *****  Count sort ------>>




//             // basic Count sort algorithm -------------->>>>>>>>>
//
//
//public class Pw_count_sort {
//
//
//
//    public static void print_arr(int [] arr){
//        for (int E: arr){
//            System.out.print(E +" ");
//        }
//    }
//
//
//
//    public static int findMax(int[] arr){
//        int max = Integer.MIN_VALUE;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]>max){
//                max=arr[i];
//            }
//        }
//        return max;
//    }
//
//
//
//
//    public static void countSort(int[] arr){
//        int max = findMax(arr);
//        int [] count = new int[max+1];
//        for (int i=0;i<arr.length;i++){
//         count[arr[i]]++;
//        }
//
//        int k =0;
//        for (int i =0;i<count.length;i++){
//            for (int j=0;j<count[i];j++){
//                arr[k++]=i;
//            }
//        }
//    }
//    public static void main(String[] args) {
//
//        int[] arr = {2,4,8,2,5,7,9,4,5,6,3};
//        countSort(arr);
//        print_arr(arr);
//    }
//}








//                // Count sort  Algorithm maintain Stability  =------------>>>>>
//
//
//public class Pw_count_sort {
//
//
//
//    public static void printArr(int[] arr){
//        for (int e: arr){
//            System.out.print(e+" ");
//        }
//    }
//
//
//    public static int findMax(int[] arr ){
//        int max= Integer.MIN_VALUE;
//        for (int e: arr){
//            if (e>max){
//                max=e;
//            }
//        }
//        return max;
//    }
//
//
//
//    public static void countSort(int[] arr){
//        int max = findMax( arr);
//        int [] count = new int[1+max];
//
//        int[] output = new int[arr.length];
//
//        for (int i =0; i<arr.length;i++){
//            count[arr[i]]++;
//        }
//
//       for (int i=1;i<count.length;i++){
//           count[i]+=count[i-1];
//       }
//       for (int i=arr.length-1;i>=0;i--){
//           int idx = count[arr[i]]-1;
//           output[idx]=arr[i];
//           count[arr[i]]--;
//       }
//
//       for (int i=0;i<arr.length;i++){
//           arr[i]=output[i];
//       }
//    }
//         public static void main(String[] args) {
//
//             int[] arr = {2,4,8,2,5,7,9,4,5,6,3};
//        countSort(arr);
//        printArr(arr);
//         }
//}

































