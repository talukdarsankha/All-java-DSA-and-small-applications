







                 // Back Tracking ----------------->>>>>>>>







                 //                    //  subsequence of array
//
//
//import java.util.ArrayList;
//
//public class BackTracking {
//
//    public static void subsequences(int[] arr, int idx, ArrayList<Integer> al){
//        if (idx==arr.length){
//            System.out.println(al);
//            return;
//        }
//        subsequences(arr,idx+1,al);
//        al.add(arr[idx]);
//        subsequences(arr,idx+1,al);
//        al.remove(al.size()-1);            //          <<<---------- BackTrack
//    }
//    public static void main(String[] args) {
//
//        int[]arr= {1,2,3};
//        subsequences(arr,0,new ArrayList<>());
//    }
//}







//                           // Premutation   ex - Pemutaion of ABC = ABC,ACB,BAC,BCA,CAB,CBA
//
//public class BackTracking {
//
//    public static void swap (char[] arr ,int i ,int j){
//        char temp = arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//    public static void Permutation(char[] arr , int fixedIdx){
//
//        if (fixedIdx==arr.length-1){
//            System.out.println(arr);
//            return;
//        }
//        for (int i = fixedIdx;i<arr.length;i++){
//            swap(arr,fixedIdx,i);
//            Permutation(arr,fixedIdx+1);
//
//            swap(arr,fixedIdx,i);    //      <<-------  BackTracking
//        }
//    }
//    public static void main(String[] args) {
//
//        String st = "ABC";
//        char[] ar = st.toCharArray();
//        Permutation(ar,0);
//    }
//}











//
//                 // Rat in a Maze
//                 // Give a square if 1 then rat go but if 0 present way rat can't go this is the problem
//
//
//                 public class BackTracking{
//
//                     public static  void   PossiblePath(int[][] arr ,int[][] vistedArray,int row, int column, int n ,String paths){
//                         n = arr.length;
//                         // if start or end is 0 then rat cant reach destination
//                         if (arr[0][0]==0 || arr[n-1][n-1]==0){
//                             System.out.println("No Paths");
//                             return;
//                         }
//                         // Base case
//                         if (row==n-1 && column==n-1){
//                             System.out.println(paths);
//                             return;
//                         }
//
//                         // Down
//                         if (row+1<n && arr[row+1][column]==1 && vistedArray[row+1][column]==0 ){
//                             vistedArray[row][column]=1;
//                             PossiblePath(arr,vistedArray,row+1,column,n,paths+'D');
//                             vistedArray[row][column]=0;           // Backtrack
//                         }
//
//                         // up
//                         if (row-1 >=0 && arr[row-1][column]==1 && vistedArray[row-1][column]==0 ){
//                             vistedArray[row][column]=1;
//                             PossiblePath(arr,vistedArray,row-1,column,n,paths+'U');
//                             vistedArray[row][column]=0;           // Backtrack
//                         }
//
//                         // Right
//                         if (column+1<n && arr[row][column+1]==1 && vistedArray[row][column+1]==0){
//                             vistedArray[row][column]=1;
//                             PossiblePath(arr,vistedArray,row,column+1,n,paths+'R');
//                             vistedArray[row][column]=0;   // Backtrack
//                         }
//
//                         // left
//                         if (column-1>=0 && arr[row][column-1]==1 && vistedArray[row][column-1]==0 ) {
//                             vistedArray[row][column] = 1;
//                             PossiblePath(arr, vistedArray, row, column-1, n, paths+'L');
//                             vistedArray[row][column]=0;
//
//                         }
//                     }
//                     public static void main(String[] args) {
//
//                         int[][] maze = {{1,0,0,0},
//                                 {1,1,0,1},
//                                 {1,1,0,0},
//                                 {0,1,1,1}};
//
//                         int[][] visited = {{0,0,0,0},
//                                 {0,0,0,0},
//                                 {0,0,0,0},
//                                 {0,0,0,0}};
//
//                         PossiblePath(maze,visited,0,0,4," ");
//                     }
//                 }
//














//                         N queens    for a Square matrix
//        // Condition = 1. You must place queens every row and column  2. and must place this  places that any queen not attack each other
//
//
//
//public class leetCodeProblem {
//
//    public static boolean isSafe(char[][]arr,int row ,int column){
//
//        int originalRow=row;
//        int originalColumn=column;
//
//        // upper diagonal
//        while (row>=0 && column>=0){
//            if (arr[row][column]=='Q'){
//                return false;
//            }
//            row--;
//            column--;
//        }
//
//        row=originalRow;
//        column=originalColumn;
//
//        // left side
//
//        while (column>=0){
//            if (arr[row][column]=='Q'){
//                return false;
//            }
//            column--;
//        }
//
//        row=originalRow;
//        column=originalColumn;
//
//        // lower diagonal
//        while (row<arr.length && column>=0){
//            if (arr[row][column]=='Q'){
//                return false;
//            }
//            row++;
//            column--;
//        }
//
//
//        return true;
//    }
//
//    public static boolean solveQueens(char[][] arr,int column){
//        // base case
//        if (column>=arr.length){
//               return true;
//        }
//          for (int row=0; row<arr.length;row++) {
//              if (isSafe(arr, row, column)) {
//                  arr[row][column] = 'Q';
//                  if (solveQueens(arr, column + 1) == true) {
//                      return true;
//                  }
//
//                  arr[row][column] = '-';    // backtrack
//              }
//          }
//
//          return false;
//    }
//
//    public static void print(char[][] arr ){
//        for (int i=0;i<arr.length;i++){
//            for (int j =0;j<arr[0].length;j++){      // it is a square matrix so arr[0].length Or arr.length is same
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//    }
//
//    public static void main(String[] args) {
//
//        char[][] arr = {{'-','-','-','-'},
//                        {'-','-','-','-'},
//                         {'-','-','-','-'},
//                          {'-','-','-','-'}};
//
//       if (solveQueens(arr,0)==true){
//           print(arr);
//       }else {
//           System.out.println("No possible way");
//       }
//
//    }
//}











//                     // N queens    for a Square matrix
//        // Condition = 1. You must place queens every row and column  2. and must place this  places that any queen not attack each other
//
//
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//
//public class leetCodeProblem {
//
//
//
//    public static boolean isSafe(char[][] arr,int i,int j){
//
//        int originalRow =i;
//        int originalColumn =j;
//
//        while (i>=0 && j>=0){
//            if (arr[i][j]=='Q'){
//                return false;
//            }
//            i--;
//            j--;
//        }
//
//        i = originalRow;
//        j = originalColumn;
//        while (j>=0){
//            if (arr[i][j]=='Q'){
//                return false;
//            }
//            j--;
//        }
//
//        i=originalRow;
//        j=originalColumn;
//        while (i<arr.length && j>=0){
//            if (arr[i][j]=='Q'){
//                return false;
//            }
//            i++;
//            j--;
//
//        }
//
//
//        return true;
//    }
//
//    public static void nQueens(char[][] arr, int column, List<List<String >> result){
//        if (column== arr.length){
//           result.add(create(arr));
//            return;
//        }
//        for (int row=0; row<arr.length; row++){
//            if (isSafe(arr,row,column)==true) {   // if (isSafe(arr,row,column)== true)  or if (isSafe(arr,row,column))  two things are same
//                arr[row][column] = 'Q';
//                nQueens(arr, column + 1, result);
//                arr[row][column] = '-';
//            }
//        }
//    }
//
//    public static List<String > create(char[][]arr){
//        List<String> res = new LinkedList<>();
//        for (int i=0;i<arr.length;i++){
//            String  s = new String(arr[i]);
//            res.add(s);
//        }
//        return res;
//    }
//
//    public static List<List<String >> solve(int n){
//        char[][] arr = new char[n][n];
//        for (int i =0;i<arr.length;i++){
//            for (int j= 0;j<arr.length;j++){    // because it is a square matrix so arr[0].length = arr.length
//                arr[i][j]='-';
//            }
//        }
//        List<List<String>> res = new ArrayList<List<String>>();
//        nQueens(arr,0,res);
//        return res;
//    }
//
//
//    public static void main(String[] args) {
//
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter n ");
////       int n= sc.nextInt();
////
////       char[][] arr = new char[n][n];
////       nQueens(arr,0,0,n);
//
//        int n=4;
//        List<List<String>> queen =  solve(n);
//
//        for (List<String > a:queen){
//            for (String b: a){
//                System.out.println(b);
//            }
//            System.out.println();
//        }
//
//    }
//}












//                 //   Soduko Solver
//                 // soduko is a square matrix 9*9  and it's each submatrix is  a square matix 3*3
//
//
//                 public class BackTracking{
//
//                     public static boolean isSafe(int[][] arr ,int row,int column ,int num){
//
//                         // row checking
//                         for (int i = 0;i<arr[0].length;i++){
//                             if (arr[row][i]==num){
//                                 return false;
//                             }
//                         }
//                         //column checking
//                         for (int i = 0;i<arr.length;i++){
//                             if (arr[i][column]==num){
//                                 return false;
//                             }
//                         }
//
//                         int subMatrixRow= row/3*3;                // formula to find  subMatrixRow = row/3*3
//                         int subMatrixColumn= column/3*3;          // formula to find  subMatrixColumn = column/3*3;
//                         for (int i=subMatrixRow;i< subMatrixRow+3 ;i++){
//                             for (int j=subMatrixColumn;j<subMatrixColumn+3 ;j++){         // because each submatrix is 3*3 size ro its's row and column run 3 times
//                                 if (arr[i][j]==num){
//                                     return false;
//                                 }
//                             }
//                         }
//
//
//                         return true;
//
//
//                     }
//                     public static void solveSoduko(int[][] arr,int row,int column){
//
//                         if (row==arr.length){                       // base case
//                             print(arr,arr.length);
//                             return;
//                         }
//
//                         int nextRow=0;
//                         int nextColumn=0;
//                         if (column==arr[0].length-1){
//                             nextRow=row+1;
//                             nextColumn=0;
//                         }else {
//                             nextRow=row;
//                             nextColumn=column+1;
//                         }
//
//                         if (arr[row][column]!=0){
//                             solveSoduko(arr,nextRow,nextColumn);
//                         }else {
//                             for (int i =1;i<=9;i++){
//                                 if (isSafe(arr,row,column,i)==true){
//                                     arr[row][column]=i;
//                                     solveSoduko(arr,nextRow,nextColumn);
//                                     arr[row][column]= 0;          // backtrack
//                                 }
//                             }
//                         }
//
//                     }
//                     public static void print(int[][] arr,int n){
//                         for (int i=0;i<n;i++){
//                             for (int j=0;j<n;j++){        // it is a square arr so row == column
//                                 System.out.print(arr[i][j]+" ");
//                             }
//                             System.out.println();
//                         }
//                     }
//                     public static void main(String[] args) {
//
//                         int [][] soduko = { {3,0,6,5,0,8,4,0,0},
//                                 {5,2,0,0,0,0,0,0,0},
//                                 {0,8,7,0,0,0,0,3,1},
//                                 {0,0,3,0,1,0,0,8,0},
//                                 {9,0,0,8,6,3,0,0,5},
//                                 {0,5,0,0,9,0,6,0,0},
//                                 {1,3,0,0,0,0,2,5,0},
//                                 {0,0,0,0,0,0,0,7,4},
//                                 {0,0,5,2,0,6,3,0,0} };
//
//                         solveSoduko(soduko,0,0);
//
//
//
//                     }
//                 }
//
//










                 //            //   Or       All possible permutation of an array
//
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class leetCodeProblem {
//    public static void permutation(int[] arr, List<List<Integer>> orginal_list ,List<Integer> temp){
//
//        if (temp.size()==arr.length){
//            orginal_list.add(new ArrayList<>(temp));
//            return;
//        }
//        for (int i =0;i<arr.length;i++){
//            if (temp.contains(arr[i])){
//                continue;
//            }
//            temp.add(arr[i]);
//            permutation(arr,orginal_list,temp);
//            temp.remove(temp.size()-1);    // backtrack
//        }
//    }
//    public static void main(String[] args) {
//
//        int[] arr = {1,2,3};
//        List<List<Integer>> ans = new ArrayList<List<Integer>>();
//        List<Integer> temp = new ArrayList<Integer>();
//        permutation(arr,ans, temp);
//
//        System.out.println(ans);
//
//        for (List<Integer> a: ans){
//            for (Integer b: a){
//                System.out.print(b);
//            }
//            System.out.println();
//        }
//    }
//}









//                 // Combination sum
//                 //  Given an integer array you find the array's all possible combination sum ==target you can choose one element unlimited time.
//
//
//                 import java.util.ArrayList;
//                 import java.util.List;
//
//                 public class Backtracking {
//
//                     public static void combinationSum(int[] arr , List<List<Integer>> ans , List<Integer> temp ,int target, int idx){
//
//                         if (target<0){
//                             return;
//                         }
//                         if (target==0){
//                             ans.add(new ArrayList<>(temp));
//                             return;
//                         }
//                         for (int i=idx;i<arr.length;i++){
//                             temp.add(arr[i]);
//                             combinationSum(arr,ans,temp,target-arr[i],i);
//                             temp.remove(temp.size()-1);
//                         }
//                     }
//                     public static void main(String[] args) {
//
//                         List<List<Integer>> ans = new ArrayList<>();
//                         List<Integer> temp = new ArrayList<>();
//
//                         int [] arr={2,3,6,7};
//                         combinationSum(arr,ans,temp,7,0);
//                         System.out.println(ans);
//
//                     }
//                 }














//                 // BackTracking Assignment -------------------->>>>>>>>>
//
//
//
//
//       //  Q1.  Given an integer array and an integer k,return if it is possible to divide the vector into k non-empty subsets with equal sum
//                // ex- arr = [1,3,2,2] and k = 2  then output = true because [1,3] = 1+3=4 and [2,2] = 2+2=4
//
//
//
//
//   public class BackTracking{
//
//    public static boolean canPartition(int[] arr,int k){
//
//        int n = arr.length;
//        int[] visited = new int[n];
//        for (int i = 0;i<visited.length;i++){
//            visited[i]=0;
//        }
//
//        int sum=0;
//        for (int i = 0;i<arr.length;i++){
//            sum+=arr[i];
//        }
//        if (sum%k!=0){
//            return false;
//        }
//         return subsetEqualSum(arr,visited,0,0,sum/k,k);
//
//
//    }
//
//    public static boolean subsetEqualSum(int[]arr , int[]visited,int startIdx,int currentSum,int target,int k){
//
//        if (k==1){
//            return true;
//        }
//        if (currentSum>target){
//            return false;
//        }
//        if (currentSum==target){
//           return subsetEqualSum(arr,visited,0,0,target,k-1);
//        }
//        for (int i=0;i<arr.length;i++){
//            if (visited[i]==0){
//                visited[i]=1;
//                if (subsetEqualSum(arr,visited,i+1,currentSum+arr[i],target,k) == true) return true;
//                visited[i]=0;         // backtrack
//            }
//
//        }
//
//        return false;
//    }
//         public static void main(String[] args) {
//
//             int k=2;
//             int[] arr ={1,3,2,2};
//
//             System.out.println(canPartition(arr,k));
//
//         }
//}





//              // Q-2.  Given an integer array print all the possible permutation of the given array
//
//     public class BackTracking {
//
//    public static void swap(char[] ar,int i,int j){
//
//        char temp = ar[i];
//        ar[i]=ar[j];
//        ar[j]=temp;
//
//    }
//             public static void possible_permutations(char[] arr,int fixedIdx){
//        if (fixedIdx==arr.length-1){
//            System.out.println(arr);
//            return;
//        }
//                 for (int i =fixedIdx;i< arr.length;i++){
//                     swap(arr,fixedIdx,i);
//                     possible_permutations(arr,fixedIdx+1);
//                     swap(arr,fixedIdx,i);  // backtrack
//                 }
//
//             }
//      public static void main(String[] args) {
//
//     String  st = "123";
//     char[] arr = st.toCharArray();
//     possible_permutations(arr,0);
//
//    }
//}






//      // Qu - 3.   Given a collection of numbers , nums, that might contain duplicates,return all possible unique permutations in any order
//
//
//                 import java.util.ArrayList;
//                 import java.util.List;
//
//    public class BackTracking{
//
//    public static void uniquePermutation(int[] arr,boolean[] used, List<List<Integer>> ans, List<Integer> temp){
//        if (temp.size()==arr.length){
//            ans.add(new ArrayList<>(temp));
//            return;
//        }
//        for (int i=0;i<arr.length;i++){
//
//            if (used[i]){              // used[i]==true or used[i]
//                continue;
//            }
//            if (i>0 && arr[i-1]==arr[i] && !used[i-1]){            // used[i] == false  or !used[i]
//                continue;
//            }
//             temp.add(arr[i]);
//            used[i]=true;
//            uniquePermutation(arr,used,ans,temp);
//            used[i]=false;
//            temp.remove(temp.size()-1);
//
//        }
//    }
//      public static void main(String[] args) {
//
//        int[] ar = {1,1,2};
//        boolean[] visited= new boolean[ar.length];
//
//        List<List<Integer>> ans = new ArrayList<List<Integer>>();
//        List<Integer> temp = new ArrayList<Integer>();
//        uniquePermutation(ar,visited,ans,temp);
//
//          System.out.println(ans);
//
//      }
//}






//                 //  Subset Multiply of  Combination Multiply
//      // Qu-4    Check if the product of some subset of an array is equal to the target ex [2,3,2,4,5] target = 30 = 2*3*5
//
//
//                 import java.util.ArrayList;
//                 import java.util.List;
//
//                 public class BackTracking{
//
//    public static void combinationMul(int[] arr, int mul, int idx, int target, List<List<Integer>> ans,List<Integer> temp) {
//
//        if (mul>target){
//            return;
//        }
//        if (mul==target){
//            System.out.println("yes");
//            ans.add(new ArrayList<>(temp));
//        return ;
//        }
//        for (int i=idx;i<arr.length;i++){
//               mul*=arr[i];
//               temp.add(arr[i]);
//           combinationMul(arr,mul,idx+1, target,ans,temp);
//            mul/=arr[i];
//            temp.remove(temp.size()-1);
//
//
//        }
//
//    }
//       public static void main(String[] args) {
//           int[] arr = {2,3,5,4};
//
//           List<List<Integer>> ans = new ArrayList<>();
//           List<Integer> temp = new ArrayList<>();
//           combinationMul(arr,1,0,40,ans,temp);
//
//           System.out.println(ans);
//       }
//}









//     // Qu-5  the nQueen problem count the total way to place every queen or solve the puzzle
//
//
//    public class BackTracking{
//
//    public static boolean isSafe(char[][] arr,int row,int column){
//        int duplicateRow=row;
//        int duplicateColumn = column;
//
//        while (row>=0 && column>=0){
//            if (arr[row][column]=='Q'){
//                return false;
//            }
//            row--;
//            column--;
//        }
//        row=duplicateRow;
//        column=duplicateColumn;
//        while (column>=0){
//            if (arr[row][column]=='Q'){
//                return false;
//            }
//            column--;
//        }
//        row=duplicateRow;
//        column=duplicateColumn;
//        while (row<arr.length && column>=0){
//            if (arr[row][column]=='Q'){
//                return false;
//            }
//            row++;
//            column--;
//        }
//
//        return true;
//    }
//
//    public static void nQueen(char[][]arr,int column,int count) {
//        if (column == arr.length) {
//            count++;
//            return;
//            // return true;
//
//        }
//
//
//        for (int i = 0; i < arr.length; i++) {
//            if (isSafe(arr, i, column)) {
//                arr[i][column] = 'Q';
////              if (nQueen(arr,column+1)==true){
////                   return true;
////               }
//                 nQueen(arr, column,count);
//                arr[i][column] = '-';
//            }
//        }
//        // return false;
//
//    }
//
//    public static int count (char[][]arr,int column ,int count){
//        nQueen(arr,column,count);
//        return count;
//    }
//        public static void main(String[] args) {
//
//        char[][] arr= {{0,0,0,0},
//                       {0,0,0,0},
//                       {0,0,0,0},
//                       {0,0,0,0}};
//
//            System.out.println( count(arr,0,0));
//
//        }
//}






