package JavaCourseGraph;








               // Graph Data Structure -------- It is a non linear data structure ------->>>
       // it is a combination of vertices/nodes and edges ------->>>






                    //  *****  Graph Representation ----->>>>  For Undirected And Directed Graph
             //   Two way to represent graph (Adjacency Matrix and Adjacency list) ------->>>



         // *****  Adjacency Matrix for undirected graph --->>
                    //Adjacency Matrix UnDirected Graph Space complexity : O(vertex*vertex) or  O(n*n)
//public class Graph {
//    public static void main(String[] args) {
//        int vertex =5, egdes= 6;             // graph elements is 1,2,3,4,5
//        int [][] arr = new int[vertex+1][vertex+1];
//
//        arr[1][2]=1;
//        arr[1][3]=1;
//        arr[2][1]=1;
//        arr[2][4]=1;
//        arr[2][5]=1;
//        arr[3][1]=1;
//        arr[3][4]=1;
//        arr[4][3]=1;
//        arr[4][2]=1;
//        arr[4][5]=1;
//          arr[5][2]=1;
//         arr[5][4]=1;
//        for (int i=0;i<=vertex;i++){
//            for (int j=0;j<=vertex;j++){
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
//    }
//}

             //   Adjacency List Representation of UnDirected Graph----  Space Complexity : O(Vertex+2*edges) = O(edges)

//import java.util.*;
//public class Graph{
//        public static void main(String[] args) {
//            int vertex =5, egdes= 6;     // graph elements is 1,2,3,4,5
//            ArrayList<ArrayList<Integer>> aal = new ArrayList<>();
//            for (int i=0;i<=5;i++){
//                aal.add(new ArrayList<>());
//            }
//
//            aal.get(1).add(2);
//            aal.get(1).add(3);
//
//            aal.get(2).add(1);
//            aal.get(2).add(4);
//            aal.get(2).add(5);
//
//            aal.get(3).add(1);
//            aal.get(3).add(4);
//
//            aal.get(4).add(2);
//            aal.get(4).add(3);
//            aal.get(4).add(5);
//
//            aal.get(5).add(2);
//            aal.get(5).add(4);
//
//            System.out.println(aal);
//
//        }
//}



                     //  *****  Adjacency Matrix for Directed graph --->>
              //  Adjacency Matrix Directed Graph Space complexity : O(vertex*vertex) or  O(n*n)
//public class Graph {
//    public static void main(String[] args) {
//        int vertex =5, egdes= 6;             // graph elements is 1,2,3,4,5
//        int [][] arr = new int[vertex+1][vertex+1];
//
//        arr[1][2]=1;
//        arr[1][3]=1;
//
//        arr[2][4]=1;
//        arr[2][5]=1;
//
//        arr[3][4]=1;
//
//
//        arr[4][5]=1;
//
//        for (int i=0;i<=vertex;i++){
//            for (int j=0;j<=vertex;j++){
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
//    }
//}

               //   Adjacency List Representation of       Directed Graph---- >>>>>>>>>>>
         //     Space Complexity : O(Vertex+edges)

//import java.util.*;
//public class Graph{
//        public static void main(String[] args) {
//            int vertex =5, egdes= 6;     // graph elements is 1,2,3,4,5
//            ArrayList<ArrayList<Integer>> aal = new ArrayList<>();
//            for (int i=0;i<=5;i++){
//                aal.add(new ArrayList<>());
//            }
//
//            aal.get(1).add(2);
//            aal.get(1).add(3);
//
//            aal.get(2).add(4);
//            aal.get(2).add(5);
//
//            aal.get(3).add(4);
//
//            aal.get(4).add(5);
//
//
//            System.out.println(aal);
//
//        }
//}



                 //  BFS Traversal(Queue) of a Graph ----------->>>>>>>>
//import java.util.*;
//public class Graph {
//    public static void breathFirstSearch(int[][]arr,int start,boolean[] visited){
//
//        Queue<Integer> qu = new LinkedList<>();
//        qu.add(start);
//        visited[start]=true;
//        while (!qu.isEmpty()){
//            int a = qu.poll();
//            System.out.print(a+" ");
//            for (int i=0;i<5;i++){
//                if (arr[a][i]==1 && visited[i]!=true){
//                    qu.add(i);
//                    visited[i]=true;
//                }
//            }
//
//        }
//    }
//    public static void main(String[] args) {
//
//        int[][] arr = {{0,1,1,0,0},
//                       {1,0,0,1,0},
//                       {1,0,0,1,4},
//                       {0,1,1,0,1},
//                       {0,0,1,1,0}};
//        boolean[] visited = new boolean[5];   // by_default every element is false and graph have 5 vertex 0,1,2,3,4
//        breathFirstSearch(arr,0,visited);
//        System.out.println();
//        visited=new boolean[5];
//        breathFirstSearch(arr,1,visited);
//
//    }
//}

               //   //  BFS Traversal(Queue) of a Graph ---------- Solved in GFG ---------->>>>

               // Time Complexity:O(V+edges) or O(n+edges)
          // Space Complexity: O(3v) =O(v) or O(n) because we create 3 extra auxiliary space
//class Solution {
//    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        boolean[] visited = new boolean[V];
//        Queue<Integer> qu = new LinkedList<>();
//        qu.add(0);   // because  graph starting from 0.that is mention this question
//        visited[0]=true;
//
//        while(!qu.isEmpty()){   // O(v) or O(n)
//            int a = qu.poll();
//            ans.add(a);
//            for(int e: adj.get(a)){
//                if(visited[e]!=true){
//                    qu.add(e);
//                    visited[e]=true;
//                }
//            }
//        }
//        return ans;
//    }
//}


               //  DFS Traversal(Stack) of a Graph -------->>>

//public class Graph {
//    public static void depthFirstSearch(int[][] arr,int start,boolean[] visited){
//
//        System.out.println(start);
//        visited[start]=true;
//        for (int i=0;i<5;i++){
//            if (arr[start][i]==1 && visited[i]==false){
//                depthFirstSearch(arr,i,visited);
//
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int[][] arr = {{0,1,1,0,0},
//                {1,0,0,1,0},
//                {1,0,0,1,4},
//                {0,1,1,0,1},
//                {0,0,1,1,0}};
//        boolean[] visited = new boolean[5]; //  graph have 5 vertex 0,1,2,3,4
//        depthFirstSearch(arr,1,visited);
//    }
//}

          //  //  DFS Traversal of a Graph -------  Solved in GFG ----------->>>
                  // Space Complexity : O(v)+O(v)+recursive stack height worst case O(v) =O(v);
          //  Time Complexity : O(v)+O(2*edges) = O(v)+O(edges)
//class Solution {
//    public void dfs(int startEle,ArrayList<Integer> ans, boolean[] visited,ArrayList<ArrayList<Integer>> adj){
//        ans.add(startEle);
//        visited[startEle]=true;
//        for(int e: adj.get(startEle)){
//            if(!visited[e]){
//                dfs(e,ans,visited,adj);
//            }
//        }
//    }
//    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
//        boolean[] visited = new boolean[V];
//        ArrayList<Integer> ans = new ArrayList<>();
//
//        dfs(0,ans,visited,adj);
//        return ans;
//    }
//}


            //  Rotting Oranges -------Solved in leetcode--------------->>>>>>>
   // Time Complexity: (n*m)   And   Sapce Complexity : O(n*m)

//class Solution {
//    class combo{
//        int row;
//        int col;
//        int time;
//        public combo(int r,int c,int t){
//            this.row=r;
//            this.col=c;
//            this.time=t;
//        }
//    }
//    public int orangesRotting(int[][] grid) {
//        int n=grid.length;
//        int m = grid[0].length;
//        boolean[][] rotten = new boolean[n][m]; // default every element is false
//        Queue<combo> qu = new LinkedList<>();
//        int freshOrangeCount=0;
//        for(int i=0;i<n;i++){  // O(n*m)
//            for(int j=0;j<m;j++){
//                if(grid[i][j]==2){
//                    rotten[i][j]=true;
//                    qu.add(new combo(i,j,0));
//                }
//                else if(grid[i][j]==1) freshOrangeCount++;
//            }
//        }
//        int count=0;
//        int ansTime=0;
//        int[] neigbourRow = {0,0,+1,-1};  // left,right,up,down
//        int[] neigbourCol = {-1,+1,0,0};   // left,right,up,down
//        while(!qu.isEmpty()){   // Time : O(n*m*4) =(n*m)
//            combo cm = qu.poll();
//            int r = cm.row;
//            int c = cm.col;
//            int t = cm.time;
//            ansTime=Math.max(ansTime,t);
//
//            for(int i=0;i<4;i++){  // O(4) or O(k)  // then run a loop 4 time for left,right,up,down
//                int newRow=r+neigbourRow[i];
//                int newCol= c+neigbourCol[i];
//                if(newRow>=0 && newRow<n &&newCol>=0 &&newCol<m && rotten[newRow][newCol]!=true &&
//                        grid[newRow][newCol]==1){
//                    rotten[newRow][newCol]=true;
//                    qu.add(new combo(newRow,newCol,t+1));
//                    count++;
//                }
//            }
//        }
//
//        if(freshOrangeCount==count) return ansTime;  // that means all freash orange we can rott
//        else return -1;
//    }
//}


           // Detection Cycle in a Undirected Graph ----- Solved in GFG ---------->>>>>>>>

//   //  -----------  By BFS Traversal ---------------------

//           // Time Complexity : O(v)+O(v+Edges)  AND Space Complexity : O(V)
// class Solution {
//     class pair{
//         int curr;
//         int parent;
//         public pair(int curr,int parent){
//             this.curr=curr;
//             this.parent=parent;
//         }
//     }
//     // Function to detect cycle in an undirected graph.
//     public boolean detect(int source,boolean[]visited,Queue<pair>qu,ArrayList<ArrayList<Integer>> adj){

//         qu.add(new pair(source,-1));  // because 0 don't connect any previous node
//         visited[source]=true;   // source is starting vertex like 0
//         while(!qu.isEmpty()){
//             pair p = qu.poll();
//             for(int e: adj.get(p.curr)){
//                 if(!visited[e]){
//                     qu.add(new pair(e,p.curr));
//                     visited[e]=true;
//                 }
//                 else if(e!=p.parent){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
//         // Code here
//          boolean[] visited = new boolean[V];
//           Queue<pair> qu = new LinkedList<>();
//         for(int i=0;i<V;i++){
//             if(!visited[i]){
//                 if( detect(i,visited,qu,adj)==true) return true;
//             }
//         }
//         return false;
//     }
// }
//                    // ---------------  By DFS Traversal ---------------------
//              // Time Complexity: O(v)+O(v+2*E);
//            // Space Complexity : O(V);
//
//
//class Solution {
//    class pair{
//        int curr;
//        int parent;
//        pair(int curr,int parent){
//            this.curr=curr;
//            this.parent=parent;
//        }
//    }
//
//    public boolean detect(int source,int parent,boolean[] vis,ArrayList<ArrayList<Integer>> adj){
//        vis[source]=true;
//        for(int e: adj.get(source)){
//            if(!vis[e]){
//                if( detect(e,source,vis,adj)==true) return true;
//            }
//            else if(parent!=e){
//                return true;
//            }
//        }
//        return false;
//    }
//    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
//        boolean[] visited = new boolean[V];
//        for(int i=0;i<V;i++){
//            if(!visited[i]){
//                if( detect(i,-1,visited,adj)==true){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//}


           // Number of Distinct isLand ----- Solved in GFG---------------->>>>>>>>>
                       //  Time Complexity : O(n*m)+(n*m*4);
                    //  Sapce Complexity :(n*m);
//class Solution {
//    public void dfs(int row,int col,boolean[][]vis,int[][] grid,int n,int m,int baseRow,int baseCol,ArrayList<Integer> al,HashSet<ArrayList<Integer>> hse){
//
//        vis[row][col]=true;
//        al.add(row-baseRow);
//        al.add(col-baseCol);
//        int[] neigbourRow={0,0,+1,-1};
//        int[] neigbourCol={+1,-1,0,0};
//        for(int i=0;i<4;i++){
//            int newRow=row+neigbourRow[i];
//            int newCol=col+neigbourCol[i];
//            if(newRow>=0&&newRow<n &&newCol>=0&&newCol<m &&grid[newRow][newCol]==1&&vis[newRow][newCol]!=true){
//                vis[newRow][newCol]=true;
//                dfs(newRow,newCol,vis,grid,n,m,baseRow,baseCol,al,hse);
//
//            }
//        }
//    }
//    int countDistinctIslands(int[][] grid) {
//        // Your Code here
//        int n = grid.length;
//        int m = grid[0].length;
//        boolean[][] visited = new boolean[n][m];
//        ArrayList<Integer> al = new ArrayList<>();
//        HashSet<ArrayList<Integer>> hs = new HashSet<>();
//        for(int i=0;i<n;i++){  // O(n*m)
//            for(int j=0;j<m;j++){
//                if(grid[i][j]==1 && !visited[i][j]){
//                    dfs(i,j,visited,grid,n,m,i,j,al,hs);   // O(n*m*4)
//                    hs.add(al);   // O(log n*m)   this time for HashSet add
//                    al=new ArrayList<>();
//                }
//            }
//        }
//
//        return hs.size();  // because that is number of distinct island;
//    }
//}




          // is Graph Bipartite -------Solved in GFG -------------->>>>>>>
//      // ------------------- By BFS Traversal -------------------------------
//        //   Time Complexity: O(V)+O(V+2*E);
//        //   Sapce Complexity : O(V);

// class Solution{
//     public boolean color(int startEle,int[]colored,Queue<Integer> qu,ArrayList<ArrayList<Integer>>adj){
//         colored[startEle]=0;
//         qu.add(startEle);
//         while(!qu.isEmpty()){
//             int a=qu.poll();
//             for(int e: adj.get(a)){
//                 if(colored[e]==-1){
//                     colored[e]=1-colored[a];
//                     qu.add(e);
//                 }
//                 else if(colored[e]==colored[a]){ // that means two adjacents have same color
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
//     public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
//     {
//         // Code here
//         int[] colored = new int[V]; // here we assume -1 means not coloured,1 means green 0 means blue colour
//         for(int i=0;i<V;i++){
//             colored[i]=-1;  // enitialy every node not coloured so we put -1
//         }

//         Queue<Integer> qu = new LinkedList<>();
//         for(int i=0;i<V;i++){   // O(V)
//             if(colored[i]==-1){  // means not colored yet
//                 if(color(i,colored,qu,adj)==false) return false;
//             }
//         }
//         return true;
//     }
// }
//
//
//              // ---------------- By DFS Traversal -----------------
//                  // Time Complexity: O(V)+O(V+2*E);
//                // Sapce Complexity : O(V);
//
//class Solution{
//    public boolean dfs(int startEle,int color,int[]colored,ArrayList<ArrayList<Integer>>adj){
//        colored[startEle]=color;
//        for(int e: adj.get(startEle)){
//            if(colored[e]==-1){
//                // colored[e]=1-colored[startEle];
//                if( dfs(e,1-color,colored,adj)==false) return false;
//            }else if(colored[e]==colored[startEle]){ // means two adjacent have same color
//                return false;
//            }
//        }
//
//        return true;
//    }
//    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj){
//        int[] colored=new int[V]; // here we assume -1 means not coloured,1 means green 0 means blue colour
//        for(int i=0;i<V;i++) colored[i]=-1;  // enitialy every node not coloured so we put -1
//
//        for(int i=0;i<V;i++){
//            if(colored[i]==-1){
//                if( !dfs(i,0,colored,adj)) return false;
//            }
//        }
//        return true; // if we don't get false after whole travers then we return true
//    }
//}



                 //  Topological Sort ------ Solved in  GFG ----------->>>>>>>>
       //---------- Topological sort not happen in cyclic or undirected Graph only Dag------
                   // DAG means = Directed Acyclic Graph

// -----------   By  DFS  Traversal ---------------------
// Time Complexity :O(V)+O(V+E)+O(V) = O(V+E)
//  Space Complexity : O(V)+O(V)+O(V) = O(V)
// class Solution
// {
//     //Function to return list containing vertices in Topological order.
//     public static void dfs(int start,boolean[]vis,Stack<Integer> st,ArrayList<ArrayList<Integer>> adj){
//         vis[start]=true;
//         for(int e: adj.get(start)){
//             if(!vis[e]){
//                 dfs(e,vis,st,adj);
//             }
//         }

//         st.push(start);
//     }
//     static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
//     {
//
//         boolean[] visited = new boolean[V]; // Space O(V)
//         Stack<Integer> stk = new Stack<Integer>();  // Space O(V)

//         for(int i=0;i<V;i++){  // time O(V)
//             if(!visited[i]){
//                 dfs(i,visited,stk,adj); // in total (V+E)
//             }
//         }

//         int[] arr = new int[V]; // space O(V)
//         int i=0;
//         while(!stk.isEmpty()){  // time O(V)
//             arr[i++]=stk.pop();
//         }

//         return arr;
//     }
// }



                 // Topological sort --------- By BFS Traversal -------------
           //it is called -------- Kahn's Algorithm--------
// Time Complexity : O(V+E)
//  Space Complexity :  O(V)
//class Solution{
//    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
//        int[] inDegree = new int[V];
//        for(int i=0;i<V;i++){   //time O(V+E)
//            for(int e: adj.get(i)){
//                inDegree[e]++;
//            }
//        }
//
//        Queue<Integer> qu = new LinkedList<>();  // space :O(V)
//        for(int i=0;i<V;i++){  //time O(V)
//            if(inDegree[i]==0){
//                qu.add(i);
//            }
//        }
//        int[] ans = new int[V];  // Space: OV
//        int i=0;
//        while(!qu.isEmpty()){  //time O(V+E)
//            int a = qu.poll();
//            ans[i++]= a;
//            for(int e: adj.get(a)){
//                inDegree[e]--;
//                if(inDegree[e]==0) qu.add(e);
//            }
//
//        }
//
//        return ans;
//    }
//}



            // Detect Cycle in Directed Graph ------ Solved in GFG ------->>>>

                      //---------------- By DFS Traversal ------------------------
// Time Complexity:O(V+E);
// Space Complexity:O(V);
// class Solution {
//     // Function to detect cycle in a directed graph.
//     public boolean dfs(int start,boolean[]vis,boolean[]pathVisited,ArrayList<ArrayList<Integer>> adj){
//         vis[start]=true;
//         pathVisited[start]=true;
//         for(int e: adj.get(start)){
//           if(!vis[e]){
//              if( dfs(e,vis,pathVisited,adj)) return true;
//           }else if(pathVisited[e]==true){
//               return true;
//           }
//         }

//         pathVisited[start]=false;  // because we don't find any cycle this path vis[start]=true but we initialize pathVisited[start]=false
//         return false;
//     }
//     public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
//         // code here
//         boolean[] visited=new boolean[V];
//          boolean[] pathVisited=new boolean[V];
//         for(int i=0;i<V;i++){
//             if(!visited[i]){
//                 if(dfs(i,visited,pathVisited,adj)==true) return true;
//             }
//         }

//         return false;
//     }
//}



                    // -----By BFS------  Using kahn's/topological sort Bfs technique------------
        // Because topological sort applicable on Directed Acyclic graph if cycle present then it is not applicable and we found cycle-------->>>>>
// Time Complexity : O(V+E);
// Space Complexity : O(v)

//class Solution {
//    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
//        int[]inDegree = new int[V];
//        for(int i=0;i<V;i++){
//            for(int e: adj.get(i)){
//                inDegree[e]++;
//            }
//        }
//
//        Queue<Integer> qu = new LinkedList<>();
//        for(int i=0;i<V;i++){
//            if(inDegree[i]==0){
//                qu.add(i);
//            }
//        }
//
//        int count=0;
//        while(!qu.isEmpty()){
//            int a = qu.poll();
//            count++;
//            for(int e: adj.get(a)){
//                inDegree[e]--;
//                if(inDegree[e]==0) qu.add(e);
//            }
//        }
//
//        if(count!=V) return true;  // that means every element not poped so topological sort not work properly it means cycle present
//        else return false;
//
//    }
//}



          // Prerequisites Task -------- Solved in GFG ----------------->>>>>>>>>>

// Time Complexity :O(N+P)/ O(V+E)
// Space Complexity : O(N+P)/ O(V+E)
//class Solution {
//    public boolean isPossible(int N,int P, int[][] prerequisites)
//    {
//        // Your Code goes here
//        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();  // space O(N+P)
//        for(int i=0;i<N;i++){   // first we create a graph representation because here adj not given
//            graph.add(new ArrayList<>());
//        }
//        int m = prerequisites.length;
//        for(int i=0;i<m;i++){ // time O(m)
//            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
//        }
//
//        int[] inDegree = new int[N]; // space :O(N) or O(V)
//        for(int i=0;i<N;i++){  // time:O(N+P)or O(V+E)
//            for(int e: graph.get(i)){
//                inDegree[e]++;
//            }
//        }
//
//        Queue<Integer> qu = new LinkedList<>();  // space :O(N)orO(V)
//        for(int i=0;i<N;i++){
//            if(inDegree[i]==0) qu.add(i);
//        }
//        int count=0;
//        while(!qu.isEmpty()){   // time:O(N+P)or O(V+E)
//            int a = qu.poll();
//            count++;
//            for(int e: graph.get(a)){
//                inDegree[e]--;
//                if(inDegree[e]==0) qu.add(e);
//            }
//        }
//
//        if(count==N) return true;
//        else return false;
//    }
//
//}


          // Course schedule ---------- Solved in  GFG ------------>>>

// here edge = 4 because m = 4 directed graph
// here n is Like V
              // Time Complexity :O(n+m);/O(v+E)
            // space Complexity :(n+m)/O(V+E)
//class Solution{
//    static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> prerequisites) {
//
//        // first we create graph from the five 2d arraylist
//        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();    // Space (n+m)
//        for(int i=0;i<n;i++){   // time O(n)
//            adj.add(new ArrayList<>());
//        }
//
//        for(int i=0;i<m;i++){    // time O(m)
//            adj.get(prerequisites.get(i).get(1)).add(prerequisites.get(i).get(0));
//        }
//
//
//        // topological cycle detection part
//        int[] indegree = new int[n];  // space(n)
//        for(int i=0;i<n;i++){    // time O(n+m)
//            for(int e: adj.get(i)){
//                indegree[e]++;
//            }
//        }
//        Queue<Integer> qu= new LinkedList<>();    // space(n)
//        for(int i=0;i<n;i++){    // time O(n)
//            if(indegree[i]==0) qu.add(i);
//        }
//        int[] ans = new int[n];   // space(n)
//        int i=0;
//        while(!qu.isEmpty()){   // time (n+m)
//            int a = qu.poll();
//            ans[i++]=a;
//            for(int e: adj.get(a)){
//                indegree[e]--;
//                if(indegree[e]==0) qu.add(e);
//            }
//        }
//
//        if(i==n) return ans;
//        else return new int[0]; // if cycle present then return empty arr;
//    }
//}



                       // Alien Dictionary --------Solved in GFG ------------>>>>>>>

           // Time Comolexity : O(N*String.length+k)
//class Solution {
//    public String findOrder(String [] dict, int N, int K){
//
//        // create garph first because don't given the graph
//        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
//        for(int i=0;i<K;i++){
//            graph.add(new ArrayList<>());
//        }
//
//        for(int i=0;i<N-1;i++){      // O(N*string.length)
//            String s1 = dict[i];
//            String s2 = dict[i+1];
//            int length = Math.min(s1.length(),s2.length());
//            for(int j = 0;j<length;j++){
//                if(s1.charAt(j)!=s2.charAt(j)){
//                    graph.get(s1.charAt(j)-'a').add(s2.charAt(j)-'a');
//                    break;
//                }
//            }
//        }
//
//        // topological part
//
//        int [] indegree = new int[K];
//        for(int i=0;i<K;i++){
//            for(int e: graph.get(i)){
//                indegree[e]++;
//            }
//        }
//        Queue<Integer> qu = new LinkedList<>();
//        for(int i=0;i<K;i++){
//            if(indegree[i]==0) qu.add(i);
//        }
//        int[] ans=new int[K];
//        int a=0;
//        while(!qu.isEmpty()){
//            int b = qu.poll();
//            ans[a++]=b;
//            for(int e: graph.get(b)){
//                indegree[e]--;
//                if(indegree[e]==0) qu.add(e);
//            }
//        }
//
//        String st ="";
//        for(int i=0;i<K;i++){
//            st+=(char)(ans[i]+'a');
//        }
//        return st;
//
//
//
//    }
//}


           //  Shortest path in Directed Acyclic Graph ------- Solved in GFG ---------->>>>>

//class pair{
//    int adjacent;
//    int weight;
//    pair(int ad,int weight){
//        this.adjacent=ad;
//        this.weight=weight;
//    }
//}
//    public void topologicalUsingDfs(int start,boolean[]visited,Stack<Integer>sk,ArrayList<ArrayList<pair>> graph){
//        visited[start]=true;
//        for(pair e: graph.get(start)){
//            if(!visited[e.adjacent]){
//                topologicalUsingDfs(e.adjacent,visited,sk,graph);
//            }
//        }
//        sk.push(start);
//    }
//    public int[] shortestPath(int N,int M, int[][] edges) {
//        // Create graph------->>
//        ArrayList<ArrayList<pair>> graph = new ArrayList<>();
//        for(int i=0;i<N;i++){
//            graph.add(new ArrayList<>());
//        }
//        for(int i=0;i<M;i++){
//            graph.get(edges[i][0]).add(new pair(edges[i][1],edges[i][2]));
//        }
//
//        //
//        boolean[] visited=new boolean[N];
//        Stack<Integer> sk = new Stack<>();
//        for(int i=0;i<N;i++){
//            if(!visited[i]){
//                topologicalUsingDfs(i,visited,sk,graph);
//            }
//        }
//
//        int[] distance = new int[N];
//
//        for(int i=1;i<N;i++){
//            distance[i]=(int)1e9;    // ennetialy we put all distance large value it is only for gfg driver code compilation
//        }
//         distance[0]=0; // because source distance is 0
//
//        while(!sk.isEmpty()){
//            int a = sk.pop();
//            for(pair e: graph.get(a)){
//                if(distance[e.adjacent]>distance[a]+e.weight){
//                    distance[e.adjacent]=distance[a]+e.weight;
//                }
//            }
//        }
//        for(int i=0;i<N;i++){
//            if(distance[i]==1e9) distance[i]=-1;  // that means there we can't reach
//        }
//
//        return distance;
//
//    }
//}

               // Sorted Path in Undirected unit weighted Graph ------- Solved in  GFG ------>>>>>

// it is a weighted graph every edges have unit means 1 weight
                 // Time Complexity: O(V +2* E)  = O(V+E)
               // space complexity :O(V+2*E) = O(V+E)
//class Solution {
//
//    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
//        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
//        for(int i=0;i<n;i++){
//            graph.add(new ArrayList<Integer>());
//        }
//        for(int i=0;i<m;i++){
//            graph.get(edges[i][0]).add(edges[i][1]);
//            graph.get(edges[i][1]).add(edges[i][0]);  // undirected grapgh
//        }
//
//        Queue<Integer> qu = new LinkedList<>();
//        int[] distance = new int[n];
//        for(int i=0;i<n;i++) distance[i]=(int)1e9;
//        distance[src]=0;  // because source distance is 0
//        qu.add(src);
//        while(!qu.isEmpty()){
//            int a =qu.poll();
//            for(int e: graph.get(a)){
//                if(distance[a]+1<distance[e]){
//                    distance[e]=distance[a]+1;
//                    qu.add(e);
//                }
//            }
//        }
//
//        for(int i=0;i<n;i++){
//            if(distance[i]==1e9) distance[i]=-1;
//        }
//        return distance;
//
//    }
//}


         //  Dijkstra's Algorithm (Sortest path undirected graph) -------- Solved in GFG ----->>>>
                   // Dijkstra's Algorithm not work on negative weighted graph then this algorithm running infinite time
           // Dijkstra's time Complexity : O(V)*( ( log(heap size)+O(V)*log(heap size)) )  = O(E log V)
//class Solution{
//    static class pair{
//        int adjacent;
//        int dis;
//        pair(int a,int d){
//            this.adjacent=a;
//            this.dis=d;
//        }
//    }
//    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S){
//
//        int[] distance=new int[V];
//        for(int i=0;i<V;i++){
//            distance[i]=Integer.MAX_VALUE;
//        }
//        distance[S]=0;
//        PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->(a.dis-b.dis));
//        pq.add(new pair(S,0));  // because source distance is 0
//        while(!pq.isEmpty()){   // time:O(V)
//            pair p = pq.poll();  //time O(log (heap size))
//            for(ArrayList<Integer> e: adj.get(p.adjacent)){  // time O(V)
//                int a =e.get(0);
//                int b = e.get(1);
//                if(distance[p.adjacent]+b < distance[a]){
//                    distance[a]= distance[p.adjacent]+b;
//                    pq.add(new pair(a,distance[a]));    // time O(log (Heap size))
//                }
//            }
//        }
//
//        return distance;
//    }
//}



// Bellman Ford Algotithm(negative cycle detection)  ------- Solved ion GFG ---------->>>>>>>>
//  Time Complexity: O(V*E).
// Space: O(V).
//class Solution {
//    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {
//        // here source not given ---->>
//        int[] distance = new int[V];
//        for(int i=0;i<V;i++){
//            distance[i]=(int)1e8;  // because questions says put 1e8
//        }
//        distance[S]=0;
//
//        for(int i=0;i<V-1;i++){   //in this algorithm this loop run V-1 Times
//            for(int j=0;j<edges.size();j++){
//                int u = edges.get(j).get(0);
//                int v = edges.get(j).get(1);
//                int wt = edges.get(j).get(2);
//                if(distance[u]+wt < distance[v]){
//                    distance[v]=distance[u]+wt;
//                }
//            }
//        }
//
//        for(int i=0;i<edges.size();i++){
//            int u = edges.get(i).get(0);
//            int v = edges.get(i).get(1);
//            int wt = edges.get(i).get(2);
//            if(distance[u]+wt<distance[v]){  // if after all work if any distance can be change then there have negative cycle
//                int[] arr = new int[1];
//                arr[0]=-1;
//                return arr;
//            }
//        }
//
//        return distance;
//    }
//}


// Prim's Algorithm (Minimum spanning tree)
// minimum spanning tree where total N vertex and N-1 edges and edges weight minimum
               // Time Complexity: O(ElogV).
              // Auxiliary Space: O(V2)

//class Solution{
//    static class pair{
//        int v;
//        int edgeWeight;
//        pair(int v,int ew){
//            this.v=v;
//            this.edgeWeight=ew;
//        }
//    }
//    static int spanningTree(int V, int E, int edges[][]){
//        ArrayList<ArrayList<pair>> adj = new ArrayList<>();  // space O(V^2)
//        for(int i=0;i<V;i++){
//            adj.add(new ArrayList<>());
//        }
//        for(int i=0;i<E;i++){
//            int u = edges[i][0];
//            int v = edges[i][1];
//            int wt = edges[i][2];
//            adj.get(u).add(new pair(v,wt));
//            adj.get(v).add(new pair(u,wt));
//        }
//
//        boolean [] visited = new boolean[V];
//        int totalEdgeWeight=0;
//        PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->(a.edgeWeight-b.edgeWeight));
//        pq.add(new pair(0,0));   // we can start any node so we start 0 and edgeWeight=0
//        while(!pq.isEmpty()){  // time O(V)
//            pair p = pq.poll();    //time O(log heap size)
//            int a=p.v;
//            int b = p.edgeWeight;
//            if(visited[a]){
//                continue;
//            }
//            visited[a]=true;
//            totalEdgeWeight+=b;
//            for(pair e: adj.get(a)){    // time O(v)
//                if(!visited[e.v]){
//                    pq.add(new pair(e.v,e.edgeWeight));  // time O(log heap size)
//                }
//            }
//        }
//        return totalEdgeWeight;
//    }
//}



                  // Disjoint Set Union by Rank--- And Union by Size----
           //   Both time complexity O(4 alpha) which is constant near about 1

//import java.util.*;
//public class Graph {
//    static class disjointSet{
//        ArrayList<Integer> rank = new ArrayList<>();
//        ArrayList<Integer> parent = new ArrayList<>();
//        public disjointSet(int N) {
//            for (int i = 0; i <= N; i++) {    // it is work 0 based or 1 based indexing so i<=N
//                rank.add(0);  // every node rank as of now 0
//                parent.add(i);  // now every node parent is itself
//            }
//        }
//        public int  findUltimateParent(int node){
//            if(node==parent.get(node)){  // that means this time any particular node parent is itself it is the ultimate parent
//                return node;
//            }
//            int p = findUltimateParent(parent.get(node));
//            parent.set(node,p);
//            return p;
//        }
//        public void unionByRank(int u,int v){   // unionByRank ---------------->>>>
//           int ultimate_parentOf_u= findUltimateParent(u);
//           int ultimate_parentOf_v = findUltimateParent(v);
//           if ( ultimate_parentOf_u==ultimate_parentOf_v) return;
//           if (rank.get(ultimate_parentOf_u)<rank.get(ultimate_parentOf_v)){
//               parent.set(ultimate_parentOf_u,ultimate_parentOf_v);
//           }else if(rank.get(ultimate_parentOf_u)>rank.get(ultimate_parentOf_v)){
//               parent.set(ultimate_parentOf_v,ultimate_parentOf_u);
//           }else {
//               parent.set(ultimate_parentOf_v,ultimate_parentOf_u);  // if two parent rank is same then any of each link any other
//               int increase = ultimate_parentOf_u+1;
//               rank.set(ultimate_parentOf_u,increase);
//           }
//         }
//
//
//    }
//    public static void main(String[] args) {
//          disjointSet ds = new disjointSet(5);
//          ds.unionByRank(3,5);
//          ds.unionByRank(2,4);
//          ds.unionByRank(3,2);
//          if (ds.findUltimateParent(5)== ds.findUltimateParent(4)){
//              System.out.println("Same graph");
//          }else {
//              System.out.println("Unconnected component");
//          }
//    }
//}


//import java.util.*;
//public class Graph {
//    static class disjointSet{
//        ArrayList<Integer> size = new ArrayList<>();
//        ArrayList<Integer> parent = new ArrayList<>();
//        public disjointSet(int N) {
//            for (int i = 0; i <= N; i++) {    // it is work 0 based or 1 based indexing so i<=N
//                size.add(1);  // every node rank as of now 0
//                parent.add(i);  // now every node parent is itself
//            }
//        }
//        public int  findUltimateParent(int node){
//            if(node==parent.get(node)){  // that means this time any particular node parent is itself it is the ultimate parent
//                return node;
//            }
//            int p = findUltimateParent(parent.get(node));
//            parent.set(node,p);
//            return p;
//        }
//        public void unionBySize(int u,int v){   // unionBy Size   ---------------->>>>
//            int ultimate_parentOf_u= findUltimateParent(u);
//            int ultimate_parentOf_v = findUltimateParent(v);
//            if ( ultimate_parentOf_u==ultimate_parentOf_v) return;    // because two node are already union or join so why i am join again
//            if(size.get(ultimate_parentOf_u) < size.get(ultimate_parentOf_v)){
//                   parent.set(ultimate_parentOf_u,ultimate_parentOf_v);
//                   size.set(ultimate_parentOf_v,size.get(ultimate_parentOf_u)+size.get(ultimate_parentOf_v));
//            }
//            else if (size.get(ultimate_parentOf_u) > size.get(ultimate_parentOf_v)){
//                parent.set(ultimate_parentOf_v,ultimate_parentOf_u);
//                size.set(ultimate_parentOf_u,size.get(ultimate_parentOf_u)+size.get(ultimate_parentOf_v));
//            }else {
//                parent.set(ultimate_parentOf_v,ultimate_parentOf_u);
//                size.set(ultimate_parentOf_u,size.get(ultimate_parentOf_u)+size.get(ultimate_parentOf_v));
//            }
//        }
//
//
//    }
//    public static void main(String[] args) {
//        disjointSet ds = new disjointSet(5);
//        ds.unionBySize(3,5);
//        ds.unionBySize(2,4);
//        ds.unionBySize(3,2);
//        if (ds.findUltimateParent(5)== ds.findUltimateParent(2)){
//            System.out.println("Same graph");
//        }else {
//            System.out.println("Unconnected component");
//        }
//    }
//}


     //  Kruskal's Algorithm (Minimum Spanning Tree) ---------->>>
                     // Time complexity :O(ElogE);
                   // Space Complexity :O(V)
//class Solution{
//
//    static class disjointSet{
//        ArrayList<Integer> size = new ArrayList<>();
//        ArrayList<Integer> parent = new ArrayList<>();
//        disjointSet(int N){
//            for(int i=0;i<N;i++){
//                size.add(1);
//                parent.add(i);
//            }
//        }
//
//        public int findUltParent(int node){
//            if(node==parent.get(node)){
//                return node;
//            }
//            int p =findUltParent(parent.get(node));
//            parent.set(node,p);
//            return p;
//        }
//
//        public void unionBySize(int u,int v){
//            int ult_p_of_u=findUltParent(u);
//            int ult_p_of_v=findUltParent(v);
//            if(ult_p_of_u==ult_p_of_v) return;
//            else if(size.get(ult_p_of_u) < size.get(ult_p_of_v)){
//                parent.set(ult_p_of_u , ult_p_of_v);
//                size.set(ult_p_of_v , size.get(ult_p_of_v)+size.get(ult_p_of_u));
//            }
//            else if(size.get(ult_p_of_u) > size.get(ult_p_of_v)){
//                parent.set(ult_p_of_v , ult_p_of_u);
//                size.set(ult_p_of_u , size.get(ult_p_of_u)+size.get(ult_p_of_v));
//            }
//            else {
//                parent.set(ult_p_of_v , ult_p_of_u);
//                size.set(ult_p_of_u , size.get(ult_p_of_u)+size.get(ult_p_of_v));
//            }
//        }
//    }
//
//
//    static class pair{
//        int u;
//        int v;
//        int edgeWeight;
//        pair(int u,int v,int wt){
//            this.u=u;
//            this.v=v;
//            this.edgeWeight=wt;
//        }
//    }
//    static int spanningTree(int V, int E, int edges[][]){
//        ArrayList<pair> al = new ArrayList<>();  // space O(V)
//        for(int i=0;i<E;i++){     // time O(E)
//            int u = edges[i][0];
//            int v = edges[i][1];
//            int wt = edges[i][2];
//            al.add(new pair(u,v,wt));
//        }
//        Collections.sort(al,(a,b)->(a.edgeWeight-b.edgeWeight));  // time O(ElogE)
//
//        disjointSet ds = new disjointSet(V);
//        int edgeSum = 0;
//
//        for(int i=0;i<al.size();i++){  // O(E)
//            int a = al.get(i).u;
//            int b = al.get(i).v;
//            int wt = al.get(i).edgeWeight;
//
//            if(ds.findUltParent(a)!=ds.findUltParent(b)) {  // it means two node are not component of the graph
//                edgeSum+=wt;
//                ds.unionBySize(a,b);
//            }
//        }
//
//        return edgeSum;
//    }
//}


//  Kossaraju's Algorithm (Strongly Connected Components)------------>>>
           // Total Time Complexity : O(V+E)
          // Total Space Complexity : O(V+E)
//class Solution{
//
//    public void dfs(int src,boolean[] vis,Stack<Integer> st,ArrayList<ArrayList<Integer>> adj){
//        vis[src]=true;
//        for(int e: adj.get(src)){
//            if(!vis[e]){
//                dfs(e,vis,st,adj);
//            }
//        }
//        st.push(src);
//    }
//
//    public void dfs2(int src,boolean[] visited,ArrayList<ArrayList<Integer>> reverseGraph){
//        visited[src]=true;
//        for(int e: reverseGraph.get(src)){
//            if(!visited[e]){
//                dfs2(e,visited,reverseGraph);
//            }
//        }
//    }
//    //Function to find number of strongly connected components in the graph.
//    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj){
//        boolean[] visited = new boolean[V];  // Space O(V)
//        Stack<Integer> st = new Stack<>();   // Space O(V)
//        for(int i=0;i<V;i++){   // time:O(V)+O(V+E)
//            if(!visited[i]){
//                dfs(i,visited,st,adj);
//            }
//        }
//
//        ArrayList<ArrayList<Integer>> reverseGraph = new ArrayList<>();  // Space : O(V+E)
//        for(int i=0;i<V;i++){   // time O(V)
//            reverseGraph.add(new ArrayList<>());
//        }
//        for(int i=0;i<V;i++){    // timeO(V+E)
//            for(int e: adj.get(i)){
//                reverseGraph.get(e).add(i);
//            }
//        }
//
//        visited = new boolean[V];
//        int stronglyConnectedComponent =0;
//        while(!st.isEmpty()){   // time:O(V)+O(V+E)
//            int a= st.pop();
//            if(!visited[a]){
//                stronglyConnectedComponent++;
//                dfs2(a,visited,reverseGraph);
//            }
//        }
//
//        return stronglyConnectedComponent;
//    }
//}



//  1192. Critical Connections in a Network   OR  Bridges in a Graph------->>> leetcode

// Time ComplexiTy :O(V+2*E)
// Space Complexity :O(V)
//class Solution {
//    int step = 1;
//    public void dfs(int src,int parent,boolean[]visited, ArrayList<ArrayList<Integer>> graph ,           List<List<Integer>> ans,int[] everySteps,int[] lowSteps){
//        visited[src]=true;
//        everySteps[src] = lowSteps[src] = step;
//        step++;
//        for(int e: graph.get(src)){
//            if(e==parent) continue;
//            if(!visited[e]){
//                dfs(e,src,visited,graph,ans,everySteps,lowSteps);
//                lowSteps[src] = Math.min(lowSteps[src],lowSteps[e]);
//                if(lowSteps[e]> everySteps[src]){
//                    ans.add(Arrays.asList(src,e));
//                }
//            }else{          // means it is alredy visited vertyex but not parent
//                lowSteps[src]=Math.min(lowSteps[src],lowSteps[e]);
//            }
//        }
//    }
//
//    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
//
//        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
//        for(int i=0;i<n;i++){
//            graph.add(new ArrayList<>());
//        }
//        for(int i=0;i<connections.size();i++){
//            int x = connections.get(i).get(0);
//            int y = connections.get(i).get(1);
//            graph.get(x).add(y);
//            graph.get(y).add(x);
//        }
//
//        List<List<Integer>> bridges = new ArrayList<>();
//        boolean[] visited = new boolean[n];
//        int[] everySteps = new int[n];
//        int[] lowSteps = new int[n];
//        dfs(0,-1,visited,graph,bridges,everySteps,lowSteps);   // we assume graph not contains unconnected component
//
//        return bridges;
//    }
//}



        // Articular Point in a Graph ------- Solved in GFG ------------>>>>>>>>
               // Time Complexity as usual a dfs traversal :O(V+2E)
              // Space Complexity :O(V)
//class Solution
//{
//    int time=1;
//    int child=0;
//    public void dfs(int src, int parent,boolean[] visited, int[] everyStep, int[] lowstep,  int[] mark
//            ,ArrayList<ArrayList<Integer>> adj){
//        visited[src]=true;
//        everyStep[src] = lowstep[src] = time;
//        time++;
//        int child=0;
//        for(int e: adj.get(src)){
//            if(e==parent) continue;
//            else if(!visited[e]){
//                dfs(e,src,visited,everyStep,lowstep,mark,adj);
//                child++;
//                lowstep[src]=Math.min(lowstep[src],lowstep[e]);
//                if(lowstep[e]>=everyStep[src] &&parent !=-1){
//                    mark[src]=1;
//                }
//
//            }else{
//                lowstep[src]=Math.min(lowstep[src],everyStep[e]);
//            }
//        }
//        if(child>1&&parent==-1){
//            mark[src]=1;
//        }
//
//    }
//
//    public ArrayList<Integer> articulationPoints(int V,ArrayList<ArrayList<Integer>> adj)
//    {
//
//        ArrayList<Integer> ans =new ArrayList<>();
//        boolean[] visited = new boolean[V];
//        int[] everyStep = new int[V];
//        int[] lowstep = new int[V];
//        int[] mark = new int[V];
//        dfs(0,-1,visited,everyStep,lowstep,mark,adj);   //because Given an undirected connected graph
//        for(int i=0;i<V;i++){
//            if(mark[i]==1){
//                ans.add(i);
//            }
//        }
//        if(ans.size()==0) {  // means no articular point
//            ans.add(-1);
//            return ans;
//        }else{
//            return ans;
//        }
//
//    }
//}







