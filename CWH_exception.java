
                 // Error --->>>>>>>>>>>>>>>>>>>
                 // Three typr of error
                 // syntax error, logical error, runtime error -------------------->>>>>>>>>>>>>>>


                 import java.util.Scanner;

//                 public class CWH_exception {
//                     public static void main(String[] args) {
//                         // sytax error
//        int a = 5;
//        System.out.println(a)

//        // logical error
//          // ex-print primr number
//        System.out.println(2);
//        for (int i=1;i<5;i++){
//            System.out.println(2*i+1);
//        }


//        // Runtime erro
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter k");
//        int n = 44;
//        int k = sc. nextInt();
//        try {
//          int g =   n/k;
//            System.out.println(g);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//        System.out.println("end the code");


                         // ***** try catch na dile error ase ar nicher code execute hoy na
                         // kintu try catch dite error ta print hoy ar nicher code execute hoy------->>>>>>>>>>>>

                         // TRY-CATCH BLOCK________________>>>>>>>>>>>>>>>>>>>


//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter n");
//        int n = sc.nextInt();
//        System.out.println("enter k");
//        int k = sc. nextInt();
//        try {
//          int g =   n/k;
//            System.out.println(g);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//        System.out.println("end the code");
//
//
//
//
//
//    }


//                         Scanner sc = new Scanner(System.in);
//
//                         int arr[] = {42, 50, 62, 88, 45};
//                         System.out.println("Enter the index");
//                         int index = sc.nextInt();
//                         System.out.println("Enter the number");
//                         int number = sc.nextInt();
//                         try {
//                             System.out.println(arr[index]/number);
//                         }
//                         catch (ArithmeticException e){
//                             System.out.println(e);
//                         }
//                         catch (ArrayIndexOutOfBoundsException e){
//                             System.out.println(e);
//                         }
//                         catch (Exception e){
//                             System.out.println(e);
//                         }
//
//                         System.out.println("ending the code thank you");
//                     }
//                 }








//                             //     ********  nested try-catch --------->>>>>
//
//                 public class CWH_exception {
//                     public static void main(String[] args) {
//
//                         int n = 110;
//                         int a = 0;
//
//                         try {
//                             System.out.println("starting the code");
//                             try {
//                                 System.out.println(n/a);
//                             }catch (Exception e){
//                                 System.out.println(e);
//                             }
//
//                         }catch (Exception e){
//                             System.out.println(e);
//                         }
//
//                         System.out.println("Ending the programm");
//                     }
//}





                  // ********** Exception class that's create our own custom exceptions ------------>>>>>>>>>>>>


//        class myException extends Exception{
//
//            @Override
//            public String toString() {
//                return "our Exception";
//            }
//
//            @Override
//            public String getMessage() {
//                return "exception";
//            }
//        }
//     public class CWH_exception {
//
//         public static void main(String[] args) {
//  Scanner sc = new Scanner(System.in);
//             System.out.println("enter n");
//  int n = sc.nextInt();
//         if (n<10){
//            try {
//                throw new myException();
//            }catch (Exception e){
//                System.out.println(e);
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());
//            }
//
//         }
//
//         }
//     }




                    //////// ******** Throws and Throw --------------------------->>>>>>>>>>>>>>

//          public class CWH_exception{
//              public static void divide(int a,int b) throws ArithmeticException{
//
//                 int c= a/b;
//                  System.out.println(c);
//              }
//              public static void main(String[] args) {
//
//                 // divide(10,2);
//                  try {
//                      divide(40,0);
//                  }catch (Exception e){
//                      System.out.println("error");
//                      System.out.println(e);
//                  }
//
//
//              }
//}






//                 class nagetiveAreaException extends Exception{
//                     @Override
//                     public String toString() {
//                         return "Nagetive area";
//                     }
//
//                     @Override
//                     public String getMessage() {
//                         return "Radius can't nagetive";
//                     }
//                 }
//      public class CWH_exception{
//          public static double areaOfSquare(int a) throws nagetiveAreaException{
//              if (a<0){
//                  throw new nagetiveAreaException();
//              }
//              return a*a;
//          }
//          public static void main(String[] args) {
//              try {
//                  System.out.println(areaOfSquare(-2));
//              }catch (Exception e){
//                  System.out.println(e);
//              }
//          }
//}











                 // ******** FINALLY BLOCK ---------------->>>>>>>>>>>
                        // finally thakle break thakleu finally block execute hobeiiii -------------->>>>>>>


//                 public class CWH_exception {
//                     public static void main(String[] args) {
//                         try {
//                             System.out.println(10/0);
//                         }catch (Exception e){
//                             System.out.println(e);
//                         }
//                         finally {
//                             System.out.println("ending the program");
//                         }
//                     }
//}









//                 public class CWH_exception {
//                     public static void main(String[] args) {
//                         int a = 10;
//                         int b = 7;
//                        while (true){
//                            try {
//                                System.out.println(a/b);
//                            }catch (Exception e){
//                                System.out.println(e);
//                                break;
//                            }finally {
//                                System.out.println("ending");
//                            }
//                            b--;
//                        }
//
//                     }
//}
















                             // ******** enter the index untill you are not enter right index of array ------------->>>>>>>>>>

//                 public class CWH_exception {
//                     public static void main(String[] args) {
//                         Scanner sc = new Scanner(System.in);
//                         int arr[] ={4,45,2};
//                         boolean flag = true;
//                         while (flag) {
//                             System.out.println("enter ind");
//                             int ind = sc.nextInt();
//                             try{
//                                 System.out.println(arr[ind]);
//                                 break;
//                             }catch (Exception e){
//                                 System.out.println(e);
//
//                             }
//                         }
//
//                     }
//}





   //  ******** enter the index untill you are not enter right index of array you only have 5 time enter the index ------------->>>>>>>>>>


                 public class CWH_exception {
                     public static void main(String[] args) {
                         Scanner sc = new Scanner(System.in);
                         int arr[] ={4,45,2};
                         int i=0;
                         while (i<=5){
                             System.out.println("enter");
                             int ind = sc.nextInt();
                             try {
                                 System.out.println(arr[ind]);
                                 break;
                             }catch (Exception e){
                                 System.out.println(e);
                                 i++;
                             }
                             if (i==6){
                                 System.out.println("error");
                             }
                         }
                     }
}