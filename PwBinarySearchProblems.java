


/*
         //problem -- Find Starting Rotate Point ---------------->>>>>.
           // ex -  1 2 3 4 5 it's rotate one time arr is = 2 3 4 5 1;
            //                it's rotate two time arr is =  3 4 5 1 2;
            //                it's rotate three time arr is = 4 5 1 2 3;


public class PwBinarySearchProblems {
    public static int findRotatePoint(int[] arr){
        int st=0, end =arr.length-1;
        int ansIdx = -1 ;
        int n = arr.length;

        while (st<=end){
            int mid = st+(end-st)/2;
            if (arr[mid]<=arr[n-1]){
                ansIdx=mid;
                end=mid-1;
            }else if (arr[mid]>arr[n-1]){
                st=mid+1;
            }
        }

        return ansIdx;
    }
    public static void main(String[] args) {
        int[]arr={4,5,6,1,2,3};
        System.out.println(findRotatePoint(arr));
    }
}

 */












/*
            // find target on roted array ----->>>>>>
      // roted array fllowing this rule array's two part is sorted or  one part sorted and other is unsorted --------->>.


public class PwBinarySearchProblems {
    public static int serch(int[] arr,int target){
        int st=0,end=arr.length-1;
        while (st<=end){
            int mid =st+(end-st)/2;
            if (arr[mid]==target){
                return mid;
            }else if (arr[mid]<arr[end]){
                if (arr[mid]<target && target<=arr[end]){
                    st=mid+1;
                }else {
                    end=mid-1;
                }
            }else {
                if (target>=arr[st] && target<arr[mid]){
                    end=mid-1;
                }else {
                    st=mid+1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {

        int[]arr={3,4,5,1,2};
        System.out.println("the index of target :");
        System.out.println(serch(arr,4));
    }
}

 */















             // find the elemnts on duplicate element array ------>>>>>>>
                 // ex- 1,1,1,1,2,2,3,3,3; one roted = 1,1,1,2,2,3,3,3,1;
                 //                        two roted = 1,1,2,2,3,3,3,1,1;


public class PwBinarySearchProblems {

    public static int serch(int [] arr,int target){
        int st=0,end =arr.length-1 , n = arr.length;

        while (st<=end){
            int mid = st+(end-st)/2;
            if (arr[mid]==target){
                return mid;
            }else if (arr[st]==arr[mid] && arr[mid]==arr[end]){
                st++;
                end--;
            }
            else if (arr[mid]<=arr[end]){
                if (arr[mid]<target && target>=arr[end]){
                    st=mid+1;
                }else {
                    end=mid-1;
                }
            }else {
                if (target>=arr[st] && target<arr[mid] ){
                    end=mid-1;
                }else {
                    st=mid+1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {


        int[] arr = {1,1,1,1,2,2,3,1,1};
        System.out.println(serch(arr,2));
        System.out.println(serch(arr,3));

    }
}

