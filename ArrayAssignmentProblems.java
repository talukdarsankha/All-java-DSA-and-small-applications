
//public class ArrayAssignmentProblems {
//
//    public static void main(String[] args) {
//
//     // Qu-1: Write a Program to print the sum of all The elements present on even indices in the given array
//
//           // ex-1
//        int[] arr1={3,20,4,6,9};
//        int sum=0;
//        for (int i=0;i<arr1.length;i++){
//            if (i%2==0){
//               sum+= arr1[i];
//            }
//        }
//        System.out.println("The sum of all The elements present on even indices is :"+sum );
//
//               //  ex-2
//        int[] arr2={4,3,6,7,1};
//        int sum2=0;
//        for (int i=0;i<arr2.length;i++){
//            if (i%2==0){
//                sum2+= arr2[i];
//            }
//        }
//        System.out.println("The sum of all The elements present on even indices is :"+sum2 );

//
//    }
//}
//
//               // Or
//     // Qu-1: Write a Program to print the sum of all The elements present on even indices in the given array
//
//
//public class ArrayAssignmentProblems{
//    public static void main(String[] args) {
//
//        int[] arr1={3,20,4,6,9};
//        int sum=0;
//        int i=0;
//        while (i<arr1.length){
//            sum+=arr1[i];
//            i=i+2;
//        }
//
//        System.out.println("sum of all The elements present on even indices in the given array is :"+sum);
//    }
//}









// public class ArrayAssignmentProblems {
//    public static void main(String[] args) {
//
//
//        // Qu-2 : write a program to traverse over the elements of the array using for each loop and print all even elements
//
//
//              // ex-1
//        int[] arr={34,21,54,65,43};
//        for (int e: arr){
//            if (e%2==0){
//                System.out.println("The even element is :"+e);
//            }
//        }
//
//
//                 // ex-2
//
//        int[] arr2 ={4,3,6,7,1};
//        for (int ele: arr2){
//            if (ele%2==0){
//                System.out.println("The even element is :"+ele);
//            }
//        }
//
//    }
// }










//  public class ArrayAssignmentProblems {
//    public static void main(String[] args) {
//
//
//        // Qu-3  Write a Program to calculate the Maximum element in the Array
//
//
//        int [] arr={34,21,54,65,43};
//        int max=Integer.MIN_VALUE;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println("The maximum Value Element in The Array :"+max);
//         }
// }







// public class ArrayAssignmentProblems {
//    public static void main(String[] args) {
//
//
//             // Qu-4  Write a Program to calculate the Minimum element in the Array
//
//
//        int [] arr={34,21,54,65,43};
//        int mini=Integer.MAX_VALUE;
//        for (int e: arr){
//            if (e<mini){
//               mini=e;
//            }
//        }
//        System.out.println("The Minimum Element in This Array is :"+mini);
//
//    }
// }

















//                     // Qu-5 Write a program to Find The second Largest element in a given array
//
//
//
//public class ArrayAssignmentProblems {
//
//    public static int findMax(int[]arr){
//        int max=Integer.MIN_VALUE;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]>max){
//                max=arr[i];
//            }
//        }
//        return max;
//    }
//
//    public static void secondMax(int[] arr) {
//        int mx = findMax(arr);
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == mx) {
//                arr[i] = Integer.MIN_VALUE;
//            }
//        }
//
//        int secondMx = findMax(arr);
//        System.out.println(secondMx);
//    }
//
//
//    public static void main(String[] args) {
//
//        // Qu-5 Write a program to Find The second Largest element in a given array
//
//        int [] arr={34,21,54,650,433};
//       secondMax(arr);
//
//    }
//}


//                                 // OR
//
//              // Qu-5 Write a program to Find The second Largest element in a given array
//
//
//public class ArrayAssignmentProblems {
//
//    public static int findSecondmax(int[] arr){
//        int max=Integer.MIN_VALUE;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]>max){
//                max=arr[i];
//            }
//        }
//
//        int secondMax=Integer.MIN_VALUE;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]!=max){
//                if (arr[i]>secondMax){
//                    secondMax=arr[i];
//                }
//            }
//        }
//
//        return secondMax;
//    }
//    public static void main(String[] args) {
//
//        int [] arr={34,21,54,650,433};
//        int ans=findSecondmax(arr);
//        System.out.println("Second max element :"+ans);
//
//    }
//}













//  // Qu-6 Given an array find the First pick element in the array a peak element is an element that is greater than its just left and just right element.
//
//
//public class ArrayAssignmentProblems {
//    public static void main(String[] args) {
//
//                   // find the First pick element
//
//        int[] arr={1,3,2,6,5};
//        int peakElement=0;
//        for (int i=1;i<arr.length-1;i++){
//            if (arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
//                peakElement=arr[i];
//                 break;
//            }
//
//        }
//        System.out.println(peakElement);
//
//
//    }
//}








//  // Qu-6 Given an array find the last pick element in the array a peak element is an element that is greater than its just left and just right element.
//
//
//public class ArrayAssignmentProblems {
//    public static void main(String[] args) {
//
//        // find the last pick element
//
//        int[] arr={1,3,2,6,5};
//        int peakElement=0;
//        for (int i=1;i<arr.length-1;i++){
//            if (arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
//                peakElement=arr[i];
//               // break;
//            }
//
//        }
//        System.out.println(peakElement);
//
//
//    }
//}










                     //   2D Array Problems













//                // Qu-1 Take m and n input from the user and m*n integer input from user and print the following
//                     //--> Number of positive numbers
//                     //-->number of negetive numbers
//                     // -->number of odd numbers
//                     // -->number of even numbers
//                     // -->number of 0
//
//
//
//import java.util.Scanner;
//
//public class ArrayAssignmentProblems {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter m(Row)");
//        int m = sc.nextInt();
//        System.out.println("Enter n(Column)");
//        int n=sc.nextInt();
//
//        int[][] arr = new int[m][n];
//        System.out.println("Enter array elements ");
//        for (int i=0;i<m;i++){
//            for (int j=0;j<n;j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }
//
//
//        int positive=0,negetive=0,odd=0,even=0,zeros=0;
//        for (int i=0;i<m;i++){
//            for (int j=0;j<n;j++){
//                if (arr[i][j]>0){          // here if-else not work so we write if statements because some time positive vales
//                   positive++;             // is even number but when one check is happen then code was can't go else statement then we getting  invalid input
//
//                }
//                if (arr[i][j]<0){
//                    negetive++;
//                }
//                 if (arr[i][j]%2!=0){
//                    odd++;
//                }
//                 if (arr[i][j]%2==0){
//                    even++;
//                }
//                 if (arr[i][j]==0){
//                    zeros++;
//                }
//            }
//        }
//
//        System.out.println("number of Positive :"+positive);
//        System.out.println("number of negetive :"+negetive);
//        System.out.println("number of odd :"+odd);
//        System.out.println("number of even :"+even);
//        System.out.println("number of zero :"+zeros);
//
//
//
//
//
//
//
//    }
//}












//              // Qu-2 Write a program to print the elements of primary and secondary diagonal of 2D matrix
                                    // Time complexity: O(m*n)
                                    // space complexity: O(1)
//
//import java.util.*;
//public class ArrayAssignmentProblems {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter m(Row)");
//        int m = sc.nextInt();
//        System.out.println("Enter n(Column)");
//        int n=sc.nextInt();
//
//        int[][] arr = new int[m][n];
//        System.out.println("Enter array elements ");
//        for (int i=0;i<m;i++){
//            for (int j=0;j<n;j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }
//
//        for (int i=0;i<m;i++){
//            for (int j=0;j<n;j++){
//                if (i+j==arr[0].length-1){
//                    System.out.println(arr[i][j]);     // Primary diagonal element
//                }
//            }
//        } for (int i=0;i<m;i++){
//            for (int j=0;j<n;j++){
//                if (i-j==0){
//                    System.out.println(arr[i][j]);     // secondary diagonal element
//                }
//            }
//        }
//
//
//
//
//    }
//}
//
//                           // OR  Optimize way
//
//             // Qu-2 Write a program to print the elements of primary and secondary diagonal of 2D matrix
//
//                             // Time complexity: O(n)
//                             // space complexity: O(1)
//
//public class ArrayAssignmentProblems {
//    public static void main(String[] args) {
//
//        int[][] arr={{ 1,2,3},
//                      {4,5,6},
//                       {7,8,9}};
//        int n=arr.length;
//
//        for (int i=0;i<n;i++){
//            System.out.println(arr[i][i]);  // Because i==j so we write arr[i][j]=arr=[i][i];
//        }
//
//        for (int i=0;i<n;i++){
//            if (i!= n-1-i) {     // because 5 print twice but we print it once so this way we avoid twice print
//                System.out.println(arr[i][n-1- i]);
//            }
//        }
//
//    }
//}













//            Qu-3 Write a program to print the elements above the secondary diagonal a user inputted sqaure matrix
//
//
//
//import java.util.*;
//public class ArrayAssignmentProblems {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter m(Row)");
//        int m = sc.nextInt();
//        System.out.println("Enter n(Column)");
//        int n=sc.nextInt();
//
//        int[][] arr = new int[m][n];
//        System.out.println("Enter array elements ");
//        for (int i=0;i<m;i++){
//            for (int j=0;j<n;j++){
//                   arr[i][j]=sc.nextInt();
//            }
//        }
//
//
//        // The above elements of secondary diagonal
//
//        for (int i=0;i<m;i++){
//            for (int j=0;j<n;j++){
//                  if (i+j<arr[0].length-1){
//                      System.out.println(arr[i][j]);
//                  }
//            }
//        }
//
//
//
//
//
//
//    }
//}












//               // Qu-4 Write a Program to find The largest Element of a 2D Array
//
//
//
//
//public class ArrayAssignmentProblems {
//    public static void main(String[] args) {
//
//
//        int[][] arr={{1,2,4,0},
//                      {2,5,7,-1},
//                        {4,2,6,9}};
//
//        int Max=Integer.MIN_VALUE;
//
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                if (arr[i][j]>Max){
//                    Max=arr[i][j];
//                }
//            }
//        }
//        System.out.println(Max);
//
//
//
//    }
//}








//                        // Qu-5 Write a function which accepts a 2D Array of integers and its size as arguments and
//                         //  displays the elements of middile row and middle column .Printing can done any order.
//                         // [Assuming the 2D Array to be a squre with odd dimensions ex- 3x3 or 5x5 or 7x7 etc. ]
//
//
//
//
//public class ArrayAssignmentProblems {
//    public static void main(String[] args) {
//
//        int[][] arr={{1,2,3,4,5},
//                     {3,4,5,6,7},
//                     {7,6,5,4,3},
//                     {8,7,6,5,4},
//                     {1,2,37,8 ,0} };
//             int n=arr.length-1;
//
//        for (int i=n/2;i<=n/2;i++){
//            for (int j=0;j<arr[i].length;j++){
//                System.out.println(arr[i][j]);
//            }
//        }
//        for (int i=0;i<arr.length;i++){
//            for (int j=n/2;j<=n/2;j++){
//                System.out.println(arr[i][j]);
//            }
//        }
//
//
//    }
//}


//                             // OR  optimize Way --->>
//
//
//                        // Qu-5 Write a function which accepts a 2D Array of integers and its size as arguments and
//                         //  displays the elements of middile row and middle column .Printing can done any order.
//                         // [Assuming the 2D Array to be a squre with odd dimensions ex- 3x3 or 5x5 or 7x7 etc. ]
//
//
//
//
//
//                                     // Time complexity: O(n)
//                                     // space complexity: O(1)
//
//public class ArrayAssignmentProblems {
//    public static void main(String[] args) {
//
//        int[][] arr={{1,2,3,4,5},
//                     {3,4,5,6,7},
//                     {7,6,10,4,3},
//                     {8,7,6,5,4},
//                     {1,2,37,8 ,0} };
//             int n=arr.length-1;
//
//             for (int i=0;i<n;i++){
//                 System.out.println(arr[i][n/2]);
//             }
//
//             for (int i=0;i<n;i++){
//                 if (i==n/2){       // To avoid twice printing one element that print it above code one time particular code this is= 10
//                     continue;
//                 }
//                 System.out.println(arr[n/2][i]);
//             }
//
//
//    }
//}