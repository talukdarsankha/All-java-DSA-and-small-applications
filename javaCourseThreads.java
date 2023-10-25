//public class javaCourseThreads {
//    public static void main(String[] args) {
//
//        // main Thread
//
//        System.out.println("before any change");
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
//
//        System.out.println("after change main Thread ");
//       Thread t = Thread.currentThread();
//       t.setName("my thread");
//       t.setPriority(8);
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
//
//    }
//}






//class myclass extends Thread{
//    @Override
//    public void run() {
//        System.out.println(" amar thread");
//    }
//}
//public class javaCourseThreads {
//    public static void main(String[] args) {
//
//        myclass mc = new myclass();
//        mc.start();
//        mc.setName("threading");
//        mc.setPriority(9);
//        System.out.println(mc.getName());
//        System.out.println(mc.getPriority());
//
//    }
//}


//import java.util.Scanner;
//
//class one extends Thread{
//    @Override
//    public void run() {
//        int j=0;
//        while (j<=20) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("enter a");
//            int a = sc.nextInt();
//            System.out.println(a);
//
//            j++;
//        }
//    }
//}
//class two extends Thread{
//    @Override
//    public void run() {
//        for (int i=0;i<100;i++){
//            System.out.println(i);
//        }
//    }
//}
//public class javaCourseThreads {
//    public static void main(String[] args) {
//
//        one t1 = new one();
//        two t2 = new two();
//        t1.start();
//        t2.start();
//    }
//}







//class mythread1 extends Thread{
//    @Override
//    public void run() {
//        for (int i=0;i<200;i++){
//            System.out.println(i);
//        }
//    }
//}
//class mythread2 extends Thread{
//    @Override
//    public void run() {
//        for (int i =0;i<=400;i++){
//            System.out.println("*");
//
//        }
//    }
//}
//public class javaCourseThreads {
//    public static void main(String[] args) {
//
//        mythread1 t1 = new mythread1();
//        mythread2 t2 =new mythread2();
//
//        t1.start();
//        t2.start();
//    }
//}



//
//               // Thread sleep
//
//class mythread1 extends Thread{
//    @Override
//    public void run() {
//        for (int i=0;i<200;i++){
//            System.out.println(i);
//        }
//    }
//}
//class mythread2 extends Thread{
//    @Override
//    public void run() {
//        for (int i =0;i<=400;i++){
//            System.out.println("*");
//
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
//
//        }
//    }
//}
//public class javaCourseThreads {
//    public static void main(String[] args) {
//
//        mythread1 t1 = new mythread1();
//        mythread2 t2 =new mythread2();
//
//        t1.start();
//        t2.start();
//    }
//}






//            // implementing Thread
//
//
//class mythread1 implements Runnable{
//    @Override
//    public void run() {
//        for (int i=0;i<200;i++){
//            System.out.println(i);
//        }
//    }
//}
//class mythread2 implements Runnable{
//    @Override
//    public void run() {
//        for (int i =0;i<=400;i++){
//            System.out.println("*");
//
//        }
//    }
//}
//public class javaCourseThreads {
//    public static void main(String[] args) {
//
//        mythread1 m1 = new mythread1();
//        mythread2 m2 =new mythread2();
//
//
//        Thread t1 =new Thread(m1);
//        Thread t2 = new Thread(m2);
//
//        t1.start();
//        t2.start();
//
//    }
//}







//         // Thread extend , implement
//
//
//
//class demo{
//
//}
//class mythread1 extends  demo implements Runnable{
//    @Override
//    public void run() {
//        for (int i=0;i<200;i++){
//            System.out.println(i);
//        }
//    }
//}
//class mythread2 extends demo implements Runnable{
//    @Override
//    public void run() {
//        for (int i =0;i<=400;i++){
//            System.out.println("*");
//
//        }
//    }
//}
//public class javaCourseThreads {
//    public static void main(String[] args) {
//
//        mythread1 m1 = new mythread1();
//        mythread2 m2=new mythread2();
//
//        Thread  tt = new Thread(m1);
//        Thread tt2 = new Thread(m2);
//
//        tt.start();
//        tt2.start();
//    }
//}







              // Multiple Threads in single run() method
     // ex--

//class laptop extends Thread {
//
//   public void run(){
//
//       String name = Thread.currentThread().getName();
//       if (name.equals("lp thread")){
//           meth1();
//       }else {
//           meth2();
//       }
//   }
//
//   public void meth1(){
//       for (int i =0;i<=100;i++){
//           System.out.println(i);
//       }
//   }
//
//   public void meth2(){
//       for (int i =0;i<=100;i++){
//           System.out.println("*");
//       }
//   }
//}
//public class javaCourseThreads {
//    public static void main(String[] args) {
//
//        laptop lp = new laptop();
//        laptop lp2 = new laptop();
//
//        lp.setName("lp thread");
//       lp2.setName("lp2 thread");
//
//       lp.start();
//       lp2.start();
//    }
//}








          // join() and is Alive() method

// join()

//class mythread1 extends Thread{
//    @Override
//    public void run() {
//        for (int i=0;i<200;i++){
//            System.out.println(i);
//        }
//    }
//}
//class mythread2 extends Thread{
//    @Override
//    public void run() {
//        for (int i =0;i<=400;i++){
//            System.out.println("*");
//
//            try {
//                Thread.sleep(20);
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
//
//        }
//    }
//}
//public class javaCourseThreads {
//    public static void main(String[] args) {
//
//        mythread1 t1 = new mythread1();
//        mythread2 t2 =new mythread2();
//
//          t1.start();
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }
//
//        t2.start();
//
//
//
//    }
//}



//class mythread1 extends Thread{
//    @Override
//    public void run() {
//        for (int i=0;i<200;i++){
//            System.out.println(i);
//        }
//    }
//}
//class mythread2 extends Thread{
//    @Override
//    public void run() {
//        for (int i =0;i<=400;i++){
//            System.out.println("*");
//
//        }
//    }
//}
//public class javaCourseThreads {
//    public static void main(String[] args) {
//
//        mythread1 t1 = new mythread1();
//        mythread2 t2 =new mythread2();
//
//        t2.start();
//
//        try {
//            t2.join();
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }
//
//        t1.start();
//
//    }
//}



        // isAlive();

//class mov extends Thread{
//    public void run(){
//        int i = 0;
//        while (i<=100){
//            System.out.println(i +" *");
//            i++;
//        }
//    }
//}
//public class javaCourseThreads {
//    public static void main(String[] args) {
//
//
//        mov mm = new mov();
//        System.out.println(mm.isAlive());
//        mm.start();
//        System.out.println(mm.isAlive());
//    }
//}
//




          //  synchronized keyword in Thread

//class computer extends Thread{
//
//  synchronized   public void run(){
//
//
//        System.out.println(" drive car");
//        System.out.println(" speed up car");
//        System.out.println("park car");
//    }
//}
//public class javaCourseThreads {
//    public static void main(String[] args) {
//
//        computer c1 = new computer();
//        computer c2 = new computer();
//        computer c3 = new computer();
//
//
//        c1.start();
//        c2.start();
//        c3.start();
//    }
//}




//
//class monitor extends Thread{
//
// public void run() {
//
//     System.out.println(" drive car");
//         System.out.println(" speed up car");
//     synchronized (this){
//         System.out.println("ammamam");
//         System.out.println("bbbbbbb ");
//         System.out.println("llllllll");
//         System.out.println("ssssssssss");
//     }
//     }
//}
//public class javaCourseThreads {
//    public static void main(String[] args) {
//        monitor m1 = new monitor();
//        monitor m2 = new monitor();
//        monitor m3 = new monitor();
//
//        m1.start();
//        m2.start();
//        m3.start();
//    }
//}





             // Interrupt() metohd
 //*** Interrupt() method on working when thread is running state if thread is in waiting state [ sleep() or join() ] then it works.

 // ex-

//class one extends Thread{
//
//    public void run(){
//        for (int i=0;i<10;i++) {
//            System.out.println("coding on threading");
//            try {
//                Thread.sleep(20);
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
//
//        }
//    }
//}
//public class javaCourseThreads {
//    public static void main(String[] args) {
//
//        one n = new one();
//        n.start();
//        n.interrupt();
//
//
//    }
//}




//class one extends Thread{
//
//
//    public void run() {
//        for (int i=0;i<10;i++) {
//            System.out.println("coding on threading");
//            try {
//                Thread.sleep(154);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//
//        }
//    }
//}
//public class javaCourseThreads {
//    public static void main(String[] args) {
//
//        one n1 =new one();
//
//        one n2 = new one();
//      n1.start();
//      n1.interrupt();
//      n2.start();
//
//      n2.interrupt();
//
//    }
//}








//class one implements Runnable{
//    @Override
//    public void run() {
//        for (int i=0;i<=100;i++){
//            System.out.println("*");
//        }
//    }
//}
//class two implements Runnable{
//    @Override
//    public void run() {
//        for (int i=0;i<=100;i++){
//            System.out.println("--");
//        }
//    }
//}
//class three implements Runnable{
//    @Override
//    public void run() {
//        for (int i=0;i<=100;i++){
//            System.out.println("=-->");
//        }
//    }
//}
//public class javaCourseThreads {
//    public static void main(String[] args) {
//
//        one o = new one();
//        two t = new two();
//        three th = new three();
//
//        Thread thr1 = new Thread(o);
//        Thread thr2 = new Thread(t);
//        Thread thr3 = new Thread(th);
//
//        thr1.start();thr2.start();
//        thr3.start();
//
//    }
//}





//           // multiple thread in single run()  method
//
//class practice implements Runnable{
//    @Override
//    public void run() {
//        if (Thread.currentThread().getName().equals("second")){
//            meth2();
//        }else {
//            meth1();
//        }
//    }
//
//    public void meth1(){
//
//        for (int i=0;i<=100;i++){
//            System.out.println("=-->");
//        }
//
//
//    }
//
//    public void meth2(){
//
//        for (int i=0;i<=100;i++){
//            System.out.println("<--=");
//        }
//
//
//    }
//}
//
//public class javaCourseThreads {
//    public static void main(String[] args) {
//
//        practice p1 = new practice();
//        practice p2 =new practice();
//
//        Thread th1 = new Thread(p1);
//        Thread th2 = new Thread(p2);
//        th1.setName("first");
//        th2.setName("second");
//
//        th1.start();
//        th2.start();
//    }
//}




//               //  synchronized   key word        it use when multiple thread's single resource
//
//         class project extends Thread{
//
//    // method synchronized
////           @Override
////          synchronized    public void run() {
////
////                 System.out.println("aaaaaaaa  "+Thread.currentThread().getName());
////                 System.out.println("bbbbbbbb  "+Thread.currentThread().getName());
////                 System.out.println("ccccccccccc   "+Thread.currentThread().getName());
////                 System.out.println("dddddddddd  "+Thread.currentThread().getName());
////             }
//
//
//            //  block synchronized
//
//             @Override
//             public void run() {
//
//                 System.out.println("aaaaaaaa  "+Thread.currentThread().getName());
//
//                 synchronized (this)
//                 {
//                     System.out.println("bbbbbbbb  " + Thread.currentThread().getName());
//                     System.out.println("ccccccccccc   " + Thread.currentThread().getName());
//                     System.out.println("dddddddddd  " + Thread.currentThread().getName());
//                 }
//             }
//         }
//public class javaCourseThreads {
//    public static void main(String[] args) {
//        project p1 = new project();
//        project p2 = new project();
//        project p3 = new project();
//        project p4 = new project();
//
//        p1.setName("first");
//        p2.setName("second");
//        p3.setName("third");
//        p4.setName("fourth");
//
//        p1.start();
//        p2.start();
//        p3.start();
//        p4.start();
//    }
//}







      // Two thread comunication ex like- poducer consumer threading



//class intarecter {
//    int x;
//    boolean flag=true;
//    synchronized public void produce(int a){
//
//        try{
//            if (flag==true){
//
//                x=a;
//                System.out.println("produeses"+x);
//                flag=false;
//                notify();
//            }else {
//                wait();
//            }
//
//        }catch (Exception e){
//            System.out.println(e);
//        }
//
//    }
//    synchronized public void consume() {
//        try{
//            if (flag==false){
//            System.out.println("consumes"+x);
//            flag=true;
//            notify();
//        }else {
//            wait();
//        }
//        }catch (Exception e){
//            System.out.println(e);
//        }
//
//    }
//}
//class producer extends Thread{
//    intarecter nn;
//    public producer(intarecter inta){
//        this.nn=inta;
//    }
//    @Override
//    public void run() {
//        int i=0;
//        while (true){
//            nn.produce(i++);
//               //i++;
//        }
//
//    }
//}
//
//class consumer extends Thread{
//    intarecter nn;
//    public consumer(intarecter nn){
//        this.nn=nn;
//    }
//    @Override
//    public void run() {
//
//        while (true){
//            nn.consume();
//        }
//    }
//}
//public class javaCourseThreads {
//    public static void main(String[] args) {
//        intarecter n =new intarecter()
//        producer p=new producer(n);
//        consumer c=new consumer(n);
//        p.start();
//        c.start();
//    }
//}





          // Two thread comunication ex like- poducer consumer threading

//class intarecter{
//    int a;
//    boolean flag = true;
//   synchronized public void produce(int a){
//        try {
//            if (flag==true){
//                wait();
//            }  else {
//                this.a=a;
//                System.out.println("produce"+a);
//                flag=true;
//                notify();
//            }
//        }catch (Exception e){
//            System.out.println(e);
//        }
//
//
//    }
//
//   synchronized public void consume(){
//       try {
//          if (flag==false){
//              wait();
//          }else {
//              System.out.println("consume"+a);
//          flag=false;
//          notify();
//          }
//       }catch (Exception e){
//           System.out.println(e);
//       }
//    }
//}
//
//class producer implements Runnable{
//
//    intarecter ic;
//    public producer(intarecter inta){
//        this.ic=inta;
//    }
//    @Override
//    public void run() {
//        int a=1;
//        while (true){
//            ic.produce(a++);
//            //a++;
//        }
//    }
//}
//class consumer implements Runnable{
//    intarecter inta;
//    public consumer(intarecter inta){
//        this.inta=inta;
//    }
//
//    @Override
//    public void run() {
//        while (true){
//            inta.consume();
//        }
//    }
//}
//public class javaCourseThreads {
//    public static void main(String[] args) {
//
//        intarecter inc = new intarecter();
//        producer pc = new producer(inc);
//        consumer cm = new consumer(inc);
//
//        Thread th = new Thread(pc);
//        Thread th2=new Thread(cm);
//        th.start();
//        th2.start();
//    }
//}
