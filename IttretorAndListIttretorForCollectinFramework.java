
 //**** Print Collection Elements


         // ForEach loop and for each loop


         import java.util.ArrayList;
         import java.util.Arrays;
         import java.util.List;
         import java.util.function.Consumer;

         public class IttretorAndListIttretorForCollectinFramework {
    public static void main(String[] args) {

        List<Integer> lc =new ArrayList<>();
        lc.add(126);
        lc.add(6);
        lc.add(546);
        lc.add(9);
        lc.add(86);

        System.out.println("for loop");
        for (int i = 0;i<lc.size();i++){
            System.out.println(lc.get(i));
        }
        System.out.println("for each loop");
        for (Integer e:lc){
            System.out.println(e);
        }


        System.out.println("forEach loop");
//        Consumer<Integer> con = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer i) {
//                System.out.println(i);
//            }
//        };

       // lc.forEach(con);

        Consumer<Integer> con = i->System.out.println(i);

        lc.forEach(con);

        System.out.println();

        lc.forEach(i->System.out.println(i));




        List lb = Arrays.asList(10,263,5465,32,2,7,80);
        System.out.println(lb);

    }
}





        // if print the collectionframework's elements

//        import java.util.ArrayList;
//        import java.util.Iterator;
//        import java.util.ListIterator;
//
//        public class IttretorAndListIttretorForCollectinFramework {
//    public static void main(String[] args) {
//
//        ArrayList<Integer> al = new ArrayList<>();
//        al.add(10);
//        al.add(20);
//        al.add(30);
//        al.add(40);
//        al.add(50);
//
////        for (int i=0;i<al.size();i++){
////            System.out.println(al.get(i));
////        }                                             // Two print approach is not a good approach
////        for (int e: al){
////            System.out.println(e);
////        }
//
//
//        // The better way to print the collection framework's element
//
//       Iterator it= al.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//
//        System.out.println("using listitreator");
//       ListIterator lst= al.listIterator();                   // ListItreator only using list classes
//        while (lst.hasNext()){
//            System.out.println(lst.next());
//        }
//
//        System.out.println("reverse");
//        ListIterator lstt= al.listIterator(al.size());
//        while (lstt.hasPrevious()){
//            System.out.println(lstt.previous());
//        }
//
//    }
//}










        // fail fast

//        import java.util.ArrayList;
//        import java.util.Iterator;
//
//        public class IttretorAndListIttretorForCollectinFramework{
//       public static void main(String[] args) {
//
//           ArrayList<Integer> al = new ArrayList<>();
//
//           al.add(100);
//           al.add(200);
//           al.add(300);
//           al.add(500);
//           al.add(600);
//           al.add(700);
//           System.out.println(al);
//
////           for (int i=0;i<al.size();i++){
////               System.out.println(al.get(i));
////               al.add(10);
////           }
//
//
//           Iterator tt = al.iterator();
//           while (tt.hasNext()){
//               tt.next();
//               al.add(10);
//           }
//       }
//}





//        // fail safe
//
//        import java.util.ArrayList;
//        import java.util.Iterator;
//        import java.util.concurrent.CopyOnWriteArrayList;
//
//        public class IttretorAndListIttretorForCollectinFramework{
//            public static void main(String[] args) {
//
//                CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList<>();
//
//                al.add(100);
//                al.add(200);
//                al.add(300);
//                al.add(500);
//                al.add(600);
//                al.add(700);
//                System.out.println(al);
//
////           for (int i=0;i<al.size();i++){
////               System.out.println(al.get(i));
////               al.add(10);
////           }
//
//
//                Iterator tt = al.iterator();
//                while (tt.hasNext()){
//                    tt.next();
//                    al.add(10);
//                }
//            }
//        }