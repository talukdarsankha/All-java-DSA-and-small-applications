

      //  Divide And Conquer *****----->>
//         1st step.  divide
//         2nd step. conquer
//         3rd step. base case and return or small problem
//         4th step  combine ans

                //   Merger Sort , Quick Sort








                          //  Merge sort -------->>>
              // It is a Stable sort
              //  it is Outplace sort not Inplace
              //   Time Complexity : O(nlogn) and Space Complexity :O(n);
//
//
//                          import java.util.Arrays;
//
//    public class JavaCousrseMergeAndQuickSort {
//
//    public static void sort(int[] arr,int left,int mid,int right){
//        int n1=mid-left+1;
//        int n2 = right-mid;
//        int[] leftArray = new int[n1];
//        int[] rigthArray = new int[n2];
//        for (int i=0;i<n1;i++){
//            leftArray[i]= arr[left+i];
//        }
//        for (int j =0;j<n2;j++){
//            rigthArray[j]=arr[mid+1+j];
//        }
//        int x =0;
//        int y=0;
//        int k = left;
//        while (x<n1 && y<n2){
//            if (leftArray[x]<=rigthArray[y]){
//                arr[k]=leftArray[x];
//                k++;
//                x++;
//            }else {
//                arr[k]=rigthArray[y];
//                k++;
//                y++;
//            }
//        }
//        while (x<n1){
//            arr[k++]=leftArray[x++];
//        }
//        while (y<n2){
//            arr[k++]=rigthArray[y++];
//        }
//
//    }
//    public static void mergerSort(int[] arr, int low,int high){
//      if (low>=high){
//          return;
//      }
//           int mid = low + (high - low) / 2;
//           mergerSort(arr, low, mid);
//           mergerSort(arr, mid + 1, high);
//           sort(arr, low, mid, high);
//
//   }
//                  //  Or
////    public static void mergerSorttt(int[] arr, int low,int high){
////          if (low<high){
////              int mid = low + (high - low) / 2;
////              mergerSort(arr, low, mid);
////              mergerSort(arr, mid + 1, high);
////              sort(arr, low, mid, high);
////          }
////   }
//
//    public static void main(String[] args) {
//        int[] arr = {7,2,6,4,3,2,9};
//        System.out.println(Arrays.toString(arr));
//        mergerSort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
////        mergerSorttt(arr,0,arr.length-1);
////        System.out.println(Arrays.toString(arr));
//
//    }
//}






                           //  Quick Sort   ----->>>
      // It is (Unstable)Not a Stable sort
      //  it is Inplace
      //  Time Complexity : bext Case--> O(nlogn), Worst Case->O(n^2) and Space Complexity :O(1);


//      import java.util.*;
//      public class JavaCousrseMergeAndQuickSort {
//          public static void swap(int[] arr ,int i,int j) {
//              int temp = arr[i];
//              arr[i] = arr[j];
//              arr[j] = temp;
//          }
//
//         public static int partition(int[]arr, int i, int j){
//              int pivot=arr[i];
//              int count=0;
//              for (int a=i+1;a<arr.length;a++){
//                  if (arr[a]<=pivot){
//                      count++;
//                  }
//              }
//              int pivotIdx=i+count;
//              swap(arr,i,pivotIdx);
//              while (i<pivotIdx &&j>pivotIdx){
//                  while (arr[i]<=pivot){
//                      i++;
//                  }
//                  while (arr[j]>pivot){
//                      j--;
//                  }
//                  if (i<pivotIdx&&j>pivotIdx){
//                      swap(arr,i,j);
//                  }
//
//              }
//             return pivotIdx;
//
//          }
//          public static void quickSort(int[] arr ,int st,int end){
//              if (st>=end){
//                  return;
//              }
//              int pivot=partition(arr,st,end);
//              quickSort(arr,st,pivot-1);
//              quickSort(arr,pivot+1,end);
//          }
//          public static void main(String[] args) {
//              int[] arr = {7,2,6,4,3,2,9};
//              System.out.println(Arrays.toString(arr));
//              quickSort(arr,0,arr.length-1);
//              System.out.println(Arrays.toString(arr));
//          }
//}
//

                        // or ---->>


//      import java.util.Arrays;
//
//      public class JavaCousrseMergeAndQuickSort {
//          public static void swap(int[] arr ,int i,int j) {
//              int temp = arr[i];
//              arr[i] = arr[j];
//              arr[j] = temp;
//          }
//
//          public static int partition(int[] ar,int low,int high){
//             int pivot=ar[low];
//             int k=low;
//             for (int i=low+1;i<=high;i++){
//                 if (ar[i]<=pivot){
//                     k++;
//                     swap(ar,k,i);
//                 }
//             }
//             swap(ar,k,low);
//             return k;
//          }
//     public static void quickSort(int[]arr,int st,int end){
//         if (st<end){
//             int pivotIdx = partition(arr,st,end);
//             quickSort(arr,st,pivotIdx-1);
//             quickSort(arr,pivotIdx+1,end);
//         }
//     }
//          public static void main(String[] args) {
//              int[] arr = {7,2,6,4,3,2,9};
//              System.out.println(Arrays.toString(arr));
//              quickSort(arr,0,arr.length-1);
//              System.out.println(Arrays.toString(arr));
//          }
//}




                                // Count of Number of inversions
                 //  inversion means  arr[i]>arr[[i+1]  ex  [5,3,2,4,1]  inversions = (5,3),(5,2),(5,4),(5,1),(3,2),(3,1),(2,1),(4,1)

//            // Brute Approach ---->
//               // Time Complexity: O(n^2)
//
//     import java.util.*;
//public class JavaCousrseMergeAndQuickSort {       //  But it is not Optimal  because it's time complexity : O(n^2)
//    public static void main(String[] args) {
//        int[] arr = {5,3,4,6,1};
//        int count=0;
//        for (int i=0;i<arr.length-2;i++){
//            for (int j=i+1;j<arr.length;j++){
//                if (arr[i]>arr[j]){
//                    count++;
//                }
//            }
//        }
//        System.out.println("The total Number of inversion : "+count);
//    }
//}

                  //   Optimize Approach ---------->>>
      // Time Complexity : O(nlogn)

//      import java.util.*;
//      public class JavaCousrseMergeAndQuickSort {
//          public static int inversion(int[] arr,int low,int mid,int high){
//              int n1 = mid-low+1;
//              int n2 = high-mid;
//              int[] leftArr=new int[n1];
//              int[] rightArr=new int[n2];
//              for (int i=0;i<leftArr.length;i++){
//                  leftArr[i]=arr[low+i];
//              }
//              for (int i=0;i<rightArr.length;i++){
//                  rightArr[i]=arr[mid+1+i];
//              }
//              int i =0;
//              int j=0;
//              int k =low;
//              int swapCount=0;
//              while (i<n1&&j<n2){
//                  if (leftArr[i]<=rightArr[j]){
//                     arr[k++]=leftArr[i++];
//                  }else {
//                      arr[k++]=rightArr[j++];
//                      swapCount+=(mid+1)-(low+i);
//                  }
//              }
//              while (i<n1){
//                  arr[k++]=leftArr[i++];
//              }
//              while (j<n2){
//                  arr[k++]=rightArr[j++];
//              }
//              return swapCount;
//          }
//    public static int countInversion(int[] arr,int st,int end){
//              int ans=0;
//              if (st<end){
//                  int mid=st+(end-st)/2;
//                 ans+= countInversion(arr,st,mid);
//                ans+= countInversion(arr,mid+1,end);
//                 ans+= inversion(arr,st,mid,end);
//              }
//         return ans;
//    }
//          public static void main(String[] args) {
//              int[] arr = {5,3,4,6,1};
//              System.out.println(countInversion(arr,0,arr.length-1));
//          }
//}



             // Selection procedure ----->
         //  or  Kth smallest Element --------->>
       // Time Complexity : Best Case -->O(n)  Worst Case --> O(n^2)


//      public class JavaCousrseMergeAndQuickSort {
//          public static void swap(int[] arr ,int i,int j) {
//              int temp = arr[i];
//              arr[i] = arr[j];
//              arr[j] = temp;
//          }
//    public static int partition(int[] arr,int low,int high){
//        int pivot=arr[low];
//        int j=low;
//        for (int i=low+1;i<=high;i++){
//            if (arr[i]<=pivot){
//                j++;
//                swap(arr,j,i);
//            }
//        }swap(arr,j,low);
//        return j;
//    }
//    public static int kthElement(int[] arr,int low,int high,int kth){
//       int pivotIdx=partition(arr,low,high);
//       if (pivotIdx==kth-1){
//           return arr[pivotIdx];
//       }else if (pivotIdx>kth-1){
//           return kthElement(arr,low,pivotIdx-1,kth);
//       }else {
//           return kthElement(arr,pivotIdx+1,high,kth);
//       }
//    }
//          public static void main(String[] args) {
//              int[]arr={50,30,70,90,10,34,89,98,13};
//              System.out.println(kthElement(arr,0,arr.length-1,4));
//          }
//}


            // kth largest element --->
  //  Now we store the all big element left side of pivot and all small element store right side of pivot

//     public class JavaCousrseMergeAndQuickSort{
//         public static void swap(int[] arr ,int i,int j) {
//              int temp = arr[i];
//              arr[i] = arr[j];
//              arr[j] = temp;
//          }
//         public static int partition(int[] arr,int low,int high){
//             int pivot = arr[low];
//             int i = low;
//             for (int j=low+1;j<=high;j++){
//                 if (pivot<=arr[j]){
//                     i++;
//                     swap(arr,i,j);
//                 }
//             }
//             swap(arr,i,low);
//             return i;
//         }
//        public static int kthLargest(int[] arr,int st,int end,int kth){
//
//             int pivotIdx = partition(arr,st,end);
//             if (pivotIdx==kth-1){
//                 return arr[pivotIdx];
//             }else if (pivotIdx<kth-1){
//                 return kthLargest(arr,pivotIdx+1,end,kth);
//             }else {
//                 return kthLargest(arr,st,pivotIdx-1,kth);
//             }
//        }
//         public static void main(String[] args) {
//             int[]arr={50,30,70,90,10,34,89,98,13};
//             System.out.println(kthLargest(arr,0,arr.length-1,4));
//         }
//}



                   //  Find Max And Min ------->>>
              // Time Complexity : O(n)

//      public class JavaCousrseMergeAndQuickSort {
//      static class pair{
//          int min;
//          int max;
//      }
//      public static pair finMinMAx(int[] arr,int low,int high){
//          pair ansMinmax= new pair();
//          pair ansMinMaxLeft = new pair();
//          pair ansMinMaxRight = new pair();
//          if (low==high){  // if array have single element
//              ansMinmax.min=arr[low];
//              ansMinmax.max=arr[low];  //  or ansMinmax.max=arr[high]
//             return ansMinmax;
//          }
//          if (low==high-1) {   // if array only have two element
//             if (arr[low]<arr[high]){
//                 ansMinmax.min=arr[low];
//                 ansMinmax.max=arr[high];
//                 return ansMinmax;
//             }else {
//                 ansMinmax.min=arr[high];
//                 ansMinmax.max=arr[low];
//                 return ansMinmax;
//             }
//          }
//           int mid = low+(high-low)/2;
//          ansMinMaxLeft =  finMinMAx(arr,low,mid);
//         ansMinMaxRight = finMinMAx(arr,mid+1,high);
//         if (ansMinMaxLeft.min<ansMinMaxRight.min){
//             ansMinmax.min=ansMinMaxLeft.min;
//         }else {
//             ansMinmax.min=ansMinMaxRight.min;
//         }
//
//         if (ansMinMaxLeft.max>ansMinMaxRight.max){
//             ansMinmax.max=ansMinMaxLeft.max;
//         }else {
//             ansMinmax.max=ansMinMaxRight.max;
//         }
//           return ansMinmax;
//
//          }
//          public static void main(String[] args) {
//              int[] arr = {50,30,70,90,10,34,89,98,13};
//              pair obj = finMinMAx(arr,0,arr.length-1);
//              System.out.println(obj.min);
//              System.out.println(obj.max);
//          }
//}
//


            //  find Peak Element    solved in leetcode --------->>>>

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


//      class Solution {
//          public static int binarySearch(int[] arr,int st,int end,int target){
//              if(st>end){
//                  return -1;
//              }
//              int mid = st+(end-st)/2;
//              if(arr[mid]==target){
//                  return mid;
//              }else if(arr[mid]>target){
//                  return binarySearch(arr,st,mid-1,target);
//              }else{
//                  return binarySearch(arr,mid+1,end,target);
//              }
//          }
//          public static int rotationPoint(int[]arr,int st,int end){
//              if(st>end){
//                  return -1;
//              }
//              int mid = st+(end-st)/2;
//              if(mid<end && arr[mid]>arr[mid+1]){
//                  return mid;
//              }
//              if(mid>st && arr[mid-1]>arr[mid]){
//                  return mid-1;
//              }
//              if(arr[st]<=arr[mid]){
//                  return rotationPoint(arr,mid+1,end);
//              }else{
//                  return  rotationPoint(arr,st,mid-1);
//              }
//          }
//          public int search(int[] nums, int target) {
//
//              int rotationIdx= rotationPoint(nums,0,nums.length-1);
//              if(rotationIdx==-1){
//                  return binarySearch(nums,0,nums.length-1,target);
//              }
//              if(nums[rotationIdx]==target){
//                  return rotationIdx;
//              }
//              if(nums[0]<=target){
//                  return binarySearch(nums,0,rotationIdx-1,target);
//              }else{
//                  return binarySearch(nums,rotationIdx+1,nums.length-1,target);
//              }
//          }
//      }
//




                // Find median from two sorted array  ------------->>>
      // Time Complexity : O(logn)
      // Space Complexity :  O(1)

//      public class JavaCousrseMergeAndQuickSort {
//    public static int median(int[] a1,int[] a2,int m,int n){
//        if(m>n){
//           return median(a2,a1,n,m);  // now a1 =a2, a2= a1 , m = n ,n = m
//        }
//        int medianPossition = (m+n+1)/2;
//        int low=0;           // here low and high is a kind of position not index
//        int high = m;
//        while (low<=high){
//            int cut1 = low+(high-low)/2;
//            int cut2 = medianPossition-cut1;
//            int l1 = (cut1==0)?Integer.MIN_VALUE:a1[cut1-1];
//            int l2 = (cut2==0)?Integer.MIN_VALUE:a2[cut2-1];
//            int r1 = (cut1==m)?Integer.MAX_VALUE:a1[cut1];
//            int r2 = (cut2==n)?Integer.MAX_VALUE:a2[cut2];
//
//            if (l1<=r2 && l2<=r1){
//                if ((m+n)%2!=0){
//                    return Math.max(l1,l2);
//                }else {
//                    return (Math.max(l1,l2)+Math.min(r1,r2))/2;
//                }
//            }else if (l1>r2){
//                high=cut1-1;
//            }else if(l2>r1) {
//                low=cut1+1;
//            }
//        }
//       return -1;
//    }
//          public static void main(String[] args) {
//              int[] arr1 = {1,4,7,10,12};
//              int m = arr1.length;
//              int[] arr2 = {2,3,6,15};
//              int n = arr2.length;
//              System.out.println(median(arr1,arr2,m,n));
//          }
//}



                    //   Max sub Array Sum  ---------->>
         // Time Complexity : O(n logn)
      // Space Complexity : O(1);

//      public class JavaCousrseMergeAndQuickSort {
//    public static int maxArrSum(int[] arr,int st,int mid,int end){
//        int leftMax=Integer.MIN_VALUE;
//        int currNum=0;
//       for (int i=mid;i>=st;i--){    // O(n/2)
//           currNum+=arr[i];
//           if (currNum>leftMax){
//               leftMax=currNum;
//           }
//       }
//       currNum=0;
//       int rightMAx=Integer.MIN_VALUE;
//       for (int i=mid+1;i<=end;i++){   // O(n/2)      // so total O(n/2)+O(n/2) = O(n)
//           currNum+=arr[i];
//           if (currNum>rightMAx){
//               rightMAx=currNum;
//           }
//       }
//       return Math.max(Math.max(leftMax,rightMAx),leftMax+rightMAx);
//    }
//     public static int maxSum(int[]arr,int st,int end){
//         if (st>end){
//             return Integer.MIN_VALUE;
//         }
//         if (st==end){
//             return arr[st];
//         }
//         int mid = st+(end-st)/2;
//          // time :  t(n) = 2t(n/2)+ n = nlogn
//         return Math.max( Math.max(maxSum(arr,st,mid-1),maxSum(arr,mid+1,end)) , maxArrSum(arr,st,mid,end) );
//     }
//          public static void main(String[] args) {
//              int[] arr ={5,-1};//{-2,-3,4,-1,2,1,-5,4};
//              System.out.println(maxSum(arr,0,arr.length-1));
//          }
//}







                //     ASSIGNMENT ------->>>


    //  problem-1. Given an array where all the elements are sorted in increasing order except two swapped
    //  element , sort it in linear time,Assume there are no duplicate in the array.

//      import java.util.Arrays;
//
//      public class JavaCousrseMergeAndQuickSort{
//        public static void main(String[] args) {
//            int[] arr = {3,8,6,7,5,9,10};    // output will be {3,5,6,7,8,9,10};
//            System.out.println(Arrays.toString(arr));
//            int a=-1;
//            int b=-1;
//            for(int i=0;i<arr.length-1;i++){
//                if (arr[i]>arr[i+1]){
//                     a = i;          // now 8 we found
//                     break;
//                }
//            }
//
//            for(int i=0;i<arr.length-1;i++){
//                if (arr[i]>arr[i+1]){
//                     b = i+1;     // now we found 5;
//                }
//            }
//            int temp = arr[a];
//            arr[a]=arr[b];
//            arr[b]=temp;
//
//            System.out.println(Arrays.toString(arr));
//        }
//}



      // Problem-2. Given an array of positive and negative integers.Segregate them in linear time and
      // constant space output should print all negative numbers followed by all positive numbers


//      import java.util.Arrays;
//
//      public class JavaCousrseMergeAndQuickSort {
//          public static void main(String[] args) {
//              int[] arr = {19, -20, 7, -4, -13, 11, -5, 3};
//              int k = 0; // we store array first index and iterate whole array
//              for (int i=0;i<arr.length;i++) {
//                  if (arr[i]<0){
//                      int temp = arr[k];
//                      arr[k]=arr[i];
//                      arr[i]=temp;
//                      k++;
//              }
//
//          }
//              System.out.println(Arrays.toString(arr));
//      }
//}


      // Problem-3. Given an array of positive and negative integers.Segregate them in linear time and
      // constant space output should print all negative numbers followed by all positive numbers
      //  But The Relative order of elements must remain the same ------>>


//      import java.util.Arrays;
//      public class JavaCousrseMergeAndQuickSort{
//          public static void arrangeNegativePositive(int[]arr,int low,int mid,int high){
//              int n1=mid-low+1;
//              int n2 = high-mid;
//              int[] leftArr=new int[n1];   // space n/2
//              int[] rightArr=new int[n2]; // space n/2      so total space complexity: O(n)
//              // Enter the leftArr element from arr
//              for (int i=0;i<n1;i++){      // time O(n/2)
//                  leftArr[i]=arr[low+i];
//              }
//              // Enter the rightArr element from arr
//              for (int i=0;i<n2;i++){  //time O(n/2)
//                  rightArr[i]=arr[mid+1+i];
//              }
//              int k = low;  // create iterator for  arr
//
//
//
//              for (int i=0;i<n1;i++){     //time O(n/2)
//                  if (leftArr[i]<0){
//                      arr[k++]=leftArr[i];
//                  }
//              }
//              for (int i=0;i<n2;i++){   //time O(n/2)
//                  if (rightArr[i]<0){
//                      arr[k++]=rightArr[i];
//                  }
//              }
//              for (int i=0;i<n1;i++){  //time O(n/2)
//                  if (leftArr[i]>0){
//                      arr[k++]=leftArr[i];
//                  }
//              }
//              for (int i=0;i<n2;i++){  //time O(n/2)
//                  if (rightArr[i]>0){
//                      arr[k++]=rightArr[i];
//                  }
//              }
//              // total time complexity: n/2 + n/2 + n/2 + n/2 + n/2 + n/2  = 3n = n
//
//          }
//    public static void merge(int[]arr,int st,int end){
//        if (st >= end) {
//            return;
//        }
//        int mid= st+(end-st)/2;
//        merge(arr,st,mid);   // O(n/2)
//        merge(arr,mid+1,end); // O(n/2)
//        arrangeNegativePositive(arr,st,mid,end);  //  O(n)      so total= 2t(n/2)+n = O(nlogn)
//    }
//       public static void main(String[] args) {
//           int[] arr = {19, -20, 7, -4, -13, 11, -5, 3};
//           System.out.println(Arrays.toString(arr));
//           merge(arr,0,arr.length-1);
//           System.out.println(Arrays.toString(arr));
//
//       }
//}



           // Problem-4.  Given two arrays of equal size n and an integer k,The task is to permute both arrays such that the
       // sum of their corresponding element(in other word each element) is greater than or equal to k ex a[i]+b[i] >=k  return true
      // if any of their corresponding element not greater than or equal to k ex a[i]+b[i] < k  return false



//      import java.util.*;
//      public class JavaCousrseMergeAndQuickSort {
//          public static boolean isPossible(int[] a,int[]b,int length,int k){
//              // sort first array decreasing order
//              Arrays.sort(a,Collections.reverseOrder());
//              // sort second array increasing order
//             Arrays.sort(b);
//
//              // Now check a[i]+b[i] < k if mach that then false
//              for (int i = 0; i < length; i++) {
//                  if (a[i] +b[i]<k) {
//                      return false;
//                  }
//              }
//             return true;
//          }
//          public static void main(String[] args) {
//              int[] a = {2, 1, 3};
//              int[] b = {7, 8, 9};
//              int n = a.length;
//              int k = 10;
//              System.out.println(isPossible(a,b,n,k));
//          }
//      }



//      // Problem-5  Merge Intervals  -------->> solved in leetcode
//
//      import java.util.*;
//      class Solution {
//          public int[][] merge(int[][] intervals) {
//              List<int[]> result = new ArrayList<>();
//              if(intervals.length==0){
//                  return new int[0][];
//              }
//              Arrays.sort(intervals,(a,b)->a[0]-b[0]);
//
//              int start=intervals[0][0];
//              int end = intervals[0][1];
//
//              for(int[] e: intervals){
//                  if(e[0]<=end){
//                      end=Math.max(end,e[1]);
//                      start=Math.min(start,e[0]);
//                  }else{
//                      result.add(new int[]{start,end});
//                      start=e[0];
//                      end=e[1];
//                  }
//              }
//              result.add(new int[]{start,end});
//              return result.toArray(new int[0][]);
//
//          }
//
//          public static void main(String[] args) {
//
//          }
//      }

