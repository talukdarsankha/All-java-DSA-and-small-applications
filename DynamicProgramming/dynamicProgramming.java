package DynamicProgramming;




                           //----------   Dynamic programming ------
        //---------- two technique memorization(recursive) and tabulation(iterative) ---------------




        //**********  Fibonacci series  by Dynamic Programming ---------->>>
                    // -------- top to bottom iterative way -----------
        // Time Complexity for iterative way :O(n)
        // Time Complexity for recursive way :O(n)  and Space Complexity :O(n+1)+stack space O(n)
//public class dynamicProgrammimg {
//    public static int fibonacciIterative(int idx){    // -------- top to bottom iterative way -----------
//         int a =0;
//         int b =1;
//         int c=0;
//         if(idx==0 || idx==1) return idx;
//         for (int i=2;i<=idx;i++){
//             c=a+b;
//             a=b;
//             b=c;
//         }
//         return c;
//    }
//
//
//    public static int fibonacciRecursiveHelper(int idx,int[] store){
//        if (idx==0||idx==1) return idx;
//        if (store[idx]!=-1){
//            return store[idx];
//        }
//        int x=fibonacciRecursiveHelper(idx-1,store);
//        int y = fibonacciRecursiveHelper(idx-2,store);
//        store[idx]=x+y;
//        return x+y;
//
//    }
//    public static int fibonacciRecursive(int idx){    // bottom to up
//        int[]store = new int[idx+1];
//        for (int i=0;i<=idx;i++){
//            store[i]=-1;
//        }
//        return  fibonacciRecursiveHelper(idx,store);
//    }
//      public static void main(String[] args) {
//          System.out.println(fibonacciIterative(5));
//          System.out.println(fibonacciIterative(0));
//
//          System.out.println(fibonacciRecursive(4));
//          System.out.println(fibonacciRecursive(1));
//     }
//}

             // Stair Case Problem -------->>> Time Complexity :O(n)  Space constant because we use tabulation way
        // it is similar to fibonacci series
//public class dynamicProgramming {
//    public static int  stairCase(int n){          // fibonacci =0,1,1,2,3,5   stair case = 0,1,2,3,5
//        if(n==0||n==1) return n;
//        int a=1,b=1, c=0;
//        for(int i=2;i<=n;i++){
//            c=a+b;
//            a=b;
//            b=c;
//        }
//        return c;
//    }
//    public static void main(String[] args) {
//        System.out.println(stairCase(0));
//        System.out.println(stairCase(4));
//    }
//}


//  Frog jump --------->>>frog can jump i+1 stone or i+2 stone to reach last stone find the min energy to reach last
           // Normal recursion code   not using dp   ------------>>>>>> Time Complexity O(2^n) exponential
//public class dynamicProgramming {
//    public static int frogJump(int[] stone,int idx,int n){
//        if (idx==n-1) return 0;               // because last stone can't go anywhere
//        int step1 = frogJump(stone,idx+1,n)+Math.abs(stone[idx]-stone[idx+1]);
//        if(idx==n-2) return step1;
//        int step2 = frogJump(stone,idx+2,n)+Math.abs(stone[idx]-stone[idx+2]);
//        return Math.min(step1,step2);
//    }
//    public static void main(String[] args) {
//        int[] stones = {10,30,20,40};
//
//        System.out.println(frogJump(stones,0,stones.length));
//    }
//}


            //  Frog jump --------->>>frog can jump i+1 stone or i+2 stone to reach last stone find the min energy to reach last
//    // memorizable(recursive way)  // Time Complexity :O(n)  And Space complexity :O(n)for recursion stack space + extra arr space O(n)
//public class dynamicProgramming {
//    public static int frogJump(int[] stone,int idx,int n ,int[] store){
//        if (idx==n-1) return 0;               // because last stone can't go anywhere
//        if (store[idx]!=-1){
//            return store[idx];
//        }
//        int step1 = frogJump(stone,idx+1,n,store)+Math.abs(stone[idx]-stone[idx+1]);
//        store[idx]=step1;
//        if(idx==n-2) return step1;
//        int step2 = frogJump(stone,idx+2,n,store)+Math.abs(stone[idx]-stone[idx+2]);
//        store[idx]=Math.min(step1,step2);
//        return Math.min(step1,step2);
//    }
//      public static void main(String[] args) {
//         int[] stones = {10,30,20,40};
//         int[]store = new int[stones.length];
//         for (int i=0;i<store.length;i++){
//             store[i]=-1;
//         }
//          System.out.println(frogJump(stones,0,stones.length,store));
//      }
//}

//  Frog jump --------->>>frog can jump i+1 stone or i+2 stone to reach last stone find the min energy to reach last ( here we assume  frog reach last to fast)
    // Tabulation (Iterative Way) __________>>>>>  Time Complexity :O(n)
//public class dynamicProgramming {
//    public static int frogJump(int[] stone ){
//        int a =0,b=0, c=0;
//        for(int i=1;i<stone.length;i++){
//            int previous = b+Math.abs(stone[i]-stone[i-1]);
//            int previousOfPrevious = Integer.MAX_VALUE;
//            if(i>1){
//                previousOfPrevious = a+Math.abs(stone[i]-stone[i-2]);
//            }
//            c=Math.min(previous,previousOfPrevious);
//            a=b;
//            b=c;
//        }
//        return c;
//    }
//      public static void main(String[] args) {
//         int[] stone = {10,30,40,20};
//          System.out.println(frogJump(stone));
//
//
//      }
//}


//  Maximum Sum of Non Adjacent elements   GFG(Stickler Thief Problem) ------>>>

// Memorizable way(Recursive) // Time Complexity :O(n) And Space Complexity :O(n)+O(n)
// class Solution{

//   public int maximumNonAdjacentSum(int[] arr,int idx,int[] store){
//         if(idx==arr.length-1) return arr[idx];
//         if(idx>arr.length-1) return 0;
//         if(store[idx]!=-1){
//             return store[idx];
//         }
//       int a = arr[idx]+maximumNonAdjacentSum(arr,idx+2,store); // that means pick or not pick similar like sbusequences
//       int b = 0+maximumNonAdjacentSum(arr,idx+1,store);
//       store[idx]=Math.max(a,b);
//       return Math.max(a,b);
//   }
//     public int FindMaxSum(int arr[], int n){
//         int[] store = new int[n];
//         for(int i=0;i<store.length;i++){
//             store[i]=-1;
//         }

//         return maximumNonAdjacentSum(arr,0,store);
//     }
// }

       // Tabulation(Iterative Way)
// Time Complexity :O(n)  And space Complexity :O(1)

//class Solution{
//    public int FindMaxSum(int arr[], int n){
//        if (n==1) return arr[0];  // means arr have one element then max is this one element
//        int a = 0;
//        int b = arr[n-1];
//        int c = 0;
//        for(int i = n-2;i>=0;i--){
//            int pick = arr[i]+a;
//            int notPick = 0+b;
//            c = Math.max(pick,notPick);
//            a=b;
//            b=c;
//        }
//        return c;
//    }
//}

          // House robber -1  ( along a street house )   ------- leetcode     // Time Complexity :O(n)  And space Complexity :O(1)
//          class Solution {
//              public int rob(int[] nums) {
//                  if (nums.length==1) return nums[0];  // means arr have one element then max is this one element
//                  int a = 0;
//                  int b = nums[nums.length-1];
//                  int c = 0;
//                  for(int i = nums.length-2;i>=0;i--){
//                      int pick = nums[i]+a;
//                      int notPick = 0+b;
//                      c = Math.max(pick,notPick);
//                      a=b;
//                      b=c;
//                  }
//                  return c;
//              }
//          }

            // House Robber -ii (circle street first and last adjacent)  -------- leetcode 
  // Time Complexity :O(n) space O(n+n)
//class Solution {
//
//    public int  maxNonAdjacentSum(int[] arr){
//        int a=0 , b=arr[arr.length-1],c=0;
//        for(int i=arr.length-2;i>=0;i--){
//            int pick = arr[i]+a;
//            int notPick = 0+b;
//            c = Math.max(pick,notPick);
//            a=b;
//            b=c;
//        }
//        return c;
//    }
//    public int rob(int[] nums) {
//        if(nums.length==1) return nums[0];  // if arr have singel element then simply return this element
//
//        int[] firstArr = new int[nums.length];
//        int[] secondArr = new int[nums.length];
//        for(int i=0;i<nums.length;i++){
//            if(i!=0){          // because first and last adjacent so we exclude one of them
//                firstArr[i]=nums[i];
//            }
//            if(i!=nums.length-1){ // because first and last adjacent so we exclude one of them
//                secondArr[i]=nums[i];
//            }
//        }
//
//        return Math.max(  maxNonAdjacentSum(firstArr), maxNonAdjacentSum(secondArr));
//
//
//    }
//}


          // Grid unique Paths ------- Leetcode

//   //Memorizable(recursive)-------->>>
//       // Time Complexity :O(m*n)   And
//       // Space Complexity :O(m*n)+recursion stack space O(grid max path) which is O((m-1)+(n-1))
// class Solution {
//     public int helper(int m,int n,int i,int j,int[][]store){
//         if(i==m-1&& j ==n-1){   // means we reach my destination so we count 1 path done
//             return 1;
//         }
//         if(i>m-1 || j>n-1) return 0;      // means we go out of bound no path
//         if(store[i][j]!=-1) return store[i][j];
//         int down=helper(m,n,i+1,j,store);
//         int right =helper(m,n,i,j+1,store);
//         return store[i][j]=down+right;
//     }
//     public int uniquePaths(int m, int n) {
//         int[][] store = new int[m][n];
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                store[i][j]=-1;
//             }
//         }
//         return helper(m,n,0,0,store);
//     }
// }
         // Tabulation Way (iterative)
// Time Complexity :O(m*n)
// space complexity :O(m*n)
//   class Solution {
//        public int uniquePaths(int m, int n) {
//            int[][] store = new int[m][n];

//            for(int i=m-1;i>=0;i--){
//                for(int j=n-1;j>=0;j--){
//                     int down=0, right=0;
//                    if(i==m-1 && j==n-1){
//                        store[i][j]=1;
//                    }else{
//                        if(i<m-1) down = store[i+1][j];
//                       if(j<n-1) right = store[i][j+1];
//                       store[i][j]=down+right;
//                    }
//                }
//            }
//            return store[0][0];
//        }
//   }
            // // Tabulation Way (iterative) More optimize Space Complexity
// Time Complexity :O(m*n)
// space complexity :O(n) it is for 1d array Space
//class Solution {
//    public int uniquePaths(int m, int n) {
//        int[] dp = new int[n];
//
//        for(int i=m-1;i>=0;i--){
//            int[] temp = new int[n];
//            for(int j =n-1;j>=0;j--){
//                if(j==n-1){
//                    temp[j]=1;
//                }
//                else{
//                    temp[j]=dp[j]+temp[j+1];
//                }
//            }
//            dp = temp;
//        }
//        return dp[0];
//    }
//}


            //  Minimum path Sum In a Grid -------->>> Leetcode --->>

                //     Memorizable----->>
//        // Time Complexity :O(m*n)   And
//       // Space Complexity :O(m*n)+recursion stack space O(grid max path) which is O((m-1)+(n-1))
// class Solution {
//    public int helper(int m,int n,int i,int j,int[][]grid,int[][] store){
//        if(i==m-1 && j==n-1) return grid[i][j];
//        if(i>m-1 || j>n-1) return Integer.MAX_VALUE;

//        if(store[i][j]!=-1) return store[i][j];
//        int down = helper(m,n,i+1,j,grid,store);
//        int right = helper(m,n,i,j+1,grid,store);
//        return  store[i][j] = grid[i][j]+Math.min(down,right);
//    }
//     public int minPathSum(int[][] grid) {
//         int m = grid.length , n = grid[0].length;
//         int[][] store = new int[m][n];
//         for(int i =0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 store[i][j]=-1;
//             }
//         }

//         return helper(m,n,0,0,grid,store);
//     }
// }

            // Tabulation -------->>>>
// Time Complexity :O(m*n)   And
// Space Complexity :O(m*n)
//  class Solution {
//        public int minPathSum(int[][] grid) {
//            int m = grid.length , n =grid[0].length;
//            int[][] store = new int[m][n];
//            for(int i=m-1;i>=0;i--){
//                for(int j=n-1;j>=0;j--){
//                    int down =Integer.MAX_VALUE, right=Integer.MAX_VALUE;
//                    if(i==m-1&&j==n-1) {
//                        store[i][j]=grid[i][j];
//                    }else{
//                       if(i<m-1) down= store[i+1][j];
//                       if(j<n-1) right= store[i][j+1];
//                       store[i][j]=grid[i][j]+Math.min(down,right);
//                    }
//                }
//            }

//            return store[0][0];
//        }
// }

         // Tabulation More Space Optimal ------>>
// Time Complexity :O(m*n)   And
// Space Complexity :O(n)
//class Solution {
//    public int minPathSum(int[][] grid) {
//        int m = grid.length , n =grid[0].length;
//        int[] dp = new int[n];
//        for(int i=0;i<dp.length;i++){
//            dp[i]=Integer.MAX_VALUE;
//        }
//
//
//        for(int i=m-1;i>=0;i--){
//            int[] temp = new int[n];
//            for(int j=n-1;j>=0;j--){
//                int down = Integer.MAX_VALUE , right=Integer.MAX_VALUE;
//                if(i==m-1 && j==n-1){
//                    temp[j]= grid[i][j];
//                }
//                else if(i!=m-1 && j==n-1){
//                    temp[j]= grid[i][j]+dp[j];
//                }
//                else{
//                    temp[j]= grid[i][j]+Math.min( dp[j],temp[j+1]);
//                }
//            }
//            dp=temp;
//        }
//
//        return dp[0];
//    }
//}



      // Minimum falling path sum --------- Leetcode ---------->>>>

           // memoization --------->>
// Time Complexity :O(m*n);
// Space complexity O(m*n)+   recursive stack space O(n)
// class Solution {
//     public int helper(int i,int j,int m,int n,int[][]matrix, int [][] store){
//         if(j<0 || j>n-1){
//             return Integer.MAX_VALUE;
//         }
//         if(i==m-1){
//             return matrix[i][j];
//         }

//         if(store[i][j] !=Integer.MIN_VALUE) return store[i][j];
//         int bellow = helper(i+1,j, m,n,matrix , store);
//          int leftDiagonal = helper(i+1,j-1, m,n,matrix, store);
//           int rightDiagonal= helper(i+1,j+1, m,n,matrix, store);

//           return  store[i][j] =  matrix[i][j]+ Math.min(bellow, Math.min(leftDiagonal,rightDiagonal));
//     }
//     public int minFallingPathSum(int[][] matrix) {
//         int m = matrix.length, n = matrix[0].length;
//         int [][] store = new int[m][n];
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 store[i][j]=Integer.MIN_VALUE; //Or store[i][j]=Integer.MAx_VALUE;  But here not accepted -1  beacsue any path minimum cost can be -1
//             }
//         }

//         int ans = Integer.MAX_VALUE;
//         for(int j =0;j<n;j++){     //  every time we start first row's every column
//            ans = Math.min(ans , helper(0,j,m,n,matrix,store));
//         }

//         return ans;
//     }
// }
        // Tabulation -------->>>>
// Time Complexity :O(m*n);
// Space complexity O(m*n)
// class Solution {
//      public int minFallingPathSum(int[][] matrix) {
//          int m = matrix.length, n = matrix[0].length;
//          int[][] store = new int[m][n];
//          for(int i=m-1;i>=0;i--){
//              for(int j=n-1;j>=0;j--){
//                  if(i==m-1) {
//                      store[i][j]=matrix[i][j];
//                  }else{
//                    if(j==n-1) store[i][j] = matrix[i][j]+ Math.min(store[i+1][j-1] , store[i+1][j]);
//                    else if(j==0) store[i][j] = matrix[i][j]+ Math.min( store[i+1][j] ,store[i+1][j+1]);
//                    else store[i][j] = matrix[i][j]+ Math.min(store[i+1][j-1],Math.min (store[i+1][j],store[i+1][j+1]));
//                  }
//              }
//          }

//   int ans  = Integer.MAX_VALUE;
//      for(int i=0;i<n;i++){
//          ans = Math.min(ans,store[0][i]);
//      }
//      return ans;
//      }
// }
        // Tabulation More Space Optimal -------->>
// Time Complexity :O(m*n);
// Space complexity O(n)
//class Solution {
//    public int minFallingPathSum(int[][] matrix) {
//        int m = matrix.length, n = matrix[0].length;
//        int[] dp = new int[n];
//        for(int i=m-1;i>=0;i--){
//            int[] temp = new int[n];
//            for(int j=n-1;j>=0;j--){
//                if(i==m-1){
//                    temp[j]=matrix[i][j];
//                }else{
//                    if(j==n-1) temp[j]= matrix[i][j]+Math.min(dp[j],dp[j-1]);
//                    else if(j==0) temp[j]= matrix[i][j]+Math.min(dp[j],dp[j+1]);
//                    else temp[j] = matrix[i][j]+Math.min( dp[j-1],Math.min(dp[j],dp[j+1]));
//                }
//            }
//            dp = temp;
//        }
//
//        int ans  = Integer.MAX_VALUE;
//        for(int i=0;i<n;i++){
//            ans = Math.min(ans,dp[i]);
//        }
//        return ans;
//    }
//}


                          // Subset sum equal to k ------- Solved in GFG AND Coding ninja
         // Memoization -------->>
// Time Complexity :O(N*target);
// Space Complexity :O(N*target)+ recursive stack space at max O(N);
// class Solution{

//     public static boolean helper(int[]arr,int idx,int k,int[][]store){
//           if(k==0) return true;
//         if(idx==arr.length-1){
//             if(arr[arr.length-1]==k) return true;
//             else return false;
//         }

//       if(store[idx][k]!=-1){
//           if( store[idx][k]== 1){
//               return true;
//           }
//           else return false;
//       }


//         boolean take = false;
//         if(arr[idx]<=k){
//           take =helper(arr,idx+1,k-arr[idx],store);
//         }
//          boolean nonTake = helper(arr,idx+1,k,store);
//          if(take || nonTake){
//              store[idx][k]= 1;
//          }else  store[idx][k]= 0;
//          return (take || nonTake);
//     }
//     static Boolean isSubsetSum(int N, int arr[], int sum){
//         int [][] store = new int[N][sum+1];
//         for(int i =0;i<N;i++){
//             for(int j =0;j<sum+1;j++){
//                 store[i][j]=-1;
//             }
//         }
//         return helper(arr,0,sum,store);

//     }
// }

            // Tabulation ----------->>>
// Time Complexity :O(N*target);
// Space Complexity :O(N*target)
// class Solution{
//      static Boolean isSubsetSum(int N, int arr[], int sum){
//          boolean[][] store = new boolean[N][sum+1];    // byDefault false every element
//         //  for(int i=0;i<N;i++){
//         //      for(int j=0;j<=sum;j++){
//         //          store[i][j]=false;
//         //      }
//         //  }

//          for(int i=0;i<N;i++){
//                  store[i][0]= true;
//          }
//         if(arr[N-1]<sum) store[N-1][arr[N-1]]=true;

//          for(int i=N-2;i>=0;i--){
//              for(int j = 1;j<=sum;j++){
//                  boolean take = false;
//                  if(arr[i]<=j) take = store[i+1][j-arr[i]];
//                  boolean nontake = store[i+1][j];
//                  store[i][j] = (take || nontake);
//              }
//          }

//          return store[0][sum];
//      }
// }

          // Tabulation More Space optimal --------->>>
// Time Complexity :O(N*target);  // OR (N*sum)
// Space Complexity :O(target)  OR O(sum)
//class Solution{
//    static Boolean isSubsetSum(int N, int arr[], int sum){
//
//        boolean [] dp = new boolean[sum+1];
//
//        for(int i=N-1;i>=0;i--){
//            boolean [] temp = new boolean[sum+1];
//            for(int j =0;j<=sum;j++){
//                if(i==N-1 && arr[N-1]<sum) temp[arr[N-1]]=true;
//                if(j==0) temp[j]=true;
//                if(i<N-1 && j>0){
//                    boolean take = false;
//                    if(arr[i]<=j) take = dp[j-arr[i]];
//                    boolean nontake = dp[j];
//                    temp[j] = (take || nontake);
//                }
//            }
//            dp = temp;
//        }
//
//        return dp[sum];
//    }
//}



    // 0-1 knapsack Problem solved in GFG ------>>>>>>>
             //  memoization --------->>
// Time Complexity : O(N*W)
// Space Complexity :  O(N*W)+ recursion stack O(N);
//class Solution {
//     public static int helper(int idx,int weight,int wt[],int val[],int n,int[][]store){
//         if(idx==n-1){
//             if(wt[n-1]<=weight) return val[n-1];
//             else return 0;
//         }

//         if(store[idx][weight]!=-1) return store[idx][weight];
//         int take = Integer.MIN_VALUE;
//         if(wt[idx]<=weight) take = val[idx]+helper(idx+1,weight-wt[idx],wt,val,n,store);
//         int nontake = helper(idx+1,weight,wt,val,n,store);
//         return store[idx][weight]=Math.max(take,nontake);

//     }
//     static int knapSack(int W, int wt[], int val[], int n) {
//         int[][] store =new  int [n][W+1];
//         for(int i =0;i<n;i++){
//             for(int j=0;j<=W;j++){
//                 store[i][j]=-1;
//             }
//         }
//             return helper(0,W,wt,val,n,store);
//     }
// }
          // Tabulation  ------->>>
// Time Complexity : O(N*W)
// Space Complexity :  O(N*W)
// class Solution {
//      static int knapSack(int W, int wt[], int val[], int n) {
//          int[][] store = new int [n][W+1];
//          for(int i=wt[n-1];i<=W;i++){
//              store[n-1][i]=val[n-1];
//          }

//          for(int i = n-2;i>=0;i--){
//              for(int j =0;j<=W;j++){
//                  int take = Integer.MIN_VALUE;
//                  if(wt[i]<=j) take = val[i]+store[i+1][j-wt[i]];
//                  int nontake = store[i+1][j];
//                  store[i][j] = Math.max(take,nontake);
//              }
//          }

//          return store[0][W];
//      }
// }

            // Tabulation -------->> optimal
// Time Complexity : O(N*W)
// Space Complexity :  O(W)
//   class Solution{
//         static int knapSack(int W, int wt[], int val[], int n) {
//             int[] dp = new int[W+1];
//             for(int i=n-1;i>=0;i--){
//                   int[] temp = new int[W+1];
//                 for(int j=0;j<=W;j++){
//                     int take = Integer.MIN_VALUE;
//                     if(wt[i]<=j) take = val[i]+dp[j-wt[i]];
//                     int nontake = dp[j];
//                     temp[j]=Math.max(take,nontake);
//                 }
//                 dp = temp;
//             }

//             return dp[W];
//         }
//   }


              // Tabulation using one  array More optimal
// Time Complexity : O(N*W)
// Space Complexity :  O(W)
//class Solution{
//    static int knapSack(int W, int wt[], int val[], int n) {
//        int[] dp = new int[W+1];
//        for(int i=n-1;i>=0;i--){
//
//            for(int j=W;j>=0;j--){
//                int take = Integer.MIN_VALUE;
//                if(wt[i]<=j) take = val[i]+dp[j-wt[i]];
//                int nontake = dp[j];
//                dp[j]=Math.max(take,nontake);
//            }
//
//        }
//
//        return dp[W];
//    }
//}



         //   Coin Change -ii  Solved in leetcode

     // here question slide diffrent we can take one coin multiple time in a combination
   // Memoization -------->>>
// class Solution {
//     public int helper(int idx,int amount,int[] coins ,int[][] store){
//         if(amount ==0) return 1;
//         if(idx==coins.length-1) {
//             if( (amount % coins[coins.length-1]) ==0) return 1;
//             else return 0;
//         }

//         if(store[idx][amount]!=-1) return store[idx][amount];
//         int take = 0;
//         if(coins[idx]<=amount) take = helper(idx,amount-coins[idx],coins,store); // here we take one coin multiple
//         int nontake = helper(idx+1,amount,coins,store);
//        return store[idx][amount]=take+nontake;
//     }
//     public int change(int amount, int[] coins) {
//        int [][]store = new int[coins.length][amount+1];
//        for(int i=0;i<coins.length;i++){
//            for(int j =0;j<=amount;j++){
//                store[i][j]=-1;
//            }
//        }
//         return helper(0,amount,coins,store);
//     }
// }


// Tabulation ------------>>>

//  class Solution {
//     public int change(int amount, int[] coins) {
//         int n =   coins.length;
//          int [][]store = new int[n][amount+1];
//          for(int i=n-1;i>=0;i--){
//            for(int j=0;j<=amount;j++){
//             if(i==n-1) {
//                if( (j%coins[n-1])==0) store[n-1][j]=1;
//             }
//             else if(j==0){
//                   store[i][j]=1;
//             }
//             else{
//                 int take =0;
//                 if(coins[i]<=j) take = store[i][j-coins[i]];   // here we take one coin multiple
//                 int nontake = store[i+1][j];
//                 store [i][j] = take+nontake;
//             }
//          }
//        }

//         return store[0][amount];
//     }
//  }

         // Tabulation --------->>>>
//class Solution {
//    public int change(int amount, int[] coins) {
//        int n =   coins.length;
//        int []dp = new int[amount+1];
//
//        for(int i=n-1;i>=0;i--){
//            int [] temp = new int[amount+1];
//            for(int j=0;j<=amount;j++){
//                if(j==0)temp[j]=1;
//                if(i==n-1  && j% coins[n-1]==0) temp[j]=1;
//                else {
//                    int take=0;
//                    if( coins[i]<=j) take = temp[j-coins[i]];  // here we take one coin multiple
//                    int nontake = dp[j];
//                    temp[j]=take+nontake;
//                }
//
//            }
//            dp=temp;
//        }
//
//        return dp[amount];
//    }
//}

             // cut Rod Problem ---------- Solved in leetcode;

     // Time complexity :O(n^2);
// space complexity : O(n*n)+ recursive space O(target);
// class Solution{
//     public int helper(int idx,int[] price,int n,int[][] store){
//         if(idx==0) return n*price[0];

//         int length=idx+1;

//         if(store[idx][n]!=-1) return store[idx][n];
//         int take = Integer.MIN_VALUE;
//         if(length<=n) take = price[idx]+helper(idx,price,n-length,store);
//         int nontake = helper(idx-1,price,n,store);
//          return store[idx][n] = Math.max(take,nontake);
//     }
//     public int cutRod(int price[], int n) {
//       int[][] store = new int[n][n+1];
//       for(int i=0;i<n;i++){
//           for(int j=0;j<=n;j++){
//               store[i][j]=-1;
//           }
//       }

//       return helper(price.length-1,price,n,store);
//     }
// }
      // Tabulation ---------->>>
// Time complexity :O(n^2);
// space complexity : O(n*n)
// class Solution{
//     public int cutRod(int price[], int n) {
//           int[][] store = new int[n][n+1];
//           for(int i=0;i<n;i++){
//               for(int j=0;j<=n;j++){
//                   if(i==0) store[0][j]=j*price[0];
//                   else{
//                       int take = Integer.MIN_VALUE;
//                       int length = i+1;
//                       if(length<=j) take= price[i]+store[i][j-length];
//                       int nontake = store[i-1][j];
//                       store[i][j]= Math.max(take,nontake);
//                   }
//               }
//           }

//           return store[n-1][n];
//     }
// }
      // Tabulation ---------->>>
// Time complexity :O(n^2);
// space complexity : O(n)
//class Solution{
//    public int cutRod(int price[], int n) {
//        int[] dp = new int[n+1];
//        for(int i=0;i<n;i++){
//            int[] temp = new int[n+1];
//            for(int j=0;j<=n;j++){
//                int length=i+1;
//                if(i==0) temp[j]= j*price[0] ;
//                else{
//                    int take = Integer.MIN_VALUE;
//                    if(length<=j) take=price[i]+temp[j-length];
//                    int nontake = dp[j];
//                    temp[j] =Math.max(take,nontake);
//                }
//            }
//            dp = temp;
//        }
//
//        return dp[n];
//    }
//}




               // Longest common subsequence --------- >>> leetcode 

  //     // Memoization ------->>>>>
// class Solution {

//     public int helper(int idx1,int idx2 , String text1,String text2, int[][] store){
//         if(idx1<0 || idx2<0) return 0;
//         if(store[idx1][idx2]!=-1) return store[idx1][idx2];
//          if(text1.charAt(idx1)==text2.charAt(idx2)){
//             return store[idx1][idx2]= 1+helper(idx1-1,idx2-1,text1,text2,store);
//          }
//      return store[idx1][idx2]= 0+ Math.max(helper(idx1-1,idx2,text1,text2,store) , helper(idx1,idx2-1,text1,text2,store));
//     }
//     public int longestCommonSubsequence(String text1, String text2) {
//         int n = text1.length(), m = text2.length();
//         int[][] store = new int[n][m];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 store[i][j]=-1;
//             }
//         }

//        return  helper(n-1,m-1,text1,text2,store);
//     }
// }

       //          // Memoization ------->>>>> Using 1 based indexing ---------->>>>
// class Solution {

//     public int helper(int idx1,int idx2 , String text1,String text2, int[][] store){
//         if(idx1==0 || idx2==0) return 0;
//         if(store[idx1][idx2]!=-1) return store[idx1][idx2];
//          if(text1.charAt(idx1-1)==text2.charAt(idx2-1)){
//             return store[idx1][idx2]= 1+helper(idx1-1,idx2-1,text1,text2,store);
//          }
//      return store[idx1][idx2]= 0+ Math.max(helper(idx1-1,idx2,text1,text2,store) , helper(idx1,idx2-1,text1,text2,store));
//     }
//     public int longestCommonSubsequence(String text1, String text2) {
//         int n = text1.length(), m = text2.length();
//         int[][] store = new int[n+1][m+1];
//         for(int i=0;i<=n;i++){
//             for(int j=0;j<=m;j++){
//                 store[i][j]=-1;
//             }
//         }

//        return  helper(n,m,text1,text2,store);
//     }
// }

//       // Tabulation --------->>>>>

//  class Solution {
//      public int longestCommonSubsequence(String text1, String text2) {
//           int n = text1.length(), m = text2.length();
//           int[][] store = new int[n+1][m+1];
//            for(int i=1;i<=n;i++){
//                for(int j=1;j<=m;j++){

//                        if(text1.charAt(i-1)==text2.charAt(j-1)){
//                            store[i][j]=1+store[i-1][j-1];
//                        }
//                        else{
//                            store[i][j]= Math.max(store[i-1][j] ,store[i][j-1]);
//                        }

//                }
//            }

//            return store[n][m];

//      }
//  }

// Tabulation ----------->>>>>

//class Solution {
//    public int longestCommonSubsequence(String text1, String text2) {
//        int n = text1.length(), m = text2.length();
//        int[] dp = new int[m+1];
//
//        for(int i=1;i<=n;i++){
//            int[] temp = new int[m+1];
//            for(int j=1;j<=m;j++){
//                if(text1.charAt(i-1)==text2.charAt(j-1)) temp[j] = 1+dp[j-1];
//                else temp[j]= Math.max(dp[j],temp[j-1]);
//            }
//            dp = temp;
//        }
//        return dp[m];
//
//    }
//}


         // Sortest common supersequence ------------>>>>>> leetcode
//class Solution {
//
//    public String shortestCommonSupersequence(String str1, String str2) {
//        int n = str1.length() , m = str2.length();
//
//        int[][] store = new int[n+1][m+1];
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=m;j++){
//                if(str1.charAt(i-1)==str2.charAt(j-1)) store[i][j]=1+store[i-1][j-1];
//                else store[i][j]= Math.max(store[i-1][j],store[i][j-1]);
//            }
//        }
//
//        String ans ="";
//        int i=n , j =m;
//        while(i>0 && j>0){
//            if(str1.charAt(i-1)==str2.charAt(j-1)) {
//                ans+=str1.charAt(i-1);  // Or  ans+st2.charAt(i-1);
//                i--;
//                j--;
//            }
//            else if(store[i-1][j] > store[i][j-1]){
//                ans+=str1.charAt(i-1);
//                i--;
//            }else{                  // else means (store[i-1][j] <= store[i][j-1])
//                ans+=str2.charAt(j-1);
//                j--;
//            }
//        }
//
//        while(i>0) {
//            ans+=str1.charAt(i-1);
//            i--;
//        }
//        while(j>0){
//            ans+=str2.charAt(j-1);
//            j--;
//        }
//
//        char[] ar = ans.toCharArray();
//        String newAns= "";
//        for(int a=ar.length-1;a>=0;a--){
//            newAns+=ar[a];
//        }
//
//        return newAns;
//    }
//}

              // ----------- Distinct subsequences ------ leetcode----------------->>>>>>>>>>

      //      //  Memoization ------------>>>>>>>>>>>>>>
//    // Time complexity :O(n*m)
//    // Spce Complexity :O(n*m)+recursive stack space at max O(n+m);
// class Solution {
//     public int helper(int idx1,int idx2 ,String s1,String s2,int[][] store){
//         if(idx2<0) return 1;
//         if(idx1<0) return 0;

//         if(store[idx1][idx2]!=-1) return store[idx1][idx2];
//         if(s1.charAt(idx1)==s2.charAt(idx2)){
//             return store[idx1][idx2]= helper(idx1-1,idx2-1,s1,s2,store)+helper(idx1-1,idx2,s1,s2,store);
//         }
//         else{
//             return  store[idx1][idx2]=helper(idx1-1,idx2,s1,s2,store);
//         }
//     }
//     public int numDistinct(String s, String t) {
//          int n = s.length(), m = t.length();
//         int[][] store = new int[n][m];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 store[i][j]=-1;
//             }
//         }

//         return helper(n-1,m-1, s,t, store);
//     }
// }

//            // Memoization ----- (1 based index)
// Time complexity :O(n*m)
// Spce Complexity :O(n*m)+recursive stack space at max O(n+m);

//     class Solution {
//     public int helper(int idx1,int idx2 ,String s1,String s2,int[][] store){
//         if(idx2==0) return 1;
//         if(idx1==0) return 0;

//         if(store[idx1][idx2]!=-1) return store[idx1][idx2];
//         if(s1.charAt(idx1-1)==s2.charAt(idx2-1)){
//             return store[idx1][idx2]= helper(idx1-1,idx2-1,s1,s2,store)+helper(idx1-1,idx2,s1,s2,store);
//         }
//         else{
//             return  store[idx1][idx2]=helper(idx1-1,idx2,s1,s2,store);
//         }
//     }
//     public int numDistinct(String s, String t) {
//          int n = s.length(), m = t.length();
//         int[][] store = new int[n+1][m+1];
//         for(int i=0;i<=n;i++){
//             for(int j=0;j<=m;j++){
//                 store[i][j]=-1;
//             }
//         }

//         return helper(n,m, s,t, store);
//     }
// }

            // Tabulation ------->>>>>
// Time complexity :O(n*m)
//    // Spce Complexity :O(n*m)
//   class Solution {
//        public int numDistinct(String s, String t) {
//             int n = s.length(), m = t.length();
//             int[][] store = new int[n+1][m+1];
//             for(int i=0;i<=n;i++){
//                 for(int j=0;j<=m;j++){
//                     if(j==0) store[i][0] =1;
//                     else if(i==0 && j!=0) store[i][j]=0;   // it is necessary
//                     else{
//                         if(s.charAt(i-1)==t.charAt(j-1)) {   //because we made this 1 based indexing
//                            store[i][j] = store[i-1][j-1]+store[i-1][j];
//                         }
//                         else{
//                             store[i][j] = store[i-1][j];
//                         }
//                     }
//                 }
//             }

//             return store[n][m];

//        }
//   }


//            //  Tabulation ----->>>
//                   // Time complexity :O(n*m)
// //    // Spce Complexity :O(m)
//         class Solution {
//            public int numDistinct(String s, String t) {
//                   int n = s.length(), m = t.length();
//                int[] dp = new int[m+1];
//                 for(int i=0;i<=n;i++){
//                     int[] temp = new int[m+1];
//                     for(int j=0;j<=m;j++){
//                         if(j==0) temp[0]=1;
//                         else if(i==0 && j!=0) temp[j]=0;  // it is necessary
//                        else {
//                          if(s.charAt(i-1)==t.charAt(j-1)) {   //because we made this 1 based indexing
//                              temp[j] = dp[j-1]+dp[j];
//                          }
//                          else{
//                              temp[j] = dp[j];
//                          }
//                        }
//                     }
//                     dp = temp;
//                 }

//                 return dp[m];
//            }
//         }

       // Tabulation ------- Using one array ------>>

//class Solution {
//    public int numDistinct(String s, String t) {
//        int n = s.length(), m = t.length();
//
//        int[] dp = new int[m+1];
//        for(int i=0;i<=n;i++){
//            for(int j=m;j>=0;j--){    // this loop reverse order in this case
//                if(j==0) dp[j]=1;
//                else if(i==0 && j!=0)dp[j] = 0;
//                else{
//                    if(s.charAt(i-1)==t.charAt(j-1)) {
//                        dp[j] = dp[j-1]+dp[j];
//                    }else{
//                        dp[j] = dp[j];
//                    }
//                }
//            }
//        }
//
//        return dp[m];
//    }
//}




                      //  Edit Distance ----------- Leetcode
// //         // Memoization ------------>>>>>>
// class Solution {

//     public int helper(int idx1,int idx2,String s1, String s2 ,int[][] store){
//            if(idx2<0) return idx1+1;
//            if(idx1<0) return  idx2+1;

//         if(store[idx1][idx2]!=-1) return store[idx1][idx2];
//         if(s1.charAt(idx1)==s2.charAt(idx2)){
//            return  store[idx1][idx2] = helper(idx1-1,idx2-1,s1,s2 ,store);
//         }else{
//             int insert = 1+helper(idx1,idx2-1,s1,s2,store);  // 1 add for every operation count
//             int delete = 1+helper(idx1-1,idx2,s1,s2 ,store);
//             int replace = 1+helper(idx1-1,idx2-1,s1,s2, store);
//             return store[idx1][idx2]= Math.min(Math.min( insert,delete), replace);
//         }

//     }
//     public int minDistance(String word1, String word2) {
//         int n = word1.length() , m =word2.length();
//         int[][] store = new int[n][m];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 store[i][j]=-1;
//             }
//         }
//         return helper(n-1,m-1,word1,word2 ,store);
//     }
// }

// Memoization ------------>>>>>> (Using 1 based indexing)
//   class Solution {
//       public int helper(int idx1, int idx2,String s1,String s2, int[][] store){
//           if(idx2==0) return idx1;
//           if(idx1==0) return idx2;

//           if(store[idx1][idx2]!=-1) return store[idx1][idx2];
//           if(s1.charAt(idx1-1)==s2.charAt(idx2-1)){
//               return store[idx1][idx2]= helper(idx1-1,idx2-1,s1,s2,store);
//           }
//           else{
//               int insert = 1+helper(idx1,idx2-1,s1,s2,store);
//               int delete = 1+helper(idx1-1,idx2,s1,s2,store);
//               int replace = 1+helper(idx1-1,idx2-1,s1,s2,store);
//                return store[idx1][idx2]= Math.min(Math.min( insert,delete), replace);
//           }
//       }
//       public int minDistance(String word1, String word2) {
//            int n = word1.length() , m =word2.length();
//         int[][] store = new int[n+1][m+1];
//         for(int i=0;i<=n;i++){
//             for(int j=0;j<=m;j++){
//                 store[i][j]=-1;
//             }
//         }

//           return helper(n ,m,word1,word2 ,store);
//       }
//   }

// Tabulation ----------->>>>

// class Solution {
//         public int minDistance(String word1, String word2) {
//               int n = word1.length() , m =word2.length();
//         int[][] store = new int[n+1][m+1];
//         for(int i=0;i<=n;i++){
//             for(int j=0;j<=m;j++){
//                 if(i==0) store[0][j] = j;
//                else if(j==0) store[i][0]= i;
//                else{
//                    if(word1.charAt(i-1)==word2.charAt(j-1)){
//                        store[i][j] = store[i-1][j-1];
//                    }else{
//                        int insert = 1+store[i][j-1];
//                        int delete = 1+store[i-1][j];
//                        int replace = 1+store[i-1][j-1];
//                        store[i][j] = Math.min( Math.min(insert,delete),replace);
//                    }
//                }
//             }
//         }

//         return store[n][m];


//       }
// }

// Tabulation ------------>>>>>>

//class Solution {
//    public int minDistance(String word1, String word2) {
//        int n = word1.length() , m =word2.length();
//        int[]dp = new int[m+1];
//        for(int i=0;i<=n;i++){
//            int [] temp = new int[m+1];
//            for(int j=0;j<=m;j++){
//                if(j==0) temp[j]= i;
//                else if(i==0) temp[j] = j;
//                else{
//                    if(word1.charAt(i-1)==word2.charAt(j-1)){
//                        temp[j]=dp[j-1];
//                    }else{
//                        int insert = 1+temp[j-1];
//                        int delete = 1+dp[j];
//                        int replace = 1+dp[j-1];
//                        temp[j]= Math.min( Math.min(insert,delete),replace);
//                    }
//                }
//            }
//            dp = temp;
//        }
//
//        return dp[m];
//    }
//}



            // Wild Card Matching --------leetcode

// Memoization--------->>>>>>
// Time Complexity :O(n*m);
// Space Complexity :O(n*m)+O(n+m)
// class Solution {
//     public boolean helper(String pattern, String ss,int idx1,int idx2,int[][] store){
//          if(idx1<0 &&idx2<0) return true;       // base condition
//          if(idx1<0 && idx2>=0) return false;      // base condition
//          if(idx2<0 && idx1>=0){                // base condition
//             for(int i=0;i<=idx1;i++){
//                 if(pattern.charAt(i)!='*') return false;
//             }
//             return true;
//          }


//         if(store[idx1][idx2]!=-1) {
//             if(store[idx1][idx2] ==1) return true;
//             else return false;
//         }

//         if(pattern.charAt(idx1)==ss.charAt(idx2) || pattern.charAt(idx1)=='?'){  // match
//             boolean ans = helper(pattern,ss ,idx1-1,idx2-1 ,store);
//             if(ans==true){
//                 store[idx1][idx2]=1;
//             }else  store[idx1][idx2]=0;
//            return  ans;
//         }
//         else{   // not Match
//            if(pattern.charAt(idx1)=='*'){
//                boolean ans = helper(pattern,ss ,idx1-1,idx2 ,store) || helper(pattern,ss ,idx1,idx2-1 ,store);
//                if(ans==true){
//                    store[idx1][idx2]=1;
//                }
//                else store[idx1][idx2]=0;
//              return ans;
//            }
//            else return  false;
//         }
//     }
//     public boolean isMatch(String s, String p) {
//         int n =p.length() , m =s.length();
//         int[][] store = new int[n][m];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 store[i][j]=-1;
//             }
//         }

//         return helper(p,s,n-1,m-1,store);
//     }
// }

// Memoization 1 based indexing---------->>>>>>>
// Time Complexity :O(n*m);
// Space Complexity :O(n*m)+O(n+m)
// class Solution {
//     public boolean helper(String pattern ,String ss,int idx1,int idx2 , int[][] store){
//           if(idx1==0 && idx2==0) return true;
//           if(idx1==0 && idx2>=1) return false;
//           if(idx2==0 && idx1>=1){
//               for(int i=1;i<=idx1;i++){
//                   if(pattern.charAt(i-1)!='*') return false;
//                }
//                return true;
//           }

//           if(store[idx1][idx2]!=-1) {
//             if(store[idx1][idx2] ==1) return true;
//             else return false;
//         }

//         if(pattern.charAt(idx1-1)==ss.charAt(idx2-1) || pattern.charAt(idx1-1)=='?'){  // match
//              boolean ans = helper(pattern,ss,idx1-1,idx2-1,store);
//               if(ans==true) store[idx1][idx2] =1;
//             else store[idx1][idx2] =0;
//              return ans;
//         }
//         else{   // not Match
//            if(pattern.charAt(idx1-1)=='*'){
//              boolean ans = helper(pattern,ss,idx1-1,idx2,store) || helper(pattern,ss,idx1,idx2-1,store);
//              if(ans==true) store[idx1][idx2]=1;
//              else store[idx1][idx2]=0;
//              return ans;
//            }
//            else return false;   // when to string character are diffrent
//         }
//     }
//       public boolean isMatch(String s, String p) {
//            int n =p.length() , m =s.length();
//            int[][] store= new int[n+1][m+1];
//             for(int i=0;i<=n;i++){
//             for(int j=0;j<=m;j++){
//                 store[i][j]=-1;
//             }
//         }

//         return helper(p,s ,n,m ,store);
//       }
// }


//  Tabulation ------------>>>>
// Time Complexity :O(n*m);
// Space Complexity :O(n*m)
// class Solution {
// public boolean isMatch(String s, String p) {
//    int n =p.length() , m =s.length();

//   boolean[][] store = new boolean[n+1][m+1];  // default every element is false
//   for(int i=0;i<=n;i++){
//         for(int j=0;j<=m;j++){
//            if(i==0 && j==0) store[i][j]=true;
//           else if(i==0 && j>=1) store[i][j] =false;
//           else if (j==0 && i>=1) {
//             boolean flag = true;
//             for(int a=1;a<=i;a++){
//                if( p.charAt(a-1)!='*'){
//                  flag=false;
//                  break;
//                }
//             }
//             store[i][j] = flag;
//           }
//           else{
//              if(p.charAt(i-1)==s.charAt(j-1) ||p.charAt(i-1)=='?') store[i][j]= store[i-1][j-1];//means match
//              else{    //means not Match
//                 if(p.charAt(i-1)=='*'){
//                   store[i][j] = store[i-1][j] || store[i][j-1];
//                 }
//                 else store[i][j] = false;
//              }
//           }

//         }
//      }

//      return store[n][m];
// }
// }


// Tabulation ----------->>>>>>>>>>>
// Time Complexity :O(n*m);
// Space Complexity :O(m)
//class Solution {
//    public boolean isMatch(String s, String p) {
//        int n =p.length() , m =s.length();
//        boolean[] dp= new boolean[m+1];
//
//        for(int i=0;i<=n;i++){
//            boolean[] temp = new boolean[m+1];
//            for(int j=0;j<=m;j++){
//                if(i==0 && j==0) temp[j]=true;
//                else if(i==0 && j>=1) temp[j]=false;
//                else if(j==0 && i>=1) {
//                    boolean flag=true;
//                    for(int a=1;a<=i;a++){
//                        if(p.charAt(a-1)!='*') {
//                            flag = false;
//                            break;
//                        }
//                    }
//                    temp[j]=flag;
//                }
//                else{
//                    if(p.charAt(i-1)==s.charAt(j-1) || p.charAt(i-1)=='?') temp[j] = dp[j-1];  // means match
//                    else{   // means not match
//                        if(p.charAt(i-1)=='*') temp[j] = dp[j] || temp[j-1];
//                        else temp[j] = false;
//                    }
//                }
//            }
//            dp = temp;
//        }
//
//        return dp[m];
//    }
//}




           // Buy Sell Stocks ------------leetcode------->>>>>>

//class Solution {
//    public int maxProfit(int[] prices) {
//        int max =0;
//        int buy=prices[0];
//        int sell=0;
//        for(int i=1;i<prices.length;i++){
//            sell= prices[i];
//            max= Math.max(max,sell-buy);
//            buy = Math.min(sell,buy);
//        }
//        return max;
//    }
//}

                // Buy sell stocks -ii
        // Memoization ------------->>>>>>>>>
// Time Complexity :O(n*2);
// Space Complexity O(n*2)+recursion stack space O(n)
// class Solution {
//     public int helper(int idx, int choice,int[] prices,int [][] store){// here we assume 1 means we can buy and 0 means can't buy
//     int profit=0;
//     if(idx==prices.length) return 0;

//     if(store[idx][choice]!=-1) return store[idx][choice];
//          if(choice ==1){  // mean buy
//             profit = Math.max( -prices[idx]+helper(idx+1,0,prices,store) ,0+helper(idx+1,1,prices,store));

//          }
//          else{  // means sold
//            profit = Math.max(prices[idx]+helper(idx+1,1,prices,store) ,0+helper(idx+1,0,prices,store));
//          }

//          return  store[idx][choice]=profit;
//     }
//     public int maxProfit(int[] prices) {
//         int [][] store = new int [prices.length][2];
//         for(int i=0;i<prices.length;i++){
//             for(int j=0;j<2;j++){
//                 store[i][j]=-1;
//             }
//         }

//        return helper(0,1,prices,store);
//     }
// }

        // Tabulation ---------->>>>>>
// Time Complexity :O(n*2);
// Space Complexity O(n*2)
//  class Solution {
//        public int maxProfit(int[] prices) {
//            int n = prices.length ;
//            int[][] store = new int[n+1][2];
//            for(int i=0;i<2;i++){     // it not mandatory because bydefault everything is 0
//                store[n][i]=0;
//            }

//            for(int i=n-1;i>=0;i--){
//                for(int j=0;j<2;j++){
//                    if(j==1)  store[i][j] = Math.max(-prices[i]+store[i+1][0],0+store[i+1][1]);
//                    else store[i][j] = Math.max(prices[i]+store[i+1][1],0+store[i+1][0]);
//                }
//            }

//            return store[0][1];
//        }
//  }

        // Tabulation ---------->>>>
// Time Complexity :O(n*2);
// Space Complexity O(2)
//class Solution {
//    public int maxProfit(int[] prices) {
//        int n = prices.length ;
//        int []dp = new int[2];
//        for(int i=n-1;i>=0;i--){
//            int []temp = new int[2];
//            for(int j=0;j<2;j++){
//                if(j==1) temp[j] = Math.max(-prices[i]+dp[0],0+dp[1]);
//                else temp[j] = Math.max(prices[i]+dp[1],dp[0]);
//            }
//            dp = temp;
//        }
//
//        return dp[1];
//    }
//}


         // Buy Sell Stock - iii

//        //Memoization ------------->>>>>
//  // Time Complexity : O(n*2*3);
//  // Space Complexity :O(n*2*3) + Recursive stack Space O(n)
// class Solution {
//     public int helper(int idx,int choice,int transaction,int[] prices,int[][][] store){
//         if(transaction==0) return 0;
//          if(idx==prices.length) return 0;

//       if(store[idx][choice][transaction]!=-1) return store[idx][choice][transaction];
//         int profit=0;
//        if(choice==1){  // means we can buy
//            profit =Math.max( -prices[idx]+helper(idx+1,0,transaction,prices,store),helper(idx+1,1,transaction,prices,store));
//        }
//        else{  // means we can sell
//            profit =Math.max(prices[idx]+helper(idx+1,1,transaction-1,prices,store),helper(idx+1,0,transaction,prices,store));
//        }

//        return  store[idx][choice][transaction]=profit;
//     }
//     public int maxProfit(int[] prices) {
//         int n =prices.length , choice=2,transaction=2;
//         int[][][] store= new int [n][choice][transaction+1]; // OR  int[][][] store= new int[n][2][3];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<choice;j++){
//                 for(int k=0;k<=transaction;k++){
//                     store[i][j][k]=-1;
//                 }
//             }
//         }

//        return helper(0,1,2,prices,store);
//     }
// }


       // Tabulation ------------->>>>>>>
// Time Complexity : O(n*2*3);
//  // Space Complexity :O(n*2*3)
//    class Solution {
//            public int maxProfit(int[] prices) {
//                  int n =prices.length ,choice=2,transaction=2;
//              int[][][] store = new int[n+1][choice][transaction+1]; //Or int[][][] store= new int[n+1][2][3]
//            for(int i=n;i>=0;i--){
//                for(int j=0;j<choice;j++){
//                    for(int k=0;k<=transaction;k++){
//                        if(k==0) store[i][j][k] =0;
//                        else if(i==n) store[i][j][k]=0;
//                        else{
//                            int profit=0;
//                            if(j==1) profit= Math.max(-prices[i]+store[i+1][0][k],0+store[i+1][1][k]);
//                            else profit=Math.max(prices[i]+store[i+1][1][k-1],0+store[i+1][0][k]);
//                            store[i][j][k]=profit;
//                        }
//                    }
//                }
//            }

//            return store[0][1][2];

//            }
//    }

     // Tabulation  ---------->>>>>>>
// Time Complexity : O(n*2*3);
// Space Complexity :O(2*3)
//class Solution {
//    public int maxProfit(int[] prices) {
//        int n =prices.length ,choice=2,transaction=2;
//
//        int[][] dp = new int[choice][transaction+1];
//        for(int i=n;i>=0;i--){
//            int[][] temp = new int[choice][transaction+1];
//            for(int j=0;j<choice;j++){
//                for(int k=0;k<=transaction;k++){
//                    if(i==n) temp[j][k] =0;
//                    else if(k==0) temp[j][k] =0;  // Or temp[j][0] =0;
//                    else{
//                        int profit =0;
//                        if(j==1) profit = Math.max(-prices[i]+dp[0][k],0+dp[1][k]);
//                        else profit =Math.max(prices[i]+dp[1][k-1],0+dp[0][k]);
//                        temp[j][k]=profit;
//                    }
//                }
//            }
//            dp=temp;
//        }
//
//        return dp[1][2];
//    }
//}











           //  Longest common Increasing subsequence ------------>>>>>>>>>>>

        // Meoization ---------->>>>>>>  1 based indexing
// Time Complexity :O(n*n) ;
// Space Compleixty :O(n*n) +recursive stack space O(n);
// class Solution {
//     public int helper(int idx,int previous_idx,int[]nums,int[][] store){
//         if(idx==nums.length+1) return 0;   // we create 1 based indexing

//         if(store[idx][previous_idx]!=-1) return store[idx][previous_idx];
//         int take =Integer.MIN_VALUE;
//         if(previous_idx==0 || nums[idx-1]>nums[previous_idx-1]) take =1+helper(idx+1,idx,nums,store);
//         int notTake = 0+helper(idx+1,previous_idx,nums,store);
//         return store[idx][previous_idx]= Math.max(take,notTake);
//     }
//     public int lengthOfLIS(int[] nums) {
//         int n = nums.length;
//         int[][] store= new int[n+1][n];
//         for(int i=1;i<=n;i++){     // Or   for(int i=0;i<=n;i++)
//             for(int j=0;j<n;j++){
//                 store[i][j]=-1;
//             }
//         }
//       return helper(1,0,nums,store);
//     }
// }

          //  Or   Memoizaton ------->>>>>
// Time Complexity :O(n*n) ;
// Space Compleixty :O(n*n) +recursive stack space O(n);
// class Solution {
//     public int helper(int idx,int previous_idx,int[]nums,int[][] store){
//         if(idx==nums.length) return 0;

//          if(store[idx][previous_idx+1]!=-1) return store[idx][previous_idx+1];
//         int take = Integer.MIN_VALUE;
//         if(previous_idx==-1 || nums[idx]>nums[previous_idx]){
//             take = 1+helper(idx+1,idx,nums,store);
//         }
//         int notTake = 0+helper(idx+1,previous_idx,nums,store);
//         return  store[idx][previous_idx+1]=Math.max(take,notTake);
//     }
//       public int lengthOfLIS(int[] nums) {
//            int n = nums.length;
//         int[][] store= new int[n][n];
//         for(int i=0;i<n;i++){     // Or   for(int i=0;i<=n;i++)
//             for(int j=0;j<n;j++){
//                 store[i][j]=-1;
//             }
//         }

//          return helper(0,-1,nums,store);
//       }
// }

            // Tabulation ----->>
// Time ComPlexity :O(n*n);
// Space Complexity :O(n*n)
// class Solution {
//       public int lengthOfLIS(int[] nums) {
//           int n = nums.length;
//           int[][] store=new int[n+1][n+1];
//          for(int i=n;i>=0;i--){
//            for(int j=i-1;j>=-1;j--){
//                   if(i==n) store[i][j+1] =0;  // it is not mandatory to assign 0 because everything is 0 already
//                  else{
//                       int take = Integer.MIN_VALUE;
//                if(j==-1 || nums[i]>nums[j]) take = 1+store[i+1][i+1];
//                int nonTake = 0+store[i+1][j+1];
//                store[i][j+1] =  Math.max(take,nonTake);
//                  }

//            }
//          }
//
//          return store[0][0];
//       }
//  }

           // Tabulation ----->>
// Time ComPlexity :O(n*n);
// Space Complexity :O(n)
// class Solution {
//       public int lengthOfLIS(int[] nums) {
//             int n = nums.length;
//           int[] dp=new int[n+1];
//           for(int i=n-1;i>=0;i--){
//                 int[]temp=new int[n+1];
//              for(int j=i-1;j>=-1;j--){
//                     int take = Integer.MIN_VALUE;
//                     if(j==-1 || nums[i]>nums[j]) take =1+dp[i+1];
//                     int nonTake = 0+dp[j+1];
//                     temp[j+1] =  Math.max(take,nonTake);
//              }
//              dp = temp;
//           }

//           return dp[0];
//       }
// }


      // (Tabulation)normal iterative way ----->>
// Time ComPlexity :O(n*n);
// Space Complexity :O(n)
//class Solution {
//    public int lengthOfLIS(int[] nums) {
//        int[] arr = new int[nums.length];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = 1;   // at  first all element subsequence length is 1
//        }
//
//        int length =1;
//        for(int i=0;i<nums.length;i++){
//            for(int j=0;j<i;j++){
//                if(nums[i]>nums[j]){
//                    arr[i] = Math.max(arr[i],1+arr[j]);
//                }
//            }
//            length = Math.max(length,arr[i]);
//        }
//
//        return length;
//    }
//}



// Print Longest common increasing subsequence ------->>>
    // Time Complexity :O(n*n)
    // Space complexity: O(n)
//public class dynamicProgramming {
//    public static void main(String[] args) {
//        int [] arr = {5,4,11,1,16,8};
//        int n = arr.length;
//        int[] dp = new int[n];   // here we store each element's longest Common subsequence length
//        int [] previous = new int[n];    // here we store each element's longest Common subsequence previous idx
//        for(int i=0;i<n;i++){
//            dp[i]=1;  // initially all element's lis length is 1
//            previous[i]=i;  // initially all element's lis previous idx is itself
//        }
//
//        int length=1, lastIdx=0;
//        for(int i=0;i<n;i++){
//            for (int j=0;j<i;j++){
//                if(arr[i]>arr[j] && dp[i]<1+dp[j]) {
//                    dp[i] = Math.max(dp[i], 1+dp[j]);
//                    previous[i]=j;
//                }
//            }
//           if(dp[i]>length){
//               length=dp[i];
//               lastIdx=i;
//           }
//        }
//
//        while (previous[lastIdx]!=lastIdx){
//            System.out.print(arr[lastIdx]+" ");
//            lastIdx=previous[lastIdx];
//        }
//        System.out.println(arr[lastIdx]);
//        // if we want right order after that we store elements an array and reverse it
//    }
//}



           // Count Longest Common subsequences------------------>>>>>>>>>>>
// Time Compleixty :O(n*n);
// Space Complexity :O(n)
//class Solution {
//    public int findNumberOfLIS(int[] nums) {
//        int n=nums.length;
//        int[] dp = new int[n];
//        int[] count = new int[n];
//        for(int i=0;i<n;i++){
//            dp[i]=1;
//            count[i]=1;
//        }
//        int length=1;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i;j++){
//                if(nums[i]>nums[j] && 1+dp[j]>dp[i]) {
//                    dp[i] = 1+dp[j];
//                    count[i]=count[j];
//                }
//                else if( nums[i]>nums[j] && 1+dp[j]==dp[i]){
//                    count[i]+=count[j];
//                }
//            }
//            length=Math.max(length,dp[i]);
//        }
//
//        int totalCount=0;
//        for(int i=0;i<n;i++){
//            if(dp[i]==length) totalCount+=count[i];
//        }
//        return totalCount;
//    }
//}


          // Matrix Chaining Multiplication (MCM)-------------- GFG ----------->>>>>>>>>>
// Time Complexity :O(n*n*n);
// Space Complexity :O(n*n)+Recursive stack space O(n)
//class Solution{
//    public static int helper(int i,int j,int[] arr,int[][] store){
//        if(i==j) return 0;
//        int ans = Integer.MAX_VALUE;
//        if(store[i][j]!=-1) return store[i][j];
//        for(int k=i;k<j;k++){
//            int steps = arr[i-1]*arr[k]*arr[j] +helper(i,k,arr,store)+helper(k+1,j,arr,store);
//            ans = Math.min(ans,steps);
//        }
//        return store[i][j]=ans;
//    }
//    static int matrixMultiplication(int N, int arr[]){
//        int[][] store = new int[N][N];
//        for(int i=0;i<N;i++){
//            for(int j=0;j<N;j++) {
//                store[i][j]=-1;
//            }
//        }
//        return helper(1,N-1,arr,store);
//    }
//}



            // Brust Balloons  --------------- Leetcode ----------->>>>>>>>

// Memoization --------------->>>>>>>>>>
// Time Complexity :O(n*n*n);
// Space complexity :O(n*n)+Recursive stack space O(n)
// class Solution {
//     public int helper(int i,int j,int[] newArr, int[][] store){
//         if(i>j) return 0;
//         if(store[i][j]!=-1) return store[i][j];
//         int maxCoins = Integer.MIN_VALUE;
//         for(int idx=i;idx<=j;idx++){
//             int coins=newArr[i-1]*newArr[idx]*newArr[j+1] +helper(i,idx-1,newArr,store)+helper(idx+1,j,newArr,store);
//             maxCoins = Math.max(maxCoins,coins);
//         }

//         return  store[i][j]=maxCoins;
//     }
//     public int maxCoins(int[] nums) {
//         int n = nums.length;
//         int[][] store=new int[n+1][n+1];
//        for(int i=0;i<=n;i++){
//            for(int j=0;j<=n;j++){
//                store[i][j]=-1;
//            }
//        }


//         int[] newArr =new int[n+2];
//         newArr[0] = newArr[newArr.length-1] =1;
//         for(int i=1;i<newArr.length-1;i++) {
//             newArr[i]=nums[i-1];
//         }

//         return helper(1,newArr.length-2,newArr,store);
//     }
// }

// Tabulation ------------<<>>>>.>>>>>>

//class Solution {
//    public int maxCoins(int[] nums) {
//        int n = nums.length;
//        int[][] store = new int[n+2][n+2];
//        int[] newArr = new int[n+2];
//        newArr[0] = newArr[newArr.length-1] =1;
//        for(int i=1;i<newArr.length-1;i++) {
//            newArr[i]=nums[i-1];
//        }
//
//
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=n;j++){
//                if(i>j) continue;
//                int maxCoins = Integer.MIN_VALUE;
//                for(int idx=i;idx<=j;idx++){
//                    int coins = newArr[i-1]*newArr[idx]*newArr[j+1]+store[i][idx-1]+store[idx+1][j];
//                    maxCoins = Math.max(maxCoins,coins);
//                    store[i][j] = maxCoins;
//                }
//            }
//        }
//        return store[1][n];
//    }
//}



            //  1277. Count Square Submatrices with All Ones  --- Leetcode----------->>>>>>>
// Time Complexity :O(m*n);
// Space complexity :O(m*n)
//class Solution {
//    public int countSquares(int[][] matrix) {
//        int m = matrix.length, n = matrix[0].length;
//        int[][] dp = new int[m][n];
//        int sum=0;
//        for(int i=0;i<m;i++){
//            dp[i][0]=matrix[i][0];
//            sum+=dp[i][0];
//        }
//        for(int i=1;i<n;i++){
//            dp[0][i] = matrix[0][i];
//            sum+=dp[0][i];
//        }
//
//        for(int i=1;i<m;i++){
//            for(int j=1;j<n;j++){
//                if(matrix[i][j]==0) dp[i][j]=0;
//                else{
//                    dp[i][j] = Math.min(Math.min( dp[i-1][j-1],dp[i][j-1]),dp[i-1][j]) +1;
//                    sum+=dp[i][j];
//                }
//            }
//        }
//
//        // int sum =0;
//        // for(int i=0;i<m;i++){
//        //     for(int j=0;j<n;j++){
//        //       sum+=dp[i][j];
//        //     }
//        // }
//        return sum;
//    }
//}
