



              // Binary To Decimal






//  import java.util.Scanner;
//    public class BinaryToDecimalAndDecimalToBinary {
//    public static void main(String[] args) {
//
//        System.out.println("Enter the number which you convert to decimal");
//        Scanner sc = new Scanner(System.in);
//        int binaryNum=sc.nextInt();
//
//        int base=1;
//        int ans=0;
//        while (binaryNum>0){
//            int numb=binaryNum%10;
//            ans+=numb*base;
//            binaryNum=binaryNum/10;
//            base*=2;
//        }
//        System.out.println("Decimal Number is :"+ans);
//
//    }
//}













                     // Decimal to Binary









              import java.util.Scanner;
         public class BinaryToDecimalAndDecimalToBinary  {
          public static void main(String[] args) {


              Scanner Sc = new Scanner(System.in);
              System.out.println("Enter the Decimal value which you convert to Binary");
              int decimal=Sc.nextInt();

              int ans=0;
              int multiply=1;
              while (decimal>0){
                   int num=decimal%2;
                   ans+=num*multiply;
                   decimal/=2;
                   multiply*=10;


              }
              System.out.println("The binary number is :"+ans);



          }
}
