


                     // Bubble Sort
              // Bubble Sort is a Inplace Sort
              // Bubble Sort is a Stable Sort







                     // Time Complexity of this Code :O(n^2)
                     // Space Complexity of this Code :O(1)

//public class BubbleSort {
//    public static void main(String[] args) {
//
//        int[] arr={4,10,5,3,12,9};
//            for (int i=0;i<arr.length-1;i++){
//                for (int j=0;j<arr.length-1-i;j++){
//                    if (arr[j]>arr[j+1]){
//                        int temp=arr[j];
//                        arr[j]=arr[j+1];
//                        arr[j+1]=temp;
//                    }
//                }
//            }
//
//            for (int i=0;i<arr.length;i++){
//                System.out.print(arr[i]+" ");
//            }
//
//    }
//}








                     // Time Complexity of this Code :O(n^2)
                     // Space Complexity of this Code :O(1)

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr={4,10,5,3,12,9};
            for (int i=0;i<arr.length-1;i++){
                boolean swap=false;
                for (int j=0;j<arr.length-1-i;j++){
                    if (arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;

                        swap=true;
                    }
                }
                if (swap!=true){
                    break;
                }
            }

            for (int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }

    }
}