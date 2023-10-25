public class DuplicateElementInArray {
    public static void main(String[] args) {

        int [] arr={4,8,5,9,5,4,3};
        int n =arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    System.out.println("Duplicate element is :"+arr[i]);
                }
            }
        }

    }
}
