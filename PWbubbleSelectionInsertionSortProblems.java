
              // Sorting Problems ---------->>>>>>

/*
    public class PWbubbleSelectionInsertionSortProblems {
    public static void sort(int[]arr){
        for (int i =0; i<arr.length-1;i++){
            boolean flag = true;
            for (int j =0;j<arr.length-1-i;j++){
                if (arr[j]==0 && arr[j+1]!=0){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    flag=false;
                }

            }

            if (flag!=false){
                return;
            }
        }
    }
    public static void main(String[] args) {

        int arr[] ={0,5,0,3,42};

//        for (int i =0; i<arr.length-1;i++){
//            boolean flag = true;
//            for (int j =0;j<arr.length-1-i;j++){
//                if (arr[j]==0 && arr[j+1]!=0){
//                    int temp = arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//
//                    flag=false;
//                }
//
//            }
//
//            if (flag!=false){
//                return;
//            }
//        }

        sort(arr);

        for (int e: arr){
            System.out.print(e+" ");
        }
    }
}

 */




//           public class PWbubbleSelectionInsertionSortProblems{
//               public static void main(String[] args) {
//                   String ss = "samuel";
//                   String ss1 = "samya";
//
//                   System.out.println(ss.equals(ss1));
//                   System.out.println(ss.equalsIgnoreCase(ss1));
//
//                   System.out.println(ss.compareTo(ss1));
//                   System.out.println(ss1.compareTo(ss));
//               }
//}


/*
public class PWbubbleSelectionInsertionSortProblems{

    public static void main(String[] args){
   // int arr[] ={0,5,0,3,42};
        String[] arr = {"kiwi","goyava","watermelon","apple","papaya"};
       for (int i = 0;i<arr.length-1;i++){
           int select_idx = i;
           for (int j =i+1;j<arr.length;j++){
            if (arr[select_idx].compareTo(arr[j])>0){
                select_idx=j;
            }
           }
           if (select_idx!=i) {
               String termp = arr[i];
               arr[i] = arr[select_idx];
               arr[select_idx] = termp;
           }
       }

       for (String e: arr){
           System.out.println(e);
       }
    }
 }
 */




              public class PWbubbleSelectionInsertionSortProblems {
                  public static void main(String[] args) {
                      String[] arr = {"kiwi","goyava","watermelon","apple","papaya"};
                      for (int i =0; i<arr.length-1;i++){
                          int select_ind = i;
                          for (int j=i+1;j<arr.length;j++){
                              if (arr[select_ind].compareTo(arr[j])>0){
                                  select_ind=j;
                              }
                          }

                          if (select_ind!=i) {
                              String temp = arr[i];
                              arr[i] = arr[select_ind];
                              arr[select_ind] = temp;
                          }
                      }

                      for (String e: arr){
                          System.out.print(e+" ,");
                      }
                  }
}