






                 // Factorial of any number

                         // Time complexity :O(n);
                         // Space complexity O(n);



//import java.util.Scanner;
//
//public class javaCourseRecursionQuestions {
//
//    public static int findFactorial(int n){
//        int ans;
//        if (n==0 || n==1){
//            return 1;
//        }else {
//           ans=n*findFactorial(n-1);
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter number");
//        int n = sc.nextInt();
//
//        System.out.println(findFactorial(n));
//
//    }
//}








//                 //  Fibonacci series's nth term
//
//                        // Time complexity :O(2^n);  exponential time complexity
//                        // Space complexity O(n);
//
//
//import java.util.Scanner;
//public class javaCourseRecursionQuestions {
//
//    public static int findFibonacci(int n){
//        int ans;
//          if (n==0||n==1){
//              return n;
//          }else {
//              ans=findFibonacci(n-1)+findFibonacci(n-2);
//          }
//          return ans;
//    }
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n");
//        int n = sc.nextInt();
//
//        System.out.println(findFibonacci(n));
//    }
//}














//                   // Calculate a^b using recursion   bellow this code optimize approach present

//                 // Normal approach
//                        // Time complexity :O(b);
//                        // Space complexity O(b);
//
//
//
//
//                 import java.util.Scanner;
//         public class javaCourseRecursionQuestions{
//
//             public static int calculateAtoThePowerB(int a,int b){
//                 if (a==0||a==1){
//                     return a;
//                 }
//                 int result;
//                 if (b==1){
//                     return a;
//                 }else {
//                     result=a*calculateAtoThePowerB(a,b-1);
//                 }
//                 return result;
//             }
//         public static void main(String[] args) {
//
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter a");
//             int a=sc.nextInt();
//             System.out.println("Enter b");
//             int b= sc.nextInt();
//
//             System.out.println(calculateAtoThePowerB(a,b));
//
//
//
//         }
//}
//
//                        // OR      Optimize Approach
//
//                 // Calculate a^b using recursion
//
//                               Time complexity :O(log b);
//                               Space complexity O(log b);
//
//
//
//        import java.util.Scanner;
//
//   public class javaCourseRecursionQuestions{
//
//    public static long calculatePower(int a,int b){
//        long result;
//        long finalResult;
//
//        if (a==0||a==1){
//            return a;
//        }
//        if (b==1){
//            return a;
//        }else {
//          result=calculatePower(a,b/2);
//          if (b%2!=0){
//             finalResult=a*result*result;
//          }else {
//              finalResult=result*result;
//          }
//
//        }
//       return finalResult;
//    }
//       public static void main(String[] args) {
//
//           Scanner sc = new Scanner(System.in);
//           System.out.println("Enter a");
//             int a=sc.nextInt();
//             System.out.println("Enter b");
//             int b= sc.nextInt();
//
//           System.out.println(calculatePower(a,b));
//
//       }
//}


                 //  Big Integer ------------------->>>>>>>



//                      //  Or     BigInteger
//                 //  Calculate a^b using recursion
//                             // Time complexity :O(log b);
//                             // Space complexity O(log b);
//
//
//     import java.math.BigInteger;
//
//     public class javaCourseRecursionQuestions{
//
//    public static BigInteger Power(BigInteger a,int b){    // a is BigInteger because when b==1 then return a. The method return type is BigInteger so a is BigInteger
//        BigInteger value;
//        BigInteger finalAns;
//
//        if (b==1){
//            return a;
//        }
//        else {
//            value=Power(a,b/2);
//            if (b%2==0){
//                finalAns= value.multiply(value);
//            }else {
//                finalAns= a.multiply(value).multiply(value);    // that is a*value*value
//            }
//        }
//        return finalAns;
//
//    }
//        public static void main(String[] args) {
//
//        BigInteger a = BigInteger.valueOf(2);
//        int b = 64;
//
//            System.out.println(Power(a,b));
//
//
//        }
//}










//
//  public class javaCourseRecursionQuestions{
//
//    public static int power(int a,int b){
//        int result;
//        if (b==0||b==1){
//            return a;
//        }else {
//            result=power(a,b/2);
//            if (b%2==0){
//                return result*result;
//            }
//            return a*result*result;
//        }
//      }
//      public static void main(String[] args) {
//
//          System.out.println(power(2,4));
//
//      }
//}












//                 // Count way to go stairs
//                                 // Time complexity :O(2^n);  exponential time complexity
//                                 // Space complexity O(n);
//
//       import java.util.Scanner;
//       public class javaCourseRecursionQuestions{
//
//           public static int countway(int n){
//               int way;
//               if (n==1||n==2){
//                   return n;
//               }else {
//                   way=countway(n-1)+countway(n-2);
//               }
//               return way;
//           }
//       public static void main(String[] args) {
//
//           Scanner sc = new Scanner(System.in);
//
//           System.out.println("Enter stair number ");
//           int stairs = sc.nextInt();
//
//           System.out.println(countway(stairs));
//       }
//}
//
//                      // Or
//             // Count way to go stairs(Using fibonacci relation or concept )
//                            // Time complexity :O(2^n);  exponential time complexity
//                            // Space complexity O(n);
//
//                 import java.util.Scanner;
//                 public class javaCourseRecursionQuestions{
//
//                     public static int countway(int n){
//                         int way;
//                         if (n==0||n==1){
//                             return n;
//                         }else {
//                             way=countway(n-1)+countway(n-2);
//                         }
//                         return way;
//                     }
//                     public static void main(String[] args) {
//
//                         Scanner sc = new Scanner(System.in);
//
//                         System.out.println("Enter stair number ");
//                         int stairs = sc.nextInt();
//
//                         System.out.println(countway(stairs+1));
//                     }
//                 }









//                         // Write a program to print from 1 t0 n increasing order element using recursion
//
//
//
//         public class javaCourseRecursionQuestions{
//
//    public static void printNumbers(int n){
//        if (n==1){
//            System.out.println(1);
//            return;
//        }else {
//            printNumbers(n-1);
//            System.out.println(n);
//        }
//    }
//             public static void main(String[] args) {
//
//                 printNumbers(5);
//
//
//             }
//}








//                 // Write a program to print from n to 1 decreasing  order element using recursion
//
//
//
//
//      public class javaCourseRecursionQuestions {
//
//    public static void printNumbers(int n){
//        if (n==1){
//            System.out.println(1);
//            return;
//        }else {
//            System.out.println(n);
//            printNumbers(n-1);
//        }
//    }
//          public static void main(String[] args) {
//
//        printNumbers(5);
//
//          }
//}









//                       // Write a program to calculate sum given any integer value using recursion     ex- 351 = 3+5+1
//
//
//
//
//
//
// public class javaCourseRecursionQuestions {
//
//    public static int sumOfIntegerDigits(int n){
//        int ans;
//        if (n>=0 && n<=9){     // it means one digit value
//            return n;
//        }else {
//            ans= sumOfIntegerDigits(n/10)+n%10;
//
//        }
//        return ans;
//    }
//     public static void main(String[] args) {
//
//         System.out.println(sumOfIntegerDigits(5134));
//
//
//     }
//}















//                 //   GIven n and b print  first multiply n*1 to n*b using recursion  ex n=5 and b=3 then = 5*1,5*2,5*3
//
//
//                           // Time Complexity :O(b)
//                              // Space Complexity :O(b)
//
//
//     public class javaCourseRecursionQuestions{
//
//    public static void firstMultiplys(int n,int b){
//        if (b==1){
//            System.out.println(n);
//            return;
//
//        }else {
//            firstMultiplys(n, b - 1);
//            System.out.println(n * b);
//        }
//    }
//         public static void main(String[] args) {
//             firstMultiplys(5,3);
//
//         }
//}









//                 // print alternate sum 1 to n  ex = 1+(-2)+3(-4)+5(-6) =-3  mean if number is even then - or number is odd then +
//
//                                         // Time Complexity :O(n)
//                                         // Space Complexity :O(n)
//
//
//
//  public class javaCourseRecursionQuestions {
//    public static int alternateSun(int n){
//        int ans;
//        if (n==1){
//            return 1;
//        }else {
//            if (n%2==0){
//                ans = alternateSun(n-1)-n;
//            }else {
//                ans=alternateSun(n-1)+n;
//            }
//
//        }
//        return ans;
//    }
//      public static void main(String[] args) {
//
//          System.out.println(alternateSun(6));
//
//      }
//}
//












//                     // Lcm(lowest common divisor) and gcd (Greatest common divisor) using recursion
//
//
//                 // GCD

//                // Recursive way
//
//     public class javaCourseRecursionQuestions{
//
//    public static int gcd(int x,int y){
//        if (y==0){
//            return x;
//        }else {
//            return gcd(y,x%y);
//        }
//    }
//         public static void main(String[] args) {
//
//             System.out.println(gcd(9,12));
//         }
//}
//


//                           // Recursive way
//
//   public class javaCourseRecursionQuestions{
//
//    public static int gcd(int x,int y){
//        int ans;
//        if (y%x==0){
//            return x;
//        }else {
//          ans=  gcd(y%x,x);
//        }
//        return ans;
//    }
//       public static void main(String[] args) {
//
//           System.out.println(gcd(12,6));
//
//
//       }
//}

//                      // LCM
//
//                 public class javaCourseRecursionQuestions{
//
//                     public static int gcd(int x,int y){
//                         int ans;
//                         if (y%x==0){
//                             return x;
//                         }else {
//                             ans=  gcd(y%x,x);
//                         }
//                         return ans;
//                     }
//                     public static void main(String[] args) {
//
//                         int x=12;
//                         int y=6;
//                        int gcd=gcd(x,y);
//
//                        int lcm = x*y/gcd;
//                         System.out.println(lcm);
//
//
//                     }
//                 }













//                     // print array element using recursion
//
//
//
//  public class javaCourseRecursionQuestions {
//
//    public static void printArrayElement(int[] arr,int idx){
//        if (idx==arr.length){         // because if the is empty(corner case) then simply terminate the code and array is finish then return the question
//          return;
//        }
//      System.out.println(arr[idx]);
//        printArrayElement(arr,idx+1);
//
//    }
//      public static void main(String[] args) {
//
//      int[] arr={4,2,6,9,8,7};
//      printArrayElement(arr,0);
//
//      }
//}










//
//                  // Print max element using recursion
//
//
//
//      public class javaCourseRecursionQuestions{
//
//  public static int printMax(int[] arr ,int idx){
//    int max=Integer.MIN_VALUE;
//    int smallAns;
//    if (idx==arr.length-1){   // because if array have 1 element then max is this particular element(corner case) and when last element
//      return arr[idx];
//    }
//
//   smallAns= printMax(arr,idx+1);
//    max=Math.max(smallAns,arr[idx]);
//    return max;
//  }
//        public static void main(String[] args) {
//
//
//
//
//          int[] arr={4,2,6,9,8,7};
//          System.out.println(printMax(arr,0));
//        }
//}










//                 // Print sum all of array elements using recursion
//
//
//                 public class javaCourseRecursionQuestions{
//
//                   public static int sum(int[]arr, int idx){
//                     if (idx==arr.length){
//                       return 0;
//                     }
//                     return arr[idx]+sum(arr,idx+1);
//                   }
//                   public static void main(String[] args) {
//
//                     int[] arr={4,2,6,9,8,7};
//                     System.out.println(sum(arr,0));
//
//                   }
//                 }


//                 // Print sum all of array elements using recursion
//
//
//    public class javaCourseRecursionQuestions{
//
//  public static int sum(int[]arr, int idx){
//    if (idx==arr.length-1){
//      return arr[idx];
//    }
//    return arr[idx]+sum(arr,idx+1);
//  }
//      public static void main(String[] args) {
//
//        int[] arr={4,2,6,9,8,7};
//        System.out.println(sum(arr,0));
//
//      }
//}












//                 // given an integer array and target value find target is present or not in the array
//
//
//
//                 public class javaCourseRecursionQuestions{
//
//                     public static boolean findTarget(int[] arr,int target,int idx){
//                         if (idx==arr.length){
//                             return false;
//                         }
//                         if (arr[idx]==target){
//                             return true;
//                         }
//                         return findTarget(arr,target,idx+1);
//
//                     }
//                     public static void main(String[] args) {
//
//                         int[]arr={7,5,1,2,63,8};
//                         if (findTarget(arr,5,0)==true){
//                             System.out.println("Yes");
//                         }else {
//                             System.out.println("No");
//                         }
//
//                     }
//                 }
//
//
//
//
//
//

//                // given an integer array and target value find target is present or not in the array
//
//
//
//    public class javaCourseRecursionQuestions{
//
//    public static boolean findTarget(int[] arr,int target,int idx){
//        boolean ans;
//        if (idx==arr.length){
//            return false;
//        }
//        else {
//            if (arr[idx]==target){
//                return true;
//            }else {
//               ans = findTarget(arr,target,idx+1);
//            }
//        }
//        return ans;
//    }
//        public static void main(String[] args) {
//
//            int[]arr={7,5,1,2,63,8};
//            if (findTarget(arr,5,0)==true){
//                System.out.println("Yes");
//            }else {
//                System.out.println("No");
//            }
//
//        }
//}











//   // given an integer array and target value if target is present then print it's index if not then print -1
//
//
//
//
//      public class javaCourseRecursionQuestions{
//
//    public static int findIdx(int[] arr,int target, int idx){
//        if (idx==arr.length){
//            return -1;
//        }
//        if (arr[idx]==target){
//            return idx;
//        }
//        return findIdx(arr,target,idx+1);
//    }
//          public static void main(String[] args) {
//
//             int[]arr={7,5,1,2,63,8};
//              System.out.println(findIdx(arr,5,0));
//
//          }
//}









//        // given an integer array and target value if target is present then print it's all index.
//
//
//
//    public class javaCourseRecursionQuestions{
//
//    public static void findAllIdx(int[] arr,int target,int idx){
//        if (idx==arr.length){
//            return;
//        }
//        if (arr[idx]==target){
//            System.out.println(idx);
//        }
//        findAllIdx(arr,target,idx+1);
//    }
//        public static void main(String[] args) {
//
//            int[]arr={7,5,2,63,5,8,5};
//            findAllIdx(arr,5,0);
//        }
//}








//                 // print target's all indices in a arraylist using recursion
//
//
//
//       import java.util.ArrayList;
//   public class javaCourseRecursionQuestions{
//
//    public static ArrayList PrintAllIndices(int[] arr, int target , int idx){
//
//        if (idx==arr.length){
//            return new ArrayList<>() ;     // if array is  then empty arraylist return
//        }
//        ArrayList<Integer> al = new ArrayList<>();
//        if (arr[idx]==target){
//            al.add(idx);
//        }
//      ArrayList<Integer> al2 = PrintAllIndices(arr,target,idx+1);
//        al.addAll(al2);
//        return al;
//    }
//     public static void main(String[] args) {
//
//         int[]arr={7,5,2,63,5,8,5};
//         System.out.println(PrintAllIndices(arr,5,0));
//
//     }
//}













//                 // using recursion find out array sorted or not
//
//
//      public class javaCourseRecursionQuestions{
//
//    public static boolean isSort(int[]arr,int idx){
//        boolean flag=false;
//        if (idx==arr.length-1){
//            return true;
//        }
//        if (arr[idx]<arr[idx+1]){
//               flag=true;
//        }
//        if (flag==false){
//            return false;
//        }
//       return isSort(arr,idx+1);
//    }
//          public static void main(String[] args) {
//
//        int[] arr={2,4,5,70,8,9};
//              System.out.println(isSort(arr,0));
//
//          }
//}









//                 // using recursion print last index of target value in the array
//
//
//      public class javaCourseRecursionQuestions{
//
//    public static int targetIdx(int[] arr,int target,int idx){
//
//        if (idx==-1){
//            return -1;
//        }
//        if (arr[idx]==target){
//            return idx;
//        }
//        return targetIdx(arr,target,idx-1);
//    }
//          public static void main(String[] args) {
//
//        int[] arr={2,4,2,6,2,8,2};
//              System.out.println(targetIdx(arr,2,arr.length-1));
//
//
//          }
//}












//            // Using recursion remove all occurrence of a character from a given string  using idx variable  ex - abcaad ,char=a  then ans= bcd
//
//                            ****  so total time complexity = Number of calls * time taken in one call
//                                                              n * 1+1+1+n+1 = n*n = O(n^2)
//
//  public class javaCourseRecursionQuestions{
//
//    public static String removeOcurrence(String st,char occurrence ,int idx){
//
//        if (idx==st.length()){
//            return " ";         // O(1)
//        }
//       String sm= removeOcurrence(st,occurrence,idx+1);   // O(1)
//        char ch = st.charAt(idx);  //O(1)
//        if (ch!=occurrence){
//           return ch+sm;            // O(n)                   // because string concatenate is liner time
//        }
//        return sm;                // O(1)
//    }
//      public static void main(String[] args) {
//
//          String  s = new String("abcaad");
//          System.out.println(removeOcurrence(s,'a',0));
//
//      }
//}









//
//                      //  without using idx variable   using substring method
//       // Using recursion remove all occurrence of a character from a given string   ex - abcaad ,char=a  then ans= bcd
//
//                     ****  so total time complexity = Number of calls * time taken in one call
//                                                          n * 1+1+1+n+1 = n*n = O(n^2)
//
//
//            public class javaCourseRecursionQuestions{
//
//    public static String removeOcurrence(String  st,char ocurrence){
//        if (st.length()==0){
//            return " ";
//        }
//         String ss = removeOcurrence(st.substring(1),ocurrence);
//        char ch= st.charAt(0);
//        if (ch!=ocurrence){
//            return ch+ss;
//        }else {
//            return ss;
//        }
//    }
//                public static void main(String[] args) {
//
//                 String st="abcaad";
//                    System.out.println(removeOcurrence(st,'a'));
//
//
//                }
//}










//                 //   Reverse a string using recursion
//
//
//   public class javaCourseRecursionQuestions{
//
//    public static String reverse(String st,int idx){
//        if (idx==st.length()){
//            return "";
//        }
//        String ss = reverse(st,idx+1);
//        char ch=st.charAt(idx);
//        return ss+ch;
//    }
//       public static void main(String[] args) {
//
//        String st = "java";
//           System.out.println(reverse(st,0));
//
//
//       }
//}



//                 //  Without using idx variable Reverse a string using recursion
//
//
//   public class javaCourseRecursionQuestions{
//
//    public static String reverse(String st){
//        if (st.length()==0){
//            return "";
//        }
//       String ss = reverse(st.substring(1));
//        char ch=st.charAt(0);
//        return ss+ch;
//    }
//       public static void main(String[] args) {
//
//             String st = "college";
//           System.out.println(reverse(st));
//
//       }
//}








                 //  using recursion reverse find the string is  Palindrome or not
//                       // Time complexity :O(n^2)
//
//
//   public class javaCourseRecursionQuestions{
//
//    public static String isPlandrome(String  st,int idx){
//        if (idx==st.length()){
//            return "";
//        }
//       String  ss = isPlandrome(st,idx+1);
//        return ss+st.charAt(idx);
//    }
//       public static void main(String[] args) {
//           String st ="level";
//           String st2 = isPlandrome(st,0);
//
//           if (st.equals(st2)){
//               System.out.println("palindrome");
//           }else {
//               System.out.println("Not a plaindroem");
//           }
//
//       }
//}

//
//                 // using recursion but not reverse find the string is  Palindrome or not
//                            // Time complexity :O(n)
//
//     public class javaCourseRecursionQuestions{
//
//    public static boolean isPlindrone(String st ,int startIdx,int lastIdx){
//        if (startIdx>=lastIdx){
//            return true;
//        }
//        if (st.charAt(startIdx)==st.charAt(lastIdx)){
//          return   isPlindrone(st,startIdx+1,lastIdx-1);
//        }
//        return false;
//    }
//         public static void main(String[] args) {
//        String st = "level";
//             System.out.println(isPlindrone(st,0,st.length()-1));
//
//         }
//}









//                 // Using recursion Print all subsequences in a Arraylist   not a good approach
//
//
//
//                 import java.util.ArrayList;
//                 import java.util.concurrent.Callable;
//
//     public class javaCourseRecursionQuestions{
//
//    public static ArrayList<String> allSubsequences(String st){
//        ArrayList<String> ans = new ArrayList<>();
//        if (st.length()==0){
//            ans.add(" ");
//            return ans;
//        }
//        ArrayList<String> al = allSubsequences(st.substring(1));
//      char ch = st.charAt(0);
//
//      for (String e: al){
//          ans.add(e);
//          ans.add(ch+e);
//
//      }
//      return ans;
//    }
//      public static void main(String[] args) {
//
//
//          System.out.println(allSubsequences("abc"));
//
//      }
//}








//                 // Using recursion Print all subsequences not using Arraylist    good approach
//                          //  Time Complexity = No of call * max space occupied in 1 stack
//                          //                         n+1  * n  = O(n^2)
//
//
//    public class javaCourseRecursionQuestions {
//    public static void allSequences(String st, String ans){
//        if (st.length()==0){
//            System.out.println(ans);
//            return;
//        }
//        char ch=st.charAt(0);
//        allSequences(st.substring(1),ans+ch);
//        allSequences(st.substring(1),ans);
//    }
//        public static void main(String[] args) {
//
//        String st = "abc";
//            allSequences(st,". ");
//
//
//        }
//}







//                 // Print aLL subsequence sum or subset's sum of a integer array  ex- [2,3,1] = 0,2,3,1,2+3,2+1,3+1,2+3+1
//
//
//       public class javaCourseRecursionQuestions{
//
//    public static void sumofSubsequences(int[] arr,int idx,int sum){
//        if (idx==arr.length){
//            System.out.println(sum);
//            return;
//        }
//        int i = arr[idx];
//       sumofSubsequences(arr,idx+1,sum+i);
//       sumofSubsequences(arr,idx+1,sum);
//    }
//           public static void main(String[] args) {
//
//        int[] arr = {1,2,3};
//                      sumofSubsequences(arr,0,0);
//
//           }
//}












//                 // frog jump recursion
//
//
//                 import javax.security.auth.login.CredentialExpiredException;
//
//                 public class javaCourseRecursionQuestions{
//    public static int bestWay(int[] arr,int idx){
//        if (idx==arr.length-1){
//            return 0;
//        }
//
//        int op1 = bestWay(arr,idx+1)+Math.abs(arr[idx]-arr[idx+1]);         // ex Math.abs(10-30) = 20 ignore sign
//        if (idx==arr.length-2){
//            return op1;
//        }
//         int op2 = bestWay(arr,idx+2)+Math.abs(arr[idx]-arr[idx+2]);
//         return Math.min(op1,op2);
//
//    }
//           public static void main(String[] args) {
//
//               int[] arr= {10,30,40,20};
//               System.out.println(bestWay(arr,0));
//
//           }
//}









                 // Ascii code
                 // es String ss = "53"  if we want char ti int then we simply subtract '0'
                 //    int a  = '5' -'0' = 5
                 //     int b = '3'-'0' = 3


//
//        // Keypad combination using recursion 2 to 9
//
//
//  public class javaCourseRecursionQuestions{
//
//    public static void possibleKeypadCombinations(String ss , String [] keypad,String ans){
//        if (ss.length()==0){
//            System.out.println(ans);
//            return;
//        }
//       int  n = ss.charAt(0)-'0';
//       String choice = keypad[n];
//       for (int i=0;i<choice.length();i++){
//           possibleKeypadCombinations(ss.substring(1),keypad,ans+choice.charAt(i));
//       }
//
//    }
//      public static void main(String[] args) {
//
//        String st = "23";
//        String[] keypad = { " "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//
//        possibleKeypadCombinations(st,keypad,"");
//
//      }
//}










                  // RECURSION ASSIGNMENT ------------------>>>>




//             // Qu-1  given an integer find out the sum of its digits using recursion
//
//
// public class javaCourseRecursionQuestions{
//
//    public static int sumOfAllDigits(int n){
//
//
//        if (n==0){
//            return 0;
//        }
//
//        return sumOfAllDigits(n/10)+ n%10;
//    }
//     public static void main(String[] args) {
//         int n = 1234;
//         System.out.println(sumOfAllDigits(n));
//     }
//}



//                 // Qu -2 given a number find the sumof natural numbers till n but with alternate sign.
//                 // that means if n = 5 return 1-2+3-4+5=3
//
//
//  public class javaCourseRecursionQuestions{
//
//      public static int alternateSum(int n) {
//
//          if (n==0){
//              return 0;
//          }
//          if (n%2!=0){
//              return alternateSum(n-1)+n;
//          }else {
//              return alternateSum(n-1)-n;
//          }
//      }
//      public static void main(String[] args) {
//          System.out.println(alternateSum(10));
//      }
//}



//                 // Qu-3 Print the max value of the array
//
//     public class javaCourseRecursionQuestions{
//
//    public static int maxValue(int[] arr,int idx){
//        int max = Integer.MIN_VALUE;
//        if (idx==arr.length-1){
//            return arr[idx];
//        }
//
//        if (arr[idx]>max){
//            max=arr[idx];
//        }
//      int ans= maxValue(arr,idx+1);
//        if (max>ans){
//            return max;
//        }else {
//            return ans;
//        }
//    }
//         public static void main(String[] args) {
//             int[] arr={13,1,-3,22,5};
//             System.out.println(maxValue(arr,0));
//         }
//}



//                 // Qu-4  print the sum of the all values of the array
//
//
//   public class javaCourseRecursionQuestions{
//
//    public static int sumOfAllValues(int[] arr,int idx){
//        if (idx==arr.length){
//            return 0;
//        }
//        return arr[idx]+sumOfAllValues(arr,idx+1);
//    }
//       public static void main(String[] args) {
//
//           int[] arr = {92,23,15,-20,10};
//           System.out.println(sumOfAllValues(arr,0));
//       }
//}



//                 // QU-5 Given a number n, print if it is an armstrong number or not .An armstrong number is a number if the sum
//                 // of every digit in that number raised to the of every digits sum in that number is armstrong
//                 //   ex- 153 total digit = 3 then 1^3+5^3+3^3 = 1+125+27 = 153
//
//
//     public class javaCourseRecursionQuestions{
//
//    public static int countDigit(int n){
//        if (n==0){
//            return 0;
//        }
//       int Digit= countDigit(n/10)+1;
//        return Digit;
//    }
//    public static int isArmstrong(int n){
//        int totalDigit=countDigit(153);
//        int digt = n%10;
//        int mul=1;
//        for (int i=1;i<=totalDigit;i++){
//            mul*=digt;
//        }
//        if (n==0){
//            return 0;
//        }
//       return isArmstrong(n/10) +mul;
//    }
//         public static void main(String[] args) {
//
//             int n = 153;
//             int ans= isArmstrong(n);
//             if (ans==n){
//                 System.out.println("armstrong");
//             }else {
//                 System.out.println("Not armstrong");
//             }
//         }
//}






                 //  Binary search Using Recursion


public class javaCourseRecursionQuestions {

    public static int binarySearchUsingRecursion(int[] arr,int target, int firstIdx,int lastIdx){


        if (firstIdx>lastIdx){
            return -1;
        }
        int mid=firstIdx+(lastIdx-firstIdx)/2;
        if (arr[mid]==target){
            return mid;
        }
       else if (arr[mid]<target){
            return binarySearchUsingRecursion(arr,target,mid+1,lastIdx);
        }else {
            return binarySearchUsingRecursion(arr,target,firstIdx,mid-1);
        }
    }
    public static void main(String[] args) {

        int[] arr = {12,19,34,50,70};
        System.out.println(binarySearchUsingRecursion(arr,70,0,arr.length-1));

    }
}