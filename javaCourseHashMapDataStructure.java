



       //   <<------   HashMap and HashSet data Structure ---------------->>








                             //  HashMap Data Structure -------------------->>>>>>>>>>
//
//
//                             import java.util.HashMap;
//                             import java.util.Map;
//
//                             public class javaCourseHashMapDataStructure {
//    public static void main(String[] args) {
//
//        // Syntax -------->>>>>
//        HashMap<String, Integer> hm = new HashMap<>();
//
//        // Adding element ----------->>>>
//        hm.put("ram",18);
//        hm.put("ajay",21);
//        hm.put("karan",20);
//        hm.put("akash",18);
//        hm.put("nirmal",19);
//
//        // getting value ------->
//        System.out.println(hm.get("ram"));
//        System.out.println(hm.get("raaamu"));
//
//        // changing or updating values---------->>>>>
//        hm.put("ram",40);
//        System.out.println(hm.get("ram"));
//
//        // remove pair  or any entry -------->>>>
//        hm.remove("ajay");
//        System.out.println(hm.get("ajay"));
//        System.out.println(hm.remove("aasa"));
//
//        // put a new entry if that is not exist -------->>>>>
//        hm.putIfAbsent("rahul",25);
//        hm.putIfAbsent("karan",20);   // it is not add because it is exist
//
//        // get all key in hashmap -------->
//        System.out.println(hm.keySet());
//
//        // get all values in values
//        System.out.println(hm.values());
//
//        // get all entry ------->>>>>
//        System.out.println(hm.entrySet());
//
//
//        System.out.println();
//        // traverse all entries  --------->>>>>>>>>
//        for (String  e: hm.keySet()){        // key printing ----->>>>
//            System.out.println("Age of "+e+" is :");
//        }
//
//        System.out.println();
//        for (int e: hm.values()){      // values printing ----->>>>
//            System.out.println("age is "+e);
//        }
//
//
//        System.out.println();
//     for (Map.Entry<String ,Integer>  e: hm.entrySet()){
//         System.out.println("The age is "+e.getKey()+" is "+e.getValue());
//     }
//                  //  or --
//        System.out.println();
//      for (var e: hm.entrySet()){
//          System.out.println("The age is "+e.getKey()+" is "+e.getValue());
//      }
//
//
//
//
//    }
//}




               //   Implement Our Own HashMap DataStructre ----------------<<<>>>>>>>>>>>>>>
//
//
//                             import java.util.LinkedList;
//                             import java.util.Map;
//
//       public class javaCourseHashMapDataStructure {
//
//   static class MyHashMap<K,V>{
//        final int defaultCapacity=4;
//        final float defaultloadFactor=0.75f;
//        private int size;  // track the size
//        class Node{
//            K key;
//            V value;
//            Node(K key,V valu){
//                this.key=key;
//                this.value=valu;
//            }
//        }
//
//        public int capacity(){
//            return arr.length;   //  it means total hashtable size
//        }
//        public float loadFactor(){
//            return (size*1.0f)/arr.length;
//        }
//
//        public MyHashMap(){
//            initiyalizearr(defaultCapacity);
//        }
//
//        LinkedList<Node>[] arr;
//        public void initiyalizearr(int n){
//            arr=new LinkedList[n];
//            for (int i=0;i<arr.length;i++){
//                arr[i]=new LinkedList<>();
//            }
//        }
//
//
//        public int size(){
//            return size;
//        }
//
//
//
//        public int hashFunc(K key){
//            int a= key.hashCode();
//            return Math.abs(a)%arr.length;          // arr.length means  hashtable total size
//        }
//        private int seacrhinCurrentArr(LinkedList<Node> l,K key){
//            for (int i = 0;i<l.size();i++){
//                if (l.get(i).key==key){
//                    return i;
//                }
//            }
//            return -1;
//        }
//
//        public void rehash(){
//            LinkedList<Node>[] arr2=arr;
//            initiyalizearr(arr2.length*2);
//            size=0;
//            for (LinkedList<Node> e: arr2){
//                for (Node  n: e){
//                    put(n.key,n.value);
//                }
//            }
//        }
//
//        public void put(K key,V value){
//        int bi = hashFunc(key);
//          LinkedList<Node> currentArr = arr[bi];
//          int si = seacrhinCurrentArr(currentArr, key);
//          if (si==-1){
//              Node n = new Node(key,value);
//              currentArr.add(n);
//              size++;
//          }else {
//              Node nd = currentArr.get(si);
//              nd.value=value;
//          }
//
//          // Rehashing ---->>
//           if (size>=arr.length*defaultloadFactor){         // if hash map entry >= totalHashTableSize * defaultloadfactor
//               rehash();
//           }
//
//
//        }
//
//        public V get(K key){
//            int hashIdx= hashFunc(key);
//            LinkedList<Node> currArr= arr[hashIdx];
//            int si = seacrhinCurrentArr(currArr,key);
//            if (si!=-1){
//                return currArr.get(si).value;
//            }
//            return null;
//        }
//
//        public V remove(K key){          // because after remove the value of any key remove method give us the value
//            int hashIdx= hashFunc(key);
//            LinkedList<Node> currArr= arr[hashIdx];
//            int si = seacrhinCurrentArr(currArr,key);
//            if (si!=-1){
//                Node n = currArr.get(si);
//                V val=n.value;
//                currArr.remove(si);   // this remove method is not our remove method it is collection framework's method
//                size--;
//                return val;
//            }
//            return null;
//        }
//
//    }
//    public static void main(String[] args) {
//
//        MyHashMap<String, Integer> hm = new MyHashMap<>();
//        hm.put("ram",21);
//        hm.put("ram" , 25);
//        System.out.println(hm.size);
//        hm.put("ramu",19);
//        hm.put("ajay",21);
//        System.out.println(hm.size);
//
//        System.out.println(hm.get("ram"));
//        System.out.println(hm.remove("ajay"));
//        System.out.println(hm.size);
//
//        System.out.println(hm.get("gah"));
//        System.out.println(hm.remove("jksdkj"));
//
//        hm.put("hari",40);
//        hm.put("harish",32);
//        hm.put("milan",22);
//        System.out.println(hm.size);
//
//        System.out.println(hm.capacity());
//        System.out.println(hm.loadFactor());
//
//
//    }
//}








                        //   HashMap  Problems---------------------------->>>>>>>>>>>>



            // problem-1  : (Two sum equal to target) Find two element indices which sum equal to target----------->>>>>>>>>>
                       // Time complexity : O(n);
                        // Space Compexity :O(n)
//
//
//
//    import java.util.arrays;
//    import java.util.HashMap;
//
//    public class javaCourseHashMapDataStructure {
//    public static void main(String[] args) {
//
//        int[] arr = {2,5,7,6,3};
//        int target= 9;
//        int[] result ={-1,-1};         // because if two element sum is not equal to target then we print -1,-1 index
//        HashMap<Integer,Integer> hmap = new HashMap<>();
//        for (int i=0;i<arr.length;i++){
//            hmap.put(arr[i],i);
//        }
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==target && hmap.containsKey(0)){
//                result[0]= i;
//                result[1]=hmap.get(0);
//                break;      // this break is important
//            }else if (hmap.containsKey(target-arr[i]) && hmap.get(target-arr[i]) >i){
//                result[0]=i;
//                result[1]=hmap.get(target-arr[i]);
//                break;  // this break is important
//            }
//        }
//
//        System.out.println(arrays.toString(result));
//
//    }
//}



//                             // or ------>>>>>
//
//         // problem-1  : (Two sum equal to target) Find two element indices which sum equal to target----------->>>>>>>>>>
//                      // Time complexity : O(n);
//                      // Space Compexity :O(n)
//
//
//
//                             import java.util.Arrays;
//                             import java.util.HashMap;
//
//       public class javaCourseHashMapDataStructure{
//      public static void main(String[] args) {
//
//          int[] arr = {2,5,7,6,3};
//          int target= 9;
//          int[] ans = {-1,-1};
//          HashMap<Integer,Integer> hm = new HashMap<>();
//          for (int i=0;i<arr.length;i++){
//              if (hm.containsKey(target-arr[i])){
//                  ans[0]=hm.get(target-arr[i]);
//                  ans[1]=i;
//                  break;
//              }else {
//                  hm.put(arr[i],i);
//              }
//          }
//
//          System.out.println(Arrays.toString(ans));
//
//      }
//}





                  //  problem -2   Find first non repeating character in a string  ------------->>>.
                           //  ex-  skills    here  k and i is non repeating   but k is first non repeating value.
                                     // Time complexity : O(n);
                                     // Space Compexity :O(n)
//
//
//      import java.util.HashMap;
//      public class javaCourseHashMapDataStructure{
//      public static void main(String[] args) {
//
//          String  ss = "skills";           // string
//          HashMap<Character,Integer> hm = new HashMap<>();
//          for (int i=0;i<ss.length();i++){
//              if (hm.containsKey(ss.charAt(i))){
//                  hm.put(ss.charAt(i),hm.get(ss.charAt(i))+1);
//              }else {
//                  hm.put(ss.charAt(i),1);
//              }
//          }
//
//          int a=-1;
//          for (int i=0;i<ss.length();i++){
//              if (hm.get(ss.charAt(i))==1){
//                  System.out.println("The first non repeating value is :"+ ss.charAt(i));
//                  a=1;
//                  break;
//              }
//          }
//
//          if (a==-1){
//              System.out.println("No Non-repeating character present here !!!!!!");
//          }
//
//
//
//
//      }
//}


                             //  Most frequent element ---------->>>>>>
//
//                             import java.util.HashMap;
//
//                             public class javaCourseHashMapDataStructure {
//         public static void main(String[] args) {
//
//             int[] arr = {5,5,2,7,2,3,2};
//             HashMap<Integer,Integer> hma = new HashMap<>();
//             for (int i=0;i<arr.length;i++){
//                 if (hma.containsKey(arr[i])){
//                     hma.put(arr[i], hma.get(arr[i])+1);
//                 }else {
//                     hma.put(arr[i],1);
//                 }
//             }
//             int max=0;
//             int element=-1;
//             for (int i=0;i<arr.length;i++){
//                 if (hma.get(arr[i])>max){
//                     max=hma.get(arr[i]);
//                     element=arr[i];
//                 }
//             }
//
//             System.out.println("The most frequent element is "+element);
//
//
//         }
//}




                  //  checking a string Anagram or Not ------------>>>>>>>






                             //   Using two HashMap for two string---------->>>>


// class Solution {

//     public  HashMap<Character,Integer> checkAnagram(String ss){
//         HashMap<Character,Integer> hm = new HashMap<>();
//         for(int i=0;i<ss.length();i++){
//             if(hm.containsKey(ss.charAt(i))){
//                  hm.put(ss.charAt(i),hm.get(ss.charAt(i))+1);
//             }else{
//                hm.put(ss.charAt(i),1);
//             }
//         }

//         return hm;
//     }
//     public boolean isAnagram(String s, String t) {
//         if(s.length() !=t.length()){
//             return false;
//         }
//         HashMap<Character,Integer> hm1 = checkAnagram(s);
//         HashMap<Character,Integer> hm2 = checkAnagram(t);

//         return hm1.equals(hm2);


//     }
// }



                             // USing One HashMap for two string----------->>>>>>
                                      // solved in leetcode ----------------->>>>>>

//                             class Solution {
//
//                                 public static HashMap<Character,Integer> checkAnagram(String ss){
//                                     HashMap<Character,Integer> hm = new HashMap<>();
//                                     for(int i=0;i<ss.length();i++){
//                                         if(hm.containsKey(ss.charAt(i))){
//                                             hm.put(ss.charAt(i),hm.get(ss.charAt(i))+1);
//                                         }else{
//                                             hm.put(ss.charAt(i),1);
//                                         }
//                                     }
//                                     return hm;
//                                 }
//                                 public boolean isAnagram(String s, String t) {
//                                     if(s.length()!=t.length()){
//                                         return false;
//                                     }
//                                     HashMap<Character,Integer> hm = checkAnagram(s);
//
//                                     for(int i=0;i<t.length();i++){
//                                         if(!hm.containsKey(t.charAt(i))){
//                                             return false;
//                                         }else{
//                                             hm.put(t.charAt(i),hm.get(t.charAt(i))-1);
//                                         }
//                                     }
//
//                                     for(int i=0;i<s.length();i++){
//                                         if(hm.get(s.charAt(i))!=0){
//                                             return false;
//                                         }
//                                     }
//                                     return true;
//                                 }
//                             }
//
//




                             //   check two String  is isomorphic or not ---------->>>>
                        //  solved in leetCode ------->>>>>>

//
//    //  using HashMap total time complexity O(n^2) ------->>>>


//            // total time complexity O(n^2)

//      class Solution {
//     public boolean isIsomorphic(String s, String t) {

//        HashMap<Character,Character>  hm = new HashMap<>();
//        for(int i=0;i<s.length();i++){      // O(n)
//            if(hm.containsKey(s.charAt(i))){
//               if(hm.get(s.charAt(i)) !=t.charAt(i)){  // O(1)
//                   return false;
//               }
//            }else if(hm.containsValue(t.charAt(i))){  // O(n)  because search hashmap value take O(n) time
//                return false;
//            }
//            else{
//                hm.put(s.charAt(i),t.charAt(i)); // O(1)
//            }
//        }

//        return true;

//     }
// }
//
//
//
//
//
//
//
//                             //  //  using HashSet total time complexity O(n) ------->>>>
//
//                             // total time complexity O(n)
//
//                             class Solution {
//                                 public boolean isIsomorphic(String s, String t) {
//
//                                     HashMap<Character,Character>  hm = new HashMap<>();
//                                     HashSet<Character> hs = new HashSet<>();
//                                     for(int i=0;i<s.length();i++){      // O(n)
//                                         if(hm.containsKey(s.charAt(i))){
//                                             if(hm.get(s.charAt(i)) !=t.charAt(i)){  // O(1)
//                                                 return false;
//                                             }
//                                         }else if(hs.contains(t.charAt(i))){  // O(1)  because search hashset value take O(n) time
//                                             return false;
//                                         }
//                                         else{
//                                             hm.put(s.charAt(i),t.charAt(i)); // O(1)
//                                             hs.add(t.charAt(i));
//                                         }
//                                     }
//
//                                     return true;
//
//                                 }
//                             }
//






                             //  Largest Subarray length  with 0 sum  ---------------->>>>>>>
//
//
//                             import java.util.HashMap;
//
//        public class javaCourseHashMapDataStructure{
//       public static void main(String[] args) {
//
////           int[] arr = {15,-2,2,-8,1,7,10,-25};
//           int[] arr = {15,-2,2,-8,1,7,10};
//
//           int maxlength=0;
//           int prefixSum=0;
//           HashMap<Integer,Integer> hmp = new HashMap<>();
//           hmp.put(0,-1);             // key = array element  and value = indexes
//           for (int i=0;i<arr.length;i++){
//               prefixSum+=arr[i];
//               if (hmp.containsKey(prefixSum)){
//                   maxlength=Math.max(maxlength,i- hmp.get(prefixSum));
//               }else {
//                   hmp.put(prefixSum,i);
//               }
//           }
//
//           System.out.println(maxlength);
//
//
//       }
//}






                                 //  HashSet Data Structure ------->>>>
                       //  it contain only one type data   and it's all containing values are unique couldn't be duplicate.
                //  HashSet all operation take constant time which is  O(1)
//
//
//       import java.util.HashSet;
//
//       public class javaCourseHashMapDataStructure {
//           public static void main(String[] args) {
//
//               HashSet<String> hs = new HashSet<>();
//               hs.add("lokesh");
//               hs.add("ram");
//               hs.add("ram");   // hashSet can not take duplicate value
//               hs.add("manas");
//               System.out.println(hs.size());
//
//               System.out.println(hs.contains("ram"));
//
//               System.out.println(hs.remove("alok"));
//               System.out.println(hs.size());
//
//               System.out.println(hs);   // default printing
//
//               for (String s: hs){
//                   System.out.print(s+" ");
//               }
//
//           }
//}



                            // HashSet Problems ------>>>>>


       // Problem 1  ----->>>>>   Longest  Consecutive sequence .
             // Solved in leetcode --->
//
//
//       class Solution {
//           public int longestConsecutive(int[] nums) {
//               HashSet<Integer> hs = new HashSet<>();
//               for(int i=0;i<nums.length;i++){
//                   hs.add(nums[i]);
//               }
//
//               int max_length=0;
//               for(int i=0;i<nums.length;i++){
//                   if(!hs.contains(nums[i]-1)){
//                       int curr_num=nums[i];
//                       int curr_length=1;
//                       while(hs.contains(curr_num+1)){
//                           curr_num++;
//                           curr_length++;
//                       }
//                       max_length=Math.max(max_length,curr_length);
//                   }
//               }
//               return max_length;
//           }
//       }





                //  Problem-2 --> You are given n distinct pairs.Each pair is numbered from 1 to n.All these pairs are initialy put in a bag
       // you need to pair up each number you take one by one from the bag and for each number you look whether the pair of this number has
       // already been taken out of the bag or not if not that means the pair of this number is still in the bag you put the current number
       // on the table in front of him otherwise you put both numbers from the pair aside Print the maximum number of numbers that
       // were on the table at the same time.


//       import java.util.HashSet;
//
//       public class javaCourseHashMapDataStructure {
//           public static void main(String[] args) {
//
//               int[] bag={1,2,2,1,3,3};
//               HashSet<Integer> table = new HashSet<>();
//               int max_present_at_one_time=0;
//               for (int i=0;i<bag.length;i++){
//                   if (!table.contains(bag[i])){
//                       table.add(bag[i]);
//                   }else {
//                       table.remove(bag[i]);
//                   }
//                   max_present_at_one_time=Math.max(max_present_at_one_time , table.size());
//               }
//
//               System.out.println(max_present_at_one_time);
//           }
//       }






                    //   HashMap Assignment --------->>

    // problem-1    Take input in Hashmap and give the output sorted order based on keys
         // Time Complexity : O(n*logn)   // because TreeMap take logn time to sort one element so we enter n element so total time n*logn
          // Space Complexity : O(n)

//       import java.util.Scanner;
//       import java.util.TreeMap;
//       public class javaCourseHashMapDataStructure{
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            TreeMap<Integer,String > tm = new TreeMap<>();
//
//            System.out.println("Enter the number of entry you want to add ");
//            int n = sc.nextInt();
//            System.out.println("Enter entries ");
//            for (int i=0;i<n;i++){
//                int key = sc.nextInt();
//                String value = sc.nextLine();
//                tm.put(key,value);
//            }
//
//            System.out.println(tm);
//        }
//}


     // problem-2    Take input in Hashmap and give the output sorted order based on values
          // Time Complexity : O(n*logn)   // because TreeMap take logn time to sort one element so we enter n element so total time n*logn
          // Space Complexity : O(n)


//       import java.util.*;
//       public class javaCourseHashMapDataStructure{
//       public static void main(String[] args) {
//           Scanner sc = new Scanner(System.in);
//
//           TreeMap<String ,Integer> tm = new TreeMap<>();
//           System.out.println("Enter the number of entry you want to add ");
//           int n = sc.nextInt();
//           for (int i=0;i<n;i++){
//               int key = sc.nextInt();
//               String values = sc.next();
//               tm.put(values,key);
//           }
//           System.out.println(tm);
//
//       }
//}


       //   Problem 3   find duplicate element is present in array or not ---->>
       // Time Complexity : O(n)
       // Space Complexity : O(n)

//import java.util.*;
//public class javaCourseHashMapDataStructure {
//    public static void isDuplicate(int[] arr){
//        HashMap<Integer,Integer> hm =new HashMap<>();
//        boolean flag= false;
//        for (int i=0;i<arr.length;i++){
//            if (hm.containsKey(arr[i])){
//                flag=true;
//                break;
//            }else {
//                hm.put(arr[i],1);          //  hm.put(arr[i],1)  here key contains element and value contains it's count
//            }
//        }
//        if (flag){
//            System.out.println("yes");
//        }else {
//            System.out.println("No");
//        }
//    }
//    public static void main(String[] args) {
//        int [] arr = {2,3,2,4,5};
//        isDuplicate(arr);
//
//    }
//}


       // problem-4  find the largest element in the array and Min element in The Array  ------>>
              // Time Complexity : O(n*logn)
              // Space Complexity : O(n)

// import java.util.*;
//public class javaCourseHashMapDataStructure {
//    public static void findMax(int[] arr){
//        TreeMap<Integer,Integer> tm = new TreeMap<>();
//        for (int i=0;i<arr.length;i++){
//            tm.put(arr[i],0);    // 0 is default value purpose
//         }
//        System.out.println("The max element is : "+tm.lastEntry().getKey());    //  Now the array is totally sorted so max element is now last
//    }
//    public static void findMin(int[] arr){
//        TreeMap<Integer,Integer> tm = new TreeMap<>();
//        for (int i=0;i<arr.length;i++){
//            tm.put(arr[i],0);    // 0 is default value purpose
//        }
//        System.out.println("The min element is : "+tm.firstEntry().getKey());    //  Now the array is totally sorted so min element is now first
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {3,2,4,5,9,7};      //  here ans will be  9
//        findMax(arr);
//        findMin(arr);
//    }
//}


       //  Problem - 5   Given two string ransomNote and magazine return true if ransomNote can be constructed by using the
       //  letters from magazine and false otherwise. Each letter in magazine can only be used once in ransomNote
           // ex- ransomNote="aa" magazine="ab" false , ransomNote="aab" magazine="ab" false , ransomNote="aab" magazine="abac" true
                           // Time Complexity:O(n+m+n)=O(n+m)   // where  n = hm1 total size and  m = hm2 total size
                          //  Space Complexity :O(n+m)

       import java.util.HashMap;
       import java.util.Map;

       public class javaCourseHashMapDataStructure {
           public static void main(String[] args) {
               String ransomNote = "aad";
               String magazine = "aba";
               HashMap<Character,Integer> hm1 = new HashMap<>();
               HashMap<Character,Integer> hm2 = new HashMap<>();
               for (int i=0;i<ransomNote.length();i++){
                   char ch = ransomNote.charAt(i);
                   if (hm1.containsKey(ch)){
                       hm1.put(ch,hm1.get(ch)+1);
                   }
                   else {
                       hm1.put(ch,1);
                   }
               }
               for (int i=0;i<magazine.length();i++){
                   char cc = magazine.charAt(i);
                   if (hm2.containsKey(cc)){
                       hm2.put(cc,hm2.get(cc)+1);
                   }else {
                       hm2.put(cc,1);
                   }
               }

               boolean flaf=true;
               for (Map.Entry<Character, Integer> e: hm1.entrySet()){
                   if (!hm2.containsKey(e.getKey()) || e.getValue()>hm2.get(e.getKey())){
                       flaf=false;
                       break;
                   }
               }
               if (flaf){
                   System.out.println("True");
               }else {
                   System.out.println("False");
               }

           }
}