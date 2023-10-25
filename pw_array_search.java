
         // first present index --------->>>>>>>>

//public class pw_array_search {
//    public static void main(String[] args) {
//
//                int []arr={4,1,2,5,4,8};
//                int x =4;
//                int idx= -1;
//                for (int i =0;i< arr.length;i++){
//                    if (arr[i]==x){
//                        idx=i;
//                        break;
//                    }
//                }
//                System.out.println(idx);
//            }
//        }





                 // last present index -------------->>>>>>
public class pw_array_search {
    public static void main(String[] args) {
        int []arr={4,1,2,5,4,8};
        int x =4;
        int idx= -1;
        for (int i =0;i< arr.length;i++){
            if (arr[i]==x){
                idx=i;
              //  break;
            }
        }
        System.out.println(idx);
    }
}
