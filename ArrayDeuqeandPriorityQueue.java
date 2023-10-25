
       // *** Array Deque it can store homogeneous and heterogeneous data.


        // Heterogeneous data store -------

//import java.util.ArrayDeque;
//
//public class ArrayDeuqeandPriorityQueue {
//    public static void main(String[] args) {
//
//        ArrayDeque aq = new ArrayDeque();
//        aq.add(13);
//        aq.add(34);
//        aq.add("java");
//        System.out.println(aq);
//        aq.addFirst(1);
//        aq.addLast("code");
//        System.out.println(aq);
//
//        System.out.println(aq.size());
//        aq.remove(34);
//        System.out.println(aq);
//
//        aq.offer(100);    // offer method work like add but is not sure that is add or not but add method is sure.
//        aq.offerFirst(11);
//        aq.offerLast(1000);
//        System.out.println(aq);
//    }
//}






       // Homogenous data storing in ArrayDeque
//
//       import java.util.ArrayDeque;
//
//       public class ArrayDeuqeandPriorityQueue {
//           public static void main(String[] args) {
//
//               ArrayDeque<String > aq = new ArrayDeque<>();
//
//               aq.add("java");
//               aq.add("course");
//               System.out.println(aq);
//           }
//}








       //*** Priority Queue
       // Priority queue works like tree structure it can be store number type data


       import java.util.PriorityQueue;

       public class ArrayDeuqeandPriorityQueue{
       public static void main(String[] args) {

           PriorityQueue  pq = new PriorityQueue();

           pq.add(10);
           pq.add(19);
           pq.add(150);
           pq.add(290);
           pq.add(500);
           pq.add(30);

           System.out.println(pq);
           pq.add(45);
           pq.add(5);
           System.out.println(pq);


           // Or

           PriorityQueue<String > pp=new PriorityQueue<>();
           pp.add("ja");
           pp.add("va");
           pp.add("pw");
           pp.add("stack");
           System.out.println(pp);


           // Or

           PriorityQueue<Integer> pqq = new PriorityQueue<>();
           pqq.add(174);
           pqq.add(354);
           pqq.add(52);
           pqq.add(4);
           pqq.add(35);
           pqq.add(635);
           System.out.println(pqq);

       }
}

