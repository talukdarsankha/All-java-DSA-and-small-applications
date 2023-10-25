//
//                 // FIND IS  ANY TARGET VALUE PRESENT IN THE ARRAY OR NOT ------------------->>>>>>>>
//
//
//public class Pw_recursion_on_array {
//
//    public static Boolean present(int[] arr,int target,int idx){
//        if (idx==arr.length){
//            return false;
//        }
//        if (arr[idx]==target){
//            return true;
//        }
//      return  present(arr,target,idx+1);
//    }
//    public static void main(String[] args) {
//
//        int[] arr={1,12,5,45,6,3,2};
//        int target = 6;
//        // System.out.println(present(arr,target,0));
//
//        if (present(arr,target,0)){
//            System.out.println("Present");
//        }else {
//            System.out.println("Not present");
//        }
//    }
//}











//          // if target value present then print first present index   ------------------->>>>>>>>>>>
//
//
//public class Pw_recursion_on_array {
//
//  public static int index_of_the_target_value(int[] arr,int target,int idx){
//      if (idx==arr.length){
//          return -1;
//      }
//      if (arr[idx]==target){
//          return idx;
//      }
//      return index_of_the_target_value(arr,target,idx+1);
//  }
//    public static void main(String[] args) {
//
//      int[] arr={2,3,4,5,4,7,8,6,4};
//      int target = 4;
//
//        System.out.println(index_of_the_target_value(arr,target,0));
//    }
//}










//         // print which_which index the target value is present --------------->>>>>>>>>>>>>>>>
//
//
//public class Pw_recursion_on_array {
//
//    public static void which_which_index(int []arr,int target,int idx) {
//        if (idx==arr.length){
//            return;
//        }
//        if (arr[idx]==target){
//            System.out.println(idx);
//        }
//        which_which_index(arr,target,idx+1);
//    }
//    public static void main(String[] args) {
//
//        int[] arr={2,3,4,5,4,7,8,6,4};
//        int target = 4;
//        which_which_index(arr,target,0);
//    }
//}
//











 //******* print those index in a arrayList which_which index the target value is present --------------->>>>>>>>>>>>>>>>



//import java.util.ArrayList;
//
//public class Pw_recursion_on_array {
//
//    public static ArrayList<Integer> which_which_index(int [] arr,int target,int idx){
//        if (idx==arr.length){
//            return new ArrayList<>();   // return a empty arraylist is no index found -->
//        }
//
//        ArrayList<Integer> ans = new ArrayList<>();
//        if (arr[idx]==target){
//            ans.add(idx);
//        }
//      ArrayList<Integer> samll =  which_which_index(arr,target,idx+1);
//        ans.addAll(samll);
//        return ans;
//    }
//    public static void main(String[] args) {
//
//        int[] arr={2,3,4,5,4,7,8,6,4};
//         int target = 4;
//
//        System.out.println(which_which_index(arr,target,0));
//    }
//}
//










//                    // last present index using recursion ---------------->>>>>>>>>
//
//
//public class Pw_recursion_on_array {
//
//    public static int last_present_index(int[]arr,int target,int idx){
//        int index = -1;
//
//        if (idx==arr.length){
//            return -1;
//        }
//        if (arr[idx]==target){
//           index=idx;
//            System.out.println(index);
//        }
//      return last_present_index(arr,target,idx+1);
//
//    }
//    public static void main(String[] args) {
//
//        int[] arr={2,3,4,5,4,7,8,6,4};
//        int target = 4;
//        System.out.println(last_present_index(arr,target,0));
//    }
//}







//              // is an array sorted or not using recursion --------------->>>>>>>
//
//public class Pw_recursion_on_array {
//
//    public static boolean sorted(int[]arr,int idx){
//        if (idx== arr.length-1){
//            return true;
//        }
//        if (arr[idx]>arr[idx+1]){
//              return false;
//        }
//        return sorted(arr,idx+1);
//    }
//    public static void main(String[] args) {
//        int[]arr={2,5,6,7,8,9};
//        System.out.println(sorted(arr,0));
//    }
//}
//









           // find the last index of the target value --------------->>>>>>>>>>>>>


public class Pw_recursion_on_array {
    public static int last_presents(int[] arr,int target , int idx){
        if (idx<0){
             return -1;
        }
        if (arr[idx]==target){
            return idx;
        }
        return last_presents(arr,target,idx-1);
    }
    public static void main(String[] args) {

        int[] arr={3,2,5,4,3,2,4,7,3,6};
        int target = 3;
        System.out.println(last_presents(arr,3,arr.length-1));
    }
}















//public class Pw_recursion_on_array {
//    public static void main(String[] args) {
//        int []arr={4,1,2,5,4,8};
//        int x =4;
//        int idx= -1;
//        for (int i =0;i< arr.length;i++){
//            if (arr[i]==x){
//                idx=i;
//               // break;
//            }
//        }
//        System.out.println(idx);
//    }
//}


//public class Pw_recursion_on_array {
//    public static void main(String[] args) {
//        int []arr={4,1,2,5,4,8};
//        int x =4;
//        int idx= -1;
//        for (int i =0;i< arr.length;i++){
//            if (arr[i]==x){
//                idx=i;
//                break;
//            }
//        }
//        System.out.println(idx);
//    }
//}
