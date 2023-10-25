



//     //  Comparator and Comparable(Collection inbuild method)  ---->>
//
//
//      import java.util.*;
//        class nums{
//            int min;
//            int max;
//            public nums(int min,int max){
//                this.min=min;
//                this.max=max;
//            }
//
//            @Override
//            public String toString() {
//              return min+" "+max;
//            }
//        }
//      public class JavaCourseGreedyAlgo {
//
//          public static void main(String[] args) {
//              List<nums> lst = new ArrayList<>();
//              lst.add(new nums(25, 3));
//              lst.add(new nums(485, 36));
//              lst.add(new nums(12, 42));
//
//              Comparator<nums> cc = new Comparator<nums>() {
//                  @Override
//                  public int compare(nums o1, nums o2) {
//                      if (o1.min > o2.min) {
//                          return 1;   // 1 means swap
//                      } else {
//                          return -1;   // -1 means no swap
//                      }
//                  }
//              };
//
//              Comparator<nums> cm = (o1,  o2) -> (o1.min > o2.min)?1: -1;   // ? means if  and   : means else
//
//    // if o1.min-o2.min  value we get positive then swap is negative then no swap if 0 then any of them consider
//              Comparator<nums> cmmm = (o1,  o2) -> (o1.min-o2.min);
//              Collections.sort(lst,cmmm);
//              System.out.println(lst);
//
//              Comparator<nums> cmm = (o1,  o2) -> {
//                  if (o1.min > o2.min) {
//                      return 1;   // 1 means swap
//                  } else {
//                      return -1;   // -1 means no swap
//                  }
//              };
//
//              Collections.sort(lst,(o1,  o2) -> {
//                  if (o1.min > o2.min) {
//                      return 1;
//                  } else {
//                      return -1;
//                  }
//              });
//              Collections.sort(lst,cm);
//              System.out.println(lst);
//
//          }
//
//}






                  // Fractional Knapsack --------->>.
   // time complexity: O(n logn) + O(n) = o(n logn)  //   because now  O(nlogn) is bigger than O(n) and we consider bigger complexity

//      import java.util.*;
//      class weight_profit{
//    int weight;
//    int profit;
//    public weight_profit(int weight,int profit){
//        this.weight=weight;
//        this.profit=profit;
//    }
//      }
//      public class JavaCousrseMergeAndQuickSort {
//          public static double FractionalKnapsack(weight_profit[] arr,int capacity){
//           // sort profit/weight base   decrease order --->
////              Arrays.sort(arr,(a,b)->{         // comparator is a functional interface so we can use lamda expression
////                  if (a.profit/a.weight<b.profit/b.weight){
////                      return 1;
////                  }else {
////                      return -1;
////                  }
////              });
//
//              Arrays.sort(arr,new Comparator<weight_profit>(){   // O(n logn)
//                  @Override
//                  public int compare(weight_profit o1, weight_profit o2) {
//                       if ((o1.profit/o1.weight)<(o2.profit/o2.weight)){
//                           return 1;
//                       }else {
//                           return -1;
//                       }
//                  }
//              });
//              double totalMaxProfit=0;
//              for (weight_profit e: arr){    // O(n)
//                  int curr_weight= e.weight;
//                  int cur_profit=e.profit;
//                  if (capacity-curr_weight>=0){
//                      capacity=capacity-curr_weight;
//                      totalMaxProfit+=cur_profit;
//                  }else {
//                       double possibleWeight = (double) capacity/(double)curr_weight;   // because  int/int = int  and we need double
//                       totalMaxProfit+=possibleWeight*cur_profit;
//                       break;
//                  }
//              }
//              return totalMaxProfit;
//          }
//          public static void main(String[] args) {
//              weight_profit e1 =new weight_profit(5,25);
//              weight_profit e2 =new weight_profit(10,75);
//              weight_profit e3 =new weight_profit(12,100);
//              weight_profit e4 =new weight_profit(4,50);
//              weight_profit e5 =new weight_profit(7,45);
//              weight_profit e6 =new weight_profit(9,90);
//              weight_profit e7 =new weight_profit(3,30);
//
//             weight_profit[] arr = {e1,e2,e3,e4,e5,e6,e7};
//             int capacity = 37;
//
//             double ans = FractionalKnapsack(arr,capacity);
//              System.out.println(ans);
//
//
//          }
//}



                       // Job Scheduling problem ---------->>
          // Time Complexity : O(n logn) + On^2)  = O(n^2)  //   because  O(n^2) is bigger than O(n logn) and we consider bigger complexity

//import java.util.*;
//public class JavaCourseGreedyAlgo {
//   static class job{
//        int jobId;
//        int deadLine;
//        int profit;
//        public job(int id,int deadline,int profit){
//            this.jobId=id;
//            this.deadLine=deadline;
//            this.profit=profit;
//        }
//    }
//    public static void MaxProfit(ArrayList<job> aa,int maxDeadLine){
//        // sort profit bases decreasing order
//       Collections.sort(aa,(o1,o2)->(o1.profit<o2.profit)? 1 : -1);   // O(n logn)
//       int[] idArr=new int[maxDeadLine];     //ex- if max deadline 7 so array last index will be 6
//       boolean[] used=new boolean[maxDeadLine];    //  by default all used array element are false
//        int totalJob=0;
//        int totalprofit=0;
//        for (int i=0;i<aa.size();i++){      //  O(n^2)
//            for (int j=aa.get(i).deadLine-1; j>=0;j--){
//                if (used[j]==false){     // that means that day we not book any job
//                    idArr[j]=aa.get(i).jobId;
//                    totalprofit+=aa.get(i).profit;
//                    totalJob++;
//                    used[j]=true;
//                    break;
//                }
//            }
//        }
//
//        System.out.println("Jobs book  "+Arrays.toString(idArr));
//        System.out.println("Total Profit  "+totalprofit);
//        System.out.println("Total jon "+totalJob);
//
//    }
//    public static void main(String[] args) {
//        ArrayList<job> al = new ArrayList<>();   // or i can use array also
//        al.add(new job(1,5,55));
//        al.add(new job(2,2,65));
//        al.add(new job(3,7,75));
//        al.add(new job(4,3,60));
//        al.add(new job(5,2,70));
//        al.add(new job(6,1,50));
//        al.add(new job(7,4,85));
//        al.add(new job(8,5,68));
//        al.add(new job(9,3,45));
//
//        MaxProfit(al,7);  // because max deadline 7
//
//
//    }
//}



             // Merge intervals   --------------->>>>>>>>
       // Time Complexity: O(n logn) + O(n) = O(nlogn)
        // Space Complexity : O(n)

//import java.util.*;
//public class JavaCourseGreedyAlgo {
//    public static int[][] merge(int[][] intervals) {
//        List<int[]> ll = new ArrayList<>();
//        if(intervals.length==0){
//            return new int[0][];
//        }
//
//      //  Collections.sort(ll,(o1,o2)->(o1[0]>o2[0])? 1 : -1);
//                  // or
//        Collections.sort(ll,(o1,o2)->(o1[0]-o2[0]));   // O(n logn)
//        int start=intervals[0][0];
//        int end = intervals[0][1];
//        for(int[] e: intervals){           // O(n)
//            if(e[0]<=end){
//                end=Math.max(end,e[1]);
//            }else{
//                ll.add(new int[]{start,end});
//                start=e[0];
//                end=e[1];
//            }
//        }
//        ll.add(new int[]{start,end});
//        return ll.toArray(new int[ll.size()][]);
//    }
//
//    public static void main(String[] args) {
//        int[][] inter = {{1,4},{2,3},{5,8},{8,9},{10,15}};
//        int[][] ans=merge(inter);
//        for (int[] e: ans){
//            for (int ee: e){
//                System.out.print(ee+" ");
//            }
//            System.out.println();
//        }
//    }
//}


               //  Lemonade  change ---->   Solved in leetcode  ---------->>

//class Solution {
//    public boolean lemonadeChange(int[] bills) {
//        int five=0;
//        int ten=0;
//        int twenty=0;
//        for(int e: bills){
//            if(e==5){
//                five++;
//            }else if(e==10){
//                if(five==0){
//                    return false;
//                }else{
//                    five--;
//                    ten++;
//                }
//            }else if(e==20){
//                if(five>0 && ten>0){
//                    five--;
//                    ten--;
//                    twenty++;
//                }
//                else if(five>=3){
//                    five-=3;
//                    twenty++;
//                }else{
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//}



           //  Boats to save People --->> Solved in leetcode ------>>

//class Solution {
//    public int numRescueBoats(int[] people, int limit) {
//        Arrays.sort(people);  // now less weight people in front and heavy weight people present in last.
//        int lowWeight=0;
//        int heavyWeight=people.length-1;
//        int boat=0;
//
//        while(lowWeight<=heavyWeight){
//            if( people[lowWeight]+people[heavyWeight]>limit){
//                heavyWeight--;
//            }else if( people[lowWeight]+people[heavyWeight] <=limit){
//                lowWeight++;
//                heavyWeight--;
//            }
//            boat++;
//        }
//
//        return boat;
//    }
//}


              //  Bag of Tokens --------> Solved in leetcode -------->>

//class Solution {
//    public int bagOfTokensScore(int[] tokens, int power) {
//        Arrays.sort(tokens);
//        int lowIdx=0;
//        int highIdx=tokens.length-1;
//        int score=0;
//
//        int maxScore=0;
//        while(lowIdx<=highIdx){
//            if(power>=tokens[lowIdx]){
//                power-=tokens[lowIdx];
//                score++;
//                lowIdx++;
//                maxScore=Math.max(score,maxScore);
//            }else if(score>=1){
//                score--;
//                power+=tokens[highIdx];
//                highIdx--;
//
//            }else{
//                break;
//            }
//        }
//        return maxScore;
//    }
//}



               //  Min Swap to balance brackets    ----  Solved in leetcode--------->>

//class Solution {
//    public int minSwaps(String s) {
//
//        int close=0;
//        int maxClose=0;
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)=='['){
//                close-=1;
//            }else{
//                close+=1;
//                maxClose=Math.max(close,maxClose);
//            }
//        }
//        int ans = (maxClose+1)/2;
//        return ans;
//    }
//}



                 //  Majority  Element -------->>


//class Solution {
//    public int majorityElement(int[] nums) {
//        int majorityEle = nums[0];    //  we assume that our majorityEle is first element
//        int majorityEleCount=1;
//        for(int i=1;i<nums.length;i++){
//            if(nums[i]==majorityEle){
//                majorityEleCount++;
//            }else{
//                majorityEleCount--;
//                if(majorityEleCount==0){
//                    majorityEle = nums[i];
//                    majorityEleCount = 1;
//                }
//            }
//        }
//        return majorityEle;
//    }
//}


                 // Candy Distribution --------->>  solved in leetcode

//class Solution {
//    public int candy(int[] ratings) {
//        int[] candy = new int[ratings.length];
//        for(int i=0;i<ratings.length;i++){
//            candy[i]=1;
//        }
//
//        for(int i=1;i<ratings.length;i++){
//            if(ratings[i]>ratings[i-1]){
//                candy[i]=candy[i-1]+1;
//            }
//        }
//
//        for(int i=ratings.length-2;i>=0;i--){
//            if(ratings[i]>ratings[i+1] && candy[i]<candy[i+1]+1){
//                candy[i]=candy[i+1]+1;
//            }
//        }
//
//        int totalCandy=0;
//        for(int i=0;i<candy.length;i++){
//            totalCandy+=candy[i];
//        }
//        return totalCandy;
//    }
//}



             //   Gas station completion circular route --> Solved in leetcode --------->>>

//class Solution {
//    public int canCompleteCircuit(int[] gas, int[] cost) {
//        int totalGas=0, totalCost=0;
//        for(int i=0;i<gas.length;i++){
//            totalGas+=gas[i];
//            totalCost+=cost[i];   // because cost and gas two are equal size array
//        }
//        if(totalCost>totalGas){
//            return -1;   // because if total cost <=total gas then we complete route else not
//        }
//
//        int fuel=0;
//        int startIdx=0;
//        for(int i=0;i<gas.length;i++){
//            fuel+=gas[i]-cost[i];
//            if(fuel<0){
//                startIdx=i+1;
//                fuel=0;
//            }
//        }
//        return startIdx;
//    }
//}




                              // ASSIGNMENT  ----------->>

// problem -1.  Task is to find the minimum sum of products of two arrays of the same size given that k modifications are allowed
 //             on first array,in each modification one array element of the first array can either increase or decrease by 2.

//public class JavaCourseGreedyAlgo {
//    public static void main(String[] args) {
//        int[] a = {1,2,-3};
//        int[] b = {-2,3,-5};
//        int k =5;
//
//        int diff =0;
//        int tempProduct=0;
//        int res=0;
//        for(int i=0;i<a.length;i++){
//            int product =a[i]*b[i];
//            res+=product;
//            if(product<0 && b[i]<0){    //product<0  it means negative value
//                tempProduct=  ( a[i]+k*2)*b[i];
//            }
//            else if (product<0 && a[i]<0){
//                tempProduct= (a[i]-k*2)*b[i];
//            }
//            else if (product>0 && a[i]<0) {  // product>0 it means positive value
//                tempProduct = (a[i]+k*2)*b[i];      // when product>0 then either or a[i]<0 and b[i]<0
//            }
//            else if (product>0 && a[i]>0){
//                tempProduct =  (a[i]-k*2)*b[i];       // when product>0 then neither nor a[i]>0 and b[i]>0
//            }
//
//            int d = Math.abs(product-tempProduct);
//            if (d>diff){
//                diff=d;
//            }
//         }
//        System.out.println(res-diff);
//
//    }
//}


            // problem-2. You are given n activities with their start and finish times.
        // Select the maximum number of activities that can be performed by a single person,
          // assuming that a person can only work on a single activity at the activity duration.


//import java.util.Arrays;
//import java.util.Comparator;
//
//public class JavaCourseGreedyAlgo {
//   static class activity{
//        int start;
//        int finish;
//        public activity(int s,int f){
//            this.start=s;
//            this.finish=f;
//        }
//    }
//    public static void maxActivity(activity[]ar){
//        // at first sort them according their finish order
//
//        Arrays.sort(ar, new Comparator<activity>() {
//            @Override
//            public int compare(activity o1, activity o2) {
//                if(o1.finish>o2.finish){
//                    return 1;
//                }else {
//                    return -1;
//                }
//            }
//        } );
//
//        int count=1;     // because first activity always count after sort.
//        System.out.print("activity index :"+0+", ");
//        for (int i=0;i<ar.length-1;i++){
//            if (ar[i].finish<ar[i+1].start){
//                count++;
//                System.out.print ("activity index :"+i+", ");
//            }
//        }
//        System.out.println();
//        System.out.println("max activity :"+count);
//    }
//    public static void main(String[] args) {
////        activity o1= new activity(1,3);
////        activity o2= new activity(1,2);
////        activity o3= new activity(4,5);
////        activity o4= new activity(5,6);
//
//      activity[] arr ={new activity(1,3),new activity(1,2),new activity(4,5),new activity(5,6)};
//        maxActivity(arr);
//
//    }
//}



          // problem -4. can Place flower ---> Solved in leetcode --------->>

//class Solution {
//    public boolean canPlaceFlowers(int[] flowerbed, int n) {
//        if(n==0){
//            return true;
//        }
//        for(int i=0;i<flowerbed.length;i++){    // n flower number
//            if(flowerbed[i]==0){
//                if((i==0 || flowerbed[i-1]==0) && (i==flowerbed.length-1 || flowerbed[i+1]==0)){
//                    flowerbed[i]=1;
//                    n--;
//                }
//            }
//        }
//
//        if(n>0){
//            return false;
//        }else{
//            return true;
//        }
//
//    }
//}


      // Solved in leetcode ------>>>
         // Problem-5. Given an array of intervals intervals where intervals[i] = [starti, endi],
// return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.


//class Solution {
//    public int eraseOverlapIntervals(int[][] intervals) {
//        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
//        int start = intervals[0][0];
//        int end = intervals[0][1];
//        int count=0;
//        for(int i=1;i<intervals.length;i++){
//            if(intervals[i][0]<end){
//                end=Math.min(end,intervals[i][1]);
//                count++;
//            }else{
//                start=intervals[i][0];
//                end= intervals[i][1];
//            }
//        }
//        return count;
//    }
//}



                     // Two city Scheduling -- Solved in leetcode ---------->>

//class Solution {
//    public int twoCitySchedCost(int[][] costs) {
//        // Sort before costs[0][0]-costs[0][1] order if it negative that means their b cost high than a then it's position from first
//
//        Arrays.sort( costs,(a,b)->(a[0]-a[1])>(b[0]-b[1])?1: -1 );
//        int totalCost=0;
//
//        for(int i=0;i<costs.length/2;i++){
//            totalCost+=costs[i][0];
//        }
//        for(int i = costs.length/2;i<costs.length;i++){
//            totalCost+=costs[i][1];
//        }
//
//        return totalCost;
//
//    }
//}