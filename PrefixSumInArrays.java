

//            // Prefix Sum In 2D Array   Brute force Approach ----->>>>
//
//
//
//import java.util.*;
//public class PrefixSumInArrays {
//
//    public static void prefixSum(int[][] arr,int r1,int c1,int r2,int c2){
//        int sum=0;
//        for (int i=r1;i<=r2;i++){
//            for (int j=c1;j<=c2;j++){
//                sum+=arr[i][j];
//            }
//        }
//        System.out.println("sum of this elements :"+sum);
//  }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter The Row Number");
//        int n =sc.nextInt();
//        System.out.println("Enter The Column Number");
//        int m = sc.nextInt();
//
//        int[][] arr= new int[n][m];
//
//        System.out.println("Enter The Array Elements");
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//
//                    arr[i][j]=sc.nextInt();
//            }
//        }
//
//        System.out.println("Enter r1");
//        int r1 = sc.nextInt();
//        System.out.println("Enter c1");
//        int c1 = sc.nextInt();
//        System.out.println("Enter r2");
//        int r2 = sc.nextInt();
//        System.out.println("Enter c2");
//        int c2 = sc.nextInt();
//
//        prefixSum(arr,r1,c1,r2,c2);
//
//
//
//        // Time Complexity : O(m*n)
//        // Space Complexity : O(1);
//
//
//    }
//}














//                   // Prefix Sum of 1D Array
//
//
//public class PrefixSumInArrays {
//    public static void main(String[] args) {
//
//        int [] arr={2,5,3,6,8,4,9};
//
//        for (int i=1;i<arr.length;i++){  // this loop time complexcity: n
//            arr[i]=arr[i]+arr[i-1];
//        }
//        for (int i=0;i<arr.length;i++){      // and this loop time complexcity: n
//            System.out.print(arr[i]+" ");
//        }
//
//        // so total time complexity of this code : n+n=2n = n  = O(n)
//    }
//}












//            // Prefix Sum of 2D Array Good and Optimize Code    bellow this code one more optimize code present
//
//
//
//
//import java.util.Scanner;
//
//public class PrefixSumInArrays {
//
//    public static void sumofRows(int[][] arra){
//        for (int i=0;i<arra.length;i++){
//            for (int j=1;j<arra[0].length;j++){
//                      arra[i][j]+=arra[i][j-1];
//            }
//        }
//    }
//
//    public static void sumofColumns(int[][] arr){
//        for (int i=0;i<arr[0].length;i++){
//            for (int j=1;j<arr.length;j++){
//                arr[j][i]+=arr[j-1][i];
//            }
//        }
//    }
//
//    public static void OriginalPrefixSum(int[][]ar,int r1,int c1,int r2,int c2){
//        int sum=0 , up =0, left=0, Repeat_Region=0;
//        up=ar[r1-1][c2];
//        left=ar[r2][c1-1];
//        Repeat_Region=ar[r1-1][c1-1];
//        sum=ar[r2][c2]-up-left+Repeat_Region;
//        System.out.println("The Prefix Sum is :"+sum);
//    }
//
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Row of The Array");
//        int n = sc.nextInt();
//        System.out.println("Enter Column of The Array");
//        int m = sc.nextInt();
//
//        int[][] arr = new int[n][m];
//
//        System.out.println("Enter Array Elements : ");
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }
//
//
//
//        System.out.println("Enter r1");
//        int r1=sc.nextInt();
//        System.out.println("Enter c1");
//        int c1=sc.nextInt();
//        System.out.println("Enter r2");
//        int r2 =sc.nextInt();
//        System.out.println("Enter c2");
//        int c2=sc.nextInt();
//
//
//
//        sumofRows(arr);
//        sumofColumns(arr);
//        OriginalPrefixSum(arr,r1,c1,r2,c2);
//
//             // Time complexity Of This Code : O(m*n)
//               // Space Complexity of This code: O(1)
//
//       // It's Time Complexity is O(m*n) and the Brute Froce Process complexity is same
//    // But still it is optimize because here Totalsum is happen one time but PrefixSum is a
//      // constant task that do one two operation So it is not a Queries dependent
//
//    }
//}

                                  // OR --------->>>>

                     // Prefix Sum of 2D Array Good and Optimize Code



import java.util.Scanner;
public class PrefixSumInArrays {

    public static void sumOfRows(int[][]arr){
        for (int i=0;i<arr.length;i++){
            for (int j=1;j<arr.length;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
    }

    public static void sumOfColumns(int[][]arr){

        for (int i=0;i<arr[0].length;i++){
            for (int j=1;j<arr.length;j++){
                arr[j][i]+=arr[j-1][i];
            }
        }
    }

    public static void prefixSum(int[][]arr,int r1,int c1,int r2,int c2){
        int up=0,left=0,right=0,sum=0;
        up=arr[r1-1][c1-1];
        left=arr[r2][c1-1];
        right=arr[r1-1][c2];
        sum=arr[r2][c2]-left-right+up;
        System.out.println(sum);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size ");
        int n = sc.nextInt();
        System.out.println("Enter the column size");
        int m = sc.nextInt();

       int[][] arr=new int[n+1][m+1];

        System.out.println("Enter array elements ");
       for (int i=1;i<=n;i++){    // start 1 row and 1 column because when r1-1 = 0-1 = -1 and so on for r2,c1,c2 that is create exception
           for (int j=1;j<=m;j++){
               arr[i][j]=sc.nextInt();
           }
       }


       for (int a[]: arr){
           for (int ele: a){
               System.out.print(ele+" ");
           }
           System.out.println();
       }




        System.out.println("Enter r1");
        int r1=sc.nextInt();
        System.out.println("Enter c1");
        int c1=sc.nextInt();
        System.out.println("Enter r2");
        int r2 =sc.nextInt();
        System.out.println("Enter c2");
        int c2=sc.nextInt();

        sumOfRows(arr);
       sumOfColumns(arr);

       prefixSum(arr,r1,c1,r2,c2);


    }
}












