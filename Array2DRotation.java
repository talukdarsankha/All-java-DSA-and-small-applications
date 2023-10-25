

public class Array2DRotation {
    public static void main(String[] args) {
        int[][] arr={  {1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};

        int n = arr.length-1;
        int m=arr[0].length-1;

        for (int i=0;i<=n;i++){
            for (int j=i;j<=m;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for (int i=0;i<=n;i++){
          int leftidx=0;
          int rightidx=arr[0].length-1;

          while (leftidx<=rightidx){
             int temp=arr[i][leftidx];
             arr[i][leftidx]=arr[i][rightidx];
             arr[i][rightidx]=temp;

              leftidx++;
              rightidx--;

          }
        }

        for (int i =0;i<=n;i++){
            for (int j=0;j<=m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



    }
}
