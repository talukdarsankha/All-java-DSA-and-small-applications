/*
    //exampel n=5 and k =8 then ans is = 5*1,5*2,5*3,5*4,5*5,5*6,5*7,5*8 --->>>>>>>>


import java.util.*;
public class recursionproblems {
    //exampel n=5 and k =8 then ans is = 5*1,5*2,5*3,5*4,5*5,5*6,5*7,5*8
    public static int firstNaturalmultiply(int n, int k){
        if (k==1){
            return n;
        }
        System.out.println(firstNaturalmultiply(n,k-1));
       return n*k;
    }
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
   int n= sc.nextInt();
        System.out.println("enter k");
   int k = sc.nextInt();
        System.out.println(firstNaturalmultiply(n,k));
    }
}

 */




/*
// exampel n is 5 then ans is = 1+2+3+4+5 --------------->>>>>>>>

import java.util.Scanner;
public class recursionproblems {
    public static int sumOfgivenfirst_nNaturalNum(int n){
        if (n==1){
            return 1;
        }
        return sumOfgivenfirst_nNaturalNum(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        System.out.println(sumOfgivenfirst_nNaturalNum(3));
    }
}

 */





/*
exampel n is 5 then ans is 1-2+3-4+5


import java.util.Scanner;
public class recursionproblems {
    public static int sumOfgivenfirst_nNaturalNumAlternativeOrder(int n){
        if (n==1){
            return 1;
        }
        if (n%2==0){
            return sumOfgivenfirst_nNaturalNumAlternativeOrder(n-1)-n;
        }else {
            return sumOfgivenfirst_nNaturalNumAlternativeOrder(n-1)+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n");
        System.out.println(sumOfgivenfirst_nNaturalNumAlternativeOrder(10));
    }
}

 */