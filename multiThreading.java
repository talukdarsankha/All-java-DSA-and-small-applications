

                 // Thread --------->>>>>>
                 // Extends Thread class or implements Runnable interface ----------->>>>
                 // override korte hoy run(); method



//     class first extends Thread{
//        public void run(){
//            int i=0;
//            while (i<=1000){
//                System.out.println("i am a thread of first class");
//                i++;
//            }
//        }
//     }
//
//     class second extends Thread{
//         @Override
//         public void run() {
//             for (int i =0;i<=1000;i++){
//                 System.out.println("i am a thread of second class");
//             }
//         }
//     }
//public class multiThreading {
//    public static void main(String[] args) {
//  first t1 = new first();
//  second t2 = new second();
//
//  t1.start();
//  t2.start();
//    }
//}





//                 class myclass implements Runnable{
//                 public void run(){
//                 for (int i =0;i<=400;i++){
//                 System.out.println("i ama a runnable");
//                     }
//                  }
//                 }
//
//                 class myclass2 implements Runnable{
//                   public void run(){
//                  int i=0;
//                  while (i<=855){
//                      System.out.println("i ama myclass2 thread");
//                      i++;
//                        }
//                    }
//                 }
//
//                 public class multiThreading {
//                     public static void main(String[] args) {
//
//                         myclass bullet1 = new myclass();
//                         Thread obj1 = new Thread(bullet1);
//
//                         myclass2 bullet2 = new myclass2();
//                         Thread obj2 = new Thread(bullet2);
//
//                         obj1.start();
//                         obj2.start();
//                     }
//}




                                            // Thread life cycel
                             // 1 new
                               // 2 Runnable
                             // 3 Running
                            // 4 not Runnable
                             // 5 Running
                          // 6 terminate






                 // Thread constructor  ***-------->>>>>
                 // Thread priority            ***-------->>>>>
                 //threads get methods       ***-------->>>>>
                 // thread join        ***-------->>>>>
                 // Thread.sleep  ***-------->>>>>



          // thread constructor --------------->>>>>>>

//      class meth extends Thread{
//    String name;
//          @Override
//          public void run() {
//              int i=0;
//              while (i<=799) {
//                  System.out.println("aaaaaaaaaaaa");
//                  i++;
//              }
//          }
//
//          public meth(String name){
//                   super(name);
//              this.name = name;
//              System.out.println(name);
//          }
//      }
//
//         public class multiThreading{
//             public static void main(String[] args) {
//
//                 meth m1= new meth("harry");
//                meth m2 = new meth("sankha");
//                meth m3=new meth("shill");
//
//                 System.out.println(m1.getName());
//                 System.out.println(m2.getName());
//                 System.out.println(m3.getName());
//
//                 System.out.println(m1.getPriority());
//
//                 System.out.println(m1.getState());
//                 System.out.println(m1.getClass());
//                 System.out.println(m1.getId());
//             }
//}




          //   Thread priority --------------------------->>>>>>>>>>>>>>>

//    class meth1 extends Thread {
//        String name;
//
//        @Override
//        public void run() {
//            int i = 0;
//            while (i <= 799) {
//                System.out.println("aaaaaaaaaaaa");
//                i++;
//            }
//        }
//
//    }
//
//                 class meth2 extends Thread {
//                     String name;
//
//                     @Override
//                     public void run() {
//                         int i = 0;
//                         while (i <= 799) {
//                             System.out.println("bbbbbbbbbbbbbbb");
//                             i++;
//                         }
//                     }
//
//                 }
//
//                 class meth3 extends Thread {
//                     String name;
//
//                     @Override
//                     public void run() {
//                         int i = 0;
//                         while (i <= 799) {
//                             System.out.println("ccccccccccccc");
//                             i++;
//                         }
//                     }
//
//                 }
//         public class multiThreading{
//             public static void main(String[] args) {
//                 meth1 m1 = new meth1();
//                 meth2 m2 = new meth2();
//                 meth3 m3 = new meth3();
//
//
//                 m2.setPriority(Thread.MAX_PRIORITY);
//                 m1.setPriority(Thread.MIN_PRIORITY);
//
//                 m1.start();
//                 m2.start();
//                 m3.start();
//
//
//             }
//             }
















        class myclass1 extends Thread{
            @Override
            public void run() {
                int i =0;
                while (i<=600){
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.println(" aaaaaaaa");
                    i++;
                }
            }
        }

                 class myclass2 extends Thread{
                     @Override
                     public void run() {
                         int i =0;
                         while (i<=600){
                             System.out.println("bbbbbbbbbbb");
                             i++;
                         }
                     }
                 }
        public class multiThreading{
            public static void main(String[] args) {

                myclass1 m1 =new myclass1();
                myclass2 m2 = new myclass2();
               m2.start();
                try {
                    m2.join();
                } catch (Exception e) {
                    System.out.println(e);
                }
                m1.start();
            }
}