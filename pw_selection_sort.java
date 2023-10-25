

                   // *************    Selection Sort -------------->>>>>>>
                        // Selection sort is a stable and in place sort ---------->>>>>>>>>>



// public class pw_selection_sort {
//    public static void main(String[] args) {
//        int [] arr = {5,7,3,9,2};
//
//       for (int i =0; i<arr.length-1;i++){
//           int select_indx = i;
//           for (int j = i+1;j<arr.length;j++){
//               if (arr[select_indx]>arr[j]){
//                   select_indx=j;
//               }
//           }
//           int temp = arr[i];
//           arr[i]=arr[select_indx];
//           arr[select_indx]=temp;
//       }
//
//       for (int e: arr){
//           System.out.println(e);
//       }
//    }
//}



                // optimize way selection sort ;0


                   public class pw_selection_sort {
    public static void selectionSort(int [] arr){

        for (int i=0; i<arr.length-1;i++){
            int select = i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[select]>arr[j]){
                    select=j;
                }
            }
            if (select!=i){
                int temp = arr[i];
                arr[i]=arr[select];
                arr[select]=temp;
            }
        }
    }
                       public static void main(String[] args) {

        int[] arr = {4,10,5,3,6};
        selectionSort(arr);

        for (int e: arr){
            System.out.println(e);
        }
                       }
}