import java.util.Scanner;

public class JavaCourseArray2D {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

//              // 1D Array
//        int [] arr = new int[6];
//
//
//        // Assing in array
//        for (int i=0;i<arr.length;i++){
//            System.out.println("Enter element");
//            arr[i]=sc.nextInt();
//        }
//        // print array element
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }





//                  // 2D Array
//        int [][]arr= new int[3][2];
//
//        // Assing array elements
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j< arr[i].length;j++){
//                System.out.println("Enter array element");
//                arr[i][j]=sc.nextInt();
//            }
//        }
//
//        // print array elements
//
//        for (int b[]:arr){
//            for (int e: b){
//                System.out.print(e+" ");
//            }
//            System.out.println();
//        }
//
//
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }








                 // jagged array
        // **** jagged array is 2D Array jeikhane each row te Alada alada size ar array thake
        // ex- [ [1st,2nd], [1st,2nd,3rd,4th] ,[1st,2nd,3rd] ,[1st,2nd,3rd,4th,5th,6th] ]
       // ex- {  {1st,2nd}
        //       {1st,2nd,3rd,4th}
        //       {1st,2nd,3rd}
        //       {1st,2nd,3rd,4th,5th,6th}
        //               }


        int [][] arr = new  int[4][];
        arr[0]=new int[2];
        arr[1]=new int[4];
        arr[2]=new int[3];
        arr[3]=new int[6];

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.println("enter numbers");
                arr[i][j]=sc.nextInt();
            }
        }

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }


    }
}
