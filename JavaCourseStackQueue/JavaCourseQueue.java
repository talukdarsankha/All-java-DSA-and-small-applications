

  package JavaCourseStackQueue;




                      //  Queue DataStructure -------->>>



                    //  Queue's  add,remove,and other function take constant time that is O(1)
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class JavaCourseQueue {
//    public static void main(String[] args) {
//
//        Queue<Integer> q= new LinkedList<>();
//        q.add(10);
//        q.add(20);
//        q.add(30);
//
//        System.out.println(q.size());
//        System.out.println(q.isEmpty());
//
//        System.out.println(q.remove());
//
//
//
//    }
// }







                          //  Implement  Queue Using stack  ----->>>
 // here enqueue or add time complexity :O(1)
 // here dequeue or delete  time complexity :O(n)
 // here space complexity : O(n)


//                 import java.util.Stack;
//
//      public class JavaCourseQueue{
//
//       static    class myQueue{
//              Stack<Integer> st1 = new Stack<>();
//              Stack<Integer> st2 = new Stack<>();
//
//              public void enQueue(int n){
//                  st1.push(n);
//              }
//
//              public int deQueue(){
//                  if (st1.empty() && st2.empty()){
//                      System.out.println("Nothing to delete !!");
//                      return -1;
//                  }
//                  if (st2.isEmpty()){
//                      while (!st1.isEmpty()){
//                         int e= st1.pop();
//                         st2.push(e);
//                      }
//                  }
//             int ans =st2.pop();
//                  return ans;
//              }
//          }
//      public static void main(String[] args) {
//
//              myQueue mq = new myQueue();
//              mq.enQueue(10);
//              mq.enQueue(20);
//              mq.enQueue(30);
//
//          System.out.println(mq.deQueue());
//          System.out.println(mq.deQueue());
//
//          mq.enQueue(50);
//          System.out.println(mq.deQueue());
//
//
//
//
//      }
//}

                             // or      Implement  Queue Using stack  ----->>>
                 // here add time complexity :O(n)
                 // here delete time complexity :O(1)
                 // here space complexity : O(n)

//                 import java.util.*;
//                 public class JavaCourseQueue{
//                   Stack<Integer> st1 = new Stack<>();
//                   Stack<Integer> st2 = new Stack<>();
//                   public void push(int x) {
//                     if(st1.empty()){
//                       st1.push(x);
//                     }else{
//                       while(!st1.empty()){
//                         st2.push(st1.pop());
//                       }
//                       st1.push(x);
//                       while(!st2.empty()){
//                         st1.push(st2.pop());
//                       }
//                     }
//                   }
//
//                   public int pop() {
//                     return st1.pop();
//                   }
//
//                   public int peek() {
//                     return st1.peek();
//                   }
//
//                   public boolean empty() {
//                     if(st1.size()==0) return true;
//                     return false;
//                   }
//
//                   public static void main(String[] args) {
//                     JavaCourseQueue jj = new JavaCourseQueue();
//                     jj.push(1);
//                     jj.push(2);
//                     jj.push(3);
//                     System.out.println(jj.peek());
//                     System.out.println(jj.pop());
//                     System.out.println(jj.pop());
//
//                   }
//                 }








                 //  Implement stack using Queue ------->>
       // here add time complexity :O(n)
       // here delete time complexity :O(1)
       // here space complexity : O(n)

//
//
//
//                 import java.util.LinkedList;
//                 import java.util.Queue;
//
//              public class JavaCourseQueue{
//
//         Queue<Integer> qu1 = new LinkedList();
//         Queue<Integer> qu2 = new LinkedList();
//
//         public void add(int n){
//            while (!qu1.isEmpty()){
//                int e = qu1.poll();
//                qu2.add(e);
//            }
//            qu1.add(n);   //    and this code handel if the qu1 already empty
//
//            while (!qu2.isEmpty()){
//                int e = qu2.poll();
//                qu1.add(e);
//            }
//         }
//
//         public int remove(){
//             if (qu1.isEmpty()){
//                 return -1;
//             }
//             int a = qu1.poll();
//             return a;
//         }
//         public static void main(String[] args) {
//
//         JavaCourseQueue jq = new JavaCourseQueue();
//
//         jq.add(10);;
//         jq.add(20);
//         jq.add(30);
//
//             System.out.println(jq.remove());
//             System.out.println(jq.remove());
//
//         }
//}

                             // or Optimize way  using one Queue --------->>
                 // here add time complexity :O(n)
                 // here delete time complexity :O(1)
                 // here space complexity : O(1)

//                 import java.util.*;
//                 public class JavaCourseQueue{
//                   Queue<Integer> qu = new ArrayDeque<>();
//
//                   public  void push(int x) {
//                     if(qu.isEmpty()){
//                       qu.offer(x);
//                     }else{
//                       qu.offer(x);
//                       for(int i=1;i<=qu.size()-1;i++){
//                         int e = qu.poll();
//                         qu.offer(e);
//                       }
//                     }
//                   }
//
//                   public int pop() {
//                     if(qu.size()==0) return -1;
//                     return qu.poll();
//                   }
//
//                   public int peek() {
//                     return qu.peek();
//                   }
//
//                   public boolean empty() {
//                     if(qu.size()==0) return true;
//                     return false;
//                   }
//
//                   public static void main(String[] args) {
//                     JavaCourseQueue jj = new JavaCourseQueue();
//                     jj.push(1);
//                     jj.push(2);
//                     jj.push(3);
//                     System.out.println(jj.pop());
//                     System.out.println(jj.peek());
//
//                   }
//                 }







                           //  DeQueue -------->>>>


//                 import java.util.ArrayDeque;
//                 import java.util.Deque;
//
//                 public class JavaCourseQueue{
//          public static void main(String[] args) {
//
//              Deque<Integer> d = new ArrayDeque<>();
//
//              d.offer(10);
//              d.offerFirst(1);
//              d.offerLast(100);
//
//              System.out.println(d.peek());
//              System.out.println(d.peekFirst());
//              System.out.println(d.peekLast());
//
//              System.out.println(d.poll());
//              System.out.println(d.pollFirst());
//              System.out.println(d.pollLast());
//          }
//}
//





                 //   Window sliding problem using deque ---->
                              //  Solved in leetcode --->>
                         //  Time complexity :O(n)
                          //  space complexity :O(n)



//                 class Solution {
//                   public int[] maxSlidingWindow(int[] nums, int k) {
//                     int[] ans = new int[nums.length-k+1];
//                     int ans_idx=0;
//
//                     Deque<Integer> dq = new ArrayDeque<Integer>();
//
//                     for(int i=0;i<nums.length;i++){
//                       if(!dq.isEmpty() && dq.peek()==i-k){
//                         dq.poll();
//                       }
//                       while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
//                         dq.pollLast();
//                       }
//
//                       dq.offer(i);
//                       if(i>=k-1){
//                         //  ans[ans_idx]=nums[dq.peek()];
//                         //  ans_idx++;
//                         ans[ans_idx++]=nums[dq.peek()];
//
//
//                       }
//                     }
//
//                     return ans;
//
//                   }
//                 }






                               //  Pw YouTube course -------------------->>>



       //  Problem  print Queue element not using build in method using extra Queue add,delete,peek,pop methods ---->>

//         import java.util.Arrays;
//         import java.util.LinkedList;
//         import java.util.Queue;
//        public class JavaCourseQueue{
//          public static void main(String[] args) {
//            Queue<Integer> qu = new LinkedList<>();
//            Queue<Integer> helper = new LinkedList<>();
//            qu.offer(10);              //  front-> 10,20,30,40,50 <-rear
//            qu.offer(20);
//            qu.offer(30);
//            qu.offer(40);
//            qu.offer(50);
//            while (!qu.isEmpty()){
//              System.out.print(qu.peek()+" ");
//              int e  = qu.poll();
//              helper.offer(e);
//            }
//            while (!helper.isEmpty()){
//              int e = helper.poll();
//              qu.offer(e);
//            }
//
//
//          }
//}

           //  Problem  print Queue element not using build in method using extra Array add,delete,peek,pop methods ---->>

//  public class JavaCourseQueue{
//    public static void main(String[] args) {
//      Queue<Integer> q  =new LinkedList<>();
//      q.offer(10);
//      q.offer(20);
//      q.offer(30);
//      q.offer(40);
//      q.offer(50);
//      int[] helper = new int[q.size()];
//      int idx=0;
//      while (!q.isEmpty()){
//        System.out.print(q.peek()+" ");
//        int e  = q.poll();
//        helper[idx++]=e;
//        // idx++;
//      }
//      for (int i=0;i<helper.length;i++){
//        q.offer(helper[i]);
//      }
//      System.out.println(q);
//
//
//    }
//}



                 //  Array implementation Queue or Implement Own Queue  using Array   ---------->>>>>


//public class JavaCourseQueue{
//   static class queue{
//        int[] arr = new int[5];    //  we  give any random size
//        int front=0;
//        int rear=0;
//        int size = 0;
//        public void add(int n){
//            if (rear==0){
//                arr[rear++]=n;
//            }else if (rear==arr.length){
//                return;
//            }
//            else {
//                arr[rear++]=n;
//            }
//            size++;
//        }
//        public int delete(){
//           if (size==0){
//               System.out.println("Nothing to be delete !!");
//               System.exit(0);  // because return type is int but i have nothing to return then we can do this
//           }
//               int e  = arr[front];
//               front++;
//               size--;
//               return e;
//        }
//        public int peek(){
//            if (size==0){
//                System.out.println("No element present ");
//                System.exit(0);       // return or System.exit()
//            }
//            return arr[front];
//        }
//        public boolean isEmpty(){
//            if (size==0) return true;
//            return false;
//        }
//        public void display(){
//            for (int i=front;i<rear;i++){
//                System.out.print(arr[i]+" ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        queue qu = new queue();
//        qu.add(1);
//        qu.add(2);
//        qu.add(3);
//        qu.add(4);
//        qu.add(5);
//        qu.display();
//        System.out.println(qu.delete());
//        System.out.println(qu.delete());
//
//        qu.display();
//        System.out.println(qu.isEmpty());
//
//    }
//}


                 //  Linkedlist implementation of Queue  ------------------>>

//   public class JavaCourseQueue{
//      static class Node{
//           int data;
//           Node next;
//           Node(int da){
//               this.data=da;
//               this.next=null;
//           }
//       }
//      static class queue{
//           int size=0;
//           Node head=null;
//           Node temp=null;
//           public void add(int val){
//               Node nn = new Node(val);
//               if (head==null){
//                   head=nn;
//                   temp=nn;
//               }
//               else {
//                   temp.next=nn;
//                   temp=temp.next;
//               }
//               size++;
//
//           }
//           public int poll(){
//               if (size==0){
//                   System.out.println("No element present ");
//                   //return -1;
//                   System.exit(0);
//               }
//               int a = head.data;
//               head=head.next;
//               size--;
//               return a;
//           }
//           public int peek(){
//               if (size==0){
//                   System.out.println("no element");
//                   //return -1;
//                   System.exit(0);
//               }
//               return head.data;
//           }
//
//           public void display(){
//               Node temp =head;
//               while (temp!=null){
//                   System.out.print(temp.data+" ");
//                   temp=temp.next;
//               }
//               System.out.println();
//           }
//       }
//       public static void main(String[] args) {
//
//           queue qu = new queue();
//           qu.add(1);
//           qu.add(2);
//           qu.add(3);
//           qu.add(4);
//           qu.add(5);
//          qu.display();
//           System.out.println(qu.poll());
//           qu.display();
//           System.out.println(qu.poll());
//           qu.display();
//
//       }
//}
//




                 //  Array implementation of circular Queue ---------->>


// public class JavaCourseQueue{
//     static class queue{
//         int[] arr = new int[4];
//         int size=0;
//         int front =0;
//         int rear =0;
//         public void add(int val){
//             if (size==0){     // when size ==0 then front=0 and rear = 0
//                 arr[rear]=val;    // arr[front]=val  or arr[rear] =val  is same for now
//                 rear++;
//             }else if (size==arr.length){
//                 return;
//             }else if (rear==arr.length){
//                 rear=0;
//                 arr[rear++]=val;
//             }else {
//                 arr[rear++]=val;
//             }
//             size++;
//         }
//         public int poll(){
//             if (size==0){
//                 System.out.println("No element");
//                 return -1;
//             }else if (front==arr.length){
//                 front=0;
//                 int a = arr[front];
//                 front++;
//                 size--;
//                 return a;
//             }else {
//                 int e = arr[front];
//                 front++;
//                 size--;
//                 return e;
//             }
//
//         }
//         public int peek(){
//             if (size==0){
//                 System.out.println();
//                 return -1;
//             }
//             return arr[front];
//         }
//         public void display(){
//             if (size==0) return;
//             if (front<rear){
//                 for (int i=front;i<rear;i++) {
//                     System.out.print(arr[i]+" ");
//                 }
//                 System.out.println();
//             }
//             if (rear<=front){
//                 for (int i=front;i<arr.length;i++){
//                     System.out.print(arr[i]+" ");
//                 }
//                 for (int i=0;i<rear;i++){
//                     System.out.print(arr[i]+" ");
//                 }
//
//                 System.out.println();
//             }
//         }
//     }
//     public static void main(String[] args) {
//
//         queue qu =new queue();
//         qu.add(1);
//         qu.add(2);
//         qu.add(3);
//         qu.add(4);
//         System.out.println(Arrays.toString(qu.arr));
//        qu.display();
//         System.out.println(qu.poll());
//         System.out.println(qu.poll());
//         qu.display();
//         qu.add(5);
//         qu.display();
//         qu.add(6);
//         qu.display();
//
//     }
//}


                 // Queue roblems  --------->>>



       //  problem .   Reverse the queue  ----------->
//
//        import java.util.LinkedList;
//        import java.util.Queue;
//        import java.util.Stack;
//
//                 public  class JavaCourseQueue{
//     public static void main(String[] args) {
//         Queue<Integer> qu = new LinkedList<>();
//         Stack<Integer> st = new Stack<>();
//         qu.offer(1);
//         qu.offer(2);
//         qu.offer(3);
//         qu.offer(4);
//         System.out.println(qu);
//         while (!qu.isEmpty()){
//             st.push(qu.poll());
//         }
//         while (!st.empty()){
//             qu.offer(st.pop());
//         }
//         System.out.println("after reverse the Queue :"+qu);
//
//     }
//}


              //  Reverse first k elements of queue ----------->>


//    import java.util.*;
//    public class JavaCourseQueue {
//        public static void main(String[] args) {
//            Queue<Integer> qu = new LinkedList<>();
//            Stack<Integer> st = new Stack<>();
//            int k =3;
//            qu.offer(1);
//            qu.offer(2);
//            qu.offer(3);
//            qu.offer(4);
//            qu.offer(5);
//            System.out.println(qu);
//            int n = qu.size()-k;
//            while (qu.size()>=k){
//                st.push(qu.poll());
//            }
//            while (!st.empty()){
//                qu.offer(st.pop());
//            }
//            System.out.println(qu); //
//          for (int i=1;i<=n;i++) {
//              qu.offer(qu.poll());
//          }
//              System.out.println(qu);
//
//        }
//}



                 //   First negative integer of each window      solved in GFG------->>


//                 class Compute {
//
//                   public long[] printFirstNegativeInteger(long A[], int N, int K)
//                   {
//                     Queue<Integer> qu = new ArrayDeque<>();
//                     long[] result = new long[N-K+1];  // N is A.length
//                     for(int i=0;i<N;i++){
//                       if(A[i]<0){
//                         qu.offer(i);    // we store indexes
//                       }
//                     }
//                     for(int i=0;i<N-K+1;i++){
//                       if(qu.size()>0 && qu.peek()<i) qu.poll();
//                       if(qu.size()>0 && qu.peek()<=i+K-1){
//                         result[i]=A[qu.peek()];
//                       }else if(qu.size()==0) result[i]=0;
//                       else{
//                         result[i]=0;
//                       }
//
//                     }
//                     return result;
//
//                   }
//                 }
//



                      //     Reorder Queue (interleave ist halt with 2nd half)  ------>>
                                 // ex -  1 2 3 4 5 6 7 8  first halt = 1 2 3 4 and second half = 5 6 7 8  ans = 1 5 2 6 3 7 4 8

                 import java.util.ArrayDeque;
                 import java.util.Queue;
                 import java.util.Stack;

                 public class JavaCourseQueue{
      public static void main(String[] args) {
        Queue<Integer> qu =new ArrayDeque<>();
        Stack<Integer> st =new Stack<>();
        qu.offer(1);
        qu.offer(2);
        qu.offer(3);
        qu.offer(4);
        qu.offer(5);
        qu.offer(6);
        qu.offer(7);
        qu.offer(8);
          System.out.println(qu);

        int half = qu.size()/2;
        for (int i=1;i<=half;i++){
          st.push(qu.poll());
        }
        while (!st.empty()){
            qu.offer(st.pop());
        }
        for (int i=1;i<=half;i++){
            st.push(qu.poll());
        }
        while (!st.empty()){
            qu.offer(st.pop());
            qu.offer(qu.poll());
        }
        while (!qu.isEmpty()){
            st.push(qu.poll());
        }
        while (!st.isEmpty()){
            qu.offer(st.pop());
        }

          System.out.println(qu);

      }
}