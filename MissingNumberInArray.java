public class MissingNumberInArray {
    public static void main(String[] args) {

        // Sum of n natural numbers = n(n+1)/2 it is aplicabel when Number series like 0+1+2+3+4+...+n

        int [] arr= {1,2,3,7,6,5};   // here six element is present
        int n = arr.length;
        int sum_of_n_nutural_num= ((n+1)*(n+1+1))/2;   // here n value is n+1 because one element is missing here
        int sumofArrayElements=0;
        for (int i=0;i<n;i++){
            sumofArrayElements+=arr[i];
        }

        int miss = sum_of_n_nutural_num-sumofArrayElements;
        System.out.println("The missing element is :"+miss);



                // Time complexcity of this code : O(n)
                 // Sapce Complexcity of this code :O(1)

        }
}
