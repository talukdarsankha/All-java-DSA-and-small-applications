

        // **** Exception are two types Runtime and Compile time
        // ****** Mainly Exception are Runtime
        // **** Checked and Unchecked Exception
        // ****  Checked Exception is Compile Exception BUt UnChecked Exception is Runtime Exception




import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.SocketHandler;

/*public class ExceptionHandlingTryCatchFinally {
    public static void main(String[] args) {


        // Try Catch

//        int a= 20;
//        int b = 0;
//        int c ;
//         try {
//             c=a/b;
//             System.out.println(c);
//         }catch (Exception e){
//             System.out.println(e);
//             System.out.println(e.getMessage());
//         }


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the int");
//        int st;
//        try{
//            st=sc.nextInt();
//            System.out.println(st);
//        }catch (InputMismatchException e){
//            System.out.println(e);
//        }catch (Exception e ){
//            System.out.println(e);
//        }




       // nested Try Catch


//        int a =  12;
//        int b =2;
//         int ans;
//         int []arr = {1,2,3};
//
//         try {
//             ans =a/b;
//             System.out.println(ans);
//
//             try {
//                 System.out.println(arr[5]);
//             }catch (Exception e){
//                 System.out.println(e);
//             }
//         }catch (Exception e){
//             System.out.println(e);
//         }
//
//        System.out.println("finish");









    }
}

 */








        //***** throws ann throw




//    class one{
//
//
//        public void meth1() throws Exception{
//          meth2();
//        }
//        public void meth2() throws Exception{
//               meth3();
//        }
//        public void meth3() throws Exception{
//
//            Scanner sc  =new Scanner(System.in);
//
//            System.out.println("Enter aa");
//            int aa  =sc.nextInt();
//            System.out.println("Enter b");
//            int b =sc.nextInt();
//            System.out.println(aa/b);
//        }
//    }
// public class ExceptionHandlingTryCatchFinally{
//     public static void main(String[] args) {
//     one nn = new one();
//         try {
//             nn.meth1();
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//
//     }
//}




     // Custom Exception


// class myClass extends Exception{
//
////     @Override
////     public String toString() {
////         System.out.println("Don't Enter negative value");
////     }
//
//     public myClass(String ss){
//              super("Dont enter negetive number");
//          }
//      }
//
// class myClass2 {
//
//     public void meth2() throws Exception {
//         int a = 10;
//         int b = -5;
//         int c;
//         Exception ee = new myClass("sjkd");
//         if (b<0){
//             throw ee;
//         }
//     }
//
//      }
//
//  public class ExceptionHandlingTryCatchFinally{
//      public static void main(String[] args) {
//
//     myClass2 my2 = new myClass2();
//          try {
//              my2.meth2();
//          } catch (Exception e) {
//              System.out.println(e);
//          }
//
//
//      }
//}







   class custom extends Exception{

   }
   class facebook{
        int a1 = 1234;
        String  s1 = "sankha";
        int a2;
        String s2;

        public void input(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter password");
            a2=sc.nextInt();
            System.out.println("Enter name");
            s2=sc.nextLine();
        }
        public void validity() throws Exception {
            if (a1==a2&&s1.equals(s2)){
                System.out.println("succesffull");
            }else {
                custom cs = new custom();
                throw cs;
            }
        }
   }

   class companyfacebook{

       public void check(){
           facebook ff = new facebook();
           ff.input();
           try {
               ff.validity();
           } catch (custom e) {
               System.out.println("you are not a wonner");
           } catch (Exception ae) {
               System.out.println(ae);
           }
       }
   }

   public class ExceptionHandlingTryCatchFinally {
       public static void main(String[] args) {

           companyfacebook cf = new companyfacebook();
           cf.check();
       }
}







//public class ExceptionHandlingTryCatchFinally {
//
//    public static void main(String[] args) {
//
//        int a = 10;
//        int b = 6;
//        int result;
//        try {
//            result=a/b;
//            System.out.println(result);
//        }catch (Exception e){
//            System.out.println(e);
//        }
//
//
//         System.out.println("end");
//    }
//}





//public class ExceptionHandlingTryCatchFinally {
//    public static void main(String[] args) {
//
//        int a = 10;
//        int b = 0;
//        int result;
//        try {
//            result=a/b;
//            System.out.println(result);
//        }catch (ArithmeticException e){
//            System.out.println(e);
//        }
//
//        System.out.println("end");
//    }
//}









//public class ExceptionHandlingTryCatchFinally {
//    public static void main(String[] args) {
//
//        int a = 10;
//        int b = 0;
//        int result;
//        int[] arr = {2,6,7,8};
//        try {
////            result=a/b;
////            System.out.println(result);
//            System.out.println(arr[4]);
//        }catch (ArithmeticException e){
//            System.out.println(e);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
//
//        System.out.println("end");
//    }
//}










//public class ExceptionHandlingTryCatchFinally {
//    public static void main(String[] args) {
//
//        int a = 10;
//        int b = 0;
//        int result;
//        String ss = null;
//        try {
//            result=a/ss.length();
//            System.out.println(result);
//        }catch (ArithmeticException e){
//            System.out.println(e);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//
//        System.out.println("end");
//    }
//}




//             // finally
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class ExceptionHandlingTryCatchFinally {
//    public static void main(String[] args) {
//
//        int num = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a");
//
//      try {
//          num = sc.nextInt();
//      }
//      catch(InputMismatchException e){
//              System.out.println(e);
//          }
//
//      catch(Exception e){
//              System.out.println(e);
//          }
//      finally {
//          sc.close();
//      }
//
//          System.out.println(num);
//
//    }
//}








                   // Throws


     // example----
//import java.util.Scanner;
//
//class one{
//    Scanner sc = new Scanner(System.in);
//    public void meth1(){
//        try {
//            meth2();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//    public void meth2() throws  Exception{
//        System.out.println("enter n");
//        int n = sc.nextInt();
//        System.out.println("enter m");
//        int m = sc.nextInt();
//
//        int c=n/m;
//        System.out.println(c);
//    }
//}
//public class ExceptionHandlingTryCatchFinally {
//    public static void main(String[] args) {
//one n = new one();
//n.meth1();
//
//    }
//}

//
//import java.util.Scanner;
//
//// example----
//class game{
//    Scanner sc = new Scanner(System.in);
//    public void meth1() throws Exception{
//        meth2();
//    }
//    public void meth2() throws Exception{
//        meth3();
//    }
//    public void meth3() throws Exception{
//        System.out.println("enter n");
//        int n = sc.nextInt();
//        System.out.println("enter m");
//        int m = sc.nextInt();
//
//        int ans = n/m;
//        System.out.println(ans);
//    }
//}
//public class ExceptionHandlingTryCatchFinally {
//    public static void main(String[] args) {
//        game gg = new game();
//        try {
//            gg.meth1();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//    }
//}




           // throw and custom exception


//import java.util.Scanner;
//
//public class ExceptionHandlingTryCatchFinally {
//    public static void main(String[] args) {
//    int n = 20;
//    int m = -10;
//
//    try {
//        if (m<0){
//            System.out.println("Negetive not allowed");
//        }
//       int c= n/m;
//        System.out.println(c);
//    }catch (Exception e){
//        System.out.println(e);
//    }
//    }
//}






//
//class one extends Exception{
//   public one(){
//
//   }
//
//   public one(String ss){
//       super("Don't Enter Negative Value");
//   }
//}
//class second{
//    public void meth() throws Exception{
//
//        int n = 20;
//        int m = -10;
//        Exception ex = new one("str");
//        if (m<0){
//            throw ex;
//        }
//        int ans =n/m;
//        System.out.println(ans);
//
//    }
//}
//public class ExceptionHandlingTryCatchFinally {
//    public static void main(String[] args) {
//        second se = new second();
//        try {
//            se.meth();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//
//        System.out.println("end");
//    }
//}


