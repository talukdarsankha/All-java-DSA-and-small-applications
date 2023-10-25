import javax.sql.rowset.spi.TransactionalWriter;
import java.util.*;

//public class generics {
//    public static void main(String[] args) {
//
//        String [] ar = {"java","spring","rest"};
//
//        String f1 = ar[0];
//        String f2= ar[2];
//
//
//
//
//    }
//}









        // Generics is this  <> type secifiers



import java.util.ArrayList;

//class one{
//    int date;
//    String name;
//    public one(int date,String  nam){
//        this.name=nam;
//        this.date=date;
//    }
//}
//class two{
//    int date;
//    String name;
//    String city;
//    public two(int date,String  nam, String city){
//        this.name=nam;
//        this.date=date;
//        this.city=city;
//
//    }
//}
//public class generics {
//    public static void main(String[] args) {
//
//
//        ArrayList<String> al = new ArrayList<String >();
//        al.add("pw");
//        al.add("skills");
//        //  al.add(10); // it throw error brcause using string type of  generics
//
//
//        one n1= new one(12,"sam");
//        one n2=new one(1,"ram",);
//        one n3= new one(30,"jodu");
//
//        two tw = new two(30,"raju","west");
//
//        ArrayList<one> aa= new ArrayList<one>();
//       aa.add(n1);
//       aa.add(n2);
//       aa.add(n3);
//      // aa.add(tw);  it is not to be add because one class generics is here.so two class obj not allowed.
//
//    }
//}








//class  myclass<T>{
//
//    T a;
//    public myclass(T ob){
//        this.a=ob;
//    }
//
//    public T getA() {
//        return a;
//    }
//
//
//
//}
//public class generics {
//    public static void main(String[] args) {
//
//        myclass<Integer> mm = new myclass<Integer>(10);
//        System.out.println(mm.getA());
//
//        myclass<String > mm2 = new myclass<String>("pw");
//        System.out.println(mm2.getA());
//
//    }
//}










//class mob <T>{
//    T a;
//    public mob(T a){
//        this.a=a;
//    }
//    public T getA(){
//        return a;
//    }
//}
//class tab{
//    int a;
//    public tab(int a){
//        this.a=a;
//    }
//
//    public int getA() {
//        return a;
//    }
//}
//
//  public class generics {
//      public static void main(String[] args) {
//          mob<Integer> mb = new mob<>(2);
//          System.out.println(mb.getA());
//      }
//}







//   class Students{
//       String name;
//       String city;
//       public Students(String name,String city){
//           this.name=name;
//           this.city=city;
//       }
//
//       public String getName() {
//           return name;
//       }
//
//       public String getCity() {
//           return city;
//       }
//
//       @Override
//       public String toString() {
//           return name+" "+city;
//       }
//   }
//   public class generics {
//       public static void main(String[] args) {
//           Students emp1 = new Students("sushank","Delhi");
//           Students emp2=new Students("Mayank","Indore");
//           Students emp3=new Students("Mayur","Mumbai");
//
//           HashMap hm = new HashMap();
//           hm.put(1,emp1);
//           hm.put(2,emp2);
//           hm.put(3,emp3);
//
//           System.out.println(hm.keySet());
//           System.out.println(hm.values());
//           System.out.println(hm.entrySet());
//       }
//}



          // inbuilt methods in Collection

//public class generics {
//    public static void main(String[] args) {
//
//        LinkedList ld = new LinkedList();
//        ld.add(100);
//        ld.add(12);
//        ld.add(54);
//        ld.add(351);
//
//        Collections.sort(ld);  // in-Built method in Collection
//        System.out.println(ld);
//    }
//}








     // comparator and comparable
   // For sort Collection in complex situation we use comparator and comparable but when the class is
   // non-accessible then we use comparator and when class is accessible then we use comparable.




//   class worker {
//       String name;
//       int age;
//       String City;
//
//
//       public worker(String name, int age, String city) {
//           this.name = name;
//           this.age = age;
//           this.City = city;
//       }
//       @Override
//       public String toString(){
//           return name+" "+age+" "+City;
//       }
//
//   }
//
//   class mycls implements Comparator<worker>{
//
//       @Override
//       public int compare(worker o1, worker o2) {
//           if (o1.age<o2.age){
//               return 1;     // for swap Write 1;
//           }else {
//               return -1;   // For non swap write return-1
//           }
//       }
//   }
//       public class generics {
//           public static void main(String[] args) {
//
//               worker wr = new worker("Robbin", 19, "India");
//               worker wr2 = new worker("Jakobus", 60, "uk");
//               worker wr3 = new worker("Lily", 20, "Africa");
//
//               ArrayList<worker> al = new ArrayList<>();
//               al.add(wr);
//               al.add(wr2);
//               al.add(wr3);
//
//           //  Collections.sort(al);
//               System.out.println(al);
//
//               mycls mc =new mycls();
//               Collections.sort(al,mc);
//               System.out.println(al);
//
//           }
//       }




                   // or

//class worker {
//    String name;
//    int age;
//    String City;
//
//
//    public worker(String name, int age, String city) {
//        this.name = name;
//        this.age = age;
//        this.City = city;
//    }
//    @Override
//    public String toString(){
//        return name+" "+age+" "+City;
//    }
//
//}
//
//
//
//public class generics {
//    public static void main(String[] args) {
//
//        worker wr = new worker("Robbin", 19, "India");
//        worker wr2 = new worker("Jakobus", 60, "uk");
//        worker wr3 = new worker("Lily", 20, "Africa");
//
//        ArrayList<worker> al = new ArrayList<>();
//        al.add(wr);
//        al.add(wr2);
//        al.add(wr3);
//
//        //  Collections.sort(al);
//        System.out.println(al);
//
//       Comparator<worker> cm =(worker o1, worker o2)-> {
//               if (o1.age<o2.age){
//                   return 1;
//               }else {
//                   return -1;
//               }
//       };
//
//
//
//       Collections.sort(al,cm);
//        System.out.println(al);
//
//    }
//}


                         // or


//class worker {
//    String name;
//    int age;
//    String City;
//
//
//    public worker(String name, int age, String city) {
//        this.name = name;
//        this.age = age;
//        this.City = city;
//    }
//    @Override
//    public String toString(){
//        return name+" "+age+" "+City;
//    }
//
//}
//
//
//
//public class generics {
//    public static void main(String[] args) {
//
//        worker wr = new worker("Robbin", 19, "India");
//        worker wr2 = new worker("Jakobus", 60, "uk");
//        worker wr3 = new worker("Lily", 20, "Africa");
//
//        ArrayList<worker> al = new ArrayList<>();
//        al.add(wr);
//        al.add(wr2);
//        al.add(wr3);
//
//        //  Collections.sort(al);
//        System.out.println(al);
//
//
//
//
//
//        Collections.sort(al,
//                (worker o1,worker o2)->{
//            if (o1.age<o2.age){
//                return 1;
//            }else {
//                return -1;
//            }
//                });
//        System.out.println(al);
//
//    }
//}






             // Comparable


class mycls implements Comparable<mycls>{
    String name;
    int age;
    int id;
    public mycls(String  name,int age,int id){
        this.name=name;
        this.age=age;
        this.id=id;
    }

    @Override
    public String toString() {
        return name +" "+age+" "+id;
    }

    @Override
    public int compareTo(mycls o) {
        if (this.id>o.id){
            return 1;
        }else {
            return -1;
        }
    }
}
public class generics {
    public static void main(String[] args) {
        mycls m1= new mycls("ramu",20,4001);
        mycls m2= new mycls("ramu",22,4023);
        mycls m3= new mycls("ramu",16,4010);

        ArrayList al = new ArrayList();
        al.add(m1);
        al.add(m2);
        al.add(m3);
        System.out.println(al);

        Collections.sort(al);
        System.out.println(al);

    }
}



//import java.util.ArrayList;
//        import java.util.Collections;
//        import java.util.Comparator;
//
////class mycl {
////    String name;
////    int age;
////    public mycl(String name, int age){
////        this.age=age;
////        this.name=name;
////    }
////
////    @Override
////    public String toString() {
////        return name+" "+age;
////    }
////}
//////class oth implements Comparator<mycl>{
//////
//////    @Override
//////    public int compare(mycl o1, mycl o2) {
//////        if (o1.age<o2.age){
//////            return 1;
//////        }else {
//////            return -1;
//////        }
//////    }
//////}
////public class generics {
////    public static void main(String[] args) {
////
////        mycl m1= new mycl("rohit",20);
////        mycl m2= new mycl("anurag",45);
////        mycl m3= new mycl("bali",10);
////        mycl m4 = new mycl("rumpam",23);
////
////        ArrayList at = new ArrayList<>();
////        at.add(m1);
////        at.add(m2);
////        at.add(m3);
////        at.add(m4);
////
////
////        System.out.println(at);
////
//////        oth ob = new oth();
////
//////        Comparator<mycl> cm =(mycl o1, mycl o2)->  {
//////                if (o1.age<o2.age){
//////                    return 1;
//////                }else {
//////                    return -1;
//////                }
//////            };
////
////      // Collections.sort(at.ob);
////
//////  Collections.sort(at,cm);
////
////        Collections.sort(at,(mycl o1, mycl o2)->  {
////            if (o1.age<o2.age){
////                return 1;
////            }else {
////                return -1;
////            }
////        });
////        System.out.println(at);
////    }
////}
//
//
//
//
//class mycl implements Comparable<mycl>{
//    String name;
//    int age;
//    public mycl(String name, int age){
//        this.age=age;
//        this.name=name;
//    }
//
//    @Override
//    public String toString() {
//        return name+" "+age;
//    }
//
//    @Override
//    public int compareTo(mycl o) {
//        if (this.age<o.age){
//            return 1;
//        }else {
//            return -1;
//        }
//    }
//}
//
//public class generics {
//    public static void main(String[] args) {
//
//        mycl m1= new mycl("rohit",20);
//        mycl m2= new mycl("anurag",45);
//        mycl m3= new mycl("bali",10);
//        mycl m4 = new mycl("rumpam",23);
//
//        ArrayList at = new ArrayList<>();
//        at.add(m1);
//        at.add(m2);
//        at.add(m3);
//        at.add(m4);
//
//
//        System.out.println(at);
//
//        Collections.sort(at);
//        System.out.println(at);
//    }
//}
