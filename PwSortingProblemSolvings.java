



              // swap to element to sort the arr -
                 // ex- {2,4,9,6,8,12,2,33} in case this two element is 6,2 ;



//public class PwSortingProblemSolvings {
//
//    public static void sorting(int[] arr){
//        int x = -1;
//        int y = -1;
//
//
//        if (arr.length==1){    // corner case
//            return;
//        }
//
//        for (int i =1;i<arr.length;i++){
//            if (arr[i-1]>arr[i]){
//                if (x==-1){
//                    x=i-1;
//                    y=i;
//                }else {
//                    y=i;
//                }
//            }
//        }
//
//        int termp = arr[x];
//        arr[x]=arr[y];
//        arr[y]=termp;
//    }
//    public static void main(String[] args) {
//        int[] arr ={2};
//        sorting(arr);
//        for (int e: arr){
//            System.out.print(e+" ");
//        }
//    }
//}















              // sort positive Negative  --------->>>>>>>>


// public class PwSortingProblemSolvings{
//
//    public static void sortPssitiveNegative(int[] arr ,int l ,int r){
//
//    while (l<r){
//        while (arr[l]<0){
//            l++;
//        }
//        while (arr[r]>=0){
//            r--;
//        };
//
//        if (l<r){
//            int temp = arr[l];
//            arr[l]=arr[r];
//            arr[r]=temp;
//            l++;
//            r--;
//        }
//    }
//    }
//     public static void main(String[] args) {
//
//        int[]arr = {5,-2,6,9,5,-7,-2,-6,-4,8,-7};
//        sortPssitiveNegative(arr,0,arr.length-1);
//        for (int e:arr){
//            System.out.print(e+" ");
//        }
//     }
//}














              //  ***** sort 0s,1s and 2s  using one pass and linear time--------->>>>>>>



//           // using count sort ------->>>>>>>
//
//
//public class PwSortingProblemSolvings{
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
//    public static void usinCount(int[]arr){
//
//        int [] count = new int[3];
//
//        for (int i =0;i<arr.length;i++){
//            count[arr[i]]++;
//        }
//
//        for (int i = 1; i<count.length;i++){
//            count[i]+=count[i-1];
//        }
//
//
//        int[] output = new int[arr.length];
//        for (int i=arr.length-1;i>=0;i--){
//            int idx = count[arr[i]]-1;
//            output[idx] =arr[i];
//            count[arr[i]]--;
//        }
//
//        for (int i =0;i<arr.length;i++){
//            arr[i]=output[i];
//        }
//    }
//    public static void main(String[] args) {
//
//
//        int[] arr ={2,0,1,2,2,0,0,1,1,2,1};
//        usinCount(arr);
//        for (int e:arr){
//            System.out.print(e+" ");
//        }
//    }
//}


              // Sort this question using one pass ----->>>




public class PwSortingProblemSolvings {



    public static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y]=temp;
    }
    public static void usingOnePass(int[] arr,int low, int mid, int hi){
        while (mid<=hi){
            if (arr[mid]==2){
                swap(arr,mid,hi);
                hi--;
            }
            if (arr[mid]==1){
               mid++;
            }
            if (arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr ={1,0,1,0,2,1,0,2,0,1,2,0,1};
        usingOnePass(arr,0,0,arr.length-1);
        for (int e: arr){
            System.out.print(e+" ");
        }
    }
}
