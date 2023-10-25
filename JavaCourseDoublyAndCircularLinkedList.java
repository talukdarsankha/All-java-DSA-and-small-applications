







//public class JavaCourseDoublyAndCircularLinkedList {
//
//    Node head;
//    Node tail;
//   static class Node{
//        int val;
//        Node next;
//        Node prev;
//        Node(int d){
//            this.val=d;
//            this.next=null;
//            this.prev=null;
//        }
//    }
//
//    public static void displayFromHead(Node nod){  // this mehods are static because Node class is static
//       Node temp=nod;
//       while (temp!=null){
//           System.out.print(temp.val+" ");
//           temp=temp.next;
//       }
//        System.out.println();
//    }
//
//    public static void displayFromTail(Node nnn){
//       Node temp = nnn;
//       while (temp!=null){
//           System.out.print(temp.val+" ");
//           temp=temp.prev;
//       }
//        System.out.println();
//    }
//
//    public void displayFromAnyNode(Node nnn){
//       Node temp=nnn;
//       while (temp.prev!=null){
//           temp=temp.prev;
//       }
//       while (temp!=null){
//           System.out.print(temp.val+" ");
//           temp=temp.next;
//       }
//        System.out.println();
//
//    }
//    public static void main(String[] args) {
//        Node a = new Node(10);
//        Node b = new Node(20);
//        Node c = new Node(30);
//        Node d = new Node(40);
//        Node e = new Node(50);
//
//        a.next=b;
//        b.next=c;
//        c.next=d;
//        d.next=e;
//        e.next=null;
//
//        e.prev=d;
//        d.prev=c;
//        c.prev=b;
//        b.prev=a;
//        a.prev=null;
//
//
//        JavaCourseDoublyAndCircularLinkedList ll = new JavaCourseDoublyAndCircularLinkedList();
//        ll.head=a;
//        ll.tail=e;
//        displayFromHead(ll.head);
//        displayFromTail(ll.tail);
//        ll.displayFromAnyNode(c);         // because this method not static
//
//
//
//
//    }
//}







               //  Doubly Linkedlist ---------------->>>>
//
//import org.w3c.dom.traversal.NodeIterator;
//
//public class JavaCourseDoublyAndCircularLinkedList {
//    Node head;
//    Node tail;
//    class Node{
//        int data;
//        Node next;
//        Node previ;
//        Node(int d){
//            this.data=d;
//            this.next=null;
//            this.previ=null;
//        }
//    }
//
//    public void insertionAtfast(int val){    //  insertionAtfast or head ------->>>
//        Node nn = new Node(val);
//        if (head==null){
//            head=nn;
//            tail=nn;
//            return;
//        }
//        nn.next=head;
//        head.previ=nn;
//        head=nn;        // now original head will be update for this line of code.
//       return ;
//    }
//
//    public void insertionAtTail(int val){     // insertionAtTail--------->>>>>
//        Node nn = new Node(val);
//        Node temp=head;
//        if (head==null){
//            head=nn;
//            tail=nn;
//            return;
//        }
//        while (temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next=nn;
//        nn.previ=temp;
//       tail=nn;
//    }
//
//    public void insertionAtTailByTail(int val){            // insertionAtTailByTail ----------------->>>>>>>
//        Node temp = tail;
//        Node nn = new Node(val);
//        if (tail==null){
//            tail=nn;
//            return;
//        }
//        temp.next=nn;
//        nn.previ=tail;
//        tail=nn;
//    }
//
//    public  void  insertionOrAddAnyPosition(int posi,int vall){   //  insertionOrAddAnyPosition -------->>> // 0 based index bese
//
//        Node nn =new Node(vall);
//        Node temp =head;
//        if(head==null){
//            return;
//        }
//        if (posi==0){
//            head=nn;
//            tail=nn;
//        }
//        for (int i=0;i<=posi-1 && temp.next!=null;i++){
//            temp=temp.next;
//        }
//        nn.next=temp;
//        temp.previ.next=nn;
//        nn.previ=temp.previ;
//        temp.previ=nn;
//
//
//    }
//
//    public void deleteHead(){     //deleteHead-------------->>>>>>
//        if (head==null){
//            return;
//        }
//
//        head=head.next;
//        head.previ=null;
//
//    }
//    public void deleteTailOrEnd(){       // deleteTailOrEnd---------------->>>>>>
//        Node temp=head;
//        if (head==null){          // becuase head ==null means tail == null
//            return;
//        }
//        while (temp.next!=null){
//            temp=temp.next;
//        }
//        temp.previ.next=null;
//        temp.previ=null ;
//        tail=temp;
//    }
//
//    public void deleteAnyPositionNode(int position){         //  deleteAnyPositionNode ----------->>>>>>>>
//
//        Node temp=head;
//        if (head==null){
//            return;
//        }
//        if (position==0){
////            head=head.next;
////            head.previ=null;
//            deleteHead();
//            return;
//        }
//        for (int i=0;i<=position-1 && temp.next!=null;i++){
//            temp=temp.next;
//        }
//        if (temp==null||temp.next==null){
//            return;
//        }
//        temp.previ.next=temp.next;
//        temp.next.previ=temp.previ;
//        temp.next=null;
//        temp.previ=null;
//
//
//    }
//
//
//                //  qu --  doubly linkedlist is palindrome or not  --------------->>>>>>
//
//     public  boolean isPalindroem(){         //  qu --  doubly linkedlist is palindrome or not  --------------->>>>>>
//         Node temp =head;
//         while (temp.next!=null){
//             temp=temp.next;
//         }
//
//         Node temp2=temp;
//         temp=head;
//
//         while (temp!=temp2) {
//             if (temp.data!=temp2.data){
//                 return false;
//             }else {
//                 temp=temp.next;
//                 temp2=temp2.previ;
//             }
//         }
//         return true;
//
//     }
//
//
//                 //  Two node sum of a sorted LinkedList  equal to target ----------------->>>>>>
//
//       public boolean targetSum(int target) {   //  Two node sum of a sorted LinkedList  equal to target ----------------->>>>>>
//           Node temp = head;                      //  ex- 2,5,7,9  target = 12
//           while (temp.next != null) {
//               temp = temp.next;
//           }
//
//           Node temp2 = temp;
//           temp=head;
//
//           while (temp!=temp2){
//               if (temp.data+temp2.data==target){
//                   return true;
//               }else if (temp.data+temp2.data>target){
//                   temp2=temp2.previ;
//               }else {
//                   temp=temp.next;
//               }
//           }
//           return false;
//       }
//
//
//                   // Critical point max and min distance ------------>>>>>>>>
//
//         public void critical_point_max_min_dist(){
//           Node temphead = head.next;              // because tail and head node can't be critical point
//           Node tempTail = tail.previ;
//           Node p1=temphead;
//           Node p2=tempTail;
//
//           while (){
//               if (temphead.data>temphead.previ.data && temphead.data>temphead.next.data ){
//                   p1=temphead;
//               }else {
//                   p1=temphead;
//               }
//               temphead=tempTail.next;
//
//           }
//
//         }
//
//
//
//
//    public void displayFromHead(){             //    displayFromHead -------------->>>>>
//        Node temp=head;
//        while (temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
//        System.out.println();
//
//    }
//    public void displayFromTail() {               // displayFromTail --------------->>>>>
//        Node temp = tail;
//        while (temp != null) {
//            System.out.print(temp.data+" ");
//            temp = temp.previ;
//        }
//        System.out.println();
//    }
//
//    public void displayFromAnyNode(Node nn){          //   displayFromAnyNode------------->>>>>>>>>
//        Node temp=nn;
//        while (temp.next!=null){
//            temp=temp.previ;
//        }
//        while (temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        JavaCourseDoublyAndCircularLinkedList ll =new JavaCourseDoublyAndCircularLinkedList();
//
////        ll.insertionAtfast(10);
////        ll.insertionAtfast(20);
////        ll.insertionAtTail(30);
////        ll.insertionAtTail(35);
////        ll.insertionAtTailByTail(40);
////
////
////        ll.displayFromHead();
////        ll.displayFromTail();
////
////        ll.insertionOrAddAnyPosition(2,70);
////        ll.displayFromHead();
////
////        ll.deleteHead();
////        ll.displayFromHead();
////        ll.deleteTailOrEnd();
////        ll.displayFromHead();
////
////        ll.deleteAnyPositionNode(1);
////        ll.displayFromHead();
//
//
//                       //   palindrome
////        ll.insertionAtfast(1);
////        ll.insertionAtfast(2);
////        ll.insertionAtfast(2);
////        ll.insertionAtfast(1);
////
////        ll.displayFromHead();
////        System.out.println(ll.isPalindroem());
//
//        ll.insertionAtfast(70);
//        ll.insertionAtfast(60);
//        ll.insertionAtfast(40);
//        ll.insertionAtfast(10);
//
//        ll.displayFromHead();
//        System.out.println(ll.targetSum(100));
//
//
//    }
//}






                      // circular Linkedlist  type =  1.singly circular and 2. doubly circular

                 //    1.singly circular
//
//import com.sun.source.tree.WhileLoopTree;
//
//public class JavaCourseDoublyAndCircularLinkedList {
//
//    Node head;
//   static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//
//    public void deleteHead(){       //      deleteHead  --------------->>>>>>>
//       Node temp =head;
//        while (temp.next!=head){
//            temp=temp.next;
//        }
//
//        head=head.next;
//        temp.next=head;
//    }
//
//    public void display(){              //   display------------->>>>
//       Node temp =head;
//       while (temp.next!=head){
//           System.out.print(temp.data+" ");
//           temp=temp.next;
//       }
//        System.out.println(temp.data+" ");
////        System.out.println();
//    }
//
//  public void displayFromAnyNode(Node n){                         // displayFromAnyNode------------------->>>>>>
//       Node temp=n;
//       while (temp.next!=n){
//           System.out.print(temp.data+" ");
//           temp=temp.next;
//       }
//        System.out.println(temp.data+" ");
//    }
//
//    public static void main(String[] args) {
//        Node a = new Node(10);
//        Node b = new Node(20);
//        Node c = new Node(30);
//        Node d = new Node(40);
//        Node e = new Node(50);
//        a.next=b;
//        b.next=c;
//        c.next=d;
//        d.next=e;
//        e.next=a;     // because it is a circular linked list so it's last node point head node
//
//        JavaCourseDoublyAndCircularLinkedList ll =new JavaCourseDoublyAndCircularLinkedList();
//
//        ll.head=a;
//        ll.display();
//        ll.displayFromAnyNode(ll.head.next.next);
//
//        ll.deleteHead();
//        ll.display();
//
//    }
//}


               //   2.  Doubly circular LinkedList ---------->>>>
//
//
//
//public class JavaCourseDoublyAndCircularLinkedList {
//
//    Node head;
//    Node tail;
//    static class Node{
//        int data;
//        Node next;
//        Node prev;
//        Node(int data){
//            this.data=data;
//            this.next=null;
//            this.prev=null;
//        }
//    }
//
//
//    public void display(){
//        Node temp =head;
//        while (temp.next!=head){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
//        System.out.println(temp.data+" ");
////        System.out.println();
//    }
//
//    public void displayByTail(){          // displayByTail------>>>>>>>
//        Node temp=tail;
//        while (temp.prev!=tail){
//            System.out.print(temp.data+" ");
//            temp= temp.prev;
//        }
//        System.out.println(temp.data);
//    }
//
////    public void displayByAnyNode(Node nn){
////        Node temp = nn;
////        while (temp.prev!)
////    }
//
//    public static void main(String[] args) {
//        Node a = new Node(10);
//        Node b = new Node(20);
//        Node c = new Node(30);
//        Node d = new Node(40);
//        Node e = new Node(50);
//        a.next=b;
//        b.next=c;
//        c.next=d;
//        d.next=e;
//        e.next=a;     // because it is a doubly circular linked list so it's last node point head node
//
//        a.prev=e;        // because it is a doubly circular linked list so it's first node point tail node
//        b.prev=a;
//        c.prev=b;
//        d.prev=c;
//        e.prev=d;
//
//
//
//        JavaCourseDoublyAndCircularLinkedList ll =new JavaCourseDoublyAndCircularLinkedList();
//
//        ll.head=a;
//        ll.display();
//        ll.tail=e;
//
//        ll.displayByTail();
//
//    }
//}


