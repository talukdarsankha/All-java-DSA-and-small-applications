//
//
//
//                  // ******** greatest common devisior ---------->>>>>>>
//
//public class pw_recursion{
//    // not use or normal approach --------------------->>>>>
//public static int gcd(int x, int y){
//     while (x%y!=0){
//         int reminder = x%y;
//         x=y;
//          y = reminder;
//     }
//     return y;
//}
//
//
//             //  ***********  usefull approach or recursive approach ------------>>>>>>>>>>>>>
//
//    public static int GCD(int x, int y){
//    if (y==0){
//        return x;
//    }
//    return GCD(y,x%y);
//    }
//    public static void main(String[] args) {
//        System.out.println(gcd(24,15));
//
//        System.out.println(GCD(24,15));
//    }
//}






//
////
////
////                           // Print array element using recursion ------------------>>>>>>>>>>>>>>>
////
////public class pw_recursion {
////    public static int print_array_ele(int[] arr,int idx){
////        if (idx==arr.length-1){
////            System.out.println(arr[idx]);
////            return -1;
////
////        }
////        System.out.println(arr[idx]);
////       return print_array_ele(arr,idx+1);
////    }
////    public static void main(String[] args) {
////
////        int arr[] ={4,58,2,54,1,2};
////        print_array_ele(arr,0);
////    }
////}
//
//
//                      // OR --------->>>> Print array element using recursion ------------------>>>>>>>>>>>>>>>
//
//public class pw_recursion {
//    public static void print_array_ele(int[] arr,int idx){
//        if (idx==arr.length){
//            return;
//        }
//        System.out.println(arr[idx]);
//         print_array_ele(arr,idx+1);
//    }
//    public static void main(String[] args) {
//
//        int arr[] ={4,58,2,54,1,2};
//        print_array_ele(arr,0);
//    }
//}










                          // Find the Max in the array elements using recursions ------------------>>>>>>>>>>>>>


//public class pw_recursion {
//    public static int max_ele_of_array(int [] arr,int idx){
//        if (idx==arr.length-1){
//            return arr[idx];
//        }
//        int samllans = max_ele_of_array(arr,idx+1);
//        return Math.max(arr[idx],samllans);
//
//    }
//
//    public static void main(String[] args) {
//
//        int arr[] ={14,55,1,145,155,12,3,78,9};
//        System.out.println(max_ele_of_array(arr,0));
//    }
//}










//                                // Sum of the array elements using recursion ---------------->>>>>>>>>>>
//
//
//public class pw_recursion {
//    public static int sum_of_array_ele(int[] arr,int ind){
//            if (ind==arr.length-1){
//                    return arr[ind];
//            }
////            int sum = 0;
////           sum+=arr[ind];
////           sum+= sum_of_array_ele(arr,ind+1);
////            return sum;
//
//              // or -->>>>>>>>>>>
//           return arr[ind]+sum_of_array_ele(arr,ind+1);
//
//
//    }
//public static void main(String[]args) {
//        int[] arr={4,1,5,2,6,4};
//    System.out.println(sum_of_array_ele(arr,0));
//}
//        }








//                             // Multiply of the array elements ------------------->>>>>>>>>>>>>>>>>>>
//
//public class pw_recursion {
//    public static int multiply(int [] arr,int ind){
//        if (ind==arr.length-1){
//            return arr[ind];
//        }
//
//      //  int mul =1;
//      //  mul*=arr[ind];
//      //  mul*=multiply(arr,ind+1);
//      //  return mul;
//
//             // OR --------------->>>>>>
//
//        return arr[ind]*multiply(arr,ind+1);
//
//    }
//    public static void main(String[] args) {
//
//        int[] arr={7,2,1,2};
//        System.out.println(multiply(arr,0));
//    }
//}