

//
//              // QU-1  Write a program to sort an array in descending order using bubble sort
//
//
//              import java.util.Arrays;
//
//              public class SortingAssignmentProblems{
//    public static void bubbleSort(int[] arr){
//         if (arr.length==0){
//             return;
//         }
//        for (int i=0;i<arr.length;i++){
//            boolean flag=false;
//            for (int j=0;j<arr.length-1-i;j++){
//                if (arr[j]<arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                    flag=true;
//                }
//            }
//            if (!flag){
//                break;
//            }
//        }
//    }
//       public static void main(String[] args) {
//
//           int[]arr={7,2,6,9,15,3};
//           bubbleSort(arr);
//           System.out.println(Arrays.toString(arr));
//
//       }
//}












//                      // Qu-2 Write a program to sort an array in descending order using selection sort
//
//
//import java.util.Arrays;
//
//public class SortingAssignmentProblems {
//    public static void selectionSort(int[] arr){
//         if (arr.length==0){
//             return;
//         }
//
//         for (int i=0;i<arr.length;i++){
//            int selectIdx=i;
//             for (int j=i+1;j<arr.length;j++){
//                  if (arr[selectIdx]<arr[j]){
//                      selectIdx=j;
//                  }
//             }
//             if (selectIdx!=i){
//                 int temp =arr[selectIdx];
//                 arr[selectIdx]=arr[i];
//                 arr[i]=temp;
//             }
//         }
//    }
//    public static void main(String[] args) {
//
//        int[] arr={3,5,1,6,0};
//selectionSort(arr);
//        System.out.println(Arrays.toString(arr));
//
//    }
//}




















//                        // Qu-3  Write a program to sort an array in descending order using insertion sort
//
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//public class SortingAssignmentProblems {
//    public static void insertionSort(int[] arr){
//        if (arr.length==0){
//            return;          // base case
//        }
//
//        for (int i=0;i<arr.length;i++){
//
//
//            int j=i;
//            while (j>0){
//                if (arr[j]>arr[j-1]){
//                    int temp =arr[j];
//                    arr[j]=arr[j-1];
//                    arr[j-1]=temp;
//                }
//                j--;
//            }
//        }
//    }
//    public static void main(String[] args) {
//
//        int[] arr={3,5,1,6,0};
//        insertionSort(arr);
//        System.out.println(Arrays.toString(arr));
//
//    }
//}
















                       // Qu- 4

  // ans = 0(n^2)


             // Qu- 5

  // ans = 0(n^2)
