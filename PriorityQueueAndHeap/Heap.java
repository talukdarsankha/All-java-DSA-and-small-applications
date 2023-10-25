package PriorityQueueAndHeap;



  // ****  Heap is a  Complete binary tree --- Heap two type   Min Heap and Max Heap
  // *****  In Min Heap  root node is small than left and right child and every level follow same
  //  ****  In MAx Heap root node is greater than left and right child and every level follow same
     // Here two type heapify  one   up Heapify  and   down Heapify
               // *******  parent = Math.abs( (idx-1)/2); , left child = 2*idx+1 , right child = 2*idx+2;  *****
      // **** Up Heapify it check its parent nodes , Down Heapify it check it's down(left,right) nodes  that these are right position or not






              // Insertion in min heap  And Deletion ------------------->>>>>
                     // Insert, Delete time Complexity : O(logn)

//import java.util.*;
//public class Heap {
//    public static void swap(int[] ar ,int i,int j){
//        int temp=ar[i];
//        ar[i]=ar[j];
//        ar[j]=temp;
//    }
//
//    public static void minheapify(int idx,int[]arr){
//        if(idx==0) return;
//
//        int parentIdx=Math.abs((idx-1)/2);
//        if (arr[idx]<arr[parentIdx]){  // because in min heap root or parent  val is small than left,right child
//               swap(arr,idx,parentIdx);
//
//            minheapify(parentIdx,arr);
//        }
//
//    }
//    public static int insertInMinHeap(int[] arr,int size,int val){     // Insert In Min Heap
//        size++;
//        arr[size-1]=val;
//        minheapify(size-1,arr);
//        return size;
//
//    }
//
//    public static void minDeleHeapify(int idx,int[] arr,int size){
//        int parentIdx=idx;
//        int leftChildIdx=2*idx+1;  // or    int leftChildIdx=2*parentIdx+1;
//        int rightchildIdx = 2*idx+2;  // or     int rightchildIdx = 2*parentIdx+2;
//
//        if (leftChildIdx<size && arr[parentIdx]>arr[leftChildIdx]) parentIdx=leftChildIdx;
//        if (rightchildIdx<size && arr[parentIdx]>arr[rightchildIdx]) parentIdx=rightchildIdx;
//        if (parentIdx!=idx){  // that means any smaller value is present left or right child
//            swap(arr,idx,parentIdx);
//
//            minDeleHeapify(parentIdx,arr,size);
//        }
//
//    }
//    public static int rootDeleteInMinHeap(int[] arr,int firstIdx,int size) {       //  deleteInMinHeap  ---------->>
//        arr[0]=arr[size-1];
//        size--;
//        minDeleHeapify(firstIdx,arr,size);
//        return size;
//    }
//    public static void display(int[]arr,int n){
//        for (int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        int[]arr = new int[1000];        // first we create any random size array;
//        arr[0]=50;
//        arr[1]=60;
//        arr[2]=70;
//        arr[3]=150;
//        arr[4]=90;
//        arr[5]=110;
//
////        int a =6;
////         display(arr,a);
////      a = insertInMinHeap(arr,a,30);
////       display(arr,a);
//
//        int b = 6;
//        display(arr,b);
//        b=rootDeleteInMinHeap(arr,0,b);
//        display(arr,b);
//    }
//}


           // Insertion in Max Heap  And deletion  -------------------->>

//public class Heap {
//     public static void swap(int[] arr,int i,int j){
//         int temp = arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//
//     }
//     public static void displayArr(int[] arr,int a){
//         for (int i=0;i<a;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//
//     public static void maxInsertionHeapify(int idx,int[]arr){
//         if (idx==0) return;
//         int parentIdx=Math.abs((idx-1)/2);
//         if(arr[idx]>arr[parentIdx]){
//             swap(arr,idx,parentIdx);
//
//             maxInsertionHeapify(parentIdx,arr);
//         }
//     }
//     public static int insertionInMaxHeap(int[] arr,int size,int val){     //  insertionInMaxHeap ---------->>>>>
//         size+=1;
//         arr[size-1]=val;
//         maxInsertionHeapify(size-1,arr);
//         return size;
//     }
//
//     public static void deletionMaxHeapify(int idx,int[]arr,int size){
//         int parentIdx=idx;
//         int leftChidIdx=2*parentIdx+1;
//         int rightChildIdx=2*parentIdx+2;
//         if (leftChidIdx<size && arr[parentIdx]<arr[leftChidIdx]) {
//             parentIdx=leftChidIdx;
//         }
//         if (rightChildIdx<size && arr[parentIdx]<arr[rightChildIdx]) {
//             parentIdx=rightChildIdx;
//         }
//         if (parentIdx!=idx) {  // that means any bigger value is present left or right child
//             swap(arr,idx,parentIdx);
//             deletionMaxHeapify(parentIdx,arr,size);
//         }
//
//     }
//     public static int rootDeletionInMaxHeap(int[] arr,int firstidx,int size){     // Root deletion In Max Heap  ---------------->>>
//         // last element is present now arr[0] so first/root now not present in the array
//         arr[firstidx]=arr[size-1];
//         size--;
//         deletionMaxHeapify(firstidx,arr,size);
//
//     }
//    public static void main(String[] args) {
//        int[] arr = new return size;
////int[100];    // first we create any random size array;
//        arr[0]=200;
//        arr[1]=180;
//        arr[2]=130;
//        arr[3]=90;
//
////        int a = 4;  // because array now have 4 elements
////        displayArr(arr,a);
////       a = insertionInMaxHeap(arr,a,250);
////        displayArr(arr,a);
//
//        int b =4;
//        displayArr(arr,b);
//        b=rootDeletionInMaxHeap(arr,0,b);
//        displayArr(arr,b);
//    }
//}




       //   Heapify function ------------>>> to fix any Min heap and Max heap  using Down heapify------>>
               // Time complexity : O(logn)
//
//public class Heap {
//    public static void swap(int[] arr,int i,int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//    public static void display(int[] arr,int size){
//        for (int i=0;i<size;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//
//    public static void heapifyForMin(int[] arr,int idx,int size){      // heapifyForMin--------->>
////        if (size==0 || size==1) return; // that time no need to fix heap because there have 0 or 1 element
//        int parentIdx =idx;
//        int leftChildIdx=2*idx+1;
//        int rightChildIdx=2*idx+2;
//        if (leftChildIdx<size &&arr[parentIdx]>arr[leftChildIdx]) parentIdx=leftChildIdx;
//        if (rightChildIdx<size && arr[parentIdx]>arr[rightChildIdx] ) parentIdx=rightChildIdx;
//        if (parentIdx!=idx){
//            swap(arr,idx,parentIdx);
//            heapifyForMin(arr,parentIdx,size);
//        }
//    }
//
//    public static void heapifyForMaxHeap(int[] arr,int idx,int size){   // heapifyForMaxHeap------->>
//        int parentIdx=idx;
//        int leftChildIdx=2*idx+1;
//        int rightChildIdx=2*idx+2;
//        if (leftChildIdx<size && arr[parentIdx]<arr[leftChildIdx]) parentIdx=leftChildIdx;
//        if (rightChildIdx<size && arr[parentIdx]<arr[rightChildIdx]) parentIdx=rightChildIdx;
//        if (parentIdx!=idx){
//            swap(arr,idx,parentIdx);
//            heapifyForMaxHeap(arr,parentIdx,size);
//        }
//    }
//    public static void main(String[] args) {
//        int[] minarr = new int[100];
//        minarr[0]=22;
//        minarr[1]=40;
//        minarr[2]=300;  // 2 idx element is violating the min heap structure so fix the min heap
//        minarr[3]=70;
//        minarr[4]=80;
//        minarr[5]=50;
//        int size=6;
//        System.out.println("Before fix min heap ");
//        display(minarr,size);
//         heapifyForMin(minarr,2,size);
//        System.out.println("after fix min heap ");
//        display(minarr,size);
//
//
//        int[] maxHeapArr= new int[100];
//        maxHeapArr[0]=70;
//        maxHeapArr[1]=5;  // 1 idx element is violating the max heap structure so fix the min heap
//        maxHeapArr[2]=60;
//        maxHeapArr[3]=40;
//
//        System.out.println("Before fix max heap ");
//        display(maxHeapArr,size);
//        heapifyForMaxHeap(maxHeapArr,1,size);
//        System.out.println("after fix max heap ");
//        display(maxHeapArr,size);
//    }
//}

    //   Heapify function ------------>>> to fix any Min heap and Max heap  using Up heapify-------------->>
           // time Complexity : O(logn)

//public class Heap {
//    public static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//
//    public static void display(int[] arr, int size) {
//        for (int i = 0; i < size; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public static void fixMinHeapUpHeapify(int idx,int[] arr){  // fixMinHeapUpHeapify------->>
//        if (idx==0) return;
//        int parentIdx=Math.abs((idx-1)/2);
//        if (arr[idx]<arr[parentIdx]){
//            swap(arr,idx,parentIdx);
//               fixMinHeapUpHeapify(parentIdx,arr);
//        }
//    }
//
//    public static void fixMaxHeapUpHeapify(int idx,int[] arr){  // fixMinHeapUpHeapify------->>
//        if (idx==0) return;
//        int parentIdx=Math.abs((idx-1)/2);
//        if (arr[idx]>arr[parentIdx]){
//            swap(arr,idx,parentIdx);
//            fixMaxHeapUpHeapify(parentIdx,arr);
//        }
//    }
//    public static void main(String[] args) {
//        int[] minarr = new int[100];
//        minarr[0]=22;
//        minarr[1]=40;
//        minarr[2]=3;  // 2 idx element is violating the min heap structure so fix the min heap
//        minarr[3]=70;
//        minarr[4]=80;
//        minarr[5]=90;
//        int size=6;
//
////        display(minarr,size);
////           fixMinHeapUpHeapify(2,minarr);
////        display(minarr,size);
//
//        int[] maxHeapArr= new int[100];
//        maxHeapArr[0]=70;
//        maxHeapArr[1]=500;  // 1 idx element is violating the max heap structure so fix the min heap
//        maxHeapArr[2]=60;
//        maxHeapArr[3]=40;
//        display(maxHeapArr,4);
//    fixMaxHeapUpHeapify(1,maxHeapArr);
//         display(maxHeapArr,4);
//    }
//}




         // Get min from minHeap , get max from maxHeap and delete min from minHeap , delete max From MaxHeap---->>

//public class Heap {
//    public static void swap(int[] arr,int i,int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//    public static void display(int[] arr,int size){
//        for (int i=0;i<size;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//        public static void heapifyForMin(int[] arr,int idx,int size){      // heapifyForMin--------->>
////        if (size==0 || size==1) return; // that time no need to fix heap because there have 0 or 1 element
//        int parentIdx =idx;
//        int leftChildIdx=2*idx+1;
//        int rightChildIdx=2*idx+2;
//        if (leftChildIdx<size &&arr[parentIdx]>arr[leftChildIdx]) parentIdx=leftChildIdx;
//        if (rightChildIdx<size && arr[parentIdx]>arr[rightChildIdx] ) parentIdx=rightChildIdx;
//        if (parentIdx!=idx){
//            swap(arr,idx,parentIdx);
//            heapifyForMin(arr,parentIdx,size);
//        }
//    }
//
//    public static void heapifyForMaxHeap(int[] arr,int idx,int size){   // heapifyForMaxHeap------->>
//        int parentIdx=idx;
//        int leftChildIdx=2*idx+1;
//        int rightChildIdx=2*idx+2;
//        if (leftChildIdx<size && arr[parentIdx]<arr[leftChildIdx]) parentIdx=leftChildIdx;
//        if (rightChildIdx<size && arr[parentIdx]<arr[rightChildIdx]) parentIdx=rightChildIdx;
//        if (parentIdx!=idx){
//            swap(arr,idx,parentIdx);
//            heapifyForMaxHeap(arr,parentIdx,size);
//        }
//    }
//    public static void getMinFromMinHeap(int[] arr,int size){  //getMinFromMinHeap------->>
//        if (size==0) return;
//        System.out.println("the min element is :"+arr[0]);// we know in Min heap min element is present array first position
//    }
//    public static void getMaxFromMaxHeap(int[] arr,int size){ //getMaxFromMaxHeap------>>>>
//        if (size==0) return;
//        System.out.println("the max element is :"+arr[0]);   // we know in Max heap max element is present array first position
//    }
//
//    public static int extractminOrDeleteMin(int[]arr,int size){  // extractminOrDeleteMin ------->>> it do return the delete element
//        if (size==0){
//            System.out.println("No element");
//        }
//        else if (size==1){
//            System.out.println(arr[0]);
//            size--;
//        }
//        else {
//            System.out.println(arr[0]);
//            swap(arr, size - 1, 0); // or arr[0] = arr[size-1]
//            size--;
//            heapifyForMin(arr, 0, size);
//        }
//        return size;
//    }
//    public static int extractMaxOrDeleteMax(int[]arr,int size){  // extractMaxOrDeleteMax ------->>> it do return the delete element
//        if (size==0){
//            System.out.println("No element");
//        }
//        else if (size==1){
//            System.out.println(arr[0]);
//            size--;
//        }
//        else {
//            System.out.println(arr[0]);
//            swap(arr, size - 1, 0);   // or arr[0] = arr[size-1]
//            size--;
//            heapifyForMaxHeap(arr, 0, size);
//        }
//        return size;
//    }
//    public static void main(String[] args) {
//        int[] maxHeapArr= new int[100];
//        maxHeapArr[0]=70;
//        maxHeapArr[1]=50;
//        maxHeapArr[2]=60;
//        maxHeapArr[3]=40;
//        int size=4;
//        getMaxFromMaxHeap(maxHeapArr,size);
//        display(maxHeapArr,size);
//          size = extractMaxOrDeleteMax(maxHeapArr,size);
//        display(maxHeapArr,size);
//
//
//        int[] minarr = new int[100];
//        minarr[0]=22;
//        minarr[1]=40;
//        minarr[2]=30;
//        minarr[3]=70;
//        minarr[4]=80;
//        minarr[5]=50;
//
//           int  sizeeee=6;
//           getMinFromMinHeap(minarr,sizeeee);
//        display(minarr,sizeeee);
//          sizeeee = extractminOrDeleteMin(minarr,sizeeee);
//        display(minarr,sizeeee);
//
//    }
//}


          // delete Any node or element in MAx And Min Heap --------->>
                // Time Complexity : O(logn)

//public class Heap {
//    public static void swap(int[] arr,int i,int j){
//        int temp = arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//    public static void display(int[] arr,int size){
//        for (int i=0;i<size;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//
//    public static void upHeapifyForMin(int idx,int[] arr){ //  Up Heapify For Min   -------->>
//        if (idx==0) return;
//        int parentIdx=Math.abs((idx-1)/2);
//        if (arr[idx]<arr[parentIdx]){
//            swap(arr,idx,parentIdx);
//            upHeapifyForMin(parentIdx,arr);
//        }
//    }
//    public static void upHeapifyForMax(int idx,int[] arr){  //  Up Heapify For Max   -------->>
//        if (idx==0) return;
//        int parentIdx=Math.abs((idx-1)/2);
//        if (arr[idx]>arr[parentIdx]){
//            swap(arr,idx,parentIdx);
//            upHeapifyForMax(parentIdx,arr);
//        }
//    }
//
//    public static void downHeapifyForMin(int idx,int[]arr,int size){  // Down Heapify For Min ----->>
//        int parentIdx=idx;
//        int leftChildIdx=2*idx+1;
//        int rightChildIdx = 2*idx+2;
//        if (leftChildIdx<size &&arr[parentIdx]>arr[leftChildIdx]) parentIdx=leftChildIdx;
//        if (rightChildIdx<size &&arr[parentIdx]>arr[rightChildIdx]) parentIdx=rightChildIdx;
//
//        if (parentIdx!=idx){
//            swap(arr,idx,parentIdx);
//            downHeapifyForMin(parentIdx,arr,size);
//        }
//    }
//    public static void downHeapifyForMax(int idx,int[]arr,int size){  // Down Heapify ForMax  ----->>
//        int parentIdx=idx;
//        int leftChildIdx=2*idx+1;
//        int rightChildIdx = 2*idx+2;
//        if (leftChildIdx<size && arr[parentIdx]<arr[leftChildIdx]) parentIdx=leftChildIdx;
//        if (rightChildIdx<size && arr[parentIdx]<arr[rightChildIdx]) parentIdx=rightChildIdx;
//
//        if (parentIdx!=idx){
//            swap(arr,idx,parentIdx);
//            downHeapifyForMax(parentIdx,arr,size);
//        }
//    }
//
//    public static int deleteAnyElementinMinHeap(int idx,int[] arr,int size){  // deleteAnyElementinMinHeap----->>
//        System.out.println(arr[idx]); // here the  index is which one i want to delete
//        arr[idx]=Integer.MIN_VALUE;
//        upHeapifyForMin(idx,arr);
//        arr[0]=arr[size-1];
//        size--;
//        downHeapifyForMin(0,arr,size);
//        return size;
//
//    }
//    public static int deleteAnyElementInMaxHeap(int idx,int[] arr,int size){     // deleteAnyElementin Max Heap----->>
//        System.out.println(arr[idx]);  // here the  index is which one i want to delete
//        arr[idx]=Integer.MAX_VALUE;
//        upHeapifyForMax(idx,arr);
//        arr[0]=arr[size-1];
//        size--;
//        downHeapifyForMax(0,arr,size);
//        return size;
//
//    }
//    public static void main(String[] args) {
//        int[] minarr = new int[100];
//        minarr[0]=22;
//        minarr[1]=40;
//        minarr[2]=30;
//        minarr[3]=70;
//        minarr[4]=80;
//        minarr[5]=50;
//
//        int size = 6;
//        display(minarr,size);
//        size  = deleteAnyElementinMinHeap(2,minarr,size);
//        display(minarr,size);
//
//
//        int[] maxHeapArr= new int[100];
//        maxHeapArr[0]=70;
//        maxHeapArr[1]=50;
//        maxHeapArr[2]=60;
//        maxHeapArr[3]=40;
//        int sizeee =4;
//        display(maxHeapArr,sizeee);
//        sizeee  = deleteAnyElementInMaxHeap(2,maxHeapArr,sizeee);
//        display(maxHeapArr,sizeee);
//
//    }
//}


           //  Build Min Heap and  Max Heap any random Array ---------->>>
               // Time Complexity : O(n)

//public class Heap {
//    public static void swap(int[] arr,int i,int j){
//        int temp = arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//    public static void display(int[] arr,int size){
//        for (int i=0;i<size;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//        public static void minHeapify(int idx,int[]arr,int size){
//        int parentIdx=idx;
//        int leftChildIdx=2*idx+1;
//        int rightChildIdx = 2*idx+2;
//        if (leftChildIdx<size && arr[parentIdx]>arr[leftChildIdx]) parentIdx=leftChildIdx;
//        if (rightChildIdx<size && arr[parentIdx]>arr[rightChildIdx]) parentIdx=rightChildIdx;
//
//        if (parentIdx!=idx){
//            swap(arr,idx,parentIdx);
//            minHeapify(parentIdx,arr,size);
//        }
//    }
//    public static void buildMinHeap(int[] arr,int size){   //  buildMinHeap ------>>>>
//         int lastElemetIdx = size-1;
//         int lastParent =Math.abs((lastElemetIdx-1))/2;
//         for (int i=lastParent;i>=0;i--){
//             minHeapify(i,arr,size);
//         }
//
//    }
//
//    public static void maxHeapify(int idx,int[] arr,int size){
//        int parentIdx = idx;
//        int leftchilIdx=2*idx+1;
//        int rightchildIdx=2*idx+2;
//        if (leftchilIdx<size && arr[parentIdx]<arr[leftchilIdx]) parentIdx=leftchilIdx;
//        if (rightchildIdx<size && arr[parentIdx]<arr[rightchildIdx]) parentIdx=rightchildIdx;
//        if (parentIdx!=idx){
//            swap(arr,idx,parentIdx);
//               maxHeapify(parentIdx,arr,size);
//        }
//    }
//    public static void bulidMaxHeap(int[]arr,int size){
//        int lastParentIdx=Math.abs(((size-1)-1)/2);  // here we want to find last element parent
//        for (int i=lastParentIdx;i>=0;i--){
//            maxHeapify(i,arr,size);
//        }
//    }
//
//    public static void main(String[] args) {
////        int[] arr =new int[100];
////        arr[0]=10;
////        arr[1]=5;
////        arr[2]=20;
////        arr[3]=2;
////        arr[4]=4;
////        arr[5]=8;
////        int size=6;
////        display(arr,size);
////        buildMinHeap(arr,size);
////        display(arr,size);
//
//        int[] maxheap = new int[100];
//        maxheap[0]=44;
//        maxheap[1]=69;
//        maxheap[2]=2;
//        maxheap[3]=72;
//        maxheap[4]=11;
//        maxheap[5]=80;
//        int sizeee=6;
//        display(maxheap,sizeee);
//        bulidMaxHeap(maxheap,sizeee);
//        display(maxheap,sizeee);
//    }
//}


                 //  Heap Sort ----------->>>>>>>>>>>


       // Heap sort on Max Heap--->> And Heap sort on min heap --------->>
            // Time complexity : O(n logn)
//public class Heap {
//    public static void swap(int[] arr,int i,int j){
//        int temp = arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//    public static void display(int[] arr,int size){
//        for (int i=0;i<size;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//       public static void maxHeapify(int idx,int[] arr,int size){
//        int parentIdx = idx;
//        int leftchilIdx=2*idx+1;
//        int rightchildIdx=2*idx+2;
//        if (leftchilIdx<size && arr[parentIdx]<arr[leftchilIdx]) parentIdx=leftchilIdx;
//        if (rightchildIdx<size && arr[parentIdx]<arr[rightchildIdx]) parentIdx=rightchildIdx;
//        if (parentIdx!=idx){
//            swap(arr,idx,parentIdx);
//               maxHeapify(parentIdx,arr,size);
//        }
//    }
//    public static void bulidMaxHeap(int[]arr,int size){
//        int lastParentIdx=Math.abs(((size-1)-1)/2);  // here we want to find last element parent
//        for (int i=lastParentIdx;i>=0;i--){
//            maxHeapify(i,arr,size);
//        }
//    }
//    public static void heapSortOnMaxHeap(int[] arr,int size){      // Heap Sort On Max Heap ------------>>> it create ascending order
//        if(size==0 || size==1) return; // That time we consider array already sorted
//        bulidMaxHeap(arr,size);    // O(n)
//
//        for (int i=size-1; i>=1;i--){  O(n)
//            swap(arr,0,size-1); // so every time the bigger element is present last
//            size--;
//            maxHeapify(0,arr,size); // O(logn)      so total O(n*logn)
//
//        }
//    }
//
//
//    public static void minHeapify(int idx,int[]arr,int size){
//        int parentIdx=idx;
//        int leftChildIdx=2*idx+1;
//        int rightChildIdx = 2*idx+2;
//        if (leftChildIdx<size && arr[parentIdx]>arr[leftChildIdx]) parentIdx=leftChildIdx;
//        if (rightChildIdx<size && arr[parentIdx]>arr[rightChildIdx]) parentIdx=rightChildIdx;
//
//        if (parentIdx!=idx){
//            swap(arr,idx,parentIdx);
//            minHeapify(parentIdx,arr,size);
//        }
//    }
//    public static void buildMinHeap(int[] arr,int size){   //  buildMinHeap ------>>>>
//         int lastElemetIdx = size-1;
//         int lastParent =Math.abs((lastElemetIdx-1))/2;
//         for (int i=lastParent;i>=0;i--){
//             minHeapify(i,arr,size);
//         }
//    }
//
//    public static void heapSortOnMinHeap(int[] arr,int size){  // Heap Sort On Min Heap ------------>>> it create decending order
//        if (size==0||size==1) return;
//
//        buildMinHeap(arr,size);
//        for (int i=size-1;i>=1;i--){  // O(n)
//            swap(arr,0,size-1);
//            size--;
//            minHeapify(0,arr,size);  // O(logn)      so total O(n*logn)
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = new int[100];
//        arr[0]=44;
//        arr[1]=69;
//        arr[2]=2;
//        arr[3]=72;
//        arr[4]=11;
//        arr[5]=80;
//        int sizeee=6;
//
//       display(arr,sizeee);
//       heapSortOnMaxHeap(arr,sizeee);
//       display(arr,sizeee);
//
//        display(arr,sizeee);
//        heapSortOnMinHeap(arr,sizeee);
//        display(arr,sizeee);
//
//    }
//}


            // In Build Priority queue Method --------->>>
  // the in Build function of priority queue create by-default Min Heap

//import java.util.PriorityQueue;
//
//public class Heap {
//    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        pq.add(10);
//        pq.add(60);
//        pq.add(2);
//        pq.add(15);
//        pq.add(70);
//        pq.add(8);
//
//        System.out.println(pq.size());
//        System.out.println(pq.peek());
//        while (!pq.isEmpty()){
//            System.out.print(pq.poll()+" ");
//        }
//        System.out.println();
//
//
//           // insertion Priority queue using for loop
//        int[] arr = {10,45,2,78,21,1,56,3,14};
//        for (int e: arr){
//            pq.add(e);
//        }
//        while (!pq.isEmpty()){
//            System.out.print(pq.poll()+" ");
//        }
//        System.out.println();
//
//
//            //  max heap  insert technique------>>
//        int[] arr2 = {10,45,2,78,21,1,56,3,14};
//        for (int e: arr2){
//            pq.add(-e);
//        }
//        while (!pq.isEmpty()){
//            int a = pq.poll();;
//            System.out.print(-a+" ");
//        }
//        System.out.println();
//
//    }
//}



            //  Kth Largest element in array --------<<>>>>>>>>>>>>>

//import java.util.PriorityQueue;
//public class Heap {
//    public static void swap(int[] arr,int i,int j){
//        int temp = arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//    public static void display(int[] arr,int size){
//        for (int i=0;i<size;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    public static void minHeapify(int idx,int[]arr,int size){
//        int parentIdx=idx;
//        int leftChildIdx=2*idx+1;
//        int rightChildIdx = 2*idx+2;
//        if (leftChildIdx<size && arr[parentIdx]>arr[leftChildIdx]) parentIdx=leftChildIdx;
//        if (rightChildIdx<size && arr[parentIdx]>arr[rightChildIdx]) parentIdx=rightChildIdx;
//
//        if (parentIdx!=idx){
//            swap(arr,idx,parentIdx);
//            minHeapify(parentIdx,arr,size);
//        }
//    }
//    public static void buildMinHeap(int[] arr,int size){   //  buildMinHeap ------>>>>
//        int lastElemetIdx = size-1;
//        int lastParent =Math.abs((lastElemetIdx-1))/2;
//        for (int i=lastParent;i>=0;i--){
//            minHeapify(i,arr,size);
//        }
//    }
//
//    public static void heapSortOnMinHeap(int[] arr,int size){  // Heap Sort On Min Heap ------------>>> it create decending order
//        if (size==0||size==1) return;
//
//        buildMinHeap(arr,size);
//        for (int i=size-1;i>=1;i--){
//            swap(arr,0,size-1);
//            size--;
//            minHeapify(0,arr,size);
//        }
//    }
//
//    public static void kthlargest(int[] arr,int kth,int size){      // Time complexity : O(nlogn)
//        heapSortOnMinHeap(arr,size);   // O(nlogn)
//        int ans=0;
//        int i=0;
//        while (kth>0){   // O(k)
//            ans=arr[i];
//            i++;
//            kth--;
//        }
//        System.out.println(ans);
//    }
//    public static void main(String[] args) {
//        int[] arr = {3,2,17,5,50,92,13,7};
//        int size= arr.length;
//
//        kthlargest(arr,2,size);
//
//
//    }
//}
             // Another way ------- inbuilt funtion ----->>

//import java.util.PriorityQueue;
//public class Heap {
//    public static void kthlargest(int[]arr,PriorityQueue<Integer> pq,int kth){  // time complexity : O(n logn)
//        for (int e: arr){ // O(n)
//            pq.add(-e); //O(logn)   // because inbuilt function create min heap
//        }
//        int ans=0;
//        for (int i=0;i<kth;i++){  // O(k)
//            ans= -pq.poll();
//        }
//        System.out.println(ans);
//
//    }
//    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        int[] arr = {3,2,17,5,50,92,13,7};
//        kthlargest(arr,pq,3);
//    }
//}

                 // Optimize or Better  Way  ------------->>>>>>>> Solved in leetcode

//import java.util.PriorityQueue;
//public class Heap {
//    public static void kthLargest(int[] arr,int kth){  // Time Complexity : O(nlogn)------>>>
//        PriorityQueue<Integer> pp = new PriorityQueue<>(); // java by-default create min heap
////        for (int e: arr){
////            pp.add(e);
////            if (pp.size()>kth) {
////                pp.poll();
////            }
////        }
////        System.out.println(pp.peek());
//              // Or---->>
//        for (int e: arr){
//            if(pp.size()<kth) {
//                pp.add(e);
//            }else if (pp.size()==kth && pp.peek()<=e){
//                pp.add(e);
//            }
//
//            if (pp.size()>kth) {
//                pp.poll();
//            }
//        }
//        System.out.println(pp.peek());
//    }
//    public static void main(String[] args) {
//        int[] arr = {3,2,17,5,50,92,13,7};
//          kthLargest(arr,3);
//
//    }
//}


                // Kth largest element in  a Stream   ---------->>>>> Solved in leetcode

//// class KthLargest {
////     int kth;
//// PriorityQueue<Integer> pq = new PriorityQueue<>();
//
////     public KthLargest(int k, int[] nums) {
////         kth=k;
////         for(int i=0;i<nums.length;i++){
////             pq.add(nums[i]);
////             if(pq.size()>k){
////                 pq.poll();
////             }
////         }
////     }
//
////     public int add(int val) {
////         pq.add(val);
////         if(pq.size()>kth){
////             pq.poll();
////         }
////         return pq.peek();
////     }
//// }
//            // Or
//class KthLargest {
//    int kth;
//    PriorityQueue<Integer> pq = new PriorityQueue<>();
//
//    public KthLargest(int k, int[] nums) {
//        kth=k;
//        for(int i=0;i<nums.length;i++){
//            if(pq.size()<k){
//                pq.add(nums[i]);
//            }else if(pq.size()==k && nums[i]>=pq.peek()){
//                pq.add(nums[i]);
//            }
//
//            if(pq.size()>k){
//                pq.poll();
//            }
//        }
//    }
//
//    public int add(int val) {
//        if(pq.size()<kth){
//            pq.add(val);
//        }
//        else if(pq.size()==kth && val>=pq.peek()){
//            pq.add(val);
//        }
//
//        if(pq.size()>kth){
//            pq.poll();
//        }
//        return pq.peek();
//    }
//}


           // Top k frequent Element ---------->>>>>> Solved in Leetcode ---->>

//class Solution {
//    public int[] topKFrequent(int[] nums, int k) {
//        HashMap<Integer,Integer> hm = new HashMap<>();
//        for(int e: nums){   // we create elemets frequency map
//            if(hm.containsKey(e)){
//                hm.put(e,hm.get(e)+1);
//            }else{
//                hm.put(e,1);
//            }
//        }
//        PriorityQueue< Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue()); //comparable
//        for(Map.Entry e: hm.entrySet()){
//            pq.add(e);
//        }
//        int[] ans = new int[k];
//        for(int i=0;i<k;i++){
//            ans[i]=pq.poll().getKey();  // because every element is entry now
//        }
//
//        return ans;
//    }
//}

            // Minimum rope coast ------ Solved in GFG ---------->>>

//class Solution {
//    long minCost(long arr[], int n) {
//        PriorityQueue<Long> pq = new PriorityQueue<>();// java default create min heap
//        for(long e: arr){ //TimeComplexity to add all element in Priorityqueue O(n logn)
//            pq.add(e);
//        }
//        long coast=0;
//        while(pq.size()!=1){ // that means then rope is connect complete
//            long a=pq.poll();
//            long b=pq.poll();
//            coast+=a+b;
//            pq.add(a+b);
//        }
//        return  coast;
//    }
//}


         // Find kth Closest Element ------- Solved in leetcode--------->>>>>

//class Solution {
//    public List<Integer> findClosestElements(int[] arr, int k, int x) {
//        List<Integer> ans = new ArrayList<>();
//
//        PriorityQueue<Integer> pq = new PriorityQueue<>( (a,b)->{
//            int diff1=Math.abs(a-x);
//            int diff2=Math.abs(b-x);
//            return (diff1==diff2)?a-b:diff1-diff2;
//        } );
//        for(int e: arr){
//            pq.add(e);
//        }
//        for(int i=1;i<=k;i++){
//            ans.add(pq.poll());
//        }
//
//        Collections.sort(ans);
//        return ans;
//
//    }
//}

                // Merge k sorted arrays in a array ---------------->> Solved in GFG ------->>

//class Solution{
//    static class pair{
//        int data;
//        int dataArrIdx;
//        int dataIdx;
//        pair(int d,int dai,int di){
//            this.data=d;
//            this.dataArrIdx=dai;
//            this.dataIdx=di;
//        }
//    }
//    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->(a.data-b.data));
//        for(int i=0;i<K;i++){
//            // pair p = new pair(arr[i][0],i,0);
//            pq.add(new pair(arr[i][0],i,0));
//        }
//
//        while(!pq.isEmpty()){
//            pair p = pq.poll();
//            ans.add(p.data);
//
//            p.dataIdx++;
//            if(p.dataIdx < arr[p.dataArrIdx].length){
//                p.data=arr[p.dataArrIdx][p.dataIdx];
//                pq.add(p);
//            }
//        }
//
//        return ans;
//
//
//    }
//}


              //  Find Median of a data Stream ------ Solved in leetcode ------------>>

//class MedianFinder {
//
//    PriorityQueue<Integer> max_pq = new PriorityQueue<>((a,b)->(b>a)?1:-1);
//    PriorityQueue<Integer> min_pq = new PriorityQueue<>(); // java induild method default create min Heap
//    public MedianFinder() {
//
//    }
//
//    public void addNum(int num) {
//        if(max_pq.isEmpty() || max_pq.peek()>num){
//            max_pq.offer(num);
//        }else{
//            min_pq.offer(num);
//        }
//
//        if(max_pq.size()+1 < min_pq.size()){//because two heap element difference would be 1(odd case) or same(even case) but not more than 1 because then we not find median
//            max_pq.add(min_pq.poll());
//        }else if(min_pq.size()+1 < max_pq.size()){
//            min_pq.offer(max_pq.poll());
//        }
//    }
//
//    public double findMedian() {
//        if(max_pq.size()==min_pq.size()){
//            double ans = ( max_pq.peek()+min_pq.peek() )/2d;  // d/D is for double data variable
//            return ans;
//        }else{
//            if(max_pq.size()>min_pq.size()){
//                return max_pq.peek();
//            }else{
//                return min_pq.peek();
//            }
//        }
//    }
//}




                //   HEAPS   ASSIGNMENT ------------->>>>

  // Problem -1  Kth largest element in an array ----------->>>>>>

//import java.util.PriorityQueue;
//public class Heap {
//    public static void kthLargest(int[] arr,int kth){  // Time Complexity : O(nlogn)------>>>
//        PriorityQueue<Integer> pp = new PriorityQueue<>(); // java by-default create min heap
////        for (int e: arr){
////            pp.add(e);
////            if (pp.size()>kth) {
////                pp.poll();
////            }
////        }
////        System.out.println(pp.peek());
//              // Or---->>
//        for (int e: arr){
//            if(pp.size()<kth) {
//                pp.add(e);
//            }else if (pp.size()==kth && pp.peek()<=e){
//                pp.add(e);
//            }
//
//            if (pp.size()>kth) {
//                pp.poll();
//            }
//        }
//        System.out.println(pp.peek());
//    }
//    public static void main(String[] args) {
//        int[] arr = {3,2,17,5,50,92,13,7};
//          kthLargest(arr,3);
//
//    }
//}


         //  Problem -2  Minimum rope coast ------ Solved in GFG ---------->>>
//
////class Solution {
////    long minCost(long arr[], int n) {
////        PriorityQueue<Long> pq = new PriorityQueue<>();// java default create min heap
////        for(long e: arr){ //TimeComplexity to add all element in Priorityqueue O(n logn)
////            pq.add(e);
////        }
////        long coast=0;
////        while(pq.size()!=1){ // that means then rope is connect complete
////            long a=pq.poll();
////            long b=pq.poll();
////            coast+=a+b;
////            pq.add(a+b);
////        }
////        return  coast;
////    }
////}


//   Problem -3        Top k frequent Element ---------->>>>>> Solved in Leetcode ---->>

//class Solution {
//    public int[] topKFrequent(int[] nums, int k) {
//        HashMap<Integer,Integer> hm = new HashMap<>();
//        for(int e: nums){   // we create elemets frequency map
//            if(hm.containsKey(e)){
//                hm.put(e,hm.get(e)+1);
//            }else{
//                hm.put(e,1);
//            }
//        }
//        PriorityQueue< Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue()); //comparable
//        for(Map.Entry e: hm.entrySet()){
//            pq.add(e);
//        }
//        int[] ans = new int[k];
//        for(int i=0;i<k;i++){
//            ans[i]=pq.poll().getKey();  // because every element is entry now
//        }
//
//        return ans;
//    }
//}


// Problem - 4   Last Stone weight ------ Solved in leetcode----------->>>>>>>

//class Solution {
//    public int lastStoneWeight(int[] stones) {
//        // First we create mac heap because we want every time two heavy weight stone
//        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(b-a));
//        for(int e: stones){
//            pq.offer(e);
//        }
//
//        while(pq.size()!=1 && !pq.isEmpty()){
//            int x = pq.poll();
//            int y = pq.poll();
//            if(x==y){
//                // then not do anything
//            }else{
//                pq.offer(x-y);
//            }
//        }
//
//        if(pq.size()==1) return pq.peek();
//        else return 0;
//    }
//}

         //  PRIORITY QUEUE  ASSIGNMENT ------>>>>

// problem-1    Reorganize string ----- Solved in leetcode---------->>>>

//class Solution {
//
//    static class pair{
//        char c;
//        int frequency;
//        pair(char c,int f){
//            this.c=c;
//            this.frequency = f;
//        }
//    }
//    public String reorganizeString(String s) {
//        int[]countFrequqency = new int[26];
//        for(int i=0;i<s.length();i++){
//            countFrequqency[s.charAt(i)-'a' ]+=1; // ex- a present 0 index b present 1 index c present 2 index so on....
//        }
//
//        PriorityQueue<pair> pq = new PriorityQueue<>((obj1,obj2)->(obj2.frequency-obj1.frequency));
//        for(int i=0;i<26;i++){
//            if(countFrequqency[i]>0){
//                pq.add(new pair((char)('a'+i),countFrequqency[i]));
//            }
//        }
//
//        String ans="";
//        pair block = pq.poll();
//        ans+=block.c;
//        block.frequency-=1;
//        while(pq.size()>0){  // means pq not empty;
//            pair temp = pq.poll();
//            ans+=temp.c;
//            temp.frequency-=1;
//            if(block.frequency>0){
//                pq.add(block);
//            }
//            block=temp;
//        }
//
//        if(block.frequency>0) return"";
//        else return ans;
//
//
//    }
//}


           // Problem -2  due half complete in leetcode ---------->>>


        // Problem-3 maximum score for removing stone(solitaire pile game) ---- Solved in leetcode----->>

//class Solution {
// public int maximumScore(int a, int b, int c) {
//  PriorityQueue<Integer> pq = new PriorityQueue<>((x,y)->(y-x));  // create Max Heap by comparable
//  pq.offer(a);
//  pq.add(b);
//  pq.offer(c);
//
//  int score=0;
//
//  while(pq.size()>1){
//   int pile1 = pq.poll();
//   int pile2 = pq.poll();
//   pile1--;
//   pile2--;
//   score++;
//   if(pile1>0) pq.add(pile1);
//   if(pile2>0) pq.add(pile2);
//  }
//  return score;
//
// }
//}


       // Problem -4   Half complete in leetcode---------->>

// Problem - 5     //  Find Median of a data Stream ------ Solved in leetcode ------------>>
//
////class MedianFinder {
////
////    PriorityQueue<Integer> max_pq = new PriorityQueue<>((a,b)->(b>a)?1:-1);
////    PriorityQueue<Integer> min_pq = new PriorityQueue<>(); // java induild method default create min Heap
////    public MedianFinder() {
////
////    }
////
////    public void addNum(int num) {
////        if(max_pq.isEmpty() || max_pq.peek()>num){
////            max_pq.offer(num);
////        }else{
////            min_pq.offer(num);
////        }
////
////        if(max_pq.size()+1 < min_pq.size()){//because two heap element difference would be 1(odd case) or same(even case) but not more than 1 because then we not find median
////            max_pq.add(min_pq.poll());
////        }else if(min_pq.size()+1 < max_pq.size()){
////            min_pq.offer(max_pq.poll());
////        }
////    }
////
////    public double findMedian() {
////        if(max_pq.size()==min_pq.size()){
////            double ans = ( max_pq.peek()+min_pq.peek() )/2d;  // d/D is for double data variable
////            return ans;
////        }else{
////            if(max_pq.size()>min_pq.size()){
////                return max_pq.peek();
////            }else{
////                return min_pq.peek();
////            }
////        }
////    }
////}


