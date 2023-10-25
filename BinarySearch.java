



             //********  Binary Search ---------->>>>>
             // Binary Search works when the array is sorted  ascending order ;





/*

public class BinarySearch {
    public static boolean binarySearch(int[] arr,int st,int end,int target){

        while (st<=end){
            int mid =st+(end-st)/2;
            if (target==arr[mid]){
                return true;
            } else if (target<arr[mid]){
                end=mid-1;
            } else {
                st=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println(binarySearch(arr,0,arr.length-1,4));
        System.out.println(binarySearch(arr,0,arr.length-1,1));
        System.out.println(binarySearch(arr,0,arr.length-1,2));
        System.out.println(binarySearch(arr,0,arr.length-1,3));
        System.out.println(binarySearch(arr,0,arr.length-1,4));
    }
}

 */







/*
       // itretive approavh -------->>

 public class BinarySearch {
public static boolean binarySearch(int[] arr,int st,int end,int target){
    while (st<=end){
        int mid = st+(end-st)/2;
        if (target==arr[mid]){
            return true;
        }else if (target<arr[mid]){
            end=mid-1;
        }else {
            st=mid+1;
        }
    }
    return false;
}
     public static void main(String[] args) {
       int [] arr={2,4,5,8,9};

//         System.out.println(binarySearch(arr,0,arr.length-1,2));
//         System.out.println(binarySearch(arr,0,arr.length-1,4));
//         System.out.println(binarySearch(arr,0,arr.length-1,5));
//         System.out.println(binarySearch(arr,0,arr.length-1,8));
//         System.out.println(binarySearch(arr,0,arr.length-1,9));



int target = 0;
while (target<=10){
    System.out.println(binarySearch(arr,0,arr.length-1,target));
    target++;
}
     }
 }


 */








  /*            // Recursive approach ----------->>>>>>>>


 public class BinarySearch{
     public static boolean recursiveBinarySearch(int[] arr,int st,int end,int target){
      if (st>end){
          return false;
      }
      int mid =st+(end-st)/2;  // if i write mid=(st+end)/2 then two sum's result can goes out of lenght int datatype  so mid = st+(end-st)/2;
      if (target==arr[mid]){
          return true;
      }else if (target<arr[mid]){
          return recursiveBinarySearch(arr,st,mid-1,target);
      }else {
          return recursiveBinarySearch(arr,mid+1,end,target);
      }
     }
     public static void main(String[] args) {
         int[]arr ={1,2,3,4,5,6};
         System.out.println(recursiveBinarySearch(arr,0,arr.length-1,1));
         System.out.println(recursiveBinarySearch(arr,0,arr.length-1,6));
         System.out.println(recursiveBinarySearch(arr,0,arr.length-1,4));
     }
}

   */








             // Problems on Binary search ------------>>>>>>>>>>

   /*
  // Print the first occurrence  ----------->

public class BinarySearch{
    public static int serch(int[] arr,int st,int end ,int target){
        int firstOccurrence= -1;

        while (st<=end){
            int mid =st+(end-st);
            if (target==arr[mid]){
                firstOccurrence=mid;
                end=mid-1;
            }else if (target<arr[mid]){
                end=mid-1;
            }else {
                st=mid+1;
            }
        }

        return firstOccurrence;
    }
    public static void main(String[] args) {
        int[]arr = {2,5,5,5,6,6,7,7,7,8,8};
        int target = 5;
        System.out.println("The first Occurrence of "+ target+"is :"+serch(arr,0,arr.length-1,target));
    }
}


    */







/*
             // last Occurrence =-------->>>>>

 public class BinarySearch{
     public static int lastOccurrence(int[] arr,int st,int end,int target){
         int lastOccurrence = -1;

         while (st<=end){
             int mid =st+(end-st);
             if (target==arr[mid]){
                 lastOccurrence=mid;
                 st=mid+1;
             }else if (target<arr[mid]){
                 end=mid-1;
             }else {
                 st=mid+1;
             }
         }

         return lastOccurrence;
     }
     public static void main(String[] args) {
         int[]arr = {2,5,5,5,6,6,7,7,7,8,8};
         int target = 5;
         System.out.println(lastOccurrence(arr,0,arr.length-1,target));

         System.out.println("The last occurrence of"+target+"is ;"+lastOccurrence(arr,0,arr.length-1,target));
     }
}

 */














           // Square root of any number ---------->>>


//  public class BinarySearch {
//      public static int squareRootOf(int x){
//          int st =0;
//          int end =x;
//          int ans =-1;
//
//          while (st<=end){
//              int mid = st+(end-st);
//              int val = mid*mid;
//              if (val==x){
//                  return mid;
//              }else if (val<x){
//                  ans=mid;
//                 st=mid+1;
//              }else {
//                  end=mid-1;
//              }
//          }
//
//          return ans;
//      }
//      public static void main(String[] args) {
//          System.out.println(squareRootOf(24));
//      }
//}




             //  Leetcode Problems  --------->>>>


             //  find Peak Element    solved in leetcode --------->

//      // class Solution {
////     public int findPeakElement(int[] arr) {
////         int n= arr.length;
////         int st =0, end=n-1;
////         while(st<=end){
////             int mid=st+(end-st)/2;
//
////      if((mid==n-1||arr[mid]>arr[mid+1])&&(mid==0||arr[mid]>arr[mid-1])){
////                 return mid;
//
////             }else if(arr[mid]<arr[mid+1]){
////                 st=mid+1;
////             }else{
////                 end=mid-1;
////             }
////         }
//
////         return -1;
////     }
//// }
//
//      // or --->
//
//
//      class Solution {
//          public static int findpeak(int[] ar,int st,int end){
//              int mid = st+(end-st)/2;
//              if( (mid==end || ar[mid]>ar[mid+1]) && (mid==st|| ar[mid]>ar[mid-1]) ){
//                  return mid;
//              }
//              else if(ar[mid]<ar[mid+1]){
//                  return  findpeak(ar,mid+1,end);
//              }else if(ar[mid]<ar[mid-1]){
//                  return findpeak(ar,st,mid-1);
//              }
//              return -1;     // if array don't have peak element
//          }
//          public int findPeakElement(int[] arr) {
//              int peak= findpeak(arr,0,arr.length-1);
//              return peak;
//          }
//      }



             // Find target Rotated array   solved in leetcode ---------->>


//             class Solution {
//                 public static int binarySearch(int[] arr,int st,int end,int target){
//                     if(st>end){
//                         return -1;
//                     }
//                     int mid = st+(end-st)/2;
//                     if(arr[mid]==target){
//                         return mid;
//                     }else if(arr[mid]>target){
//                         return binarySearch(arr,st,mid-1,target);
//                     }else{
//                         return binarySearch(arr,mid+1,end,target);
//                     }
//                 }
//                 public static int rotationPoint(int[]arr,int st,int end){
//                     if(st>end){
//                         return -1;
//                     }
//                     int mid = st+(end-st)/2;
//                     if(mid<end && arr[mid]>arr[mid+1]){
//                         return mid;
//                     }
//                     if(mid>st && arr[mid-1]>arr[mid]){
//                         return mid-1;
//                     }
//                     if(arr[st]<=arr[mid]){
//                         return rotationPoint(arr,mid+1,end);
//                     }else{
//                         return  rotationPoint(arr,st,mid-1);
//                     }
//                 }
//                 public int search(int[] nums, int target) {
//
//                     int rotationIdx= rotationPoint(nums,0,nums.length-1);
//                     if(rotationIdx==-1){
//                         return binarySearch(nums,0,nums.length-1,target);
//                     }
//                     if(nums[rotationIdx]==target){
//                         return rotationIdx;
//                     }
//                     if(nums[0]<=target){
//                         return binarySearch(nums,0,rotationIdx-1,target);
//                     }else{
//                         return binarySearch(nums,rotationIdx+1,nums.length-1,target);
//                     }
//                 }
//             }
//
