



          //  swap Logic with temp variable;


//          public class ReverseAnArray {
//              public static void main(String[] args) {
//
//                  int a = 3;
//                  int b = 9;
//                  int temp ;
//                  temp=a;
//                  a=b;
//                  b=temp;
//
//                  System.out.println(a);
//                  System.out.println(b);
//              }
//}



          //  swap Logic without use any  variable;


//          public class ReverseAnArray {
//              public static void main(String[] args) {
//
//                  int a = 3;
//                  int b = 9;
//
//                  a=a+b;
//
//                  b=a-b;
//                  a=a-b;
//
//                  System.out.println(a);
//                  System.out.println(b);
//              }
//          }









public class ReverseAnArray {

    public static void main(String[] args) {

        int[] arr={2,5,9,63,12};
        int n = arr.length-1;

        for (int i = 0; i<=n/2;i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        for (int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }


         // Time complexcity : O(n)
        // Space Complexcity : O(1)

    }
}
