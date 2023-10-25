package JavaCourseStackQueue;





                                // Stack data Structure ----->>>>



//import java.util.Stack;
//public class JavaCourseStack {
//    public static void main(String[] args) {
//        Stack<Integer> sk = new Stack<>();
//        sk.push(10);
//        sk.push(50);
//        sk.push(100);
//        sk.push(20);
//
//        System.out.println(sk.size());
//        System.out.println(sk.pop());
//        System.out.println(sk.peek());
//
//        System.out.println(sk.empty());
//        System.out.println(sk.search(100));  // it give us the position of 100 in stack
//
//
//    }
//}




             // problem ---->>  Valid Parenthesis
                          // Time Complexity :O(n)
                           // Space complexity :O(n);
//
//import java.util.Stack;
//
//public class JavaCourseStack {
//
//    public boolean isValid(String s){
//        char[] cr = s.toCharArray();
//        Stack<Character> stk = new Stack<>();
//        for (int i=0;i<cr.length;i++){
//            if (cr[i]=='(' || cr[i]=='{' || cr[i]=='['){
//                stk.push(cr[i]);
//                continue;
//            }else if (stk.empty()){
//                return false;
//            }
//            char openbr=stk.pop();
//            if (openbr=='(' && cr[i]!=')'){
//                return false;
//            }else if (openbr=='{' && cr[i]!='}'){
//                return false;
//            }else if (openbr=='[' && cr[i]!=']'){
//                return false;
//            }
//        }
//        if (stk.empty()==true){
//            return true;
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//
//        String ss = "((){}[])";
//
//         JavaCourseStack js =new JavaCourseStack();
//        System.out.println(js.isValid(ss));
//
//    }
//}

        // problem ---->>  Valid Parenthesis    solved in leetcode
//class Solution {
//    public boolean isValid(String s) {
//        Stack<Character> st = new Stack<>();
//        for(int i=0;i<s.length();i++){
//            char c  = s.charAt(i);
//            if(c=='(' || c=='{' || c=='['){
//                st.push(c);
//            }else{
//                if(st.empty()){
//                    return false;
//                }else if(st.peek()=='(' && c==')') st.pop();
//                else if(st.peek()=='{' && c=='}') st.pop();
//                else if(st.peek()=='[' && c==']') st.pop();
//                else if(st.peek() !=c) return false;
//            }
//        }
//
//        if(st.size()==0) return true;
//        return false;
//    }
//}

             //  longest area of a histrogram;-------------->>>>>>
                     // Time Complexity :O(n)
                      // Space complexity :O(n);

//import java.util.Stack;
//
//public class JavaCourseStack {
//    public static void main(String[] args) {
//
//        int[] arr={2,1,5,6,2,3};    // each element is height of each building
//
//        Stack<Integer> sk = new Stack<>();
//        int[] leftBoundry=new int[arr.length];
//        leftBoundry[0]=-1;
//        sk.push(0);
//        for (int i=1;i<arr.length;i++){
//           while (sk.size()>0 && arr[i]<=arr[sk.peek()]){
//               sk.pop();
//           }
//           if (sk.isEmpty()){
//               leftBoundry[i]=-1;
//           }else {
//               leftBoundry[i]=sk.peek();
//           }
//           sk.push(i);
//        }
//
//        int [] rightBoundry=new int[arr.length];
//       sk=new Stack<>();     // initialize stack empty
//        rightBoundry[arr.length-1]=arr.length;
//        sk.push(arr.length-1);
//        for (int i =arr.length-2;i>=0;i--){
//            while (sk.size()>0 && arr[i]<=arr[sk.peek()]){
//                sk.pop();
//            }
//            if (sk.isEmpty()){
//                rightBoundry[i]=arr.length;
//            }else {
//                rightBoundry[i]=sk.peek();
//            }
//            sk.push(i);
//        }
//
//        int maxArea=0;
//        for (int i=0;i<arr.length;i++){
//            int width=rightBoundry[i]-leftBoundry[i]-1;
//            int area= width*arr[i];
//            maxArea=Math.max(area,maxArea);
//        }
//
//        System.out.println("max rectangular of a histrogram is :"+maxArea);
//
//
//    }
//}




//import java.util.Stack;
//
//public class JavaCourseStack {
//    public static void main(String[] args) {
//        Stack<Integer> s =new Stack<>();
//        s.push(1);
//        s.push(1);
//        s.push(1);
//        s.push(1);
//
//        System.out.println(s.empty());
//        System.out.println(s.size());
//        System.out.println(s.isEmpty());
//    }
//}






        //  Pw YouTube course


                //  enter  5 using for loop element in stack
//
//
//import java.util.Scanner;
//import java.util.Stack;
//
//public class JavaCourseStack {
//    public static void main(String[] args) {
//
//        Stack s1 =new Stack<>();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the stack element number");
//        int n = sc.nextInt();
//        System.out.println("Enter the elements ->");
//        for (int i=1;i<=n;i++){
//            int x = sc.nextInt();
//            s1.push(x);
//        }
//
//        System.out.println(s1);
//
//
//    }
//}





//               //   Print stack element reverse order --->>  like   [1, 2, 3, 4, 5] = [5, 4, 3, 2, 1]
//
//
//import java.util.Stack;
//
//public class JavaCourseStack {
//       public static void main(String[] args) {
//
//           Stack<Integer> s1 = new Stack<>();
//           Stack<Integer> s2 = new Stack<>();
//
//           s1.push(1);
//           s1.push(2);
//           s1.push(3);
//           s1.push(4);
//           s1.push(5);
//
//           System.out.println(s1);
//           while (!s1.empty()){
//              int e= s1.pop();
//              s2.push(e);
//           }
//
//
//           System.out.println(s2);
//
//       }
//}




                  //  Copy the exact stack in another stack    like  [1, 2, 3, 4, 5] = [1, 2, 3, 4, 5]
//
//
//import java.util.Stack;
//
//public class JavaCourseStack {
//    public static void main(String[] args) {
//
//        Stack<Integer> s1 = new Stack<>();
//        Stack<Integer> helper = new Stack<>();
//        Stack<Integer> s2 = new Stack<>();
//
//        s1.push(1);
//        s1.push(2);
//        s1.push(3);
//        s1.push(4);
//        s1.push(5);
//
//        System.out.println(s1);
//
//        while (!s1.isEmpty()){
//            int e=s1.pop();
//            helper.push(e);
//        }
//
//        while (!helper.isEmpty()){
//            int e = helper.pop();
//            s2.push(e);
//        }
//
//        System.out.println("copy of s1 ");
//        System.out.println(s2);
//
//
//    }
//}





                 //  Reverse the same stack --->>
//
//
//import java.util.Stack;
//
//public class JavaCourseStack {
//    public static void main(String[] args) {
//
//        Stack<Integer> ss = new Stack<>();
//        Stack<Integer> helper1 = new Stack<>();
//        Stack<Integer> helper2 = new Stack<>();
//
//        ss.push(1);
//        ss.push(2);
//        ss.push(3);
//        ss.push(4);
//        ss.push(5);
//        System.out.println(ss);
//
//        while (!ss.isEmpty()){
//            int a = ss.pop();
//            helper1.push(a);
//        }
//
//        while (!helper1.isEmpty()){
//            int a = helper1.pop();
//            helper2.push(a);
//        }
//
//        while (!helper2.isEmpty()){
//            ss.push(helper2.pop());
//        }
//
//        System.out.println("Reverse the same stack ");
//        System.out.println(ss);
//
//
//    }
//}


                 //  Insert number in stack at bottom  and any position(assume that 0 base indexing)
//
//
//import java.util.Stack;
//public class JavaCourseStack {
//    public static void main(String[] args) {
//
////        //  Insert 5 in stack at bottom --->>
////
////        Stack<Integer> s1 = new Stack<>();
////        Stack<Integer> s2 = new Stack<>();
////
////        s1.push(1);
////        s1.push(2);
////        s1.push(3);
////        s1.push(4);
////        //  Insert number in stack at bottom --->>
////        while (!s1.isEmpty()){
//////            int e = s1.pop();
//////            s2.push(e);
////            s2.push(s1.pop());
////        }
////        s1.push(5);   // after empty the s1 stack
////        while (!s2.isEmpty()){
////            s1.push(s2.pop());
////        }
////        System.out.println(s1);
//
//
//        //  Insert number in stack  any position(assume that 0 base indexing)
//
//        Stack<Integer> st1 = new Stack<>();
//        Stack<Integer> st2 = new Stack<>();
//        st1.push(1);
//        st1.push(2);
//        st1.push(3);
//        st1.push(4);
//        // insert 5 at 2 index -->>
//        int n =2;
//        while (st1.size()>n){
//           st2.push(st1.pop());
//        }
//        st1.push(5);
//        while (!st2.empty()){
//            st1.push(st2.pop());
//        }
//        System.out.println(st1);
//
//
//
//    }
//}

              // using recursion Insert number in stack at bottom  and any position(assume that 0 base indexing) --->>>
//
//import java.util.Stack;
//
//public class JavaCourseStack {
//
//    // using recursion Insert number in stack at bottom --->>
//    public static void insertAtBottom(int n , Stack<Integer> st){
//        if (st.isEmpty()){
//            st.push(n);
//            return;
//        }
//        int e = st.pop();
//        insertAtBottom(n,st);
//        st.push(e);
//    }
//    // using recursion Insert number in stack at  any position(assume that 0 base indexing) --->>>
//    public static void insertAnyPosition(int n,int position,Stack<Integer> ss){
//        if (ss.size()==position){
//            ss.push(n);
//            return;
//        }
//        int e = ss.pop();
//        insertAnyPosition(n,position,ss);
//        ss.push(e);
//    }
//
//
//    public static void main(String[] args) {
//        Stack<Integer> ss = new Stack<>();
//        ss.push(1);
//        ss.push(2);
//        ss.push(3);
//        ss.push(4);
//        insertAtBottom(5,ss);
//        System.out.println(ss);
//        insertAnyPosition(30,2,ss);
//        System.out.println(ss);
//
//    }
//}




               // Stack Printing pattern and process ---->>

//import java.util.Stack;
//public class JavaCourseStack {
//    public static void main(String[] args) {
//
//            //1.  Print Stack Bottom to Top  using another stack  --->>
////        Stack<Integer> ss = new Stack<>();
////        ss.push(1);
////        ss.push(2);
////        ss.push(3);
////        ss.push(4);
////        Stack<Integer> ss2 = new Stack<>();
////        while (!ss.isEmpty()){
////            ss2.push(ss.pop());
////        }
////        while (!ss2.isEmpty()){
////            int e = ss2.pop();
////            System.out.print(e+" ");
////            ss.push(e);
////        }
//
//        //2.  Print Stack Bottom to Top  using another array  --->>
////        Stack<Integer> s1 = new Stack<>();
////        s1.push(1);
////        s1.push(2);
////        s1.push(3);
////        s1.push(4);
////        int[] arr = new int[s1.size()];
////        for (int i = arr.length-1;i>=0;i--){
////            int e  =s1.pop();
////            arr[i]=e;
////        }
////        for (int i=0;i<arr.length;i++){
////            System.out.print(arr[i]+" ");
////            s1.push(arr[i]);
////        }
////        System.out.println(s1);
//
//    }
//}


              //  Print stack using recursion ------>>
//
//
//public class JavaCourseStack {
//
//    // 1.  using recursion print stack top to bottom means reverse order --->
//    public static void printStackReverse(Stack<Integer> stk){
//        if (stk.isEmpty()){
//            return;
//        }
//        int e  = stk.pop();
//        System.out.print(e+" ");
//        printStackReverse(stk);
//        stk.push(e);    // because after complete printing add those thing same order
//
//    }
//
//    // 1.  using recursion print stack Bottom to Top ---->>
//    public static void printStackBottomToTop(Stack<Integer> st){
//        if (st.isEmpty()){
//            return;
//        }
//        int e = st.pop();
//        printStackBottomToTop(st);
//        System.out.print(e+" ");
//        st.push(e);
//    }
//
//    public static void main(String[] args) {
//
//        Stack<Integer> st = new Stack<>();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        printStackReverse(st);
//        System.out.println();
//        printStackBottomToTop(st);
//
//
//
//
//    }
//}


//             // Remove  Bottom element and any index  element iteratively and recursively  ------->>>
//
//
//import java.util.Stack;
//public class JavaCourseStack {
//
//    // Remove  Bottom element iteratively  ------->>>
//    public static void deleteBottomElementRecursively(Stack<Integer> s){
//        if (s.size()==1){
//            s.pop();
//            return;
//        }
//        int e = s.pop();
//        deleteBottomElementRecursively(s);
//        s.push(e);
//
//    }
//    // Remove any index or position element Recursively(assume 0 base indexing)  ------->>>
//    public static void deleteAnyElement(int index,Stack<Integer> ss){
//        if (ss.size()==index+1){
//            ss.pop();
//            return;
//        }
//        int e=ss.pop();
//        deleteAnyElement(index,ss);
//        ss.push(e);
//    }
//
//
//    public static void main(String[] args) {
//
////        // Remove  Bottom element iteratively  ------->>>
////        Stack<Integer> st = new Stack<>();
////        Stack<Integer> st2 = new Stack<>();
////        st.push(1);
////        st.push(2);
////        st.push(3);
////        st.push(4);
////
////        while (st.size()>1){
////            st2.push(st.pop());
////        }
////        st.pop();
////        while (!st2.isEmpty()){
////            st.push(st2.pop());
////        }
////        System.out.println(st);
////
////        // Remove any index or position element iteratively(assume 0 base indexing)  ------->>>
////        Stack<Integer> ss = new Stack<>();
////        Stack<Integer> ss2 = new Stack<>();
////        ss.push(1);
////        ss.push(2);
////        ss.push(3);
////        ss.push(4);
////
////
////        int idx = 2;
////        while (ss.size()>idx+1){
////            ss2.push(ss.pop());
////        }
////        ss.pop();
////        while (!ss2.isEmpty()){
////            ss.push(ss2.pop());
////        }
////        System.out.println(ss);
//
//
//        Stack<Integer> sc = new Stack<>();
//        sc.push(1);
//        sc.push(2);
//        sc.push(3);
//        sc.push(4);
//        sc.push(5);
//        deleteBottomElementRecursively(sc);
//        System.out.println(sc);
//        deleteAnyElement(1,sc);
//        System.out.println(sc);
//
//    }
//}


               //  Reverse the Original Stack Using Recursion  ------>>
//
//import java.util.Stack;
//public class JavaCourseStack {
//
//    public static void pushtAtBottom(int n,Stack<Integer> ss){
//        if (ss.size()==0){
//            ss.push(n);
//            return;
//        }
//       int e  = ss.pop();
//       pushtAtBottom(n,ss);
//       ss.push(e);
//    }
//    public static void reverseUsingResursion(Stack<Integer> stc){
//        if (stc.size()==1){
//            return;
//        }
//        int e = stc.pop();
//        reverseUsingResursion(stc);
//       pushtAtBottom(e,stc);
//    }
//    public static void main(String[] args) {
//        Stack<Integer> ss  =new Stack<>();
//        ss.push(1);
//        ss.push(2);
//        ss.push(3);
//        ss.push(4);
//        reverseUsingResursion(ss);
//        System.out.println(ss);
//
//
//    }
//}


                  //    Implement own stack using array  ------>>
//
//public class JavaCourseStack {
//   static class MyStack{
//      int[] arr =new int[10];
//      int idx=0;
//      void push(int n){
//          if (idx==arr.length){
//              System.out.println("Not possible");
//              return;
//          }
//          arr[idx]=n;
//          idx++;
//      }
//      int peek(){
//          if (idx==0){
//              System.out.println("Not element present !");
//              return -1;
//          }
//          return arr[idx-1];
//      }
//
//      int pop(){
//          if (idx==0){
//              System.out.println("Not element present !");
//              return -1;
//          }
//          else {
//             int ans = arr[idx-1];
//              arr[idx-1]= 0;      //  here after delete element we can keep 0 default
//              idx--;
//              return ans;
//          }
//      }
//      boolean isEmpty(){
//          if (idx==0){
//              return true;
//          }
//          return false;
//      }
//      boolean isFull(){
//          if (idx==arr.length){
//              return true;
//          }
//          return false;
//      }
//      int size(){
//          return idx;
//      }
//      void displayStack(){
//          for (int i = 0;i<idx;i++){
//              System.out.print(arr[i]+" ");
//          }
//          System.out.println();
//      }
//
//    }
//    public static void main(String[] args) {
//
//        MyStack ms = new MyStack();
//        ms.push(1);
//        ms.push(2);
//        ms.push(3);
//        ms.push(4);
//        ms.push(5);
//        ms.displayStack();
//
//        System.out.println(ms.peek());
//        System.out.println(ms.pop());
//        System.out.println(ms.pop());
//        ms.displayStack();
//
//    }
//}



               //   Implement own Stack Using LinkedList ----->>
//
//
//public class JavaCourseStack {
//
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//        static class MyStack{
//            Node head;
//            int size=0;
//            void push(int n){
//                Node nn = new Node(n);
//                nn.next=head;
//                head=nn;
//                size++;
//            }
//            int peek(){
//                if (head==null){
//                    System.out.println("No element present !!");
//                    return -1;
//                }
//                int ans = head.data;
//                return ans;
//            }
//            int pop(){
//                if (head==null){
//                    System.out.println("No element present !!");
//                    return -1;
//                }
//                int ans = head.data;
//                head=head.next;
//                size--;
//                return ans;
//            }
//
//            boolean isEMpty(){
//                if (size==0){
//                    return true;
//                }
//                return false;
//            }
//
//            void display(Node head){
//                if (head==null){
//                    return;
//                }
//               display(head.next);
//                System.out.print(head.data+" ");
//            }
//
//        }
//
//    public static void main(String[] args) {
//     MyStack ms = new MyStack();
//      ms.push(1);
//        ms.push(2);
//        ms.push(3);
//        ms.push(4);
//
//        ms.display(ms.head);
//        System.out.println();
//        System.out.println(ms.peek());
//        System.out.println(ms.pop());
//        System.out.println(ms.pop());
//        ms.display(ms.head);
//
//    }
//}





               // Pw YouTube  Stack  Problems     ---------------->>


       //  1.  Balanced parenthesis  or  valid parenthesis    here we concern only first brackets----->>
     //  2.  Find the minimum Number of brackets that we need to delete to make the brackets balanced-------->>
//
//import java.util.Stack;
//
//public class JavaCourseStack {
//
//    //  1.  Balanced parenthesis  or  valid parenthesis    here we concern only first brackets----->>
//    public static boolean isValid(String ss){
//        Stack<Character> sc  =new Stack<>();
//        for (int i=0;i<ss.length();i++){
//            char c = ss.charAt(i);
//            if (c=='('){
//                sc.push(c);
//            }else {
//               if (sc.empty()){
//                   return false;
//               }else if (sc.peek()=='('){
//                   sc.pop();
//               }
//            }
//        }
//
//        if (sc.size()==0){       // sc.empty()   or sc.size()==0
//            return true;
//        }
//        return false;
//    }
//
//    //  2.  Find the minimum Number of brackets that we need to delete to make the brackets balanced-------->>
//    public static int minimumDeleteBrackets(String ss){
//        Stack<Character> sk = new Stack<>();
//        int count=0;
//        for (int i =0;i<ss.length();i++){
//            char c  = ss.charAt(i);
//            if (c=='('){
//                sk.push(c);
//            }else {
//                if (sk.empty()){
//                   count++;
//                }else if (sk.peek()=='('){
//                    sk.pop();
//                }
//            }
//        }
//
//        if (sk.size()>0){               // sc.empty()   or sc.size()==0
//            count+= sk.size();
//        }
//        return count;
//    }
//
//
//    public static void main(String[] args) {
////        String  ss = new String("(()(()))");
////        String  ss2 = new String("()(())(");
////        String  ss3 = new String("()())");
////
////        System.out.println(isValid(ss));
////        System.out.println(isValid(ss2));
////        System.out.println(isValid(ss3));
//
//        String s1 = "(((()";
//        System.out.println(minimumDeleteBrackets(s1));
//        String s2 = "()()))";
//        System.out.println(minimumDeleteBrackets(s2));
//
//
//    }
//}

               //  problem-   Remove consecutive subsequences.  Remove all the consecutive subsequences of length greater than or
               //             equal to 2 that contains the same element.
//
//import java.util.Stack;
//
//public class JavaCourseStack {
//
//    public static int[] removeConsecutive(int[] arr){
//        Stack<Integer> ss = new Stack<>();
//        for (int i=0;i<arr.length;i++) {
//            if (ss.empty() || ss.peek() != arr[i]) {
//                ss.push(arr[i]);
//            }else if (ss.peek()==arr[i]){
//                if (i==arr.length-1 || arr[i]!=arr[i+1]){
//                    ss.pop();
//                }
//            }
//        }
//        int[] ans = new int[ss.size()];
//        for (int i =ans.length-1;i>=0;i--){
//            ans[i]=ss.pop();            //   ans[i]=ss.pop();  or i can write  ans[i]=ss.peek();
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7};
//        int[] a = removeConsecutive(arr);
//        for (int e: a){
//            System.out.print(e+" ");
//        }
//
//    }
//}


           //  Next greater element for each element   -------->>

   //1.  Normal approach which time Complexity O(n^2)
//
//public class JavaCourseStack {
//    public static void main(String[] args) {
//        int[] arr = {1,3,2,1,8,6,3,4};
//        int[] result = new int[arr.length];
//        for (int i=0;i<result.length;i++){
//            result[i]=-1;                          // all default value we added -1
//        }
//        for (int i =0;i< arr.length;i++){
//            for (int j = i+1;j<arr.length;j++){
//                if (arr[i]<arr[j]){
//                    result[i]=arr[j];
//                    break;
//                }
//            }
//        }
//
//        for (int e: arr){
//            System.out.print(e+" ");
//        }
//        System.out.println();
//        for (int e: result){
//            System.out.print(e+" ");
//        }
//    }
//}

   // 2. Optimize Approach  which TimeComplexity : O(n) ------->>>

//import java.util.Arrays;
//import java.util.Stack;
//public class JavaCourseStack {
//    public static  int[] nextGreater(int[] arr){
//        int[] result = new int[arr.length];
//        Stack<Integer> stk = new Stack<>();
//        result[result.length-1]=-1;           //  because the last element have no greatest element
//        stk.push(arr[arr.length-1]);
//        for (int i= arr.length-2 ;i>=0;i--){
//            while (!stk.empty() && arr[i]>stk.peek()){
//                stk.pop();
//            }
//            if (stk.size()==0){
//                result[i]=-1;
//            }else {
//                result[i]=stk.peek();
//            }
//            stk.push(arr[i]);
//        }
//        return result;
//    }
//    public static void main(String[] args) {
//        int[] arr = {1,3,2,1,8,6,3,4};
//        System.out.println(Arrays.toString(arr));
//     int[] ans = nextGreater(arr);
//        System.out.println(Arrays.toString(ans));
//
//
//    }
//}


         // Previous Greater Element for each element   --------->>
//
//import java.util.Stack;
//import java.util.Arrays;
//public class JavaCourseStack {
//    public static int[] previousGreater(int[] arr){
//        Stack<Integer> sk = new Stack<>();
//        int[] result = new int[arr.length];
//        result[0]=-1;
//        sk.push(arr[0]);
//        for (int i=1;i<arr.length;i++){
//            while (!sk.isEmpty() && arr[i]>sk.peek()){
//                sk.pop();
//            }
//            if (sk.isEmpty()){
//                result[i]=-1;
//            }
//            else {
//                result[i]=sk.peek();
//            }
//            sk.push(arr[i]);
//        }
//          return result;
//    }
//    public static void main(String[] args) {
//        int[] arr = {1,3,2,1,8,6,3,4};
//        System.out.println(Arrays.toString(arr));
//     int[] ans =previousGreater(arr);
//        System.out.println(Arrays.toString(ans));
//    }
//}


        //  Given a series of N daily price quotes for a stock we need to calculate the  sum of the
        //  stock's price for all N days The Span of the stock's price in the one day is the maximum
        // number of consecutive days (starting from that day and going backward ) for which the stock
        // price was less than or equal to the price of that day.--------->>


//import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.Stack;
//
//public class JavaCourseStack {
//    public static int[] maxStock(int[] arr){
//        int[] ans  = new int[arr.length];
//        Stack<Integer> sk =new Stack<>();
//        ans[0]=1;
//        sk.push(0);    // because the first element index is  0  and here we stroe indexes not value
//        for (int i=1;i<arr.length;i++){
//            while (!sk.empty() && arr[sk.peek()]<arr[i]){
//                sk.pop();
//            }
//            if (sk.isEmpty()){
//                ans[i]=i-(-1);
//            }else {
//                ans[i]=i-sk.peek();
//            }
//            sk.push(i);
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//   int[] arr = {100,80,60,70,60,75,85};
//        System.out.println(Arrays.toString(arr));
//   int[] a = maxStock(arr);
//        System.out.println(Arrays.toString(a));
//
//    }
//}



                                      // Stack infix , postfix,prefix concepts ------>>



                 //   infix mean human readble equation number operator number operator so on   ex - a+b-c
        // problem  calculate  8-5+3*4/6 thid kind of problems     * and /  priority is greater than + and - and calculate left to right
//
//import java.util.Stack;
//public class JavaCourseStack {
//    public static void main(String[] args) {
//        Stack<Integer> valueStack = new Stack<>();
//        Stack<Character> operatorStack = new Stack<>();
//        String  ss  = "9-3+4*4/2";
//        for (int i =0;i<ss.length();i++){
//            char c  = ss.charAt(i);
//            int asscai = (int) c;       // because we need the asscai value of this particular char
//            if (asscai>=48 && asscai<=57){         // 0 to 9 asscai value is 48 to 57
//                valueStack.push(asscai-48);  // ex=  6 asscai value is 54 so 54-48=6
//            }else {
//                if (operatorStack.empty()){
//                    operatorStack.push(c);
//                }
//                else if (c=='+'||c=='-'){
//                    int val1= valueStack.pop();
//                    int val2 = valueStack.pop();
//                    if (operatorStack.peek()=='+') valueStack.push(val2+val1);
//                    if (operatorStack.peek()=='-') valueStack.push(val2-val1);
//                    if (operatorStack.peek()=='*') valueStack.push(val2*val1);
//                    if (operatorStack.peek()=='/') valueStack.push(val2/val1);
//                    operatorStack.pop();
//                    operatorStack.push(c);
//                }
//                else if (c=='*'||c=='/') {
//                    if (operatorStack.peek() == '*' || operatorStack.peek() == '/') {
//                        int val1 = valueStack.pop();
//                        int val2 = valueStack.pop();
//                        if (operatorStack.peek() == '*') valueStack.push(val2 * val1);
//                        if (operatorStack.peek() == '/') valueStack.push(val2 / val1);
//                        operatorStack.pop();
//                        operatorStack.push(c);
//                    }
//                    else operatorStack.push(c);
//
//                }
//            }
//        }
//
//        while (valueStack.size()>1){
//            int val1 = valueStack.pop();
//            int val2 = valueStack.pop();
//            if (operatorStack.peek()=='+') valueStack.push(val2+val1);
//            if (operatorStack.peek()=='-') valueStack.push(val2-val1);
//            if (operatorStack.peek()=='*') valueStack.push(val2*val1);
//            if (operatorStack.peek()=='/') valueStack.push(val2/val1);
//            operatorStack.pop();
//        }
//        System.out.println(valueStack.peek());
//    }
//}


      // problem  calculate  8-(5+3)*4/6 thid kind of problems     * and /  priority is greater than + and - and calculate left to right
            // if first bracket present then first priority is first brackets element operation
//import java.util.Stack;
//public class JavaCourseStack {
//    public static void main(String[] args) {
//        Stack<Integer> valueStack = new Stack<>();
//        Stack<Character> operatorStack = new Stack<>();
//        String  ss  = "9-(3+4)*4/2";
//        for (int i =0;i<ss.length();i++){
//                        char c  = ss.charAt(i);
//                        int asscai = (int) c;       // because we need the asscai value of this particular char
//                        if (asscai>=48 && asscai<=57){         // 0 to 9 asscai value is 48 to 57
//                            valueStack.push(asscai-48);  // ex=  6 asscai value is 54 so 54-48=6
//                        }else {
//                            if (operatorStack.empty()|| c=='('|| operatorStack.peek()=='('){
//                                operatorStack.push(c);
//                            }
//                            else if (c==')'){
//                                while (operatorStack.peek()!='('){
//                        int val1 = valueStack.pop();
//                        int val2 = valueStack.pop();
//                        if (operatorStack.peek()=='+') valueStack.push(val2+val1);
//                        if (operatorStack.peek()=='-') valueStack.push(val2-val1);
//                        if (operatorStack.peek()=='*') valueStack.push(val2*val1);
//                        if (operatorStack.peek()=='/') valueStack.push(val2/val1);
//                        operatorStack.pop();
//                    }
//                    operatorStack.pop();
//                }
//                else if (c=='+'||c=='-'){
//                    int val1= valueStack.pop();
//                    int val2 = valueStack.pop();
//                    if (operatorStack.peek()=='+') valueStack.push(val2+val1);
//                    if (operatorStack.peek()=='-') valueStack.push(val2-val1);
//                    if (operatorStack.peek()=='*') valueStack.push(val2*val1);
//                    if (operatorStack.peek()=='/') valueStack.push(val2/val1);
//                    operatorStack.pop();
//                    operatorStack.push(c);
//                }
//                else if (c=='*'||c=='/') {
//                    if (operatorStack.peek() == '*' || operatorStack.peek() == '/') {
//                        int val1 = valueStack.pop();
//                        int val2 = valueStack.pop();
//                        if (operatorStack.peek() == '*') valueStack.push(val2 * val1);
//                        if (operatorStack.peek() == '/') valueStack.push(val2 / val1);
//                        operatorStack.pop();
//                        operatorStack.push(c );
//                    }
//                    else operatorStack.push(c);
//
//                }
//            }
//        }
//
//        while (valueStack.size()>1){
//            int val1 = valueStack.pop();
//            int val2 = valueStack.pop();
//            if (operatorStack.peek()=='+') valueStack.push(val2+val1);
//            if (operatorStack.peek()=='-') valueStack.push(val2-val1);
//            if (operatorStack.peek()=='*') valueStack.push(val2*val1);
//            if (operatorStack.peek()=='/') valueStack.push(val2/val1);
//            operatorStack.pop();
//        }
//        System.out.println(valueStack.peek());
//    }
//}
//

               // infix to prefix ---------->>.      prefix mean human operator+val1+val2  ex = a+b-c = +ab-c = -+abc

//import java.util.Stack;
//
//public class JavaCourseStack {
//    public static void main(String[] args) {
//
//        String ss  = "9-(5+3)*4/2";
//        Stack<String> valueStack = new Stack<>();
//        Stack<Character> operatorStack = new Stack<>();
//        for (int i=0;i<ss.length();i++){
//            char cc = ss.charAt(i);
//            int asscai = (int) cc;
//            if (asscai>=48 && asscai<=57){
//                String v = ""+cc;                      // because string + any datatype = string
//                valueStack.push(v);
//            }else {
//                if (operatorStack.empty() || cc=='('||operatorStack.peek()=='('){
//                    operatorStack.push(cc);
//                }else if (cc=='+'||cc=='-'){
//                    String val1 = valueStack.pop();
//                    String  val2 = valueStack.pop();
//                    char op = operatorStack.pop();
//                    valueStack.push(op+val2+val1);
//                    operatorStack.push(cc);
//                }else if (cc=='*' || cc=='/'){
//                    if (operatorStack.peek()=='*'||operatorStack.peek()=='/'){
//                        String val1 = valueStack.pop();
//                        String  val2 = valueStack.pop();
//                        char op = operatorStack.pop();
//                        valueStack.push(op+val2+val1);
//                        operatorStack.push(cc);
//                    }else {
//                        operatorStack.push(cc);
//                    }
//                }else if (cc==')'){
//                    while (operatorStack.peek()!='('){
//                        String val1 = valueStack.pop();
//                        String  val2 = valueStack.pop();
//                        char op = operatorStack.pop();
//                        valueStack.push(op+val2+val1);
//                    }
//                    operatorStack.pop();
//                }
//            }
//        }
//
//        while (valueStack.size()>1){
//            String val1 = valueStack.pop();
//            String  val2 = valueStack.pop();
//            char op = operatorStack.pop();
//            valueStack.push(op+val2+val1);
//        }
//
//        System.out.println(valueStack.peek());
//
//    }
//}



               //  infix to postfix ----------->>>>  postfix means number operator  ex- a+b*c = a+bc* = abc*+

//import java.util.Stack;
//public class JavaCourseStack {
//    public static void main(String[] args) {
//
//        String ss  = "9-(5+3)*4/2";
//        Stack<String> valueStack = new Stack<>();
//        Stack<Character> operatorStack = new Stack<>();
//        for (int i=0;i<ss.length();i++){
//            char cc = ss.charAt(i);
//            int asscai = (int) cc;
//            if (asscai>=48 && asscai<=57){
//                String v = ""+cc;                      // because string + any datatype = string
//                valueStack.push(v);
//            }else {
//                if (operatorStack.empty() || cc=='('||operatorStack.peek()=='('){
//                    operatorStack.push(cc);
//                }else if (cc=='+'||cc=='-'){
//                    String val1 = valueStack.pop();
//                    String  val2 = valueStack.pop();
//                    char op = operatorStack.pop();
//                    valueStack.push(val2+val1+op);
//                    operatorStack.push(cc);
//                }else if (cc=='*' || cc=='/'){
//                    if (operatorStack.peek()=='*'||operatorStack.peek()=='/'){
//                        String val1 = valueStack.pop();
//                        String  val2 = valueStack.pop();
//                        char op = operatorStack.pop();
//                        valueStack.push(val2+val1+op);
//                        operatorStack.push(cc);
//                    }else {
//                        operatorStack.push(cc);
//                    }
//                }else if (cc==')'){
//                    while (operatorStack.peek()!='('){
//                        String val1 = valueStack.pop();
//                        String  val2 = valueStack.pop();
//                        char op = operatorStack.pop();
//                        valueStack.push(val2+val1+op);
//                    }
//                    operatorStack.pop();
//                }
//            }
//        }
//
//        while (valueStack.size()>1){
//            String val1 = valueStack.pop();
//            String  val2 = valueStack.pop();
//            char op = operatorStack.pop();
//            valueStack.push(val2+val1+op);
//        }
//
//        System.out.println(valueStack.peek());
//
//    }
//}




                    //   calculate postfix----------->>>>

//import java.util.Stack;
//
//public class JavaCourseStack {
//    public static void main(String[] args) {
//
//        String ss = "953+4*2/-";             // "9-(5+3)*4/2"
//        Stack<Integer> stck = new Stack<>();
//        for (int i=0;i<ss.length();i++ ){
//            char cc = ss.charAt(i);
//            int asscai=(int) cc;
//            if (asscai<=57 && asscai>=48){
//                stck.push(asscai-48);
//            }else {
//                int val1 = stck.pop();
//                int val2  =stck.pop();
//                if (cc=='+')stck.push(val2+val1);
//                if (cc=='-')stck.push(val2-val1);
//                if (cc=='*') {
//                    stck.push(val2*val1);
//                }
//                if (cc=='/')stck.push(val2/val1);
//            }
//        }
//        System.out.println(stck.peek());
//    }
//}


                  //  Calculate prefix ------------->>>>>>
//
//import java.util.Stack;
//
//public class JavaCourseStack {
//    public static void main(String[] args) {
//
//        String ss = "-9/*+5342";           //  // "9-(5+3)*4/2"
//        Stack<Integer> sk = new Stack<>();
//        for (int i = ss.length()-1;i>=0;i--){
//            char cc = ss.charAt(i);
//            int asscai = (int) cc;
//            if (asscai>=48&&asscai<=57){
//                sk.push(asscai-48);
//            }else {
//                int val1 = sk.pop();
//                int val2 = sk.pop();
//                if (cc=='+')sk.push(val1+val2);       // here val1 first then val2 because stack preserve 2435 sequence val1=5, val2 =3
//                if (cc=='-')sk.push(val1-val2);
//                if (cc=='*')sk.push(val1*val2);
//                if (cc=='/')sk.push(val1/val2);
//            }
//        }
//
//        System.out.println(sk.peek());
//
//    }
//}



                    //  Postfix  to Prefix    -------------------->>
//
//import java.util.Stack;
//public class JavaCourseStack {
//    public static void main(String[] args) {
//        String ss = "953+4*2/-";
//        Stack<String > sk = new Stack<>();
//        for (int i = 0;i<ss.length();i++){
//            char cc  = ss.charAt(i);
//            String v = ""+cc;
//            int asscai = (int) cc;
//            if (asscai<=57 && asscai>=48){
//                sk.push(v);          // because we need to store string
//            }else {
//                String  val1  =sk.pop();
//                String  val2 = sk.pop();
////                if (cc=='+')sk.push(cc+val2+val1);
////                if (cc=='-')sk.push(cc+val2+val1);
////                if (cc=='*')sk.push(cc+val2+val1);
////                if (cc=='/')sk.push(cc+val2+val1);
//                        // or
//                sk.push(cc+val2+val1);
//
//            }
//        }
//        System.out.println(ss+" to ");
//        System.out.println(sk.peek());
//
//    }
//}



                     //  Prefix  to postfix  -------------------->>
//
//import java.util.*;
//public class JavaCourseStack {
//    public static void main(String[] args) {
//        String ss = "-9/*+5342";
//        Stack<String> sk = new Stack<>();
//        for (int i = ss.length() - 1; i >= 0; i--) {
//            char cc = ss.charAt(i);
//            int asscai = (int) cc;
//            String v = "" + cc;
//            if (asscai >= 48 && asscai <= 57) {
//                sk.push(v);
//            } else {
//                String val1 = sk.pop();
//                String val2 = sk.pop();
//                sk.push(val1 + val2 + cc);
//            }
//        }
//        System.out.println(ss);
//        System.out.println(sk.peek());
//    }
//}



                    //  Prefix to infix  ---------->>   -9/*+5342 == 9-(5+3)*4/2 == (9-(((5+3)*4)/2))

//import java.util.Stack;
//
//public class JavaCourseStack {
//    public static void main(String[] args) {
//        String  ss =  "-9/*+5342";
//        Stack<String> sk = new Stack<>();
//        for (int i = ss.length()-1;i>=0;i--){
//            char cc = ss.charAt(i);
//            int asscai = (int)cc;
//            String v = ""+cc;
//            if (asscai>=48&&asscai<=57){
//                sk.push(v);
//            }else {
//                String val1 = sk.pop();
//                String  val2 = sk.pop();
//                char op = cc;
//                sk.push('('+val1+cc+val2+')');   // because infix can have brackets  ex-  9-(5+3)*4/2  and ans will be (9-(((5+3)*4)/2))  two are same
//            }
//        }
//        System.out.println(ss);
//        System.out.println(sk.peek());
//    }
//}


               // Postfix to infix ------>>>>>
//
//import java.util.Stack;
//public class JavaCourseStack {
//    public static void main(String[] args) {
//        String  ss =  "953+4*2/-";
//        Stack<String> sk = new Stack<>();
//        for (int i =0;i<ss.length();i++){
//            char cc = ss.charAt(i);
//            int asscai = (int)cc;
//            String v = ""+cc;
//            if (asscai>=48&&asscai<=57){
//                sk.push(v);
//            }else {
//                String val1 = sk.pop();
//                String  val2 = sk.pop();
//                char op = cc;
//                sk.push('('+val2+cc+val1+')');   // because infix can have brackets  ex-  9-(5+3)*4/2  and ans will be (9-(((5+3)*4)/2))  two are same
//            }
//        }
//        System.out.println(ss);
//        System.out.println(sk.peek());
//    }
//}





                   //  Celebrity Problem ---------->> Solved in GFG
//
//import java.util.*;
//public class JavaCourseStack {
//   public static int celebrity(int M[][], int n) {
//        Stack<Integer> st = new Stack<Integer>();
//        for(int i =0;i<n;i++){
//            st.push(i);
//        }
//        while(st.size()>1){
//            int v1 = st.pop();
//            int v2 = st.pop();
//            if(M[v1][v2]==0){
//                st.push(v1);
//            }else if(M[v2][v1]==0){
//                st.push(v2);
//            }
//        }
//        if(st.empty()){
//            return -1;
//        }
//        int position = st.pop();
//        for(int i = 0;i<n;i++){
//            if(M[position][i]==1) return -1;
//        }
//        for(int i =0;i<n;i++){
//            if(i==position) continue;
//            if(M[i][position]==0) return -1;
//        }
//
//        return position;
//
//    }
//
//    public static void main(String[] args) {
//       int[][] arr = {{0,1,0},
//                      {0,0,0},
//                       {0,1,0}};
//        System.out.println(celebrity(arr, arr.length));
//    }
//}




           //  Problem -->>  Given a pattern which containing only I and D. I for Increasing and D for Decreasing.Write a algorithm to print
            //    the minimum number following that pattern.Digit from 1 to 9 and digits can't repeat.
               // ex- 1.input "D" output: 21, 2.input "DD" output: 321, 3.input "ID" output: 132  4.input "II" output: 123


//import java.util.Stack;
//
//public class JavaCourseStack {
//    public static void main(String[] args) {
//        Stack<Integer> stk = new Stack<>();
//        String  ss = "IDI";
//        for (int i=0;i<=ss.length();i++){
//            stk.push(i+1);
//            if (i==ss.length() || ss.charAt(i)=='I'){
//                while (!stk.isEmpty()){
//                    System.out.print(stk.pop()+" ");
//                }
//            }
//        }
//    }
//}



          //  Number of Valid Subarrays -->>  Given an array of integers return the number of nonEmpty continuous subarrays satisfy the
         // following condition : The leftmost element of the subarray is not larger than other element os subarray
//
//
//import java.util.Stack;
//
//public class JavaCourseStack {
//    public static void main(String[] args) {
//        int[] arr = {1,4,2,5,3}; // [1],[1,4].[1,4,2],[1,4,2,5],[1,4,2,5,3],[4],[2],[2,5],[2,5,3],[5],[3]
//        // find next smallest index for each element
//        int[] nextSmlEleIdx = new int[arr.length];
//        Stack<Integer> st = new Stack<>();
//        nextSmlEleIdx[arr.length-1]=arr.length;   // if any element don't have any smallest element then we store default value arr.length
//        st.push(arr.length-1);
//        for (int i=arr.length-2;i>=0;i--){
//            while (!st.isEmpty() && arr[st.peek()]>=arr[i]){
//                st.pop();
//            }
//            if (st.isEmpty()){
//                nextSmlEleIdx[i]=arr.length;
//            }else {
//                nextSmlEleIdx[i]=st.peek();
//            }
//            st.push(i);
//        }
//
//        int[] subarray = new int[arr.length];
//        int totalSubArray=0;
//        for (int i=0;i<subarray.length;i++){
//            subarray[i]=nextSmlEleIdx[i]-i;
//            totalSubArray+=subarray[i];
//        }
//
//        System.out.println("Total valid subarray :"+totalSubArray);
//    }
//}




                 // Stack  Assignment ------------------------>>>>


 // problem -1  Given a row*column binary matrix filled with 0 and 1 find the lergest rectangel containig only 1 and return its area.

//import java.util.Stack;
//public class JavaCourseStack {
//    public static int largestRectangelOf2DMatrix(int[][] arr){
//        int[]part = new int[arr[0].length];
//        for (int i=0;i<arr[0].length;i++){
//            part[i]=arr[0][i];
//        }
//        int area = largestAreaOfHistrogram(part);
//        for (int i=1;i<arr.length;i++){
//            for (int j =0;j<arr[0].length;j++){
//                if (arr[i][j]==1){
//                    part[j]+=1;
//                }else if (arr[i][j]==0){
//                    part[j]=0;
//                }
//            }
//            area=Math.max(area,largestAreaOfHistrogram(part));
//        }
//
//        return area;
//    }
//   public static int largestAreaOfHistrogram(int[] arr){
//       Stack<Integer> stk = new Stack<>();
//       int[] nextBoundry = new int[arr.length];
//      nextBoundry[arr.length-1]=arr.length;           // if any building don't have any next boundry then we store default value arr.length
//       stk.push(arr.length-1);
//       for (int i=arr.length-2;i>=0;i--){
//           while (!stk.empty()&&arr[stk.peek()]>=arr[i]){
//               stk.pop();
//           }
//           if (stk.empty()){
//               nextBoundry[i]=arr.length;
//           }else {
//               nextBoundry[i]=stk.peek();
//           }
//           stk.push(i);
//       }
//       int[]previousBoundry=new int[arr.length];
//       stk=new Stack<>();       // Now  initialize the previous stack empty
//       previousBoundry[0]=-1;        // if any building don't have any previous boundry then we store default value -1
//       stk.push(0);
//       for (int i=1;i<arr.length;i++){
//           while (!stk.isEmpty()&&arr[stk.peek()]>=arr[i]){
//               stk.pop();
//           }
//           if (stk.empty()){
//               previousBoundry[i]=-1;
//           }else {
//               previousBoundry[i]=stk.peek();
//           }
//           stk.push(i);
//       }
//
//       int maxArea=0;
//       for (int i=0;i<arr.length;i++){
//           int width = nextBoundry[i]-previousBoundry[i]-1;
//           int area = width*arr[i];
//           maxArea=Math.max(maxArea,area);
//       }
//       return maxArea;
//   }
//    public static void main(String[] args) {
//        int[][] arr= {{1,0,1,0,0},
//                      {1,0,1,1,1},
//                      {1,1,1,1,1},
//                      {1,0,0,1,0}};
//        System.out.println(largestRectangelOf2DMatrix(arr));
//    }
//}


                // or        solved in leetcode --------->>>>>
//import java.util.*;
//class Solution {
//    public int maximalRectangle(char[][] matrix) {
//        int[]part = new int[matrix[0].length];
//        int area = 0;
//        for (int i=0;i<matrix.length;i++){
//            for (int j =0;j<matrix[0].length;j++){
//                if (matrix[i][j]=='1'){
//                    part[j]+=1;
//                }else if (matrix[i][j]=='0'){
//                    part[j]=0;
//                }
//            }
//            area=Math.max(area,largestAreaOfHistrogram(part));
//        }
//
//        return area;
//    }
//    public static int largestAreaOfHistrogram(int[] arr){
//        Stack<Integer> stk = new Stack<>();
//        int[] nextBoundry = new int[arr.length];
//        nextBoundry[arr.length-1]=arr.length;           // if any building don't have any next boundry then we store default value arr.length
//        stk.push(arr.length-1);
//        for (int i=arr.length-2;i>=0;i--){
//            while (!stk.empty()&&arr[stk.peek()]>=arr[i]){
//                stk.pop();
//            }
//            if (stk.empty()){
//                nextBoundry[i]=arr.length;
//            }else {
//                nextBoundry[i]=stk.peek();
//            }
//            stk.push(i);
//        }
//        int[]previousBoundry=new int[arr.length];
//        stk=new Stack<>();       // Now  initialize the previous stack empty
//        previousBoundry[0]=-1;        // if any building don't have any previous boundry then we store default value -1
//        stk.push(0);
//        for (int i=1;i<arr.length;i++){
//            while (!stk.isEmpty()&&arr[stk.peek()]>=arr[i]){
//                stk.pop();
//            }
//            if (stk.empty()){
//                previousBoundry[i]=-1;
//            }else {
//                previousBoundry[i]=stk.peek();
//            }
//            stk.push(i);
//        }
//
//        int maxArea=0;
//        for (int i=0;i<arr.length;i++){
//            int width = nextBoundry[i]-previousBoundry[i]-1;
//            int area = width*arr[i];
//            maxArea=Math.max(maxArea,area);
//        }
//        return maxArea;
//    }
//}








          // problem-2   encode to decode string  ex-3[a]2[bc] = aaabcbc , 3[a 2[c]] = accaccacc , 2[abc]3[cd]ef = abcabccdcdef

//import java.util.Stack;
//
//public class JavaCourseStack {
//    public static void main(String[] args) {
//        String ss = "3[ab]2[c]";
//        Stack<String> sk =new Stack<>();
//        for (int i=0;i<ss.length();i++){
//            if (ss.charAt(i)!=']'){
//                sk.push(String.valueOf(ss.charAt(i)));   // becuase ss.charAt(i) it is a character and my stack is String type
//            }else {
//                while (sk.peek() !="[") {
//                    sk.pop();
//                }
//                sk.pop();
//                String num = sk.pop();
//            }
//        }
//
//
//    }
//}




          //problem-3  Basket Ball Game --------->>  and Solved in leetcode

//import java.util.Stack;
//
//public class JavaCourseStack {
//    public static void main(String[] args) {
//        String[] ss = {"5","2","C","D","+"};
//        Stack<Integer> sk =new Stack<>();
//        int firstNum=0;
//        int secondNum=0;
//        for(String e: ss){
//            switch(e){
//                case "+": firstNum=sk.pop();
//                    secondNum=sk.peek();
//                    sk.push(firstNum);
//                    sk.push(secondNum+firstNum);
//                    break;
//                case "D": firstNum=sk.peek();
//                    sk.push(firstNum*2);
//                    break;
//                case "C": sk.pop();
//                    break;
//                default: sk.push(Integer.parseInt(e));
//                    break;
//            }
//        }
//        int ans = 0;
//        while(!sk.empty()){
//            ans+=sk.pop();
//        }
//        System.out.println(ans);
//
//
//    }
//}



          // problem-4  Asteroid collision problem  solved in leetcode ------>>>>


//import java.util.*;
//class Solution {
//    public static int[] asteroidCollision(int[] asteroids) {
//        Stack<Integer> sk = new Stack<>();
//        for(int e: asteroids){
//            if(e>0){
//                sk.push(e);
//            }else{
//                while(!sk.isEmpty() && sk.peek()>0 && sk.peek()<-e){   // because ex =  -(-5) = 5 that is the absolute value and size
//                    sk.pop();
//                }
//                if(!sk.isEmpty() && sk.peek()>0 &&sk.peek()>-e){   // because ex =  -(-5) = 5 that is the absolute value and size
//                    // Now e is explode so we don't push anything
//                }else if(!sk.isEmpty() && sk.peek()>0 &&sk.peek()==-e){  // because ex =  -(-5) = 5 that is the absolute value and size
//                    // Now e and peek two are explode
//                    sk.pop();
//                }else{
//                    sk.push(e);
//                }
//            }
//        }
//
//        int[] ans= new int[sk.size()];
//        for(int i=ans.length-1;i>=0;i--){
//            ans[i]=sk.pop();
//        }
//
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        int[] asteroids = {5,10,-5};     absolute values are the size and - and + sign is the direction of each asteroids
//        int[] ans = asteroidCollision(asteroids);
//        System.out.println(Arrays.toString(ans));
//    }
//}




    //  problem-5  Daily Temperature(How day after we get heiger temperature) ---  Solved In leetcode -------->>>
             //   Similar question like that Next Greater element --->>

//
//import java.util.*;
//class Solution {
//    public int[] dailyTemperatures(int[] temperatures) {
//        Stack<Integer> stk = new Stack<>();
//        int[] arr = new int[temperatures.length];
//        stk.push(temperatures.length-1);
//        arr[arr.length-1]=0;  // If there is no future day for which this is possible, keep answer[i] == 0 instead.
//        for(int i=arr.length-2;i>=0;i--){
//            while(!stk.isEmpty() && temperatures[stk.peek()]<=temperatures[i]){
//                stk.pop();
//            }
//            if(stk.isEmpty()){
//                arr[i]=0;    // If there is no future day for which this is possible, keep answer[i] == 0 instead.
//            }else{
//                arr[i]=stk.peek()-i;
//            }
//            stk.push(i);
//        }
//        return arr;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {73,74,75,71,69,72,76,73};
//    }
//}


//import java.util.Arrays;
//
//public class JavaCourseStack {
//    public static void main(String[] args) {
//        char[] c= {'1','0'};
//        int[] ar = new int[2];
//        int a  = (int)c[0];
//        int b = a-'0';
//        ar[0]=b;
//        System.out.println(Arrays.toString(ar));
//
//    }
//}