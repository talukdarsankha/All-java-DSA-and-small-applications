

                        // Insertion Sort
                // Insertion Sort is an Inplace Sort
                // Insertion sort is a Stable sort










//                      //   Time Complexity of this Code :O(n^2)
//                      //   Space Complexity of this Code :O(1)
//
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//public class Insertion_Sort {
//    public static void main(String[] args) {
//
//        int[] arr={40,5,115,8785,152,5,12};
//        for (int i=0;i<arr.length;i++){
//             int j=i;
//             while (j>0&&arr[j]<arr[j-1]){
//                 int temp=arr[j];
//                 arr[j]=arr[j-1];
//                 arr[j-1]=temp;
//                 j--;
//             }
//        }
//
//        System.out.println(Arrays.toString(arr));    // it is for print array element
//
//    }
//}


                         // Or



                 // Time Complexity of this Code :O(n^2)
                 // Space Complexity of this Code :O(1)

        import java.util.Arrays;
                        public class Insertion_Sort{
           public static void main(String[] args) {

               int[] arr={40,5,115,8785,152,5,12};
               for (int i=0;i<arr.length;i++){
                   for (int j=i;j>=1;j--){
                       if (arr[j]<arr[j-1]){
                           int temp=arr[j];
                           arr[j]=arr[j-1];
                           arr[j-1]=temp;
                       }
                   }
               }

               System.out.println(Arrays.toString(arr));   // it is for print array element
           }
}
