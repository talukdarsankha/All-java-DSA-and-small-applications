
             // Types of  Inheritance
   // Single-level , multi-level , Hierarchical-inheritance, multiple-inheritance

             // Types of Inheritance methods
      // Inherit method , Overriden methods , Specialize methods



//             // Single-level
//
//     class one{
//        public  void speek(){
//            System.out.println("speeking");
//        }
//     }
//     class two extends one{
//
//     }



//             // multi level
//    class parent1{
//       public  void see(){
//           System.out.println("see something");
//       }
//     }
//     class child1 extends parent1{
//         public  void eat(){
//             System.out.println("eating");
//         }
//     }
//     class child2 extends child1{
//
//     }
//     class child3 extends child2{
//
//     }





             // Hierarchical-inheritance

     class animal{
      public  void sleep(){
          System.out.println("sleeping");
      }
     }

     class tiger extends animal{

     }
     class cow extends animal{

     }

     class dog extends animal{
      public  void run(){
          System.out.println("running");
      }
     }



//     // Multi level inheritance not allowed it show error
//    class one{
//
//     }
//     class two{
//
//     }
//     class three extends one,two{   // it throw error
//
//     }
public class InheritanceTypes {
    public static void main(String[] args) {

//        two tt = new two();
//        tt.speek();


//        child3 cc = new child3();
//        cc.see();
//        cc.eat();




//        dog dd = new dog();
//        dd.sleep();
//        dd.run();
    }
}







