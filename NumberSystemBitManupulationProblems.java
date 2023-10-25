//
//             // Qu-1 Given a number print its binary representation
//
//
//
//
//import java.util.Scanner;
//public class NumberSystemBitManupulationProblems {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int multiply=1;
//        int ans=0;
//
//        while (n>0){
//            int val=n%2;
//            ans+=val*multiply;
//            n/=2;
//            multiply*=10;
//        }
//
//        System.out.println("Binary Representation :"+ans);
//
//    }
//}














//                 // Qu- Given a number print its decimal representation
//
//
//import java.util.Scanner;
//
//public class NumberSystemBitManupulationProblems {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//
//        int multiply=1;
//        int ans = 0;
//        while (n>0){
//            int val=n%10;
//            ans+=val*multiply;
//            multiply*=2;
//            n/=10;
//        }
//
//        System.out.println("Decimal Representation :"+ans);
//    }
//}
















                     // Qu- 2   Given a number n predict whether it is a power of two or not


//public class NumberSystemBitManupulationProblems {
//    public static void main(String[] args) {
//
//
//        int n = 32;
//        boolean flag=true;
//
//        while (n>1){
//           int remainder =n%2;
//            n/=2;
//            if (remainder!=0){
//
//               flag=false;
//               break;
//            }
//
//        }
//        if (flag!=true){
//            System.out.println("it is not a power of two");
//        }else {
//            System.out.println("it is a power of two");
//        }
//
//    }
//
//}















                 // Qu-3 Given a number using bit manipulation check whether it is odd or even
                             // o and 1 it is a bit






//public class NumberSystemBitManupulationProblems {
//    public static void main(String[] args) {
//
//
//        int n =83;
//        int ans=0;
//        int base=1;
//        while (n>0){
//            int val=n%2;
//            n/=2;
//            ans+=val*base;
//            base*=10;
//
//
//        }
//        System.out.println(ans);
//        int bitForm=ans;
//        if (bitForm%2==0){
//            System.out.println("even");
//        }else {
//            System.out.println("odd");
//        }
//
//
//    }
//}
















//                  // Qu-4 Given a number count the number of set bits(1 is also called set bit) in that number without using extra space
//
//
//
//
//
//
//public class NumberSystemBitManupulationProblems {
//    public static void main(String[] args) {
//        long n = 1010001011;
//        int count=0;
//        while (n>0){
//           int bit= (int) (n%10);
//           if (bit==1){
//               count++;
//           }
//           n/=10;
//        }
//        System.out.println("The number of Set bit :"+count);
//
//    }
//}










  // Qu- 5   Given an array in this array each numbers occur even time or twice except one number present ood time find the number.


public class NumberSystemBitManupulationProblems {
    public static void main(String[] args) {
     // in this type xor operation it is mandatory to initialize one variable  0  which we will use to compare with other elements

        int[] arr = {2,2,3,5,5,3,4,4,4};

        int xor = 0;
        for (int i=0;i<arr.length;i++){
            xor= xor ^ arr[i];
        }

        System.out.println("Ood occurrence Number is : "+xor);

    }
}




