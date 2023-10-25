



       // **** Duplicate elememts are allowed in linkedlist
        // **** collection linkedlist is a doubly linkedlist

           //***** Homogeneous data strore in linkedlist




import java.util.ArrayList;
import java.util.LinkedList;


//public class linkedlist {
//    public static void main(String[] args) {
//        LinkedList<Integer> aa = new LinkedList<>();
//        LinkedList<Integer> llll = new LinkedList<>();
//        llll.add(32);
//        llll.add(4);
//        llll.add(2);
//
//        aa.add(52);
//        aa.add(7);
//        aa.add(3);
//        aa.add(72);
//        aa.add(95);
//
//        aa.addFirst(1);
//        aa.addLast(100);
//
//        // aa.addAll(llll);
//       // aa.addAll(0,llll);
//
//       // aa.add(0,10);
//
//        aa.set(1,20);
//        System.out.println(aa);
//
//        System.out.println(aa.size());
//
//        for (int i=0;i<aa.size();i++){
//            System.out.println(aa.get(i));
//        }
//
//        System.out.println(aa.get(2));
//
//        System.out.println(aa.contains(7));
//
//        System.out.println(aa.indexOf(7));
//
//        aa.remove(aa.size()-1);
//
//        System.out.println(aa);
//
////        aa.clear();
////        System.out.println(aa);
//    }
//}





           // Heterogeneous data store in linkedlist


public class linkedlist {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.add(100);
        ll.add(10.21);
        ll.add(100);
        ll.add("java");
        ll.add('-');
        System.out.println(ll);

        ll.addFirst("linked");
        ll.addFirst("linkedlist");
        ll.addLast(10000);
        System.out.println(ll);

        System.out.println(ll.indexOf(100));
        System.out.println(ll.lastIndexOf(100));

        System.out.println(ll.get(0));
        System.out.println(ll.get(1));

        ll.push(10);
        System.out.println(ll);

        System.out.println(ll.peek());
        System.out.println(ll);

        System.out.println(ll.pop());
        System.out.println(ll);

        System.out.println(ll.poll());
        System.out.println(ll);

        System.out.println(ll.peekFirst());
        System.out.println(ll.peekLast());

        System.out.println(ll.pollFirst());
        System.out.println(ll);
        System.out.println(ll.pollLast());
        System.out.println(ll);


    }
}
