//
//            // Qu-1 Given an array find the number x in the array.If the element is present return the index
//            // of element else print "Element no found in array "Input the size of array array from user and element from user.
//            // use Linear search to find the element.
//
//
//
//
//
//
//   import java.util.Scanner;
//   public class LinearSearchAndBinarySearch {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of elements you want to add");
//        int n = sc.nextInt();
//        int[] arr=new int[n];
//        System.out.println("Enter the elements of the array ");
//        for (int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println("Enter the element to be search in array");
//        int x = sc.nextInt();
//
//        int idx=-1;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==x){
//                idx=i;
//            }
//        }
//
//        if (idx!=-1){
//            System.out.println("Found the element in :"+idx);
//        }else {
//            System.out.println("Element not found ");
//        }
//
//
//
//
//    }
//}














               // Qu-2  Given an array and an "traget" return the last occurrence of target in the array .if target
               //  not present in array return -1;
//
//
//
//
//
//
//public class LinearSearchAndBinarySearch {
//
//    public static int lastOccurrence(int[] arr,int target) {
//       int low=0, high=arr.length-1;
//       int result=-1;
//       while (low<=high){
//           int mid=low+(high-low)/2;
//           if (arr[mid]==target){
//               result=mid;
//               low=mid+1;
//           }else if (arr[mid]<target){
//               low=mid+1;
//           }else {
//               high=mid-1;
//           }
//       }
//       return  result;
//    }
//
//    public static void main(String[] args) {
//
//
//        int [] arr= {1,1,1,2,3,4,4,5,6,6,6,6};
//        int target = 4;
//        System.out.println(lastOccurrence(arr,target));
//
//
//
//
//    }
//}













//              // Qu-3 given an sorted binary array efficiently count  the total number of 1 in it;
//
//
//
//
//
//public class LinearSearchAndBinarySearch {
//    public static void main(String[] args) {
//
//        int[] arr={0,0,0,0,1,1,1,1,1,1};
//        int count=0;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==1){
//                count++;
//            }
//        }
//        System.out.println("the total number of 1 in it is :"+count);
//
//    }
//}










        // Qu-4 Given a sorted integer array containing duplicates count occurrence of a given number
        // if the element is not found in the array,report that as well

//
//
//
//public class LinearSearchAndBinarySearch {
//    public static void main(String[] args) {
//
//        int[]arr={2,5,5,5,6,6,8,9,9,9};
//        int target=5;
//        int count=0;
//        int idx=-1;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==target){
//                count++;
//                idx=i;
//            }
//        }
//        if (idx!=-1){
//            System.out.println("Target present "+count+" times");
//        }else {
//            System.out.println("Not present in the array");
//        }
//
//    }
//}












             // Qu-5 Given a positive integer return true if the number is perfect square or false otherwise
             //  A perfect  square is an integer that is the square of an integer. in other word it is product of some integer
              // like input =i6=4*4 it is a perfect square but input =14 = 3.742*3.742 it is not a perfect square




public class LinearSearchAndBinarySearch {
    public static void main(String[] args) {

        int n = 16;
        int low =0,high=n;
        int i=-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            long val=mid*mid;
            if (val==n){

                i=mid;
                break;
            }else if (val>n){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }

        if (i!=-1){
            System.out.println("True perfect square");
        }else {
            System.out.println("false ");
        }


    }
}