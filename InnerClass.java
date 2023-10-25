

      // Three types of inner class like = member inner class, static inner class , Anonymous inner class



//      // member innner class
//
//      class a1{
//          public void metha1(){
//              System.out.println("it is metha1");
//          }
//
//          class  b1{
//              public void methb1(){
//                  System.out.println("b1 meth");
//              }
//          }
//      }
//public class InnerClass {
//    public static void main(String[] args) {
//        a1 aa = new a1();
//        aa.metha1();
//       a1.b1  b = aa.new b1();
//       b.methb1();
//    }
//}





//      // static innner class
//
//
//
//      class a1{
//                    public void metha1(){
//              System.out.println("it is metha1");
//          }
//
//         static class  b1{
//              public void methb1(){
//                  System.out.println("b1 meth");
//              }
//          }
//      }
//  public class InnerClass{
//      public static void main(String[] args) {
//          a1 a = new a1();
//          a.metha1();
//
//        a1.b1 b = new a1.b1();
//        b.methb1();
//      }
//}









      // Anonymous inner class


interface  a3{
    public void metha3();
}
 public class InnerClass{
     public static void main(String[] args) {

         a3 a = new a3() {
             @Override
             public void metha3() {
                 System.out.println("Anonymous class");
             }
         } ;
         
         a.metha3();
     }
}
