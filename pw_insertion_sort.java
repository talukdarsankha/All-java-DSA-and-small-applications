public class pw_insertion_sort {
    public static void main(String[] args) {

        int [] arr ={4,5,2,9,3,6};

        for (int i =1;i<arr.length;i++){
            int j = i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }

        for (int e: arr){
            System.out.println(e);
        }
    }
}
