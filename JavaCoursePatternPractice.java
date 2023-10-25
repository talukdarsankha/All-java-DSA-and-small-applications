




public class JavaCoursePatternPractice {
    public static void main(String[] args) {

//        int n =11;
//        for (int i =0;i<n;i++){
//            for (int j=0;j<=i;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }


//        int n =11;
//        for (int i =n;i>=0;i--){
//            for (int j=0;j<=i;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//    }



//        int n=10;
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }




//        int n=10;
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                if (i==0||i==n-1||j==0||j==n-1){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
//
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                if (i==0||i==n-1||j==0||j==n-1){
//                    System.out.print("*"+" ");
//                }else {
//                    System.out.print(" "+" ");
//                }
//            }
//            System.out.println();
//        }



//        int n=10;
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                if (i==0||j==0||j==n-1||i==(n-1)/2){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }


//int n = 10;
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                if (j==0||j==n-1||i==(n-1)/2){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }



               // A pattern
//       int n =9;
//       for (int i=0;i<n;i++){
//           for (int j=0;j<n;j++){
//               if ((i==0 && j>0 && j<n-1) || (j==0 && i>0) || (j==n-1 && i>0) || i==(n-1)/2){
//
//                   System.out.print("* ");
//               }else {
//                   System.out.print("  ");
//               }
//           }
//           System.out.println();
//       }






                 // D pattern
//        int n=7;
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                if (i==0&& j<n-1  || i== n-1&&j<n-1 || j==0 || j==n-1&&i>0&&i<n-1){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }


        // I pattern
//        int n=5;
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                if (j==(n-1)/2 || i==0 || i==n-1){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }







//        int n = 11;
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                if (i==j  ||  i+j==n-1){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

//        int n=13;
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                if (i==j || i+j==n-1  || i==0 || j==0 || i==n-1 || j==n-1){
//                    System.out.print("*"+" ");
//                }else {
//                    System.out.print(" "+" ");
//                }
//            }
//            System.out.println();
//        }





//        int n=13;
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                if (i==j || i+j==n-1  || i==0 || j==0 || i==n-1 || j==n-1 || i==(n-1)/2 || j==(n-1)/2){
//                    System.out.print("*"+" ");
//                }else {
//                    System.out.print(" "+" ");
//                }
//            }
//            System.out.println();
//        }






//        int n=13;
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                if (i==0||j==0||i==n-1||j==n-1|| i==j || i+j==n-1 || i+j==(n-1)/2   || j-i==(n-1)/2 || i-j==(n-1)/2 || i+j==(n-1)+(n-1)/2){
//                    System.out.print("*"+" ");
//                }else {
//                    System.out.print(" "+" ");
//                }
//            }
//            System.out.println();
//        }




//
//    int n = 11;
//    for (int i=0;i<n;i++){
//        for (int j=0;j<n;j++){
//            if (i==0||j==0||i==n-1||j==n-1 || i+j==(n-1)/2 || j-i==(n-1)/2 || i-j==(n-1)/2 ||i+j==(n-1)+(n-1)/2 ){
//                System.out.print("* ");
//            }else {
//                System.out.print("  ");
//            }
//        }
//        System.out.println();
//    }



//
//
        int n = 11;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==0||j==0||i==n-1||j==n-1 || i+j<=(n-1)/2 || i-j>=(n-1)/2 || j-i>=(n-1)/2 ||i+j>=(n-1)+(n-1)/2 ){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }





//        int m = 5;
//        for (int i=0; i<m;i++){
//            for (int j=0;j<m;j++){
//                if (i+j==(m-1)/2 || j-i==(m-1)/2 || i==(m-1)/2  || j==(m-1)/2&&i<=(m-1)/2 ){
//
//
//                    System.out.print("*"+" ");
//                }else {
//                    System.out.print(" "+" ");
//                }
//            }
//            System.out.println();
//        }






 // 2: Triangle Pattern
//        int m = 7;
//        for (int i=0; i<m;i++){
//            for (int j=0;j<m;j++){
//                if (i+j==(m-1)/2 || j-i==(m-1)/2 || i==(m-1)/2  || j==(m-1)/2&&i<=(m-1)/2 ||
//                        j==((m-1)/2)-1&&i<=(m-1)/2&&i>0 || j==((m-1)/2)+1 &&i>0&&i<=(m-1)/2){
//
//
//                    System.out.print("*"+" ");
//                }else {
//                    System.out.print(" "+" ");
//                }
//            }
//            System.out.println();
//        }


        }
    }

