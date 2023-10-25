package SystemDesign;





           /////  ********** System Design Principles **********
       // 1. DRY
       // 2. KISS
       // 3.SOLID
       // 4. CUPID





       // singleton technique ------->>>>>>  It is use to avoid creation of more than one object of any class


//  class laptop {
//    private laptop(){   // we create constructor private so anyone can't create object this class so we can create obj only this class
//
//    }
//   private static laptop obj;
//    public static laptop get(){
//
//        synchronized (laptop.class){   // it is not mandatory is is for thread purpose
//            if(obj==null){     // if obj not create then we create obj but after create one object we not create obj return previous obj
//                obj = new laptop();
//            }
//            return obj;
//        }
//
//    }
//}
//public class SystemDesign1 {
//       public static void main(String[] args) {
//
////           laptop l1 = new laptop();
//           laptop l1 = laptop.get();
//           laptop l2 = laptop.get();
//           System.out.println(l1.hashCode());  // if two hashcode are same that means we don't create multiple obj only one obj
//           System.out.println(l2.hashCode());
////           System.out.println(laptop.obj.hashCode());
//
//       }
//}

           // Or

class laptop {
    private laptop(){   // we create constructor private so anyone can't create object this class so we can create obj only this class

    }

   private static laptop obj = new laptop();  // here we create obj one time but return many time
    public static laptop get(){
      return obj;
    }
}
public class SystemDesign1 {
       public static void main(String[] args) {

//           laptop l1 = new laptop();
           laptop l1 = laptop.get();
           laptop l2 = laptop.get();
           System.out.println(l1.hashCode());   // if two hashcode are same that means we don't create multiple obj only one obj
           System.out.println(l2.hashCode());
//           System.out.println(laptop.obj.hashCode());

       }
}
