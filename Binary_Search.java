


                   // Binary Search




                   // Time Complexity of this Code :O(log n)
                   // Space Complexity of this Code :O(1)

//public class Binary_Search {
//
//    public static int binarySearch(int[] arr,int target) {
//        int lowidx=0,highidx=arr.length-1;
//
//
//        while (lowidx<=highidx){
//            int mid=lowidx+(highidx-lowidx)/2;
//            if (arr[mid]==target){
//                System.out.print("yes present the index is this element :");
//                return mid;
//            }else if (arr[mid]>target){
//                highidx=mid-1;
//            }else {
//                lowidx=mid+1;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//
//        int[] arr={2,3,4,5,7,9};
//        System.out.println(binarySearch(arr,5));
//
//    }
//}








                                   // First Occurrence Or Lower Bounded

//
//
//
//                   // Time Complexity of this Code :O(log n)
//                   // Space Complexity of this Code :O(1)
//
//  public class Binary_Search{
//
//    public static int firstIdx(int[] arr,int ele){
//        int low=0,high=arr.length-1;
//        int result=-1;
//        while (low<=high){
//            int mid=low+(high-low)/2;
//            if (arr[mid]==ele){
//                result=mid;
//                high=mid-1;
//            }else if (arr[mid]<ele){
//                low=mid+1;
//            }else {
//                high=mid-1;
//            }
//        }
//        return result;
//    }
//      public static void main(String[] args) {
//
//          int[]arr={2,3,4,4,5,6,4,7,9};
//          System.out.println(firstIdx(arr,4));
//      }
//}












                                        // Square Root of a number



                   // Time Complexity of this Code :O(log n)
                   // Space Complexity of this Code :O(1)

  public class Binary_Search{
    public static int squareRoot(int n){
        int low=0,high=n/2;   // because any number's square root = number/2 * number/2
        if (n==1){
            return 1;
        }
        int result=-1;
        while (low<=high){
            int mid=low+(high-low)/2; // to avoid overflow because some test case low+high cross int boundary
            long ans=mid*mid;   // because anyhow if mid*mid cross int boundary we not get exception
            if (ans==n){
                return mid;
            }else if (ans<n){
                result=mid;
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return result;
    }
      public static void main(String[] args) {

          int ex1 = squareRoot(9);
          System.out.println(ex1);

          int ex2 = squareRoot(12);
          System.out.println(ex2);

          int ex3 = squareRoot(1);
          System.out.println(ex3);

      }
}