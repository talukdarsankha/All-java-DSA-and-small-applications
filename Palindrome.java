

             // Palindrome Array

//public class Palindrome {
//    public static void main(String[] args) {
//
//             //Not a good approach  its time complexcity o(n) and space complexcity o(n)
//
//        int[] array = {1,2,3,2,1};
//        int n = array.length;
//        int[] newArr= new int[n];
//        for (int i =n-1; i>=0;i--){
//            newArr[n-1-i]=array[i];
//        }
//
//
//
//    }
//}






         //Good approach  its time complexcity o(n) and space complexcity o(1)


     public class Palindrome{
         public static void main(String[] args) {

             int[] array = {1,2,3,4,3,2,1};
             int n = array.length-1;
             for (int i=0;i<=n/2;i++){
                 if (array[i]!=array[n-i]){
                     System.out.println("Not Palindrome");
                     return;
                 }
             }
             System.out.println("Palindrome");

         }
}

