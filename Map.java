
        // MAP is an interface where each key and value  pair is an entry.
    // in map key must be unique but values can unique or nonunique.




//import java.util.HashMap;
//public class Map {
//    public static void main(String[] args) {
//
//        HashMap hs = new HashMap();
//        hs.put(01,"ram");
//        hs.put(02,"sam");
//        hs.put(03,"kam");
//        hs.put(04,"nam");
//
//
//        System.out.println(hs);
//
//
//        HashMap hs1 = new HashMap();
//        hs1.put("virat","koli");
//        hs1.put("rahul","singh");
//        hs1.put("ramu","singh");
//        hs1.put("ora","vatiya");
//        hs1.putAll(hs);
//
//        System.out.println(hs1);
//
//
//        HashMap hs2 = new HashMap();
//        hs2.put(null,"ram");
//        hs2.put(02,"sam");
//        hs2.put(03,null);
//        hs2.put(04,"nam");
//        hs2.put(null,null);
//        System.out.println(hs2);
//
//
//        HashMap hs3 = new HashMap();
//        hs3.put(01,"ram");
//        hs3.put(02,"ram");
//        hs3.put(03,"ram");
//        hs3.put(04,"sam");
//        hs3.put(05,"kam");
//        hs3.put(06,"nam");
//
//        System.out.println(hs3);
//
//
//        HashMap hs4 = new HashMap();
//        hs4.put(01,"ram");
//        hs4.put(01,"sam");
//        hs4.put(02,"kam");
//        hs4.put(03,"nam");
//
//
//        System.out.println(hs4);
//
//
//        HashMap<Integer,String > hm = new HashMap<>();
//        hm.put(24,"hjasdh");
//        hm.put(6,"jkldf");
//        hm.put(023,"cjc");
//
//        System.out.println(hm);
//
//    }
//}





//        import java.util.LinkedHashMap;
//
//        public class Map {
//            public static void main(String[] args) {
//
//                LinkedHashMap lh = new LinkedHashMap();
//                lh.put(5,"ss");
//                lh.put(24,"ll");
//                lh.put(57,"aa");
//                lh.put(9,"dd");
//
//                System.out.println(lh);
//            }
//}




//        import java.util.*;
//
//        public class Map{
//       public static void main(String[] args) {
//
//           HashMap hm = new HashMap();
//           hm.put(4,"rahul") ;
//           hm.put(5,"rohan");
//           hm.put(6,"rohit");
//
//           System.out.println(hm.get(5));
//           System.out.println(hm.get(6));
//
//
////           hm.replace(4,"rahull");
////           System.out.println(hm);
////           hm.replace(5,"rohan","sohan");
////           System.out.println(hm);
//
//
//           System.out.println(hm.keySet());
//           System.out.println(hm.values());
//           System.out.println(hm.entrySet());
//
//
//         Set ss= hm.keySet();
//         Iterator itk= ss.iterator();
//         while (itk.hasNext()){
//             System.out.println(itk.next());
//         }
//
//        Collection cm= hm.values();
//         Iterator tcm=cm.iterator();
//         while (tcm.hasNext()){
//             System.out.println(tcm.next());
//         }
//
//         Collection tem=hm.entrySet();
//       Iterator ite = tem.iterator();
//       while (ite.hasNext()){
//           System.out.println(ite.next());
//       }


        
        
        
//        import java.util.Collection;
//        import java.util.HashMap;
//        import java.util.Iterator;
//        import java.util.Set;
//
//        public class Map {
//            public static void main(String[] args) {
//
//                HashMap hm = new HashMap();
//                hm.put(001,"aaaa");
//                hm.put(002,"bbb");
//                hm.put(003,"cccc");
//                hm.put(004,"dddd");
//                hm.put(005,"eeee");
//                System.out.println(hm);
//
//                Set ss=hm.keySet();
//               Iterator tm= ss.iterator();
//               while (tm.hasNext()){
//                 Integer nn=(Integer)  tm.next();
//                   System.out.println(nn);
//               }
//
//                Collection cm=hm.values();
//                Iterator cmm=cm.iterator();
//                while (cmm.hasNext()){
//                    String sm=(String) cmm.next();
//                    System.out.println(sm);
//                }
//
//               Collection em= hm.entrySet();
//               Iterator tem= em.iterator();
//               while (tem.hasNext()){
//                 java.util.Map.Entry eee=(java.util.Map.Entry) tem.next();
//                   System.out.println(eee);
//               }
//
//             Collection ccl=  hm.entrySet();
//               Iterator te=ccl.iterator();
//               while (te.hasNext()){
//                 //  System.out.println(te.next());
//                   
//                   java.util.Map.Entry enm=(java.util.Map.Entry) te.next();
//                   System.out.println(enm);
//
//                 
//
//               }
//
//
//       }
//}





//        import java.util.Collection;
//        import java.util.HashMap;
//        import java.util.Iterator;
//
//        class laptop{
//              int age;
//              String name;
//              String state;
//
//              public laptop(int age,String name,String state){
//                  this.name=name;
//                  this.age=age;
//                  this.state=state;
//              }
//
//              public int getAge(){
//                  return age;
//              }
//              public String getName(){
//                  return name;
//              }
//              public String getState(){
//                  return state;
//              }
//
//              @Override
//              public String toString() {
//                  return age+" "+name+" "+state;
//              }
//          }
//
//
//
//        public class Map {
//            public static void main(String[] args) {
//                laptop l1= new laptop(10,"sankha","west");
//                laptop l2=new laptop(18,"san","bwngal");
//                laptop l3=new laptop(20,"man","dubai");
//
//                HashMap hss= new HashMap();
//                hss.put(1,l1);
//                hss.put(2,l2);
//                hss.put(3,l3);
//
//                System.out.println(hss);
//
//              Collection cm= hss.entrySet();
//             Iterator tm= cm.iterator();
//             while (tm.hasNext()){
//                   // System.out.println(tm);
//               java.util.Map.Entry em= (java.util.Map.Entry) tm.next();
//                 System.out.println(em.getKey()+" "+em.getValue());
//             }
//
//
//
//
//   }
//}





//        import java.util.HashMap;
//        import java.util.Hashtable;
//
//        public class Map {
//            public static void main(String[] args) {
////                Hasht2able ht2 = new Hasht2able();
////                   ht2.put(1,"ram");
////                   ht2.put(2,"sam");
////                   ht2.put(4,"jodu");
////                   ht2.put(5,"madhu");
////                   ht2.putIfAbsent(4,"ramu");
////                   ht2.putIfAbsent(3,"ramu");
////                System.out.println(ht2);
////
////                System.out.println(ht2.keys());
////                System.out.println(ht2.values());
//
//
//
//                Hashtable ht2 = new Hashtable();
//
//                   Integer i = 10;
//                   int n= 100;
//                ht2.put(1,"ram");
//                ht2.put(2,"sam");
//                ht2.put(4,"jodu");
//                ht2.put(5,"madhu");
//                ht2.put(i,"dddd");
//                ht2.put(n,"lllll");
//               // ht2.put(null,"samu");   // Null pointer exception
//                ht2.putIfAbsent(4,"ramu");
//                ht2.putIfAbsent(3,"ramu");
//                System.out.println(ht2);
//
//                System.out.println(ht2.keys());
//                System.out.println(ht2.values());
//
//
//
//            }
//}


//        import java.util.TreeMap;

//
//        public class Map {
//            public static void main(String[] args) {
//
//                TreeMap tm = new TreeMap();
//                tm.put(1,"aaa");
//                tm.put(10,"bb");
//                tm.put(4,"ggg");
//                tm.put(3,"ccc");
//
//                System.out.println(tm);
//            }
//}




//        import java.util.HashMap;
//
//        class one{
//    int age;
//    String name;
//
//    public one(int age,String name){
//        this.age=age;
//        this.name=name;
//    }
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//            @Override
//            public String toString() {
//                return "age" + age + " "+"Name"+"-"+name;
//            }
//       }
//    public class Map{
//        public static void main(String[] args) {
//       one nn1 = new one(20,"sam");
//            HashMap hm =new HashMap();
//            hm.put(1,nn1);
//            System.out.println(hm);
//            System.out.println(hm.keySet());
//            System.out.println(hm.values());
//
//        }
//}


        import java.util.HashMap;
        import java.util.WeakHashMap;

        class employee {
     int id;
     String name;

     public int getId() {
         return id;
     }

     public String getName() {
         return name;
     }

     public employee(int id,String name){
         this.id=id;
         this.name=name;
     }

     @Override
     public String toString() {
         return id+" "+name;
     }
     public void finalize(){
         System.out.println("garbej");
     }

 }
public class Map {
    public static void main(String[] args) {

        employee emp2 = new employee(2221,"hhshs");
        HashMap he2 = new HashMap();
        he2.put(1,emp2);
        System.out.println(he2);

        emp2=null;
        System.gc();      // invoke garbej collector
        System.out.println(he2);



        employee emp = new employee(2221,"hhshs");
        WeakHashMap he = new WeakHashMap();
        he.put(1,emp);
        System.out.println(he);

        emp=null;
        System.gc();
        System.out.println(he);

    }
}

