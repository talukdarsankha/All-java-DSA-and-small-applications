import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PwBucketSort {

    public static void bucketSort(float[] arr){
        ArrayList<Float>[] bucket  = new ArrayList[arr.length];

        for (int i =0;i<arr.length;i++){
            bucket[i]=new ArrayList<Float>();
        }

        for (int i =0;i<arr.length;i++){
            int index = (int) arr[i]* arr.length;
            bucket[index].add(arr[i]);
        }

        for (int i =0;i<arr.length;i++){
            Collections.sort(bucket[i]);

        }

        int k =0;
        for (int i=0;i< arr.length;i++){
            ArrayList<Float> newArrayList = bucket[i];
            for (int j =0;j<newArrayList.size();j++){
                arr[k++]=newArrayList.get(j);
            }
        }
    }
     public static void main(String[] args) {
         float[] arr = {0.5f,0.3f,0.2f,0.6f,0.4f,0.9f,0.8f};
         bucketSort(arr);

         for (float e: arr){
             System.out.print(e+" ");
         }
     }
}