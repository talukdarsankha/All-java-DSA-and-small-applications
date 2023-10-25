
//
////import java.util.Date;
//
//
//public class APIandAnnotations {
//    public static void main(String[] args) {
//
////        Date dt = new Date();
////        System.out.println(dt);
//
//
//        // Import Package same time
//        java.util.Date dt2 = new java.util.Date();
//        System.out.println(dt2);
//        long dmy = dt2.getTime();
//
//
//        java.sql.Date dtt = new java.sql.Date(dmy);
//        System.out.println(dtt);
//
//
//    }
//}







//
// import java.time.*;
//      public class API_andAnnotations {
//          public static void main(String[] args) {
//
//              System.out.println(LocalDate.now());
//              System.out.println(LocalTime.now());
//
//
//
//
//             LocalDate ld= LocalDate.now();
//              System.out.println(ld);
//             int gdm= ld.getDayOfMonth();
//              Month m=ld.getMonth();
//             int y=ld.getYear();
//              System.out.println(gdm+"/"+m+"/"+y);
//
//
//
//             LocalTime lt= LocalTime.now();
//              System.out.println(lt);
//              int h=lt.getHour();
//             int min= lt.getMinute();
//              int s=lt.getSecond();
//              System.out.println(h+":"+min+":"+s);
//          }
//}







//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.function.Consumer;
//
//public class API_andAnnotations {
//         public static void main(String[] args) {
//
//             ArrayList<Integer> al = new ArrayList<>();
//                  // or
//             List<Integer> arli = new ArrayList<>();
//                     // or
//             List<Integer> arl = Arrays.asList(12,12,3,5,21,36,6);
//
//             System.out.println("for loop");
//             for (int i=0;i<arl.size();i++){
//                 System.out.println(arl.get(i));
//             }
//             System.out.println("for each loop");
//             for (Integer e:arl){
//                 System.out.println(e);
//             }
//             System.out.println("forEach loop");
//
////             Consumer<Integer> co = new Consumer<Integer>() {
////                 @Override
////                 public void accept(Integer n) {
////                     System.out.println(n);
////                 }
////             };
////             arl.forEach(co);
//
//             Consumer<Integer> co = n->  System.out.println(n);
//             arl.forEach(co);
//
//               // or
//             arl.forEach(n-> System.out.println(n));
//
//
//
//
//         }
//}








                     // Stream() Api




//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.stream.Stream;
//
//public class API_andAnnotations {
//    public static void main(String[] args) {
//
//        List<Integer> alist = new ArrayList<>();
//
//        alist.add(100);
//        alist.add(200);
//        alist.add(300);
//        alist.add(400);
//
//       Stream<Integer> stral= alist.stream();
//       stral.forEach(n-> System.out.println(n));
//
////      Iterator tr =stral.iterator();
////      while (tr.hasNext()){
////          System.out.println(tr.next());
////      }
//
//
//      // stral.forEach(n-> System.out.println(n));
//
//    }
//}







//import java.util.LinkedList;
//import java.util.List;
//import java.util.stream.Stream;
//
//public class API_andAnnotations {
//               public static void main(String[] args) {
//                   List<Integer> ll = new LinkedList<>();
//                   ll.add(100);
//                   ll.add(25);
//                   ll.add(458);
//                   ll.add(865);
//                   ll.add(74);
//
//                   System.out.println(ll);
////                 Stream<Integer> stm  = ll.stream();
////                     stm.forEach(n-> System.out.println(n));
////                  stm.forEach(i-> System.out.println(i));
//
//
//
////                  Stream<Integer> sm = ll.stream();
////                 Stream<Integer> sms=sm.sorted();
////                 Stream<Integer> smsm=sms.map(n->n*2);
////                 Stream<Integer>smsmf=smsm.filter(n->n%2==0);
////                 smsmf.forEach(a-> System.out.println(a));
//
//                         // Or
//               Stream<Integer> sm=ll.stream().sorted().map(n->n*2).filter(n->n%2==0);
//               sm.forEach(a-> System.out.println(a));
//
//
//               }
//}










             // *******  enum
     // enum for constant data. enum's all data are capital it .We can't Create enum's object. In enum
    // enum can create outside main class or inside main class
     // In enum we can create constructor, methods(), variables



//   enum color{
//      RED,BLACK,WHITE,BLUE,GREEN
//   }
//        public class API_andAnnotations {
//
//    enum week{
//        MON,TUES,WEDNES,THURS,FRI,SAT,SUN
//    }
//            public static void main(String[] args) {
//
//             //   color c = new color();  // We can't Create enum's object
//
//                color cl = color.RED;
//                System.out.println(cl);
//                color cl2 = color.BLACK;
//                System.out.println(cl2);
//                System.out.println(color.valueOf("RED"));
//               color col[]= color.values();
//               for (color e:col){
//                   System.out.println(e);
//                   System.out.println(e.ordinal());
//               }
//
//               int idx=color.RED.ordinal();
//                System.out.println(idx);
//
//
//
//                week th = week.THURS;
//                System.out.println(th);
//
//
//
//            }
//}









//
//    enum city{
//     INDIA,PAKISTAN,BANGLADESH,SHRILANKA,AMERICA
//
//    }
//        public class API_andAnnotations {
//            public static void main(String[] args) {
//
//                int i=city.AMERICA.ordinal();
//                System.out.println(i);
//               city c= city.INDIA;
//                System.out.println(c);
//            }
//}








//enum result{
//    PASS,FAIL,NORESULT;
//    int marks;
//     result(){
//        System.out.println("This is a constructor of enym");
//    }
//    public void setMarks(int marks){
//         this.marks=marks;
//    }
//    public int getMarks(){
//         return marks;
//    }
//}
//public class API_andAnnotations {
//
//    public static void main(String[] args) {
//
//        result.PASS.setMarks(85);
//        int pm =result.PASS.getMarks();
//        System.out.println(pm);
//
//        result.FAIL.setMarks(30);
//        System.out.println(result.FAIL.getMarks());
//
//        int nm=result.NORESULT.getMarks();
//        System.out.println(nm);
//    }
//}









                 // enum in switch case


//enum result{
//    PASS,FAIL,NORESULT;
//}
//        public class API_andAnnotations {
//            public static void main(String[] args) {
//
//               result res= result.PASS;
//               switch (res){
//                   case PASS :
//                       System.out.println("pass");
//                       break;
//                   case FAIL:
//                       System.out.println("fail");
//                       break;
//                   case NORESULT:
//                       System.out.println("noresult");
//                       break;
//                   default:
//                       System.out.println("Not Mactched");
//               }
//
//
//
//            }
//}













                   // ******  Annotations (In-byilt annotations and Custom annotations




//@FunctionalInterface          // interface annotation
//interface rocket{
//
//   public void  go();
//}
//
//
//class plane{
//    public void fly(){
//        System.out.println("fliing");
//    }
//}
//
//
//@Deprecated                             // class annotation
//class spaceShip{
//    int age = 63;
//    public void visit(){
//        System.out.println("visit space");
//    }
//}
//
//
//class jetplane extends plane{
//@Override                               // method annotation
//    public void fly(){
//        System.out.println("jet plane fliing");
//    }
//}
//
//
//public class API_andAnnotations {
//    public static void main(String[] args) {
//        plane pl = new jetplane();
//        pl.fly();
//    }
//}







                      // Custom annotations


//import java.lang.annotation.*;
//
//@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
//@Retention(RetentionPolicy.RUNTIME)
//  @interface CricketPlayer{
//
//          String name() default "Virat";
//          int rate() default 5;
//    }
//
////    @CricketPlayer(name = "raju",rate = 5)
//@CricketPlayer()
// class play{
//
//   @CricketPlayer
//    int over;
//
//     int run;
//
//        @CricketPlayer
//        public int getOver() {
//            return over;
//        }
//
//        public void setOver(int over) {
//            this.over = over;
//        }
//
//        public int getRun() {
//            return run;
//        }
//
//        public void setRun(int run) {
//            this.run = run;
//        }
//
//
//    }
//
//public class API_andAnnotations {
//    public static void main(String[] args) {
//
//        play pl = new play();
//        pl.setOver(20);
//        pl.setRun(100);
//        System.out.println(pl.getOver());
//        System.out.println(pl.getRun());
//
//        System.out.println();
//
//       Class plc= pl.getClass();
//      Annotation an= plc.getAnnotation(CricketPlayer.class);
//     CricketPlayer cl = (CricketPlayer) an;
//
//        System.out.println(cl.getClass());
//       String nm= cl.name();
//        System.out.println(nm);
//       int ra= cl.rate();
//        System.out.println(ra);
//    }
//}














import javax.management.relation.Role;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
 @interface Myanno{
    String name() default "ramu";
 }

@Myanno
class role{

    public void say(){
        System.out.println("hello");
    }
}
public class API_andAnnotations {
    public static void main(String[] args) {

       role r = new role();
       Class cs=r.getClass();
       Annotation aa=cs.getAnnotation(Myanno.class);
       Myanno mn = (Myanno) aa;

        System.out.println(mn.name());

        r.say();


    }
}