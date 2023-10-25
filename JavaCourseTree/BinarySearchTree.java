package JavaCourseTree;



                   //  Binary Search  Tree


        //  Binary Search tree Time complexity : O(logn)




        // In the Binary Search Tree Concept Inorder(left ,root ,right) Traversal is always Sorted order ascending order---->> and
         //   reverse inOrder(right, root, left) is always sorted descending order------>>

//import java.util.*;
//public class BinarySearchTree {
//        static class Node{
//        int data;
//        Node left;
//        Node right;
//        Node(int d){
//            this.data=d;
//            left=null;
//            right=null;
//        }
//    }
//    public static Node construct_tree(String [] arr){
//        int a = Integer.parseInt(arr[0]);
//        Node root= new Node(a);
//        Queue<Node> qu= new LinkedList<>();
//        qu.offer(root);
//        int i = 1;
//        while (i<arr.length-1){
//            Node temp = qu.poll();
//            Node left = new Node(0);
//            Node right = new Node(0);
//            if(arr[i]==null){
//                left=null;
//            }else {
//               left.data= Integer.parseInt(arr[i]);
//               qu.offer(left);
//            }
//            if(arr[i+1]==null){
//                right=null;
//            }else {
//                right.data= Integer.parseInt(arr[i+1]);
//                qu.offer(right);
//            }
//            temp.left=left;
//            temp.right=right;
//            i+=2;
//        }
//
//        return root;
//    }
//
//        public static void reverInOrder(Node root){      // reverse inOrder is always sorted decending order------>>
//        if (root==null) return;
//
//          reverInOrder(root.right);
//            System.out.print(root.data+" ");
//        reverInOrder(root.left);
//
//
//    }
//
//    public static void inOrder(Node root){      // inorder ------->>
//        if (root==null) return;
//
//        inOrder(root.left);
//        System.out.print(root.data+" ");
//        inOrder(root.right);
//    }
//            public static void main(String[] args) {
//                String[] arr = {"50","40","60","20","45","55","80"};
//               Node root= construct_tree(arr);
//               inOrder(root);
//                System.out.println();
//               reverInOrder(root);
//            }
//}



            // Search in a binary search Tree ----- Solved in leetcode---------->>
                 //  Time complexity : O(logn)
//class Solution {
//    public TreeNode searchBST(TreeNode root, int val) {
//        if(root==null) return null;
//        if(val==root.val) return root;
//        else if(val<root.val){
//            return searchBST(root.left,val);
//        }else{
//            return searchBST(root.right,val);
//        }
//    }
//}

            //  insert any node in a Binary Search Tree ----- Solved in leetcode ----->>>
                    // Time complexity : O(logn)
//class Solution {
//    public TreeNode insertIntoBST(TreeNode root, int val) {
//        if(root==null) root= new TreeNode(val);
//        if(val<root.val){
//            if(root.left==null) {
//                root.left= new TreeNode(val);
//            }else{
//                insertIntoBST(root.left,val);
//            }
//        }
//        if(val>root.val){
//            if(root.right==null){
//                root.right = new TreeNode(val);
//            }else{
//                insertIntoBST(root.right,val);
//            }
//        }
//
//        return root;
//    }
//}


                  //  Preorder ,Inorder, Postorder traversal in a Binary Search Tree ------>>
                //    // Convert a Binary Search Tree into a sorted Order array (Using Inorder)------>>
        // Inorder Traversal of a Binary search Tree is always Sorted order

//import java.util.*;
//
//public class BinarySearchTree {
//   static class Node{
//        int data;
//        Node left;
//        Node right;
//        Node(int d){
//            this.data=d;
//            left=null;
//            right=null;
//        }
//    }
//    public static Node construct_tree(String [] arr){
//        int a = Integer.parseInt(arr[0]);
//        Node root= new Node(a);
//        Queue<Node> qu= new LinkedList<>();
//        qu.offer(root);
//        int i = 1;
//        while (i<arr.length-1){
//            Node temp = qu.poll();
//            Node left = new Node(0);
//            Node right = new Node(0);
//            if(arr[i]==null){
//                left=null;
//            }else {
//               left.data= Integer.parseInt(arr[i]);
//               qu.offer(left);
//            }
//            if(arr[i+1]==null){
//                right=null;
//            }else {
//                right.data= Integer.parseInt(arr[i+1]);
//                qu.offer(right);
//            }
//            temp.left=left;
//            temp.right=right;
//            i+=2;
//        }
//
//        return root;
//    }
//
//    public static void preOrder(Node root){    // preOrder------->>
//       if (root==null) return;
//        System.out.print(root.data+" ");
//        preOrder(root.left);
//        preOrder(root.right);
//    }
//
//    public static void inOrder(Node root){      //inOrder------>>
//        if (root==null) return;
//
//        inOrder(root.left);
//        System.out.print(root.data+" ");
//        inOrder(root.right);
//    }
//
//    public static void postOrder(Node root){    //postOrder ----->>
//        if (root==null) return;
//        postOrder(root.left);
//        postOrder(root.right);
//        System.out.print(root.data+" ");
//    }
//
//    public static void convertSortedOrder(Node root, ArrayList<Integer> al){  // Convert a Binary Search Tree into a sorted Order array (Using Inorder)------>
//       if (root==null) return;
//         convertSortedOrder(root.left,al);
//         al.add(root.data);
//         convertSortedOrder(root.right,al);
//
//    }
//    public static void main(String[] args) {
//        String[] arr = {"50","40","60","20","45","55","80"};
//        Node root=construct_tree(arr);
////        preOrder(root);
////        System.out.println();
////        inOrder(root);       // In Order traversal is Always sorted for Binary Search Tree ------>>
////        System.out.println();
////        postOrder(root);
////        System.out.println();
//
//        ArrayList<Integer> al = new ArrayList<>();
//        convertSortedOrder(root,al);
//        System.out.println(al);
//    }
//}


                //  Delete leaf Node(mean 0 child for this Node) of a Binary Tree ------->>>
//import java.util.*;
//public class BinarySearchTree {
//    static class Node{
//        int data;
//        Node left;
//        Node right;
//        Node(int d){
//            this.data=d;
//            left=null;
//            right=null;
//        }
//    }
//    public static Node construct_tree(String [] arr){
//        int a = Integer.parseInt(arr[0]);
//        Node root= new Node(a);
//        Queue<Node> qu= new LinkedList<>();
//        qu.offer(root);
//        int i = 1;
//        while (i<arr.length-1){
//            Node temp = qu.poll();
//            Node left = new Node(0);
//            Node right = new Node(0);
//            if(arr[i]==null){
//                left=null;
//            }else {
//                left.data= Integer.parseInt(arr[i]);
//                qu.offer(left);
//            }
//            if(arr[i+1]==null){
//                right=null;
//            }else {
//                right.data= Integer.parseInt(arr[i+1]);
//                qu.offer(right);
//            }
//            temp.left=left;
//            temp.right=right;
//            i+=2;
//        }
//
//        return root;
//    }
//    public static void preOrder(Node root){
//        if (root==null) return;
//        System.out.print(root.data+" ");
//        preOrder(root.left);
//        preOrder(root.right);
//    }
//
//       public static void deleteLeafNode(Node root,int val){       // delete any Leaf Node  ------->>
//        if (root==null) return;
//           if (root.data>val){
//               if (root.left==null) return;
//               if (root.left.data==val){
//                   root.left=null;
//               }
//               else {
//                   deleteLeafNode(root.left,val);
//               }
//           }
//           if (root.data<val){
//               if (root.right==null) return;
//               if (root.right.data==val) root.right=null;
//              else deleteLeafNode(root.right,val);
//           }
//       }
//
//       public static void deleteNode(Node root,int val){     // Delete Node which has have 1 child    --------->>>>
//        if (root==null) return;
//
//           if (root.data>val){
//               if (root.left==null) return;
//             if (root.left.data==val){
//                   if (root.left.left==null &&root.left.right==null){
//                       root.left=null;
//                   }
//                   if (root.left.left==null ||root.left.right==null){
//                       if (root.left.left==null){
//                           root.left=root.left.right;
//                       }
//                       if (root.left.right==null){
//                           root.left=root.left.left;
//                       }
//                   }
//               }
//              else{
//                  deleteNode(root.left,val);
//               }
//           }
//           if (root.data<val){
//               if (root.right==null) return;
//               if (root.right.data==val) {
//                      if (root.right.left==null&&root.right.right==null){  // that means this is a leaf
//                          root.right=null;
//                      }
//                      if (root.right.left==null || root.right.right==null){
//                          if (root.right.left==null){
//                              root.right=root.right.right;
//                          }
//                          if (root.right.right==null){
//                              root.right=root.right.left;
//                          }
//                      }
//               }
//               else deleteNode(root.right,val);
//           }
//       }
//
//       public static void delete(Node root,int val){    // delete any node
//
//       }
//
//       public static void main(String[] args) {
//        String[] arr = {"50","20","90","10",null,"80","100"};
//           Node rro = construct_tree(arr);
////           preOrder(rro);         // this preorders is for Printing Purpose
////           //deleteLeafNode(rro,100);
////           deleteLeafNode(rro,40);
////           System.out.println();
////           preOrder(rro);
//
//           preOrder(rro);
//           deleteNode(rro,20);
//           System.out.println();
//           preOrder(rro);
//
//       }
//}




                 //  Delete  any node of Binary Search Tree leaf ,1 child node , 2 child node --- solved in leetcode--------->>

//class Solution {
//    public void delete(TreeNode root,int key){
//        if(root==null) return;
//        if(root.val>key){
//            if(root.left==null) return;
//            if(root.left.val==key){
//                TreeNode node=root.left;
//                if(node.left==null&&node.right==null){ // means leaf node 0 child
//                    root.left=null;
//                }
//                else if(node.left==null ||node.right==null){ // means 1 child node
//                    if(node.left==null){
//                        root.left=node.right;
//                    }
//                    else if(node.right==null){
//                        root.left=node.left;
//                    }
//                }
//                else if(node.left!=null&&node.right!=null){ // means 2 child node
//                    TreeNode temp = node.left;
//                    while(temp.right!=null){
//                        temp = temp.right;
//                    }
//                    delete(root,temp.val);
//                    temp.right=node.right;
//                    temp.left=node.left;
//
//                    root.left=temp;
//
//                }
//            }
//            else{
//                delete(root.left,key);
//            }
//        }
//        else if(root.val<key){
//            if(root.right==null) return;
//            if(root.right.val==key){
//                TreeNode node = root.right;
//                if(node.left==null&&node.right==null){  // means leaf node 0 child
//                    root.right=null;
//                }
//                else if(node.left==null || node.right==null){  // means 1 child node
//                    if(node.left!=null){
//                        root.right=node.left;
//                    }
//                    else if(node.right!=null){
//                        root.right=node.right;
//                    }
//                }
//                else if(node.left!=null&&node.right!=null){   // means 2 child node
//                    TreeNode temp = node.left;
//                    while(temp.right!=null){
//                        temp = temp.right;
//                    }
//                    delete(root,temp.val);
//                    temp.left=node.left;
//                    temp.right=node.right;
//
//                    root.right=temp;
//                }
//            }
//            else {
//                delete(root.right,key);
//            }
//        }
//    }
//    public TreeNode deleteNode(TreeNode root, int key) {
//        TreeNode fakeNode = new TreeNode(Integer.MAX_VALUE);
//        fakeNode.left=root;
//        delete(fakeNode,key);
//        return fakeNode.left;
//    }
//}


                 //  Lowest common Ancestor of Binary Search Tree --- Solved in leetcode---->>

//class Solution {
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(root==null) return null;
//        if(p==q) return p;
//        else if(p==root||q==root) return root;
//        else if(p.val<root.val&&q.val>root.val) return root;//means p present left tree q present right tree
//        else if(p.val>root.val&&q.val<root.val) return root;//means p present right tree q present left tree
//        else if(p.val<root.val&&q.val<root.val) {//means p and q two are present left tree
//            return lowestCommonAncestor(root.left,p,q);
//        }
//        else if(p.val>root.val&&q.val>root.val) return lowestCommonAncestor(root.right,p,q);  //means p and q two are present right tree
//
//        return null; //  it is default
//    }
//}


           //  Predecessor and Successor of any node for a Binary Search Tree -------->>>>
   // Predecessor of any node is the previous node of inorder(sorted) traversal same Successor is next node of inorder(sorted) traversal

//import java.util.*;
//public class BinarySearchTree {
//        static class Node{
//        int data;
//        Node left;
//        Node right;
//        Node(int d){
//            this.data=d;
//            left=null;
//            right=null;
//        }
//    }
//    public static Node construct_tree(String [] arr){
//        int a = Integer.parseInt(arr[0]);
//        Node root= new Node(a);
//        Queue<Node> qu= new LinkedList<>();
//        qu.offer(root);
//        int i = 1;
//        while (i<arr.length-1){
//            Node temp = qu.poll();
//            Node left = new Node(0);
//            Node right = new Node(0);
//            if(arr[i]==null){
//                left=null;
//            }else {
//                left.data= Integer.parseInt(arr[i]);
//                qu.offer(left);
//            }
//            if(arr[i+1]==null){
//                right=null;
//            }else {
//                right.data= Integer.parseInt(arr[i+1]);
//                qu.offer(right);
//            }
//            temp.left=left;
//            temp.right=right;
//            i+=2;
//        }
//
//        return root;
//    }
//
//    public static void inOrder(Node root,ArrayList<Integer> al){
//        if (root==null) return;
//
//        inOrder(root.left,al);
//       // System.out.print(root.data+" ");
//        al.add(root.data);
//        inOrder(root.right,al);
//    }
//    public static void PredAndsuccessor(Node root,int val,ArrayList<Integer> al){ // Time Complexity:O(n) and Space Complexity :O(n)
//            inOrder(root,al);
//        System.out.println(al);
//            int predecessor=-1;
//            int successor =-1;
//            for (int i=0;i<al.size();i++){
//                if (al.get(i)==val){
//                    predecessor=al.get(i-1);
//                    successor=al.get(i+1);
//                }
//            }
//        System.out.println("Predecessor is :"+predecessor);
//        System.out.println("Successor is :"+successor);
//    }
//                // Or          NOT using extra arraylist OPTIMIZE WAY ------>>>
//    static int temp=-1;
//    static int prede= -1;
//      static int succesor =-1;
//       static boolean flag=false;
//    public static void inOrder_prede_Succe(Node root,int val){
//        if (root==null) return;
//
//            inOrder_prede_Succe(root.left,val);
//            if (root.data==val){
//                prede = temp;
//                flag=true;
//            }else {
//                if (flag==true){
//                    succesor=root.data;
//                    flag=false;
//                }else {
//                    temp=root.data;
//                }
//
//            }
//            inOrder_prede_Succe(root.right,val);
//    }
//    public static void main(String[] args) {
//        String[] arr = {"50","40","60","20","45","55","80"};
//            Node root = construct_tree(arr);
////            ArrayList<Integer> al = new ArrayList<>();
////       PredAndsuccessor(root,50,al);
//
//        inOrder_prede_Succe(root,80);
//        System.out.println("Predecessor is :"+prede);
//        System.out.println("Successor is :"+succesor);
//    }
//}


              // Check The Binary Tree is Binary Search Tree --->> Solved in leetcode------->>
        // If any Binary Tree inOrder Traversal is Sorted than definitely it is a Binary Search Tree

//class Solution {
//    boolean isBinarySearchTree = true;
//    TreeNode temp = null;
//    public void inOrder(TreeNode root){
//        if(root==null) return;
//
//        inOrder(root.left);
//        if(temp==null) temp=root;
//        else if(root.val<=temp.val){
//            isBinarySearchTree = false;
//        }else{
//            temp=root;
//        }
//        inOrder(root.right);
//    }
//    public boolean isValidBST(TreeNode root) {
//        inOrder(root);
//        if(isBinarySearchTree){
//            return true;
//        }else{
//            return false;
//        }
//    }
//}

                   // Convert Binary Search Tree from Sorted Array --- Solved in leetcode----->>

//class Solution {
//    // similar recursion like binary search recursive approach
//    public TreeNode helper(int[] arr,int st,int end){
//        if(st>end) return null;
//        int mid=st+(end-st)/2;
//        TreeNode root = new TreeNode(arr[mid]);
//        root.left= helper(arr,st,mid-1);
//        root.right=helper(arr,mid+1,end);
//        return root;
//    }
//    public TreeNode sortedArrayToBST(int[] nums) {
//        TreeNode ansRoot =  helper(nums,0,nums.length-1);
//        return ansRoot;
//    }
//}


              //  Kth smallest element in Binary Search Tree ---- Solved in leetcode----->>>

//class Solution {
//    int ans=0;
//    int klevel=0;
//    public void inorder(TreeNode root,int k){
//        if(root==null) return;
//        inorder(root.left,k);
//        klevel++;
//        if(klevel==k){
//            ans=root.val;
//        }
//        inorder(root.right,k);
//
//    }
//    public int kthSmallest(TreeNode root, int k) {
//        inorder(root,k);
//        return ans;
//    }
//}

              //  Covert Binary Search Tree From Sorted Linked list----Solved in leetcode---->>

//class Solution {
//    // similar recursion like binary search recursive approach
//    public TreeNode helper(int[] arr,int st,int end){
//        if(st>end) return null;
//        int mid=st+(end-st)/2;
//        TreeNode root=new TreeNode(arr[mid]);
//        root.left=helper(arr,st,mid-1);
//        root.right=helper(arr,mid+1,end);
//
//        return root;
//    }
//    public TreeNode sortedListToBST(ListNode head) {
//        ListNode temp = head;
//        int size=0;         // fisrt we serach the size of linkedlist
//        while(temp!=null){
//            size++;
//            temp=temp.next;
//        }
//        int[]arr = new int[size];
//        temp =head;   // now temp is null so reassign the temp head
//        int i=0;
//        while(temp!=null){
//            arr[i++]=temp.val;
//            temp=temp.next;
//        }
//
//        TreeNode ansRoot= helper(arr,0,arr.length-1);
//        return ansRoot;
//
//    }
//}


              //   Construct Binary Search Tree From Preorder traversal ---Solved in leetcode---->>

//class Solution {
//    public void insertion(TreeNode root,int val){
//        if(root==null){
//            root=new TreeNode(val);
//            return;
//        }
//
//        if(val<root.val){
//            if(root.left==null) root.left= new TreeNode(val);
//            else insertion(root.left,val);
//        }
//        else {
//            if(root.right==null) root.right=new TreeNode(val);
//            else insertion(root.right,val);
//        }
//    }
//    public TreeNode bstFromPreorder(int[] preorder) {
//        TreeNode ansRoot = new TreeNode(preorder[0]);// becuase in the preorder tarversal array first elemet is always root element
//        for(int i =1;i<preorder.length;i++){
//            insertion(ansRoot,preorder[i]);
//        }
//
//        return ansRoot;
//
//    }
//}


           //   Convert Binary Search Tree to Greater Tree ---- Solved in leetcode--------->>

// Time complexity : O(n);
//  Space Complexity : O(tree height)

//         //  Not using Global variable ----->>
//
//  class Solution {
//     // int sum=0;
//     public void reverseInOrder(TreeNode root,int[]sum){
//         if(root==null) return;
//         reverseInOrder(root.right,sum);
//          root.val+=sum[0];
//          sum[0]=root.val;
//         reverseInOrder(root.left,sum);
//     }
//     public TreeNode convertBST(TreeNode root) {
//         int[] sum = new int[1];
//         sum[0]=0;
//         reverseInOrder(root,sum);
//         return root;
//     }
// }
//
//            // Using global variable ---->>
//class Solution {
//    int sum=0;  // Golbal veriable we can avoid to use
//    public void reverseInOrder(TreeNode root){
//        if(root==null) return;
//        reverseInOrder(root.right);
//        root.val+=sum;
//        sum=root.val;
//        reverseInOrder(root.left);
//    }
//    public TreeNode convertBST(TreeNode root) {
//        reverseInOrder(root);
//        return root;
//    }
//}

           //  Minimum difference between to node in BST --- Solved in leetcode------->>


////             // Not Using Any global Variables--->>>>
//
//// class Solution {
////     // TreeNode previous=null;
////     // int diff=0;
////     // int min = Integer.MAX_VALUE;
////     public void inorder(TreeNode root,TreeNode[] previous,int[] diff,int[] min ){
////         if(root==null) return;
////         inorder(root.left,previous,diff,min);
////          if(previous[0]==null) previous[0] = root;
////          else{
////              diff[0]=Math.abs(root.val-previous[0].val);
////              min[0]= Math.min(min[0],diff[0]);
////              previous[0] = root;
////          }
////         inorder(root.right,previous,diff,min);
////     }
////     public int getMinimumDifference(TreeNode root) {
////         TreeNode[] previous={null};
////         int[] diff={0};
////         int[]min={Integer.MAX_VALUE};
////         inorder(root,previous,diff,min);
////         return min[0];
////     }
//// }
//
//                    // Using global variables---->>
//
//class Solution {
//    TreeNode previous=null;
//    int diff=0;
//    int min = Integer.MAX_VALUE;
//    public void inorder(TreeNode root ){
//        if(root==null) return;
//        inorder(root.left);
//        if(previous==null) previous = root;
//        else{
//            diff=Math.abs(root.val-previous.val);
//            min= Math.min(min,diff);
//            previous = root;
//        }
//        inorder(root.right);
//    }
//    public int getMinimumDifference(TreeNode root) {
//        inorder(root);
//        return min;
//    }
//}



               // InOrder Traversal of BSt (constant Space)----- Solved in leetcode----->>
//  using Moris Traversal ------->>> constant Space
          // Time Complexity :O(n)
          // Space Complexity :O(1)

//class Solution {
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> ll = new ArrayList<>();// it is method return not consider extra auxiliary Space
//        TreeNode curr = root;
//        while(curr!=null){
//            if(curr.left!=null){
//                TreeNode pred = curr.left;
//                while(pred.right!=null && pred.right!=curr){
//                    pred=pred.right;
//                }
//                if(pred.right==null){
//                    pred.right=curr;
//                    curr=curr.left;
//                }
//                if(pred.right==curr){
//                    ll.add(curr.val);
//                    pred.right=null;
//                    curr=curr.right;
//                }
//            }else{
//                ll.add(curr.val);
//                curr=curr.right;
//            }
//        }
//
//        return ll;
//    }
//}


            //  Sort all element  of two BST ---- solved in leetcode-------->>

        // here we can do recursive inorder for two tree then space complexity not constant O(1)

//class Solution {
//    public void merge(List<Integer> a,List<Integer> b,List<Integer> ll){
//        int i=0;
//        int j=0;
//        while(i<a.size()&&j<b.size()){
//            if(a.get(i)<=b.get(j)){
//                ll.add(a.get(i++));
//                // i++;
//            }else{
//                ll.add(b.get(j++));
//                //j++;
//            }
//        }
//        while(i<a.size()){
//            ll.add(a.get(i++));
//        }
//        while(j<b.size()){
//            ll.add(b.get(j++));
//        }
//    }
//
//
//    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
//        List<Integer> ans = new ArrayList<>();
//
//               // First of all we sort two tree using inorder tarversal then we merge two tree in ans list sorted order
//        List<Integer> a = new ArrayList<>();
//        TreeNode curr=root1;
//
//        while(curr!=null){
//            if(curr.left!=null){
//                TreeNode pred = curr.left;
//                while(pred.right!=null && pred.right!=curr){
//                    pred = pred.right;
//                }
//                if(pred.right==null){
//                    pred.right=curr;
//                    curr=curr.left;
//                }
//                if(pred.right==curr){
//                    pred.right=null;
//                    a.add(curr.val);
//                    curr=curr.right;
//                }
//            }else{
//                a.add(curr.val);
//                curr=curr.right;
//            }
//
//        }
//
//        List<Integer> b = new ArrayList<>();
//        curr=root2;
//        while(curr!=null){
//            if(curr.left!=null){
//                TreeNode pred = curr.left;
//                while(pred.right!=null && pred.right!=curr){
//                    pred=pred.right;
//                }
//                if(pred.right==null){
//                    pred.right=curr;
//                    curr=curr.left;
//                }
//                if(pred.right==curr){
//                    pred.right=null;
//                    b.add(curr.val);
//                    curr=curr.right;
//                }
//            }else{
//                b.add(curr.val);
//                curr=curr.right;
//            }
//        }
//
//
//        merge(a,b,ans);
//        return ans;
//
//
//    }
//}


            //     Trim a Binary Search Tree -----  Solved in leetcode------->>>.

//class Solution {
//    public void trimhelper(TreeNode root,int low,int high){
//        if(root==null) return;
//
//        while(root.left!=null){
//            if(root.left.val<low){
//                root.left=root.left.right;
//            }
//            else if(root.left.val>high){
//                root.left=root.left.left;
//            }
//            else{
//                break;
//            }
//        }
//
//        while(root.right!=null){
//            if(root.right.val>high){
//                root.right=root.right.left;
//            }
//            else if(root.right.val<low){
//                root.right=root.right.left;
//            }
//            else{
//                break;
//            }
//        }
//
//        trimhelper(root.left,low,high);
//        trimhelper(root.right,low,high);
//    }
//    public TreeNode trimBST(TreeNode root, int low, int high) {
//        TreeNode fakeroot = new TreeNode(Integer.MAX_VALUE);
//        fakeroot.left=root;
//        trimhelper(fakeroot,low,high);
//        return fakeroot.left;
//    }
//}


         // Recover the Binary Sewarch Tree ------ Solved in leetcode---------->>>

//                //Inorder Traversal Recursive Way Space:O(tree height) Not optimal--->>
//
//// class Solution {
////     TreeNode second =null;
////     TreeNode first=null;
////     TreeNode a=null;
////     TreeNode b=null;
//
////        public void inorder(TreeNode root) {
////            if(root==null) return;
////            inorder(root.left);
//
////              if(first==null) first = root;
////              else{
////                  second=first;
////                  first=root;
////                  if(second.val>first.val){
////                      if(a==null) a=second;
////                      b=first;
////                  }
////              }
//
////            inorder(root.right);
////        }
////     public void recoverTree(TreeNode root) {
////       inorder(root);
////        int temp =a.val;
////         a.val=b.val;
////         b.val=temp;
////     }
//// }
//
//          //Inorder using Moris Traversal Space Constant:O(1)----->>> Optimal---->>>
//
//class Solution {
//    TreeNode second =null;
//    TreeNode first=null;
//    TreeNode a=null;
//    TreeNode b=null;
//
//    public void morisInorder(TreeNode root) {
//        TreeNode curr=root;
//        while(curr!=null){
//            if(curr.left!=null){
//                TreeNode pred = curr.left;
//                while(pred.right!=null && pred.right!=curr){
//                    pred=pred.right;
//                }
//                if(pred.right==null){
//                    pred.right=curr;
//                    curr=curr.left;
//                }
//                if(pred.right==curr){
//                    second=first;
//                    first=curr;
//                    if(second.val>first.val){
//                        if(a==null) a=second;
//                        b=first;
//                    }
//
//                    pred.right=null;
//                    curr=curr.right;
//                }
//            }
//
//            else{
//                if(first==null) first=curr;
//                else{
//                    second=first;
//                    first=curr;
//                    if(second.val>first.val){
//                        if(a==null) a=second;
//                        b=first;
//                    }
//                }
//
//                curr=curr.right;
//            }
//        }
//
//        int temp =a.val;
//        a.val=b.val;
//        b.val=temp;
//    }
//    public void recoverTree(TreeNode root) {
//        morisInorder(root);
//    }
//}


                         // BINARY SEARCH TREE ASSIGNMENT------------->>>>>

        // Problem-1.     Iterartive way to search any element in BST----->>

//import java.util.*;
//public class BinarySearchTree {
//   static class Node{
//        int val;
//        Node left;
//        Node right;
//        Node(int d){
//            this.val=d;
//            this.left=null;
//            this.right=null;
//        }
//    }
//
//    public static Node costructTree(String[] arr){
//             int x = Integer.parseInt(arr[0]);
//             Node root = new Node(x);
//             Queue<Node> qu = new ArrayDeque<>();
//             qu.offer(root);
//             int i = 1;
//             while (i<arr.length-1){
//                 Node temp = qu.poll();
//                 Node left = new Node(0);
//                 Node right = new Node(0);
//                 if (arr[i]==null){
//                     left=null;
//                 }else {
//                     left.val = Integer.parseInt(arr[i]);
//                     qu.offer(left);
//                 }
//
//                 if (arr[i+1]==null){
//                     right=null;
//                 }else {
//                     right.val=Integer.parseInt(arr[i+1]);
//                     qu.offer(right);
//                 }
//                 temp.left=left;
//                 temp.right=right;
//                 i+=2;
//             }
//             return root;
//         }
//
//     public static boolean iterativeSearchInBST(Node root,int target){       //  iterativeSearchInBST ------------->>>>
//
//               while (root!=null) {
//                     if (root.val == target) return true;
//                    else if (root.val < target) root = root.right;
//                      else root = root.left;
//               }
//               return false;
//         }
//    public static void main(String[] args) {
//        String[] st= {"15","10","20","8","12","16","25"};
//       Node roo= costructTree(st);
//        System.out.println(iterativeSearchInBST(roo,20));
//        System.out.println(iterativeSearchInBST(roo,200));
//    }
//}


          // Problem-2  Kth  largest element in  BST -------->>

//import java.util.*;
//public class BinarySearchTree {
//   static class Node{
//        int val;
//        Node left;
//        Node right;
//        Node(int d){
//            this.val=d;
//            this.left=null;
//            this.right=null;
//        }
//    }
//
//    public static Node costructTree(String[] arr){
//             int x = Integer.parseInt(arr[0]);
//             Node root = new Node(x);
//             Queue<Node> qu = new ArrayDeque<>();
//             qu.offer(root);
//             int i = 1;
//             while (i<arr.length-1){
//                 Node temp = qu.poll();
//                 Node left = new Node(0);
//                 Node right = new Node(0);
//                 if (arr[i]==null){
//                     left=null;
//                 }else {
//                     left.val = Integer.parseInt(arr[i]);
//                     qu.offer(left);
//                 }
//
//                 if (arr[i+1]==null){
//                     right=null;
//                 }else {
//                     right.val=Integer.parseInt(arr[i+1]);
//                     qu.offer(right);
//                 }
//                 temp.left=left;
//                 temp.right=right;
//                 i+=2;
//             }
//             return root;
//         }
//
//         static int ans=-1;
//       static int count=0;
//         public static void reverseInorde(Node root,int kth){
//       if (root==null) return;
//       reverseInorde(root.right,kth);
//       count++;
//       if (count==kth){
//           ans=root.val;
//       }
//       reverseInorde(root.left,kth);
//         }
//        public static void kthLargestElement(Node root,int kth){     //  kthLargestElement------>>
//              reverseInorde(root,kth);
//            System.out.println(ans);
//        }
//    public static void main(String[] args) {
//        String[] st= {"15","10","20","8","12","16","25"};
//       Node roo= costructTree(st);
//       // kthLargestElement(roo,2);
//        kthLargestElement(roo,1);
//    }
//}


        // Problem-3  Find Pair sum in a BST ----------->>>>

//import java.util.*;
//public class BinarySearchTree {
//       static class Node{
//        int val;
//        Node left;
//        Node right;
//        Node(int d){
//            this.val=d;
//            this.left=null;
//            this.right=null;
//        }
//    }
//        public static Node costructTree(String[] arr){
//             int x = Integer.parseInt(arr[0]);
//             Node root = new Node(x);
//             Queue<Node> qu = new ArrayDeque<>();
//             qu.offer(root);
//             int i = 1;
//             while (i<arr.length-1){
//                 Node temp = qu.poll();
//                 Node left = new Node(0);
//                 Node right = new Node(0);
//                 if (arr[i]==null){
//                     left=null;
//                 }else {
//                     left.val = Integer.parseInt(arr[i]);
//                     qu.offer(left);
//                 }
//
//                 if (arr[i+1]==null){
//                     right=null;
//                 }else {
//                     right.val=Integer.parseInt(arr[i+1]);
//                     qu.offer(right);
//                 }
//                 temp.left=left;
//                 temp.right=right;
//                 i+=2;
//             }
//             return root;
//         }
//
//         public static boolean serach(Node root,int val){
//           if (root==null) return false;
//
//           if (root.val==val) return true;
//           if (root.val>val){
//               return serach(root.left,val);
//           }else {
//               return serach(root.right,val);
//           }
//
//         }
//    public static void findPairInorder(Node mainRoot,Node root,int target){
//           if (root==null) return;
//      findPairInorder( mainRoot,root.left,target);
//
//      int findpart =target-root.val;
//      if (serach(mainRoot,findpart)==true){
//          System.out.println("The pair of target is :"+root.val+", "+findpart);
//      }
//      findPairInorder(mainRoot,root.right,target);
//    }
//    public static void main(String[] args) {
//       String[] str = {"15","10","20","8","12","21","30","6","9","18","22"};
//       Node root =costructTree(str);
//       findPairInorder(root,root,14);
//    }
//}


     // Problem-4  Predecessor of every node----->>

//import java.util.*;
//public class BinarySearchTree {
//        static class Node{
//        int data;
//        Node left;
//        Node right;
//        Node(int d){
//            this.data=d;
//            left=null;
//            right=null;
//        }
//    }
//    public static Node construct_tree(String [] arr){
//        int a = Integer.parseInt(arr[0]);
//        Node root= new Node(a);
//        Queue<Node> qu= new LinkedList<>();
//        qu.offer(root);
//        int i = 1;
//        while (i<arr.length-1){
//            Node temp = qu.poll();
//            Node left = new Node(0);
//            Node right = new Node(0);
//            if(arr[i]==null){
//                left=null;
//            }else {
//                left.data= Integer.parseInt(arr[i]);
//                qu.offer(left);
//            }
//            if(arr[i+1]==null){
//                right=null;
//            }else {
//                right.data= Integer.parseInt(arr[i+1]);
//                qu.offer(right);
//            }
//            temp.left=left;
//            temp.right=right;
//            i+=2;
//        }
//
//        return root;
//    }
//
//    static Node temp=null;
//    public static void morisInorder(Node root){
//        Node curr=root;
//        while (curr!=null) {
//            if (curr.left != null) {
//                Node pred = curr.left;
//                while (pred.right != null && pred.right != curr) {
//                    pred = pred.right;
//                }
//                if (pred.right == null) {
//                    pred.right = curr;
//                    curr = curr.left;
//                }
//                if (pred.right == curr) {
//                    System.out.print(temp.data+" ");
//                    temp=curr;
//
//                    pred.right = null;
//                    curr = curr.right;
//                }
//            }
//            else {
//                if (temp == null){
//                    System.out.print(0+" ");
//                    temp=curr;
//                }
//                else {
//                    System.out.print(temp.data + " ");
//                    temp = curr;
//                }
//                    curr = curr.right;
//            }
//        }
//        }
//
//    public static void main(String[] args) {
//        String[] st= {"15","10","20","8","12","16","25"};
//       Node roo= construct_tree(st);
//       morisInorder(roo);
//    }
//    }





           // Problem-5   Lowest common Ancestor of Binary Search Tree --- Solved in leetcode---->>

//class Solution {
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(root==null) return null;
//        if(p==q) return p;
//        else if(p==root||q==root) return root;
//        else if(p.val<root.val&&q.val>root.val) return root;//means p present left tree q present right tree
//        else if(p.val>root.val&&q.val<root.val) return root;//means p present right tree q present left tree
//        else if(p.val<root.val&&q.val<root.val) {//means p and q two are present left tree
//            return lowestCommonAncestor(root.left,p,q);
//        }
//        else if(p.val>root.val&&q.val>root.val) return lowestCommonAncestor(root.right,p,q);  //means p and q two are present right tree
//
//        return null; //  it is default
//    }
//}