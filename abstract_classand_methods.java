

        // abstract class and methods ----------->>>>>>>>>>>


   // abstract method abstract class a thake ,kono method jodi abstract hoy tale class takei abstract korte hoy--->
   // abstract method ar body thake na ----->>
   // kono class a abstract class extend korle sei class a abstract method take override korte hoy naile class take abstract korte hoy-->>>
   // abstract class ar obj hoy na kintu abstract class extend koira jei class toiri hoy seitar obj hoy----->>>>
     // joto gula abstract method thake sob gula kei override korte hoy------->>



//abstract  class first{
//
//    public void sayHello(){
//        System.out.println("hello");
//    }
//
//    abstract public void greet();
//}
//
//class second extends first{
//
//    public void greet(){
//        System.out.println("Good Day");
//    }
//}
//
//public class abstract_classand_methods {
//    public static void main(String[] args) {
//
//     second ss = new second();
//     ss.sayHello();
//     ss.greet();
//    }
//}






       abstract class school {

           public void saybye() {
               System.out.println("bye");
           }

           abstract public void greet1();

           abstract public void greet2();
       }

        class college extends school{

    public void greet1(){
        System.out.println("good morning");
    }
    public void greet2(){
        System.out.println("good night");
    }
        }

       abstract class university extends school{

    public void greet1(){
        System.out.println("very good morning");
    }
        }
        public class abstract_classand_methods {
            public static void main(String[] args) {
                college cc = new college();
               cc.saybye();
               cc.greet1();
               cc.greet2();
            }
}



