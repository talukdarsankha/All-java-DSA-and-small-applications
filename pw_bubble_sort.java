

          // Bubble Sort ------------------>>>>>>>>>>>>>>
          //**** bubble sort is a in place sort --->>
          // bubble sort is a stable sort =-->


//public class pw_bubble_sort {
//    public static void main(String[] args) {
//
//        int [] arr ={7,4,3,5,2};
//        for (int i=0;i<arr.length-1;i++){
//            for (int j =0;j<arr.length-1-i;j++){
//                if (arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//
////        for (int e: arr){
////            System.out.println(e);
////        }
//
//        for (int i=0 ;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//
//    }
//}







          // bubble sort optimize way ------------->>>>>>>>>>>

   public class pw_bubble_sort {
    public static void bubble(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag=false;
                }
            }
            if (flag!=false){
                return;
            }
        }

    }



              public static void main(String[] args) {

                  int[] arr = {4, 8, 9, 2, 3, 5, 6};
                  bubble(arr);
                  for (int e: arr){
                      System.out.println(e);
                  }

              }
}