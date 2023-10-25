

        // Interface don't have body
        // we cannot  create interface's obj

//interface plane{
//    public void fly();
//    public void takeOff();
//}
//class Airplane implements plane{
//    @Override
//    public void fly() {
//        System.out.println("flyyy");
//    }
//
//    @Override
//    public void takeOff() {
//        System.out.println(" taking off");
//    }
//}
//
//class sample {
//    public void smeth(plane pp){
//        pp.fly();
//        pp.takeOff();
//    }
//}
//public class InterfaceBodyCreation {
//    public static void main(String[] args) {
//        Airplane aa = new Airplane();
//
//        sample sp = new sample();
//        sp. smeth(aa);
//    }
//}







        // Can we create interface body using default or static keyword
        // default or static keyword

//      interface two {
//             default void call(){
//                 System.out.println("i am two");
//             }
//                   // or
//             static void call2(){
//                 System.out.println(" i am call2 of two");
//             }
//      }
//
//      class one implements two{
//            public void dooo(){
//                System.out.println("i am one");
//            }
//      }
//
//   public class InterfaceBodyCreation{
//       public static void main(String[] args) {
//
//           two.call2();
//
//
//           one nn = new one();
//           nn.dooo();
//           nn.call();
//       }
//}
