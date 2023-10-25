package JavaCourseTree;



                   // Tree  -------->>





//public class PwTreeDataStructure {
//   static class Node{
//        int data;
//        Node leftChild;
//        Node rightChild;
//        public Node(int data){
//            this.data=data;
//        }
//    }
//
////    public static void displayViaRecursion(Node root){   // Preorder printing a tree
////        if (root==null) {
////            return;
////        }
////        System.out.print(root.data+"->");
////         System.out.print(root.leftChild.data+"  ");
////         System.out.println(root.rightChild.data);
////        displayViaRecursion(root.leftChild);
////        displayViaRecursion(root.rightChild);
////    }
//
//   public static void displayViaRecursion(Node root){   // Preorder printing a tree
//       if (root==null) {
//           return;
//       }
//        System.out.print(root.data+"->");
//       if (root.leftChild!=null){
//           System.out.print(root.leftChild.data+"  ");
//       }else {
//           System.out.print("Null  ");
//       }
//        if (root.rightChild!=null){
//            System.out.println(root.rightChild.data);
//        }else {
//            System.out.println("Null");
//        }
//        displayViaRecursion(root.leftChild);
//        displayViaRecursion(root.rightChild);
//    }
//    public static void main(String[] args) {
//        Node root = new Node(1);
//        Node a  = new Node(2);
//        Node b  = new Node(3);
//        root.leftChild=a;
//        root.rightChild=b;
//        Node c  = new Node(4);
//        a.leftChild=c;
//        a.rightChild=null;
//        Node e  = new Node(6);
//        Node f  = new Node(7);
//        b.leftChild=e;
//        b.rightChild=f;
//        displayViaRecursion(root);
//    }
//}



//public class PwTreeDataStructure {
//   static class Node {
//       int data;
//       Node leftChild;
//       Node rightChild;
//
//       public Node(int data) {
//           this.data = data;
//       }
//   }
//
//   public static void printPreorder(Node root){    //  printPreorder  ---------->>
//       if (root==null){
//           return;
//       }
//       System.out.print(root.data+" ");
//       printPreorder(root.leftChild);
//       printPreorder(root.rightChild);
//   }
//    static int totalSize=0;
//   public static void size(Node root){
//       if (root==null){
//           return;
//       }
//        totalSize++;
//        size(root.leftChild);
//       size(root.rightChild);
//   }
//   public static int getSize(Node root){   // this is better way to  tree find size --------->>
//       if (root==null){
//           return 0;
//       }
//       return 1+getSize(root.leftChild)+getSize(root.rightChild);
//   }
//
//   public static int sumOfTreeNodes(Node root){    //  sumOfTreeNodes------->>
//       if (root==null){
//           return 0;
//       }
//     int ans=  root.data+sumOfTreeNodes(root.leftChild)+sumOfTreeNodes(root.rightChild);
//     return ans;
//   }
//
//   public static int multiplyTreeNodes(Node root){
//       if (root==null){
//           return 1;
//       }
//       return root.data*multiplyTreeNodes(root.leftChild)*multiplyTreeNodes(root.rightChild);
//   }
//   public static int maxValueNodeForWholeTree(Node root){   //  maxValueNodeForWholeTree ---->>
//       if (root==null){
//           return Integer.MIN_VALUE;  // if tree node's value is negative then and tree node's values positive then two case are handel by this
//       }
//       return Math.max( root.data,Math.max( maxValueNodeForWholeTree(root.leftChild),maxValueNodeForWholeTree(root.rightChild) ) );
//   }
//   public static int minValueForWholeTree(Node roo){   //  minValueForWholeTree ---->>
//       if (roo==null) return Integer.MAX_VALUE;
//       return Math.min(roo.data , Math.min(minValueForWholeTree(roo.leftChild),minValueForWholeTree(roo.rightChild)));
//   }
//   public static int heightLevelWise(Node root){   //  heightLevelWise -------->>
//       if (root==null) return 0;
//      return  1+Math.max(heightLevelWise(root.leftChild),heightLevelWise(root.rightChild));
//   }
//   // total edges in a tree is = total node-1, and edges wise height = level-1;
//   public static int edgesWiseheight(Node roo){     // edgesWiseheight ---------->>
//       if (roo==null){
//           return 0;
//       }
//       if (roo.leftChild==null && roo.rightChild==null){
//           return 0;
//       }
//       return 1+Math.max( edgesWiseheight(roo.leftChild),edgesWiseheight(roo.rightChild) );
//   }
//
//   public static void printPreOrder(Node root){   // printPreOrder ---->   parent node then left child then right child
//       if (root==null) return;
//       System.out.print(root.data+" ");
//       printPreorder(root.leftChild);
//       printPreorder(root.rightChild);
//   }
//   public static void printInOrder(Node roo){  //printInOrder----->  left child then parent node then right child
//       if (roo==null) return;
//       printInOrder(roo.leftChild);
//          System.out.print(roo.data+"  ");
//       printInOrder(roo.rightChild);
//   }
//
//   public static void  printPostOrder(Node root){ //printPostOrder --->> left child right child and then parent child
//       if (root==null) return;
//       printPostOrder(root.leftChild);
//       printPreOrder(root.rightChild);
//       System.out.print(root.data+" ");
//   }
//
//   public static void nthLevelElePrinting(Node root,int level){  // nthLevelElePrinting --->>  // time complexity O(n)
//       if (root==null) return;
//       if (level==1){
//           System.out.print(root.data+" ");
//           return;
//       }
//       nthLevelElePrinting(root.leftChild,level-1);
//       nthLevelElePrinting(root.rightChild,level-1);
//   }
//
//
//    public static void main(String[] args) {
//        Node root = new Node(1);
//        Node a  = new Node(2);
//        Node b  = new Node(3);
//        root.leftChild=a;
//        root.rightChild=b;
//        Node c  = new Node(4);
//        Node d  = new Node(5);
//        a.leftChild=c;
//        a.rightChild=d;
//        Node f  = new Node(7);
//        b.leftChild=null;
//        b.rightChild=f;
////       printPreorder(root);
////       size(root);
////        System.out.println("Total size is : "+totalSize);
////        System.out.println("total size of tree is : "+getSize(root));
////        System.out.println("Sum of tree's all nodes : "+sumOfTreeNodes(root));
////        System.out.println("Multiply of tree's all nodes : "+multiplyTreeNodes(root));
////        System.out.println("Max value node for whole tree is :"+maxValueNodeForWholeTree(root));
////        System.out.println("min value node for whole tree is :"+minValueForWholeTree(root));
////        System.out.println("Level wise tree height is : "+heightLevelWise(root));
////        System.out.println("Edges wise height is : "+edgesWiseheight(root));
////        printPreorder(root);
////        System.out.println();
////        printInOrder(root);
////        System.out.println();
////    printPostOrder(root);
////        System.out.println();
//
////    nthLevelElePrinting(root,3);
////        System.out.println();
////    nthLevelElePrinting(root,2);
//
//    // Level wise element printing using this  nthLevelElePrinting method-->
//        int l = heightLevelWise(root);
//        for (int i=1;i<=l;i++){        // time complexity : O(nlogn) or if we not do any extra traversal then  O(n)
//            nthLevelElePrinting(root,i);
//            System.out.println();
//        }
//
//    }
//}


//import java.util.ArrayDeque;
//import java.util.Queue;
//import java.util.Stack;
//
//public class PwTreeDataStructure {
//   static class Node {
//       int data;
//       Node leftChild;
//       Node rightChild;
//
//       public Node(int data) {
//           this.data = data;
//       }
//   }
//
//    public static void nthLevelElePrinting(Node root,int level){  // nthLevelElePrinting --->>  // time complexity O(n)
//       if (root==null) return;
//       if (level==1){
//           System.out.print(root.data+" ");
//           return;
//       }
//       nthLevelElePrinting(root.leftChild,level-1);
//       nthLevelElePrinting(root.rightChild,level-1);
//   }
//
//   public static void levelElePrinting(Node root){  // Breath first search(BFS) using Queue Level order traversal ------->>
//       Queue<Node> qu = new ArrayDeque<>();
//      if (root!=null) qu.offer(root);
//       while (!qu.isEmpty()) {
//           Node temp = qu.poll();
//          if(temp.leftChild!=null) qu.offer(temp.leftChild);
//           if (temp.rightChild!=null) qu.offer(temp.rightChild);
//           System.out.print(temp.data+" ");
//       }
//   }
//
//
//        // DFS(Depth First Search) using stack iteratively printing   Preorder,Inorder,Postorder  --------->>
//
//    public static void DFSPreorder(Node root){   // DFSPreorder ------->>>
//       Stack<Node> sc =new Stack<>();
//       if (root!=null) sc.push(root);
//       while (!sc.isEmpty()){
//           Node temp = sc.pop();
//           System.out.print(temp.data+" ");
//           if (temp.rightChild!=null){
//               sc.push(temp.rightChild);
//           }
//           if (temp.leftChild!=null){
//               sc.push(temp.leftChild);
//           }
//       }
//    }
//   public static void DFSInorder(Node root){  //  DFSInorder------>>
//       Stack<Node> stk = new Stack<>();
//        if (root!=null) stk.push(root);
//        while (!stk.isEmpty()){
//            Node temp = stk.peek();
//                if (temp.leftChild!=null) {
//                    stk.push(temp.leftChild);
//                    temp.leftChild=null;
//                }else {
//                    stk.pop();
//                    System.out.print(temp.data + " ");
//                    if (temp.rightChild != null) {
//                        stk.push(temp.rightChild);
//                        temp.rightChild = null;
//                    }
//                }
//        }
//   }
//
//   public static void DFSPostOrder(Node root){  // DFSPostOrder---->>
//       Stack<Node> st = new Stack<>();
//       if (root!=null) st.push(root);
//       while (!st.isEmpty()){
//           Node temp = st.peek();
//           if (temp.leftChild!=null){
//               st.push(temp.leftChild);
//               temp.leftChild=null;
//           }
//           else {
//               if (temp.rightChild!=null){
//                   st.push(temp.rightChild);
//                   temp.rightChild=null;
//               }
//               else {
//                   st.pop();
//                   System.out.print(temp.data+" ");
//               }
//           }
//       }
//   }
//
//       public static void main(String[] args) {
//        Node root = new Node(1);
//        Node a  = new Node(2);
//        Node b  = new Node(3);
//        root.leftChild=a;
//        root.rightChild=b;
//        Node c  = new Node(4);
//        Node d  = new Node(5);
//        a.leftChild=c;
//        a.rightChild=d;
//        Node e = new Node(6);
//        Node f  = new Node(7);
//        b.leftChild=e;
//        b.rightChild=f;
//
//        //levelElePrinting(root);
//       // DFSInorder(root);
//
//           DFSPreorder(root);
//           System.out.println();
//           DFSPostOrder(root);
//
//       }
//   }


             // Construct own Binary Tree ---------->> using Queue or Bfs

//import java.util.*;
//     public class PwTreeDataStructure {
//       static class Node{
//            int val;
//            Node left;
//            Node right;
//            Node(int val){
//                this.val=val;
//                left=null;
//                right=null;
//            }
//        }
//    public static int heightLevelWise(Node root){   //  heightLevelWise -------->>
//       if (root==null) return 0;
//      return  1+Math.max(heightLevelWise(root.left),heightLevelWise(root.right));
//   }
//    public static void nthLevelElePrinting(Node root,int level){  // nthLevelElePrinting --->>  // time complexity O(n)
//        if (root==null) return;
//        if (level==1){
//            System.out.print(root.val+" ");
//            return;
//        }
//        nthLevelElePrinting(root.left,level-1);
//        nthLevelElePrinting(root.right,level-1);
//    }
//
//         public static Node costructTree(String[] arr){
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
//         public static void main(String[] args) {
//           String[] ss={"1","2","3","4","5",null,"6",null,"7",null,null,"8",null,null,null,"9",null};
//          Node nn = costructTree(ss);
//          int l=heightLevelWise(nn);
//          for (int i=1;i<=l;i++){
//              nthLevelElePrinting(nn,i);
//              System.out.println();
//          }
//
//         }
//}


              // Boundary element of a Binary tree ----------->>

//import  java.util.*;
//class Node{
//    int val;
//    Node left;
//    Node right;
//    Node(int val){
//        this.val=val;
//        left=null;
//        right=null;
//    }
//}
//   public class PwTreeDataStructure {
//       public static Node costructTree(String[] arr){
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
//       public static void leftBounndary(Node root){
//           if (root==null) return;
//           if (root.left==null&&root.right==null) return;
//           System.out.print(root.val+" ");
//          if (root.left!=null){
//              leftBounndary(root.left);
//          }else {
//              leftBounndary(root.right);
//          }
//       }
//
//       public static void leafNodeboundary(Node root){
//           if (root==null) return;
//           if (root.left==null&&root.right==null){
//               System.out.print(root.val+" ");
//               return;
//           }
//           leafNodeboundary(root.left);
//           leafNodeboundary(root.right);
//       }
//
//       public static void rightBoundry(Node root){
//           if (root==null) return;
//           if (root.left==null&&root.right==null) return;
//          // System.out.print(root.val+" ");
//          if (root.right!=null){
//              rightBoundry(root.right);
//          }else {
//              rightBoundry(root.left);
//          }
//           System.out.print(root.val+" ");
//       }
//
//       public static void totalBoundary(Node root){
//           leftBounndary(root);
//           leafNodeboundary(root);
//           rightBoundry(root.right);      // because we print root val one time so don't repeat again
//
//       }
//        public static void main(String[] args) {
//         String[] arr={"1","2","3","4","5",null,"13","6",null,"9","10",null,"15",null,"7",null,"11","12",null,null,"16"};
//         Node roo= costructTree(arr);
//         totalBoundary(roo);
//     }
//}


           // Solved in leetcode  ----->>     94. Binary Tree Inorder Traversal

      // This is recursive way ------>>
//class Solution {
//    public void inorderUsingRecursion(TreeNode roo, List<Integer> li){
//        if(roo==null) return;
//        inorderUsingRecursion(roo.left,li);
//        li.add(roo.val);
//        inorderUsingRecursion(roo.right,li);
//    }
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> ll = new ArrayList<Integer>();
//        inorderUsingRecursion(root,ll);
//
//        return ll;
//    }
//}



          // Diameter of binary tree   -- solved in leetcode--------->>>>

//class Solution {
//    public int heightEdgesWise(TreeNode root){
//        if(root==null) return 0;
//        if(root.left==null && root.right==null) return 0;
//        return 1+Math.max(heightEdgesWise(root.left),heightEdgesWise(root.right));
//    }
//    public int diameterOfBinaryTree(TreeNode root) {
//        if(root==null) return 0;
//        if(root.left==null && root.right==null) return 0;
//        int leftDiameter = diameterOfBinaryTree(root.left);
//        int rightDiameter = diameterOfBinaryTree(root.right);
//        int count = heightEdgesWise(root.left) + heightEdgesWise(root.right);
//        if(root.left!=null) count+=1;
//        if(root.right!=null) count+=1;
//
//        return Math.max(count,Math.max( leftDiameter,rightDiameter));
//
//    }
//}



       // is balanced binary tree --- solved in leetcode------------>>

//class Solution {
//    // public void heightEdgesWise(TreeNode root){
//    //     if(root==null) return 0;
//    //     if(root.left==null&&root.right==null) return 0;
//    //    return 1+Math.max(heightEdgesWise(Node.left),heightEdgesWise(Node.right) );
//    // }
//    public int heightLevelwise(TreeNode root){
//        if(root==null) return 0;
//        return 1+Math.max(heightLevelwise(root.left),heightLevelwise(root.right));
//    }
//    public boolean isBalanced(TreeNode root) {
//        if(root==null) return true;
//        int leftHeight=heightLevelwise(root.left);
//        int rightheight= heightLevelwise(root.right);
//        if(Math.abs(leftHeight-rightheight)>1) return false;
//        return ( isBalanced(root.left)&&isBalanced(root.right) );
//    }
//}
//



                //  Same tree  -- Solved in leetcode ------------>>>>

//class Solution {
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if(p==null&&q==null) return true;
//        if(p==null || q==null) return false;
//        if(p.val!=q.val)  return false;
//        return  (isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
//    }
//}


           // Binary Tree Paths    ------------->>

//class Solution {
//    public void paths(TreeNode root,List<String> ls,String ss){
//        if(root==null) return;
//        if(root.left==null &&root.right==null){
//            ss+=root.val;
//            ls.add(ss);
//            return;
//        }
//        paths(root.left,ls, ss+root.val+"->");
//        paths(root.right,ls, ss+root.val+"->");
//    }
//    public List<String> binaryTreePaths(TreeNode root) {
//        List<String> ls = new ArrayList<>();
//        String ss= "";
//        paths(root,ls,ss);
//        return ls;
//    }
//}


                  //  lowest common Ancestor ---  Solved in leetcode--------------->>>>>>>

//class Solution {
//    public boolean isPresent(TreeNode root,TreeNode node){
//        if(root==null) return false;
//        if(root==node)return true;
//        return  (isPresent(root.left,node) || isPresent(root.right,node));
//
//    }
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(p==q) return p;
//        if(p==root||q==root) return root;
//        boolean leftPresent = isPresent(root.left,p);
//        boolean rightPresent = isPresent(root.right,q);
//        if(leftPresent && rightPresent) return root;
//        if(!leftPresent && !rightPresent) return root;
//        if(leftPresent && !rightPresent){
//            return lowestCommonAncestor(root.left,p,q);
//        }
//        if(!leftPresent && rightPresent){
//            return lowestCommonAncestor(root.right,p,q);
//        }
//
//        return null;     // This is default for not get to missing return statement
//
//    }
//}


               //  Invert Binary Tree-----  Solved in leetcode-------------->>
       // Time Complexity : O(n)
        // Space Complexity : O(height ) or O(logn)  // because height = logn

// class Solution {
//     public void swap(TreeNode root){
//         TreeNode temp = root.left;
//         root.left = root.right;
//         root.right=temp;
//     }
//     public void helper(TreeNode root){
//         if(root==null) return;
//         if(root.left==null && root.right==null) return;
//         swap(root);
//         helper(root.left);
//         helper(root.right);
//     }
//     public TreeNode invertTree(TreeNode root) {
//         helper(root);
//         return root;
//     }
// }
                  // or  -------->>>>>
//class Solution {
//    public void swap(TreeNode root){
//        TreeNode temp = root.left;
//        root.left = root.right;
//        root.right=temp;
//    }
//    public TreeNode invertTree(TreeNode root) {
//        if(root==null) return null;
//        if(root.left==null&&root.right==null) return root; // becuase now the root is leaf node
//        TreeNode left = invertTree(root.left);
//        TreeNode right = invertTree(root.right);
//        swap(root);
//
//        return root;
//    }
//}



//  check whether it is a mirror of itself------ solved in leetcode---------->>>>

/*
class Solution {
    public void swap(TreeNode root){
        TreeNode temp = root.left;
        root.left=root.right;
        root.right=temp;
    }
    public TreeNode invert(TreeNode root){
        if(root==null) return null;
        swap(root);
        invert(root.left);
        invert(root.right);
        return root;
    }

    public boolean isSameTree(TreeNode tree1,TreeNode tree2){
        if(tree1==null&&tree2==null) return true;
        if(tree1==null || tree2==null) return false;
        if(tree1.val==tree2.val){
            return (isSameTree(tree1.left,tree2.left) &&  isSameTree(tree1.right,tree2.right));
        }
        return false;  // it is default
    }
    public boolean isSymmetric(TreeNode root) {
        TreeNode left = invert(root.left);
        return (isSameTree(left,root.right));
    }
}*/


           //   Zigzag level order element printing ----->>  and  similar Question solved leetcode ------>>

    //public class PwTreeDataStructure {
    //    static class Node {
    //        int data;
    //        Node leftChild;
    //        Node rightChild;
    //
    //        public Node(int data) {
    //            this.data = data;
    //        }
    //    }
    //      public static void nthLevelLeftToRight(Node root,int level){
    //        if (root==null)return;
    //        if (level==1){
    //            System.out.print(root.data+" ");
    //            return;
    //        }
    //          nthLevelLeftToRight(root.leftChild,level-1);
    //          nthLevelLeftToRight(root.rightChild,level-1);
    //
    //      }
    //      public static void nthLevelRighttoLeft(Node root,int level){
    //          if (root==null)return;
    //        if (level==1){
    //            System.out.print(root.data+" ");
    //        }
    //          nthLevelRighttoLeft(root.rightChild, level-1);
    //          nthLevelRighttoLeft(root.leftChild ,level-1);
    //
    //      }
    //    public static int heightLevelWise(Node root){   //  heightLevelWise -------->>
    //       if (root==null) return 0;
    //      return  1+Math.max(heightLevelWise(root.leftChild),heightLevelWise(root.rightChild));
    //   }
    //      public static void main(String[] args) {
    //          Node root = new Node(1);
    //          Node a  = new Node(2);
    //          Node b  = new Node(3);
    //          root.leftChild=a;
    //          root.rightChild=b;
    //          Node c  = new Node(4);
    //          Node d  = new Node(5);
    //          a.leftChild=c;
    //          a.rightChild=d;
    //          Node e = new Node(6);
    //          Node f  = new Node(7);
    //          b.leftChild=e;
    //          b.rightChild=f;
    //          int l = heightLevelWise(root);
    //          for (int i=0;i<=l;i++) {
    //              if (i % 2 != 0) {
    //                  nthLevelLeftToRight(root, i);
    //                  System.out.println();
    //              } else {
    //                  nthLevelRighttoLeft(root, i);
    //                  System.out.println();
    //              }
    //          }
    //      }
    //}


                //   Binary Tree right side view ------->>>>  solved in leetcode

                   // This is a normal way ----->>
          // This not a Opimize approach according to Time and Space Complexity ------>>>
// class Solution {
// public int height(TreeNode root){
//     if(root==null) return 0;
//     return 1+Math.max(height(root.left),height(root.right));
// }

//     public void nthLevel(TreeNode root,int level,List<Integer> ls){
//        if(root==null) return;
//        if(level==1) {
//            ls.add(root.val);
//            return;
//        }
//        nthLevel(root.left,level-1,ls);
//         nthLevel(root.right,level-1,ls);
//     }

//     public List<Integer> rightSideView(TreeNode root) {
//         List<List<Integer>> lls = new ArrayList<>();
//         List<Integer> ll = new ArrayList<>();
//         int L = height(root);
//         for(int i=1;i<=L;i++){
//            nthLevel(root,i,ll);
//            lls.add(ll);
//             ll = new ArrayList<>();
//         }

//         List<Integer> ans = new ArrayList<>();
//         for(int i=0;i<lls.size();i++){
//             List<Integer> temp = lls.get(i);
//             ans.add(temp.get( temp.size()-1) );
//         }

//      return ans;

//     }
// }

                     //  Optimize Approach -------->>
//import java.util.*;
//class Solution {
//    static class TreeNode{
//        int val;
//        TreeNode left;
//        TreeNode right;
//        TreeNode(int da){
//            this.val=da;
//        }
//    }
//    public int height(TreeNode root){
//        if(root==null) return 0;
//        return 1+Math.max(height(root.left),height(root.right));
//    }
//
//    public void leftView(TreeNode root,List<Integer> lis ,int level){      //   Binary Tree left side view ------->>>>
//        if(root==null) return;
//        lis.set(level-1,root.val);
//        leftView(root.right,lis,level+1);
//        leftView(root.left,lis,level+1);
//    }
//    public void rightView(TreeNode root,List<Integer> lis ,int level){     //   Binary Tree right side view ------->>>>
//        if(root==null) return;
//        lis.set(level-1,root.val); // It is a method to update old value to new value particular index
//        rightView(root.left,lis,level+1);
//        rightView(root.right,lis,level+1);
//
//    }
//    public List<Integer> rightSideView(TreeNode root) {
//        List<Integer> llls = new ArrayList<>();
//        int le=height(root);
//        for(int i=1;i<=le;i++){
//            llls.add(0);      // any default element add in arraylist
//        }
//
//        rightView(root,llls , 1);
//          return llls;
//
//       //   leftView(root,llls,1);
//       // return llls;
//
//    }
//}


              //  Vertical level elements printing of a tree --------------->>>
      //  And Top view  element of a tree And Bottom view element   -------->>>



//import java.util.*;
//public  class PwTreeDataStructure {
//    static class Node {
//        int val;
//        Node left;
//        Node right;
//
//        Node(int val) {
//            this.val = val;
//        }
//    }
//    public static Node costructTree(String[] arr){
//        int x = Integer.parseInt(arr[0]);
//        Node root = new Node(x);
//        Queue<Node> qu = new ArrayDeque<>();
//        qu.offer(root);
//        int i = 1;
//        while (i<arr.length-1){
//            Node temp = qu.poll();
//            Node left = new Node(0);
//            Node right = new Node(0);
//            if (arr[i]==null){
//                left=null;
//            }else {
//                left.val = Integer.parseInt(arr[i]);
//                qu.offer(left);
//            }
//
//            if (arr[i+1]==null){
//                right=null;
//            }else {
//                right.val=Integer.parseInt(arr[i+1]);
//                qu.offer(right);
//            }
//            temp.left=left;
//            temp.right=right;
//            i+=2;
//        }
//        return root;
//    }
//
//    public static int leftCount(Node root){
//        if (root==null) return 0;
//        return 1+leftCount(root.left);
//    }
//    public static int rightCount(Node root){
//        if(root==null) return 0;
//        return 1+rightCount(root.right);
//    }
//    public static void printVerticalelements(Node root,int level,int currLevel){
//        if (root==null) return;
//        if (level==currLevel){
//            System.out.print(root.val+" ");
//           // return;
//        }
//        printVerticalelements(root.left,level,currLevel-1);
//        printVerticalelements(root.right,level,currLevel+1);
//    }
//    public static void verticalLevelElement(Node root){                //  verticalLevelElement ---------->>
//         for (int i=1-leftCount(root);i<rightCount(root);i++){
//             printVerticalelements(root,i,0);
//             System.out.println();
//         }
//    }
//
//
//
//    public static void printViewElement(Node root,int level,int currLevel){
//        if (root==null) return;
//        if (level==currLevel){
//            System.out.print(root.val+" ");
//            return;
//        }
//        printViewElement(root.left,level,currLevel-1);
//        printViewElement(root.right,level,currLevel+1);
//    }
//    public static void topViewElement(Node root){                    //  topViewElement ----------->>>>
//        for (int i=1-leftCount(root);i<rightCount(root);i++){
//            printViewElement(root,i,0);
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        String[] arr ={"1","2","3","4","5",null,"6",null,"7"};
//       Node root = costructTree(arr);
////          // verticalLevelElement(root);
////       // topViewElement(root);
////       HashMap<Integer,Integer> hm = new HashMap<>();
////         bottomViewElement(root,0,hm);
////         for (int e: hm.values()){
////             System.out.print(e+" ");
////         }
//
//    }
//}


                      //  Bottom View elements of a tree -------------->>

//import java.util.*;
//public  class PwTreeDataStructure {
//    static class Node {
//        int val;
//        Node left;
//        Node right;
//        Node(int val) {
//            this.val = val;
//        }
//    }
//    public static Node costructTree(String[] arr){
//        int x = Integer.parseInt(arr[0]);
//        Node root = new Node(x);
//        Queue<Node> qu = new ArrayDeque<>();
//        qu.offer(root);
//        int i = 1;
//        while (i<arr.length-1){
//            Node temp = qu.poll();
//            Node left = new Node(0);
//            Node right = new Node(0);
//            if (arr[i]==null){
//                left=null;
//            }else {
//                left.val = Integer.parseInt(arr[i]);
//                qu.offer(left);
//            }
//
//            if (arr[i+1]==null){
//                right=null;
//            }else {
//                right.val=Integer.parseInt(arr[i+1]);
//                qu.offer(right);
//            }
//            temp.left=left;
//            temp.right=right;
//            i+=2;
//        }
//        return root;
//    }
//
//    public static int leftCount(Node root){
//        if (root==null) return 0;
//        return 1+leftCount(root.left);
//    }
//    public static int rightCount(Node root) {
//        if (root == null) return 0;
//        return 1 + rightCount(root.right);
//    }
//
//    public static void BottomView(Node root,ArrayList<Integer> al){
//        int leftt = leftCount(root);
//        int right = rightCount(root);
//        int level = leftt+right-1;
//        for (int i=1;i<=level;i++){
//            al.add(0);
//        }
//        Bottom(root,0,al,leftt);
//    }
//    public static void Bottom(Node root,int level,ArrayList<Integer> al,int left){    //  Bottom View element of tree------->>>>
//        if (root==null) return;
//        al.set(level+(left-1),root.val);    //  because Arraylist don't have negative indices so we define their right index
//        Bottom(root.right,level+1,al,left);
//        Bottom(root.left,level-1,al,left);
//    }
//
//
//     public static void bottomViewElement(Node root,int level,HashMap<Integer,Integer> hm ){  //  bottomViewElement using HashMap------------->>
//        if (root==null) return;
//        hm.put(level,root.val);
//         bottomViewElement(root.right,level+1,hm);
//         bottomViewElement(root.left,level-1,hm);
//    }
//
// public static void main(String[] args) {
//        String[] arr ={"1","2","3","4","5",null,"6",null,"7"};
//        Node root = costructTree(arr);
//
////        HashMap<Integer,Integer> hm = new HashMap<>();
////        bottomViewElement(root,0,hm);
////        for (int e: hm.values()){
////            System.out.print(e+" ");
////        }
//
//     ArrayList<Integer> ll = new ArrayList<>();
//     BottomView(root,ll);
//       System.out.println(ll);
//
//
//    }
//}



         //  Construct tree from given preorder and inorder traversal array-----  Solved in leetcode---------->>

//class Solution {
//    public TreeNode helper(int[]preorder,int preLow,int preHigh,int[]inorder,int inLow,int inHigh){
//        if(preLow>preHigh) return null;
//        TreeNode root = new TreeNode(preorder[preLow]);
//        int i =inLow;
//        while(inorder[i]!=preorder[preLow]){
//            i++;
//        }
//        int leftSize = i-inLow;
//        root.left=helper(preorder,preLow+1,preLow+leftSize,inorder,inLow,i-1);
//        root.right = helper(preorder,preLow+leftSize+1,preHigh,inorder,i+1,inHigh);
//        return root;
//    }
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        int n = preorder.length;
//        return helper(preorder,0,n-1,inorder,0,n-1);  // becuase two array length is same
//    }
//}


           //  path sum -1 ---  Solved in leetcode -------->>

//class Solution {
//    public boolean hasPathSum(TreeNode root, int targetSum) {
//        if(root==null) return false;
//        if(root.left==null && root.right==null) {
//            if(targetSum==root.val){
//                return true;
//            }else{
//                return false;
//            }
//        }
//        return (hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val));
//    }
//}

            //    path sum -2 ---  Solved in leetcode -------->>

//class Solution {
//    public void possiblePaths(TreeNode root, int sum,List<Integer> ls, List<List<Integer>> ans){
//        if(root==null) return;
//        if(root.left==null &&root.right==null) {
//            if(root.val==sum){
//                ls.add(root.val);
//                List<Integer> temp = new ArrayList<>();
//                for(int e: ls){
//                    temp.add(e);
//                }
//                ans.add(temp);
//                ls.remove(ls.size()-1);     // simple Backtrack
//            }
//
//            return;
//        }
//        ls.add(root.val);
//        possiblePaths(root.left,sum-root.val,ls,ans);
//        possiblePaths(root.right,sum-root.val,ls,ans);
//        ls.remove(ls.size()-1);   // simple Backtrack
//    }
//    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
//        List<List<Integer>> ans = new ArrayList<>();
//        List<Integer> ll = new ArrayList<>();
//        possiblePaths(root,targetSum,ll,ans);
//        return ans;
//
//    }
//}



        //  Flatten of a binary tree into linked list ---- Solved in leetcode--------->>

//             //  Time Complexity : O(n)  and Space Complexity : O(height)

// class Solution {
//     public void flatten(TreeNode root) {
//         if(root==null) return;
//         TreeNode leftTree = root.left;
//         TreeNode rightTree = root.right;
//         flatten(root.left);
//         flatten(root.right);
//         root.right=leftTree;
//         root.left = null;
//         TreeNode temp = leftTree;
//         while(temp!=null && temp.right!=null){
//             temp=temp.right;
//         }
//         if(temp!=null){
//           temp.right=rightTree;
//         }else{
//             root.right=rightTree;
//         }

//     }
// }
//
//              Follow up: Can you flatten the tree in-place (with O(1) extra space)?
//            if we dont use recursive way rather than iterative way then we do this ----->>
//
//class Solution {
//    public void flatten(TreeNode root) {
//        TreeNode curr = root;
//        while(curr!=null){
//            if(curr.left!=null){
//                TreeNode temp = curr.left;
//                while(temp.right!=null){
//                    temp = temp.right;
//                }
//                temp.right=curr.right;
//                curr.right=curr.left;
//                curr.left=null;
//            }
//            curr=curr.right;
//
//        }
//
//    }
//}


               //  Total amount of time to infect the tree ------ Solved in leetcode------>>

//class Solution {
//
//    public TreeNode startNode(TreeNode root,int start){
//        if(root==null) return null;
//        if(root.val==start) return root;
//        TreeNode left=startNode(root.left,start);
//        TreeNode right=startNode(root.right,start);
//        if(left!=null) {
//            return left;
//        }else{
//            return right;
//        }
//    }
//                 // Because we don't have parent access like left,right child so we create hashmap for each node parents
//    public void parents(TreeNode root,HashMap<TreeNode,TreeNode> parent){
//        if(root==null) return;
//        if(root.left!=null) parent.put(root.left,root);
//        if(root.right!=null) parent.put(root.right,root);
//        parents(root.left,parent);
//        parents(root.right,parent);
//    }
//
//    public int amountOfTime(TreeNode root, int start) {
//        TreeNode start_node = startNode(root,start);
//        HashMap<TreeNode,TreeNode> parent = new HashMap<>();
//        parents(root,parent);
//
//        Queue<TreeNode> qu = new ArrayDeque<>();
//        qu.offer(start_node);
//
//        HashMap<TreeNode,Integer> infected = new HashMap<>();
//        infected.put(start_node,0);
//
//        while(!qu.isEmpty()){
//            TreeNode temp = qu.poll();
//            int mint = infected.get(temp)+1;
//            if(temp.left!=null && !infected.containsKey(temp.left)){
//                qu.offer(temp.left);
//                infected.put(temp.left,mint);
//            }
//            if(temp.right!=null &&!infected.containsKey(temp.right)){
//                qu.offer(temp.right);
//                infected.put(temp.right,mint);
//            }
//            if(parent.containsKey(temp) && !infected.containsKey(parent.get(temp))){
//                qu.offer(parent.get(temp));
//                infected.put(parent.get(temp),mint);
//            }
//        }
//
//        int totalTime = Integer.MIN_VALUE;
//        for(int e: infected.values()){
//            totalTime=Math.max(totalTime,e);
//        }
//
//        return totalTime;
//    }
//}


                    //  Max Path Sum ------------>>>
               //  Solved in leetcode------------>>

//class Solution {
//    int MaxPath = Integer.MIN_VALUE;
//    public int helper(TreeNode root){
//        if(root==null) return 0;
//        //because if left path or right path is negative then we don't add
//        int left = Math.max(0,helper(root.left));
//        int right= Math.max(0,helper(root.right));
//
//        MaxPath = Math.max(MaxPath,root.val+left+right);
//
//        return root.val+Math.max(left,right);
//
//    }
//    public int maxPathSum(TreeNode root) {
//        helper(root);
//        return MaxPath;
//    }
//}




                      //  TREE ASSIGNMENT ----------->>>>


     // Problem -1.  zigzag level order or spiral order element printing-------->>

//public class PwTreeDataStructure {
//    static class Node {
//        int data;
//        Node leftChild;
//        Node rightChild;
//
//        public Node(int data) {
//            this.data = data;
//        }
//    }
//      public static void nthLevelLeftToRight(Node root,int level){
//        if (root==null)return;
//        if (level==1){
//            System.out.print(root.data+" ");
//            return;
//        }
//          nthLevelLeftToRight(root.leftChild,level-1);
//          nthLevelLeftToRight(root.rightChild,level-1);
//
//      }
//      public static void nthLevelRighttoLeft(Node root,int level){
//          if (root==null)return;
//        if (level==1){
//            System.out.print(root.data+" ");
//        }
//          nthLevelRighttoLeft(root.rightChild, level-1);
//          nthLevelRighttoLeft(root.leftChild ,level-1);
//
//      }
//    public static int heightLevelWise(Node root){   //  heightLevelWise -------->>
//       if (root==null) return 0;
//      return  1+Math.max(heightLevelWise(root.leftChild),heightLevelWise(root.rightChild));
//   }
//      public static void main(String[] args) {
//          Node root = new Node(1);
//          Node a  = new Node(2);
//          Node b  = new Node(3);
//          root.leftChild=a;
//          root.rightChild=b;
//          Node c  = new Node(4);
//          Node d  = new Node(5);
//          a.leftChild=c;
//          a.rightChild=d;
//          Node e = new Node(6);
//          Node f  = new Node(7);
//          b.leftChild=e;
//          b.rightChild=f;
//          int l = heightLevelWise(root);
//          for (int i=0;i<=l;i++) {
//              if (i % 2 != 0) {
//                  nthLevelLeftToRight(root, i);
//                  System.out.println();
//              } else {
//                  nthLevelRighttoLeft(root, i);
//                  System.out.println();
//              }
//          }
//      }
//}

   // Problem-2.  Check the tree is a complete binary tree or not.A complete binary tree is a tree in which every level
  //               except possibly the last is filled,and all nodes are as far left as possible.

                 // Solved in leetcode---------->>>
//class Solution {
//    public boolean isCompleteTree(TreeNode root) {
//        Queue<TreeNode> qu = new LinkedList<>();
//        qu.offer(root);
//        boolean found_null = false;
//        while(!qu.isEmpty()){
//            TreeNode temp = qu.poll();
//            if(temp==null){
//                found_null=true;
//            }else{
//                if(found_null==true){
//                    return false;
//                }else{
//                    qu.offer(temp.left);
//                    qu.offer(temp.right);   //here we don't check child are null or not.
//                }
//            }
//        }
//        return true;
//    }
//}


//        // Problem-3. Bottom to up level wise element printing-------->>
//
//public class PwTreeDataStructure {
//    static class Node {
//        int data;
//        Node leftChild;
//        Node rightChild;
//
//        public Node(int data) {
//            this.data = data;
//        }
//    }
//      public static void nthLevelLeftToRight(Node root,int level){
//        if (root==null)return;
//        if (level==1){
//            System.out.print(root.data+" ");
//            return;
//        }
//          nthLevelLeftToRight(root.leftChild,level-1);
//          nthLevelLeftToRight(root.rightChild,level-1);
//
//      }
//    public static int heightLevelWise(Node root){   //  heightLevelWise -------->>
//       if (root==null) return 0;
//      return  1+Math.max(heightLevelWise(root.leftChild),heightLevelWise(root.rightChild));
//   }
//      public static void main(String[] args) {
//          Node root = new Node(1);
//          Node a  = new Node(2);
//          Node b  = new Node(3);
//          root.leftChild=a;
//          root.rightChild=b;
//          Node c  = new Node(4);
//          Node d  = new Node(5);
//          a.leftChild=c;
//          a.rightChild=d;
//          Node e = new Node(6);
//          Node f  = new Node(7);
//          b.leftChild=e;
//          b.rightChild=f;
//          int l = heightLevelWise(root);
//          for (int i=l;i>=1;i--) {
//              nthLevelLeftToRight(root,i);
//              System.out.println();
//          }
//      }
//}


       // problem-4 left view----->>

//import java.util.*;
//class Solution {
//    static class TreeNode{
//        int val;
//        TreeNode left;
//        TreeNode right;
//        TreeNode(int da){
//            this.val=da;
//        }
//    }
//    public int height(TreeNode root){
//        if(root==null) return 0;
//        return 1+Math.max(height(root.left),height(root.right));
//    }
//
//    public void leftView(TreeNode root,List<Integer> lis ,int level){      //   Binary Tree left side view ------->>>>
//        if(root==null) return;
//        lis.set(level-1,root.val);
//        leftView(root.right,lis,level+1);
//        leftView(root.left,lis,level+1);
//    }
//    public List<Integer> leftSideView(TreeNode root) {
//        List<Integer> llls = new ArrayList<>();
//        int le=height(root);
//        for(int i=1;i<=le;i++){
//            llls.add(0);      // any default element add in arraylist
//        }
//
//
//          leftView(root,llls,1);
//        return llls;
//
//    }
//}


        // Problem-5   Covert  binary tree's  mirror tree or invert tree ----->>>

//class Solution {
//    public void swap(TreeNode root){
//        TreeNode temp = root.left;
//        root.left = root.right;
//        root.right=temp;
//    }
//    public TreeNode invertTree(TreeNode root) {
//        if(root==null) return null;
//        if(root.left==null&&root.right==null) return root; // becuase now the root is leaf node
//        TreeNode left = invertTree(root.left);
//        TreeNode right = invertTree(root.right);
//        swap(root);
//
//        return root;
//    }
//}

