




//             // Insertion any Node in linkedlist at the end
//
//
//             import org.w3c.dom.Node;
//
//             public class JavaCourseLinkedList{
//    Node head;
//    class Node{
//        int data;
//        Node next;
//        public Node(int d){
//            this.data=d;
//            this.next=null;
//        }
//    }
//    public void insertAtTheEnd(int val){        // Insertion any Node in linkedlist at the end
//        Node nn = new Node(val);
//        if (head==null){
//            head=nn;
//            return;
//        }
//        Node temp = head;
//        while (temp.next!=null){
//            temp=temp.next;
//        }
//       temp.next=nn;
//        return;
//    }
//    public  void display(){
//        Node temp = head;
//        while (temp.next!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
//        System.out.println(temp.data);
//    }
//       public static void main(String[] args) {
//
//        JavaCourseLinkedList ll = new JavaCourseLinkedList();
//        ll.insertAtTheEnd(10);
//        ll.insertAtTheEnd(20);
//        ll.insertAtTheEnd(30);
//        ll.insertAtTheEnd(40);
//
//        ll.display();
//       }
//}







//                     //   Display LinkedLIst element Itretively ,Recursively and Reverse Order Display
//
//
//    public class JavaCourseLinkedList{
//    Node head;
//    class Node{
//        int data;
//        Node next;
//        public Node(int d){
//            this.data=d;
//            this.next=null;
//        }
//    }
//    public void insertAtTheEnd(int val){
//        Node nn = new Node(val);
//        if (head==null){
//            head=nn;
//            return;
//        }
//        Node temp = head;
//        while (temp.next!=null){
//            temp=temp.next;
//        }
//       temp.next=nn;
//        return;
//    }
//    public  void display(){                 //   //   Display LinkedLIst element Itretively----------->>>>>>>>
//       Node temp = head;
//        while (temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
//        System.out.println();
//
//    }
//
////    public void displayReverseOrder(){
////        Node temp =head;
////        if ()
////    }
//    public void displayRecursively(Node temp){        //   //   Display LinkedLIst element Recursively----------->>>>>>>>
//
//        if (temp==null){
//            return;
//        }
//        System.out.print(temp.data+" ");
//        displayRecursively(temp.next);
//
//    }
//
//
//
//        public void displayRecursivelyReverseOrder(Node temp){        //   //   Display Reverse order LinkedLIst element Recursively----------->>>>>>>>
//            if (temp==null){
//                return;
//            }
//            displayRecursivelyReverseOrder(temp.next);
//            System.out.print(temp.data+" ");
//
//        }
//
//       public static void main(String[] args) {
//
//        JavaCourseLinkedList ll = new JavaCourseLinkedList();
//
//           ll.insertAtTheEnd(10);
//           ll.insertAtTheEnd(20);
//           ll.insertAtTheEnd(30);
//           ll.insertAtTheEnd(40);
//
//           ll.display();
//           ll.displayRecursively(ll.head);
//           ll.displayRecursivelyReverseOrder(ll.head);
//
//
//       }
//}
















//             // Insertion any Node in linkedlist at the end
//
//
//
//     public class JavaCourseLinkedList{
//    Node head;
//    class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//
//    }
//         public void insertAtTheEnd(int val){    // Insertion any Node in linkedlist at the end
//             Node nn = new Node(val);
//             if (head==null){
//                 head=nn;
//                 return;           // it is mandatory
//             }
//             Node temp = head;
//             while (temp.next!=null){
//                 temp=temp.next;
//             }
//             temp.next=nn;
//            // return;
//         }
//         public void display() {
//             Node temp = head;
////             while (temp.next!=null){
////                 System.out.println(temp.data);
////                 temp=temp.next;
////             }
////             System.out.println(temp.data);
////         }
//             // or
//             while (temp != null) {
//                 System.out.println(temp.data);
//                 temp = temp.next;
//             }
//         }
//
//         public static void main(String[] args) {
//
//             JavaCourseLinkedList ll = new JavaCourseLinkedList();
//             ll.insertAtTheEnd(10);
//             ll.insertAtTheEnd(20);
//             ll.insertAtTheEnd(30);
//
//             ll.display();
//
//
//         }
//}
//





//             // Insertion at the beginning  ------>>>>>
//
//
//             import org.w3c.dom.Node;
//
//             public class JavaCourseLinkedList{
//        Node head;
//        class Node{
//            int data;
//            Node next;
//            Node(int d){
//                this.data=d;
//                this.next=null;
//            }
//        }
//        public void insertAtBeginning(int data){          // Insertion at the beginning  ------>>>>>
//            Node nn = new Node(data);
//
//            nn.next=head;
//            head=nn;
//
//        }
//
//        public void display(){
//            Node temp = head;
//            while (temp != null) {
//                 System.out.println(temp.data);
//                 temp = temp.next;
//             }
//         }
//
//      public static void main(String[] args) {
//
//          JavaCourseLinkedList ll = new JavaCourseLinkedList();
//
//          ll.insertAtBeginning(10);
//          ll.insertAtBeginning(100);
//          ll.display();
//      }
//}






             // Insertion in linkedlist after any node or any position

//
//             import org.w3c.dom.Node;
//
//             public class JavaCourseLinkedList{
//    Node head;
//    class Node{
//        int data;
//        Node next;
//        Node(int d){
//            data=d;
//            next=null;
//        }
//    }
//    public void addBeginning(int val){
//        Node nn = new Node(val);
//        nn.next=head;
//        head=nn;
//
//    }
//    public void addAfterAnyNode(Node previous_node,int val){       // Insertion in linkedlist after any node
//        Node nnn = new Node(val);
//        if (head==null){
//            System.out.println("head is already null after head you can't add .......");
//            return;
//        }
//          nnn.next= previous_node.next;
//        previous_node.next=nnn;
//
//    }
//
//                // Or
//
//     public void addNodeAnyPosition(int position,int val){       //// Insertion in linkedlist  any node at any possition --------->>>>>>
//        Node nn = new Node(val);
//        Node temp = head;
//        if (position==0){
//            nn.next=head;
//            head=nn;
//           return;
//        }
//        for (int i=0;i<position-1 && temp.next!=null;i++){
//            temp=temp.next;
//
//        }
//             nn.next=temp.next;
//            temp.next=nn;
//     }
//    public void addEnd(int val){
//        Node nn =  new Node(val);
//        if (head==null){
//            head=nn;
//            return;
//        }
//        Node temp = head;
//        while (temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next=nn;
//
//    }
//    public void display(){
//        Node temp = head;
//        while (temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
//        System.out.println();
//    }
//       public static void main(String[] args) {
//
//           JavaCourseLinkedList ll = new JavaCourseLinkedList();
//
//           ll.addBeginning(20);
//           ll.addBeginning(10);
//           ll.addBeginning(5);
//           ll.addEnd(50);
//           ll.addAfterAnyNode(ll.head.next.next,40);
//           ll.addNodeAnyPosition(2,50);
//           ll.addNodeAnyPosition(0,1);
//           ll.addNodeAnyPosition(-1,100);
//
//           ll.display();
//
//       }
//}







//             // LinkedList Deletions
//
//          // Deletion an Beginning
//
//
//
//
//             public class JavaCourseLinkedList{
//                 Node head;
//
//                 class Node{
//                     int data;
//                     Node next;
//                     Node(int d){
//                         data=d;
//                         next=null;
//                     }
//                 }
//                 public void addBeginning(int val){
//                     Node nn = new Node(val);
//                     nn.next=head;
//                     head=nn;
//
//                 }
//                 public void addAfterAnyNode(Node previous_node,int val){
//                     Node nnn = new Node(val);
//                     if (head==null){
//                         System.out.println("head is already null after head you can't add .......");
//                         return;
//                     }
//                     nnn.next= previous_node.next;
//                     previous_node.next=nnn;
//
//                 }
//                 public void addEnd(int val){
//                     Node nn =  new Node(val);
//                     if (head==null){
//                         head=nn;
//                         return;
//                     }
//                     Node temp = head;
//                     while (temp.next!=null){
//                         temp=temp.next;
//                     }
//                     temp.next=nn;
//
//                 }
//
//                 public void deleteFast(){               // Deletion an Beginning--------->>>>
//                     Node temp = head;
//                     if (head==null){
//                         return;
//                     }
//                     head=temp.next;
//                 }
//                 public void deleteAnyPositionOrEnd(int possition){       //deleteAnyPositionOrEnd ------>>>>>>>>
//                     Node temp=head;
//                     if (head==null){
//                         return;
//                     }
//                     for (int i=0;i<possition-1 && temp.next!=null;i++){
//                             temp=temp.next;
//                      }
//                     if (temp==null||temp.next==null){
//                        return;
//                     }
//                     temp.next=temp.next.next;
//
//
//                 }
//                 public void display(){
//                     Node temp = head;
//                     while (temp!=null){
//                         System.out.println(temp.data);
//                         temp=temp.next;
//                     }
//                 }
//                 public static void main(String[] args) {
//
//                     JavaCourseLinkedList ll = new JavaCourseLinkedList();
//
//                     ll.addBeginning(20);
//                     ll.addBeginning(10);
//                     ll.addBeginning(1);
//                     ll.addEnd(50);
//                     ll.addAfterAnyNode(ll.head.next.next,40);
//
//                     ll.deleteFast();
//                     ll.deleteAnyPositionOrEnd(2);
//                     ll.display();
//
//                 }
//             }





//                             // Linked Lis Size or Length
//
//                    // It is not a good way to count linkedlist length------------->>>>>>>
//
//
//public class JavaCourseLinkedList {
//    Node head=null;           // Node head;  or Node head =null; it is same because we create instance variable which have default value
//
//    class Node{
//        int data ;
//        Node next;
//        Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//
//    }
//    public void addfast(int val){
//        Node nn = new Node(val);
//        nn.next=head;
//        head=nn;
//    }
//    public int size(){
//        int  count=0;
//        Node temp = head;
//        while (temp!=null){
//            temp=temp.next;
//            count++;
//        }
//        return count;
//    }
//    public static void main(String[] args) {
//        JavaCourseLinkedList ll = new JavaCourseLinkedList();
//        ll.addfast(10);
//        ll.addfast(20);
//        System.out.println(ll.size());
//    }
//}








//               // Get linked List element
//
//
//public class JavaCourseLinkedList {
//    Node head = null;
//    class Node{
//        int data;
//        Node next;
//        Node(int d){
//            this.data=d;
//            this.next=null;
//        }
//    }
//    public void addfast(int val){
//        Node nn = new Node(val);
//        nn.next=head;
//        head=nn;
//    }
//    public void getElement(int position){
//        Node temp = head;
//        if (head==null){
//            return;
//        }
//        if (position==0){
//            System.out.println(temp.data);
//            return;
//        }
//        for (int i=0;i<position-1&&temp.next!=null;i++){
//            temp=temp.next;
//        }
//        if (temp.next==null||temp==null){
//            return;
//        }
//        System.out.println(temp.next.data);
//
//    }
//    public static void main(String[] args) {
//
//
//        JavaCourseLinkedList jll=new JavaCourseLinkedList();
//        jll.addfast(10);
//        jll.addfast(20);
//        jll.addfast(30);
//        jll.getElement(0);
//        jll.getElement(1);
//        jll.getElement(2);
//    }
//}









//                       // Reverse LinkedList Itretive way  And Recursive Way
//               // Time complexity O(n) ,  and Space Complexity O(1)
 //
//
//             public class JavaCourseLinkedList{
//                 Node head;
//
//                 class Node{
//                     int data;
//                     Node next;
//                     Node(int d){
//                         data=d;
//                         next=null;
//                     }
//                 }
//                 public void addBeginning(int val){
//                     Node nn = new Node(val);
//                     nn.next=head;
//                     head=nn;
//
//                 }
//                 public void addAfterAnyNode(Node previous_node,int val){
//                     Node nnn = new Node(val);
//                     if (head==null){
//                         System.out.println("head is already null after head you can't add .......");
//                         return;
//                     }
//                     nnn.next= previous_node.next;
//                     previous_node.next=nnn;
//
//                 }
//                 public void addEnd(int val){
//                     Node nn =  new Node(val);
//                     if (head==null){
//                         head=nn;
//                         return;
//                     }
//                     Node temp = head;
//                     while (temp.next!=null){
//                         temp=temp.next;
//                     }
//                     temp.next=nn;
//
//                 }
//
//                 public void deleteFast(){
//                     Node temp = head;
//                     if (head==null){
//                         return;
//                     }
//                     head=temp.next;
//                 }
//                 public void deleteAnyPositionOrEnd(int possition){
//                     Node temp=head;
//                     if (head==null){
//                         return;
//                     }
//                     for (int i=0;i<possition-1 && temp.next!=null;i++){
//                         temp=temp.next;
//                     }
//                     if (temp==null||temp.next==null){
//                         return;
//                     }
//                     temp.next=temp.next.next;
//
//
//                 }
//
//
//                 public void reverseLinkedList(){            // Reverse LinkedList Itretive way---------->>>>>>
//
//                     Node current=head;
//                     Node previous=null;
//                     Node orginal_Curr_next=null;
//                     while (current!=null){
//                         orginal_Curr_next=current.next;
//                         current.next=previous;
//                         previous=current;
//                         current=orginal_Curr_next;
//                     }
//                     head=previous;
//                 }
//
//                 public void reverseRecursive(Node previous,Node current){          // Reverse LinkedList Recursive way---------->>>>>>
//
//                     if (current==null){
//                         head=previous;
//                         return;
//                     }
//                     Node Orgi_Curr_next=current.next;
//                     current.next=previous;
//
//                     reverseRecursive(current,Orgi_Curr_next);
//                 }
//
//                 public void display(){
//                     Node temp = head;
//                     while (temp!=null){
//                         System.out.print(temp.data+" ");
//                         temp=temp.next;
//                     }
//                     System.out.println();
//                 }
//
//                 public static void main(String[] args) {
//
//                     JavaCourseLinkedList ll = new JavaCourseLinkedList();
//
//                     ll.addBeginning(20);
//                     ll.addBeginning(10);
//                     ll.addBeginning(1);
//                     ll.addEnd(50);
//                     ll.addAfterAnyNode(ll.head.next.next,40);
//
////                     ll.deleteFast();
////                     ll.deleteAnyPositionOrEnd(2);
//                     ll.display();
//                     ll.reverseLinkedList();
//                     ll.display();
//                     ll.reverseRecursive(null, ll.head);
//                     ll.display();
//
//                 }
//             }
//







//
//               //   Middel of LinkedList --------------->>>>>>
//
//        //  Time complexity O(n)+O(n/2) that is = O(n) ,  and Space Complexity O(1)
//
//
//public class JavaCourseLinkedList{
//    Node head;
//
//    class Node{
//        int data;
//        Node next;
//        Node(int d){
//            data=d;
//            next=null;
//        }
//    }
//    public void addBeginning(int val){
//        Node nn = new Node(val);
//        nn.next=head;
//        head=nn;
//
//    }
//    public void addAfterAnyNode(Node previous_node,int val){
//        Node nnn = new Node(val);
//        if (head==null){
//            System.out.println("head is already null after head you can't add .......");
//            return;
//        }
//        nnn.next= previous_node.next;
//        previous_node.next=nnn;
//
//    }
//    public void addEnd(int val){
//        Node nn =  new Node(val);
//        if (head==null){
//            head=nn;
//            return;
//        }
//        Node temp = head;
//        while (temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next=nn;
//
//    }
//
//    public void deleteFast(){
//        Node temp = head;
//        if (head==null){
//            return;
//        }
//        head=temp.next;
//    }
//    public void deleteAnyPositionOrEnd(int possition){
//        Node temp=head;
//        if (head==null){
//            return;
//        }
//        for (int i=0;i<possition-1 && temp.next!=null;i++){
//            temp=temp.next;
//        }
//        if (temp==null||temp.next==null){
//            return;
//        }
//        temp.next=temp.next.next;
//
//
//    }
//
//
//    public void reverseLinkedList(){
//
//        Node current=head;
//        Node previous=null;
//        Node orginal_Curr_next=null;
//        while (current!=null){
//            orginal_Curr_next=current.next;
//            current.next=previous;
//            previous=current;
//            current=orginal_Curr_next;
//        }
//        head=previous;
//    }
//
//    public void reverseRecursive(Node previous,Node current){
//
//        if (current==null){
//            head=previous;
//            return;
//        }
//        Node Orgi_Curr_next=current.next;
//        current.next=previous;
//
//        reverseRecursive(current,Orgi_Curr_next);
//    }
//
//
//          // While(fast!=null && fast.next!=null) is coorrect but  While(fast.next!=null && fast!=null) is not because even cases when fast == null then fast.next.next give exception
//       public void foundMiddelOfLinkedList(){            // found Middel Of LinkedList  for odd and even both cases ------------>>>>>
//        Node slow=head;
//        Node fast=head;
//        while (fast!=null && fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//           System.out.println(slow.data);
//
//       }
//
//          public void foundLeftMiddelOfLinkedList(){            // found  Left Middel for even case Of LinkedList------------>>>>>
//        Node slow=head;
//        Node fast=head;
//        while (fast.next.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//           System.out.println(slow.data);
//
//       }
//
//    public void display(){
//        Node temp = head;
//        while (temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//
//        JavaCourseLinkedList ll = new JavaCourseLinkedList();
//
//        ll.addBeginning(20);
//        ll.addBeginning(10);
//        ll.addBeginning(1);
//        ll.addEnd(50);
//        ll.addAfterAnyNode(ll.head.next.next,40);
//
////                     ll.deleteFast();
////                     ll.deleteAnyPositionOrEnd(2);
//        ll.display();
//        ll.reverseLinkedList();
//        ll.display();
//        ll.reverseRecursive(null, ll.head);
//        ll.display();
//
//        ll.foundMiddelOfLinkedList();   //  that is for odd
//        ll.addEnd(100);
//        ll.display();
//        ll.foundMiddelOfLinkedList();      // That is for even
//
//
//    }
//}












              //  Cycel detection of a LinkedList  ------------------>>>>>>>>>>>>
//
//
//    public class JavaCourseLinkedList{
//    Node head;
//    class Node{
//        int data;
//        Node next;
//        Node(int d){
//            data=d;
//            next=null;
//        }
//    }
//    public void addBeginning(int val){
//        Node nn = new Node(val);
//        nn.next=head;
//        head=nn;
//
//    }
//    public void addAfterAnyNode(Node previous_node,int val){
//        Node nnn = new Node(val);
//        if (head==null){
//            System.out.println("head is already null after head you can't add .......");
//            return;
//        }
//          nnn.next= previous_node.next;
//        previous_node.next=nnn;
//
//    }
//    public void addEnd(int val){
//        Node nn =  new Node(val);
//        if (head==null){
//            head=nn;
//            return;
//        }
//        Node temp = head;
//        while (temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next=nn;
//
//    }
//
//
//    public void cycleDetection(){              //  Cycel detection of a LinkedList  ------------------>>>>>>>>>>>>
//        Node slow=head;
//        Node fast = head;
//        if (head==null){
//            return;
//        }
//        if(head.next==null){
//            return;
//        }
//        while (fast!=null && fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//            if (slow==fast){
//                System.out.println("Yes cycel found ");
//                return;
//            }
//        }
//        System.out.println("Not found");    // if cycel not present that means fast==null || fast.next==null then while loop stop and print this
//
////        if (fast==null || fast.next==null){
////            System.out.println("not found");
////        }
//    }
//
//
//            public Node cycelStartingNode() {             // Find cycel Starting Node  --------------->>>>>
//                Node slow = head, fast =head;
//                if(head==null || head.next==null){
//                    return null;
//                }
//                while(fast!=null && fast.next!=null){
//                    slow=slow.next;
//                    fast=fast.next.next;
//                    if(slow==fast){
//                        break;
//                    }
//                }
//                if(slow==fast){  //because if cycel not present then we not go inside the code
//                    Node temp =head;
//                    while(temp!=slow){
//                        temp=temp.next;
//                        slow=slow.next;
//                    }
//                    return temp;
//                }
//                return null;
//            }
//    public void display(){
//        Node temp = head;
//        while (temp!=null){
//            System.out.println(temp.data);
//            temp=temp.next;
//        }
//    }
//       public static void main(String[] args) {
//
//           JavaCourseLinkedList ll = new JavaCourseLinkedList();
//
//           ll.addBeginning(10);
//           ll.addEnd(20);
//           ll.addEnd(30);
//           ll.addEnd(40);
//           ll.addEnd(50);
//
//           ll.cycleDetection();  // not found because not create any cycel
//
//           Node temp = ll.head;
//           while (temp.next!=null){
//               temp=temp.next;
//           }
//           temp.next= ll.head;
//
//
//           ll.cycleDetection();   //  found because creation of cycel
//           System.out.println(ll.cycelStartingNode().data);
//
//
//       }
//}




//                       //   LinkedList full  code  ------------------>>>>>>>>>>
//
//
//
//
//public class JavaCourseLinkedList {
//    Node head=null;
//    int size=0;
//    class Node{
//        int data;
//        Node next;
//        Node(int d){
//            this.data=d;
//            this.next=null;
//        }
//    }
//
//    public void addFast(int val){
//        Node nn = new Node(val);
//        nn.next=head;
//        head=nn;
//        size++;
//    }
//    public void addAnyPosition(int val, int possition){
//        Node nn = new Node(val);
//        Node temp = head;
//        if (head==null){
//            return;
//        }
//        if (possition<0||possition>size){
//            System.out.println(" You might enter wrong possition.Not possible this possition ");
//            return;
//        }
//        if (possition==0){
//            nn.next=head;
//            head=nn;
//            size++;
//            return;
//        }
//        for (int i=0;i<possition-1 && temp.next!=null;i++){
//            temp=temp.next;
//        }
//         nn.next=temp.next;
//        temp.next=nn;
//        size++;
//    }
//
//    public void addAfterAnyNode(int val,Node previousNode){
//        Node nnn =new Node(val);
//        if (head==null){
//            System.out.println("Head already null so we can't add any node after null  !!!");
//            return;
//        }
//        nnn.next=previousNode.next;
//        previousNode.next=nnn;
//
//        size++;
//    }
//    public void addEnd(int val){
//        Node nn = new Node(val);
//        Node temp = head;
//        if (head==null){
//            head=nn;
//            size++;
//            return;
//        }
//        while (temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next=nn;
//        size++;
//    }
//    public void delete(int position){
//        Node temp =head;
//        if (head==null){
//            return;
//        }
//        if (position<0 || position>size){
//            return;
//        }
//        if (position==0){
//            head=temp.next;
//        }
//        for (int i=0;i<position-1 && temp.next!=null ;i++){
//            temp=temp.next;
//        }
//        if (temp.next==null || temp==null){
//            return;
//        }
//        temp.next =temp.next.next;
//
//        size--;
//    }
//
//    public void getElement(int position){
//        Node temp = head;
//        if (head==null){
//            return;
//        }
//        if (position==0){
//            System.out.println(temp.data);
//        }
//        for (int i=0;i<position-1 && temp.next!=null;i++){
//            temp=temp.next;
//        }
//        if (temp.next==null || temp==null){
//            return;
//        }
//        System.out.println(temp.next.data);
//    }
//
//    public void display(){
//        Node temp = head;
//        while (temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
//        System.out.println();
//
//    }
//    public void displayRecursively(Node temp){
//        if (temp==null){
//            return;
//        }
//
//            System.out.print(temp.data+" ");
//            displayRecursively(temp.next);
//
//    }
//    public void displayRecursivelyReverseOrder(Node temp){
//        if (temp==null){
//            return;
//        }
//
//            displayRecursivelyReverseOrder(temp.next);
//            System.out.print(temp.data+" ");
//
//    }
//
//    public static void main(String[] args) {
//        JavaCourseLinkedList ll =new JavaCourseLinkedList();
//        ll.addFast(10);
//        ll.addAnyPosition(20,1);
//        ll.addAfterAnyNode(30, ll.head.next);
//        ll.addEnd(40);
//        ll.addEnd(50);
//        ll.addEnd(60);
//        System.out.println(ll.size);
//        ll.display();
//        ll.getElement(1);
//        ll.delete(3);
//        System.out.println(ll.size);
//        ll.display();
//        ll.displayRecursively(ll.head);
//        System.out.println("\ndisplayRecursivelyReverseOrder ");
//        ll.displayRecursivelyReverseOrder(ll.head);
//
//    }
//}







                // LeetCode Problem or pw Youtube Linked List problem --------------->>>>>>
//
//
//
// // qu-1 delete any node as given parameter
//
//
//public class JavaCourseLinkedList {
//    Node head;
//    class Node{
//        int data;
//        Node next;
//        Node(int d){
//            this.data=d;
//            this.next=null;
//        }
//    }
//    public void addFast(int val){
//        Node nn = new Node(val);
//        nn.next=head;
//        head=nn;
//
//    }
//    public void display(){
//        Node temp = head;
//        while (temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
//        System.out.println();
//
//    }
//
//    public void deleteNode(Node nno){            // delete any node as given parameter
//        nno.data=nno.next.data;
//        nno.next=nno.next.next;
//    }
//    public static void main(String[] args) {
//
//        JavaCourseLinkedList ll = new JavaCourseLinkedList();
//        ll.addFast(10);
//        ll.addFast(20);
//        ll.addFast(30);
//        ll.addFast(40);
//        ll.addFast(50);
//
//        ll.deleteNode();
//        ll.deleteNode(ll.head);
//        ll.display();
//
//
//
//    }
//}






 //                   // Qu-2  Find nth node from last side of a linked list
//
//
//public class JavaCourseLinkedList {
//    Node head = null;
//    class Node {
//        int data;
//        Node next;
//
//        Node(int d) {
//            this.data = d;
//            this.next = null;
//        }
//    }
//    public void addFast(int val) {
//        Node nn = new Node(val);
//        nn.next = head;
//        head = nn;
//
//    }
//
//    // Not a good approach  Because using two travelsal            Find nth node from last side of a linked list ------>>
//    public void findNodeFromLast(int nth,Node node){    // Not a good approach              Find nth node from last side of a linked list ------>>
//        Node temp =node;
//        int size=0;
//        while (temp!=null){
//            temp=temp.next;
//            size++;
//        }
//        int nthNode= size-nth+1;
//
//         temp = node;        // re-assign temp = node is so important because when we count size then temp gone null so
//        for (int i=0;i<nthNode-1;i++){
//            temp=temp.next;
//        }
//        System.out.println(temp.data);
//    }
//
//    // Good approach   --->>>    Find nth node from last side of a linked list ------>>
//    public void findNodeFromLastGood(int nth,Node node){   // Good approach       Find nth node from last side of a linked list ------>>
//        Node slow=node;
//        Node fast =node;
//        for (int i=1;i<=nth;i++){
//          fast=fast.next;
//        }
//
//        while (fast!=null){      // fast!=null
//            slow=slow.next;
//            fast=fast.next;
//        }
//
//        System.out.println(slow.data);
//
//    }
//
//    public void display() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//
//    }
//
//
//    public static void main(String[] args) {
//        JavaCourseLinkedList ll = new JavaCourseLinkedList();
//
//        ll.addFast(10);
//        ll.addFast(20);
//        ll.addFast(30);
//        ll.addFast(40);
//        ll.addFast(50);
//        ll.addFast(60);
//
//        ll.display();
//        ll.findNodeFromLast(2, ll.head);
//        ll.findNodeFromLastGood(2,ll.head);
//
//    }
//}
//


            // Qu-3    Delete nth node from last side of a linked list
//
//public class JavaCourseLinkedList {
//    Node head = null;
//    class Node {
//        int data;
//        Node next;
//
//        Node(int d) {
//            this.data = d;
//            this.next = null;
//        }
//    }
//    public void addFast(int val) {
//        Node nn = new Node(val);
//        nn.next = head;
//        head = nn;
//
//    }
//
//    public Node deleteNodeFromLast(int nth,Node node){   // Delete nth node from last side of a linked list ------>>
//        Node slow=node;             //  here node means  head
//        Node fast =node;
//        for (int i=1;i<=nth;i++){
//          fast=fast.next;
//        }
//
//        if (fast==null){
//            node=node.next;   //  here node means  head
//          return node;
//        }
//        while (fast.next!=null){   // fast.next
//            slow=slow.next;
//            fast=fast.next;
//        }
//        slow.next=slow.next.next;
//        return node;
//
//    }
//
//    public void display() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//
//    }
//    public void displayyyy(Node noo){
//         Node temp=noo;
//         while (temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//        System.out.println();
//    }
//
//
//    public static void main(String[] args) {
//        JavaCourseLinkedList ll = new JavaCourseLinkedList();
//
//        ll.addFast(10);
//        ll.addFast(20);
//        ll.addFast(30);
//        ll.addFast(40);
//        ll.addFast(50);
//        ll.addFast(60);
//
//        ll.display();
//        ll.displayyyy(ll.head);
//
//        Node a=ll.deleteNodeFromLast(6, ll.head);
//        ll.displayyyy(a);
//
//        Node aa=ll.deleteNodeFromLast(3, ll.head);
//        ll.displayyyy(aa);
//
//
//    }
//}
//


                   // Delete middle node of a linkedlist ----------------->>>>>
//
//
//public class JavaCourseLinkedList {
//    Node head = null;
//
//    class Node {
//        int data;
//        Node next;
//
//        Node(int d) {
//            this.data = d;
//            this.next = null;
//        }
//    }
//
//    public void addFast(int val) {
//        Node nn = new Node(val);
//        nn.next = head;
//        head = nn;
//
//    }
//    public void display() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//
//    }
//
//    public void deleteMiddleNode(){
//         Node slow=head, fast = head;
//         if (head.next==null){    // it means single element linked list
//             head=null;
//             return;
//         }
//         while (fast.next.next!=null && fast.next.next.next!=null){      // because we want to get previous node
//             slow=slow.next;
//             fast = fast.next.next;
//         }
//         slow.next = slow.next.next;
//    }
//
//    public static void main(String[] args) {
//   JavaCourseLinkedList ll = new JavaCourseLinkedList();
//        ll.addFast(10);
////        ll.addFast(30);
////        ll.addFast(40);
////        ll.addFast(50);
////        ll.addFast(60);
//
//        ll.display();
//        ll.deleteMiddleNode();
//        System.out.println("After delete");
//        ll.display();
//    }
//}







                  // merger two  sorted linked list sorted order  using extra space    and  Not using aNY EXTRA SPACE;

             // solved in leetcode ------------------>>>>>>>>>>

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

//           // using extra space

// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode temp1 =list1, temp2 =list2;
//         ListNode head = new ListNode(1000);    // This extra Node for adding purpose it's not a original head original one is actualy head.next
//         ListNode temp3 = head;

//         while(temp1!=null && temp2 !=null){
//             if(temp1.val<=temp2.val){
//                 ListNode a= new ListNode(temp1.val);
//                 temp3.next=a;
//                 temp1=temp1.next;
//                 temp3=a;
//             }else{
//                 ListNode a = new ListNode(temp2.val);
//                     temp3.next=a;
//                     temp3=a;
//                     temp2=temp2.next;

//             }
//         }
//         if(temp1==null){
//             temp3.next=temp2;
//         }else{
//             temp3.next=temp1;
//         }

//         return head.next ; // because our created head is not head head.next is original head.
//     }
// }
//
//
//
//
//                       // Not using  any extra space
//
//
//class Solution {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode temp1=list1, temp2=list2;
//        ListNode head = new ListNode(5000);     // This extra Node for adding purpose it's not a original head original one is actualy head.next
//        ListNode temp3= head;
//        while(temp1!=null && temp2!=null){
//            if(temp1.val<=temp2.val){
//                temp3.next=temp1;
//                temp3=temp1;
//                temp1=temp1.next;
//            }else{
//                temp3.next=temp2;
//                temp3=temp2;
//                temp2=temp2.next;
//            }
//        }
//        if(temp1==null){
//            temp3.next=temp2;
//        }else{
//            temp3.next=temp1;
//        }
//
//        return head.next;   // because our created head is not head head.next is original head.
//    }
//}





//                            //  leetcode problem
//
//                    // Using extra space  and not using extra space linkedlist two part odd and even linkedlist by maintaining same order
//
//public class JavaCourseLinkedList {
//    Node head = null;
//
//    class Node {
//        int data;
//        Node next;
//
//        Node(int d) {
//            this.data = d;
//            this.next = null;
//        }
//    }
//
//    public void addFast(int val) {
//        Node nn = new Node(val);
//        nn.next = head;
//        head = nn;
//
//    }
//
//    public Node oddEven(){                    //Using extra space
//        Node odd = new Node(100000);
//        Node even = new Node(100000);      // this two node is code purpose
//        Node temp1= odd;
//        Node temp2 =even;
//         Node temp = head;
//
//         while(temp!=null){
//             if (temp.data%2!=0){
//                 Node n1 = new Node(temp.data);
//                 temp1.next=n1;
//                 temp1=temp1.next;
//                 temp=temp.next;
//             }else{
//                 Node n2 = new Node(temp.data);
//                 temp2.next=n2;
//                 temp2=temp2.next;
//                 temp=temp.next;
//             }
//         }
//         odd=odd.next;
//         even=even.next;
//         temp1.next=even;
//
//         return odd;          // Now odd is the main head of our linkedlist
//    }
//
//   // not using extra space
//
//    public Node oddEvenNotUsingSpace(){                    // Not Using extra space
//        Node odd = new Node(100000);
//        Node even = new Node(100000);      // this two node is code purpose
//        Node temp1= odd;
//        Node temp2 =even;
//        Node temp = head;
//
//        while(temp!=null){
//            if (temp.data%2!=0){
//                temp1.next=temp;
//                temp1=temp1.next;
//                if (temp1.next==null){
//                    temp2.next=null;
//                }
//                temp=temp.next;
//            }else{
//
//                temp2.next=temp;
//                temp2=temp2.next;
//                if (temp2.next==null){
//                    temp1.next=null;
//                }
//                temp=temp.next;
//            }
//        }
//        odd=odd.next;
//        even=even.next;
//        temp1.next=even;
//
//        return odd;          // Now odd is the main head of our linkedlist
//    }
//
//    public void display(Node head) {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//
//    }
//
//    public static void main(String[] args) {
//
//        JavaCourseLinkedList  ll = new JavaCourseLinkedList();
//        ll.addFast(8);
//        ll.addFast(3);
//        ll.addFast(4);
//        ll.addFast(5);
//        ll.addFast(6);
//
//        ll.display(ll.head);
//        Node a = ll.oddEven();
//        ll.display(a);
//        Node aa = ll.oddEvenNotUsingSpace();
//        ll.display(aa);
//    }
//}






                    // LeetCode problem delete duplicates of a sorted Linked list
//                               //      sloved in leetCode ----------->>>>>>
//
//
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//class Solution {
//    public ListNode deleteDuplicates(ListNode head) {
//        ListNode temp =head;
//        while(temp!=null && temp.next!=null){
//            if(temp.val==temp.next.val){
//                temp.next=temp.next.next; // here temp not moving temp can move when this condition not satisfied
//            }else{
//                temp=temp.next;
//            }
//        }
//        return head;
//    }
//}




                         //   reverse a linked list
                  // solved in leet code

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//               //  iterative approach

// class Solution {
//     public ListNode reverseList(ListNode head) {
//         // ListNode temp=head;
//         ListNode current=head;
//         ListNode previous=null;
//         ListNode Original_curr_add=null;

//           if(head==null){
//               return null;
//           }
//         while(current!=null){
//         Original_curr_add=current.next;
//         current.next=previous;
//         previous=current;
//         current=Original_curr_add;
//         }
//         head=previous;

//         return head;
////     }
//// }
//
//
//
//
////   Recursive approach
//
//
//class Solution {
//    public ListNode reverseList(ListNode head) {
//        if(head==null || head.next==null){
//            return head;
//        }
//        ListNode nn= reverseList(head.next);
//        head.next.next=head;
//        head.next=null;
//        return nn;
//    }
//}



               //  Plaindrome linked list    solved in leetCode     -------------->>>>>
 //
//
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//class Solution {
//    public boolean isPalindrome(ListNode head) {
//        ListNode slow = head;
//        ListNode fast= head;
//        while(fast.next!=null && fast.next.next!=null){  // here we find out left middle
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        ListNode secondHead=reverse(slow.next);
//        slow.next=secondHead;
//        ListNode temp1=head;
//        ListNode temp2=secondHead;
//        while(temp2!=null){
//            if(temp1.val!=temp2.val){
//                return false;
//            }
//            temp1=temp1.next;
//            temp2=temp2.next;
//        }
//        return true;
//
//
//    }
//    public ListNode reverse(ListNode head){
//        if(head==null || head.next==null){
//            return head;
//        }
//        ListNode nn = reverse(head.next);
//        head.next.next=head;
//        head.next=null;
//        return nn;
//
//    }
//}



                       //   twin sum of a linked list       Solved in leetCode---------->>>>>>>>>
//
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//class Solution {
//    public int pairSum(ListNode head) {
//        ListNode slow=head,fast=head;
//        while(fast.next!=null && fast.next.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        ListNode second_head = reverse(slow.next);
//        slow.next=second_head;
//
//        ListNode temp1=head;
//        ListNode temp2=second_head;
//        int max=Integer.MIN_VALUE;
//        while(temp2!=null){
//            if(temp1.val+temp2.val>max){
//                max=temp1.val+temp2.val;
//            }
//            temp1=temp1.next;
//            temp2=temp2.next;
//        }
//        return max;
//
//    }
//    public ListNode reverse(ListNode head){
//        ListNode current=head;
//        ListNode previous =null, original_curr_add=null;
//        if(head==null){
//            return head;
//        }
//        while(current!=null){
//            original_curr_add=current.next;
//            current.next=previous;
//            previous=current;
//            current=original_curr_add;
//        }
//        head=previous;
//
//        return head;
//    }
//}




//                // Odd even linkedlist      solved in leetcode --------------------->>>>>>>>
//
//
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//class Solution {
//    public ListNode oddEvenList(ListNode head) {
//        ListNode odd = new ListNode(1000000);
//        ListNode even = new ListNode(100000);
//        ListNode tempOdd = odd;
//        ListNode tempEven=even;
//        ListNode temp = head;
//        while(temp!=null){
//            tempOdd.next=temp;
//            tempOdd=tempOdd.next;
//            temp=temp.next;
//            // if(tempOdd==null){
//            //    tempEven.next==null;
//            // }
//
//            tempEven.next=temp;
//            if(temp==null){
//                break;
//            }
//            tempEven=tempEven.next;
//            temp=temp.next;
//            // if(tempEven==null){
//            //     tempOdd.next==null;
//            // }
//        }
//        odd=odd.next;
//        even=even.next;
//        tempOdd.next=even;
//
//        return odd;
//    }
//}




                 //     create deep copy with random pointers   solved in leetcode-------->>>
//
//
///*
//// Definition for a Node.
//class Node {
//    int val;
//    Node next;
//    Node random;
//
//    public Node(int val) {
//        this.val = val;
//        this.next = null;
//        this.random = null;
//    }
//}
//*/
//
//class Solution {
//    public Node copyRandomList(Node head) {
//        // step-1 create deep copy
//
//        Node temp1 = head;
//        Node head2=new Node(0);
//        Node temp2 = head2;
//        while(temp1!=null){
//            Node nn = new Node(temp1.val);
//            temp2.next=nn;
//            temp2=temp2.next;
//            temp1=temp1.next;
//        }
//        head2=head2.next;
//        //   step-2  alternate address creation
//        temp1=head;
//        temp2=head2;
//
//        Node nod=new Node(1000);
//        Node temp3=nod;
//        while(temp1!=null){
//            temp3.next=temp1;
//            temp3=temp3.next;
//            temp1=temp1.next;
//
//            temp3.next=temp2;
//            temp3=temp3.next;
//            temp2=temp2.next;
//
//        }
//
//        // step -3  create random addresses
//        nod=nod.next;
//        temp3=nod;
//        temp1=head;
//        temp2=head2;
//
//        while(temp1!=null){
//            if(temp1.random==null){
//                temp2.random=null;
//                //   temp1=temp2.next;
//                //   if(temp1==null){
//                //      break;
//                //  }
//                //    temp2=temp1.next;
//            }else{
//                temp2.random=temp1.random.next;
//            }
//            temp1=temp2.next;    // or temp1.next= temp1.next.next;
//            if(temp1==null){
//                break;
//            }
//            temp2=temp1.next;
//        }
//
//        // step-4  nest address creations  or seprating two list
//
//        temp1=head;
//        temp2=head2;
//
//        while(temp1!=null){
//            temp1.next=temp1.next.next;
//            temp1=temp1.next;
//
//            if(temp2.next==null){
//                break;
//            }
//            temp2.next=temp2.next.next;
//            temp2=temp2.next;
//        }
//
//        return  head2;
//
//
//    }
//}
//