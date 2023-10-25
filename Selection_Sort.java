

                     // Selection Sort
           // Selection sort is an Inplace Sort
           // Selection Sort is Not a Stable sort








                     // Time Complexity of this Code :O(n^2)
                     // Space Complexity of this Code :O(1)

import java.lang.reflect.Array;
import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {

        int[] arr={7,5,4,8,2,19,6,3};
        for (int i=0;i<arr.length;i++){
           int select_idx=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[select_idx]>arr[j]) {
                    select_idx = j;
                }
            }
            if (select_idx!=i){
                int temp=arr[i];
               arr[i]=arr[select_idx];
               arr[select_idx]=temp;
            }
        }


//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        System.out.println(Arrays.toString(arr));

    }
}
