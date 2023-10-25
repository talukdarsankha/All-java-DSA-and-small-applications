



                 // Linear Search


              // Time Complexity of this Code :O(n)
              // Space Complexity of this Code :O(1)

//public class LinearSearch {
//    public static void main(String[] args) {
//
//        int[]arr={2,7,4,9,8,24,8,5};
//        int target = 8;
//        int idx=-1;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==target){
//                idx=i;
//            }
//        }
//        if (idx!=-1){
//            System.out.println("The value's location is :"+idx);
//        }else {
//            System.out.println("The Value not found");
//        }
//    }
//}








                 // Time Complexity of this Code :O(n)
                 // Space Complexity of this Code :O(1)

public class LinearSearch {
    public static void main(String[] args) {

        int[]arr={2,7,4,9,8,24,8,5};
        int target = 8;
        int idx=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                idx=i;
                break;
            }
        }
        if (idx!=-1){
            System.out.println("The value's location is :"+idx);
        }else {
            System.out.println("The Value not found");
        }
    }
}
