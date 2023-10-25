
           // strings ------------->>>>>>>>>>>

//import java.util.Scanner;
//
//public class pw_string_recursions {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String  ss = sc.nextLine();
//
//        for (int i=0;i<ss.length();i++) {
//            System.out.println(ss.charAt(i));
//        }
//
//        System.out.println(ss.substring(2,ss.length()));
//        System.out.println(ss.substring(2));
//    }
//}







//
//     // ************* delete occurence ------------------------->>>>>>>>>>>>>>>
//
//           public class pw_string_recursions {
//
//         public static String delete_occurence(String ss,char c,int idx){
//             if (idx==ss.length()){
//                 return "";
//             }
//             String smallpart = delete_occurence(ss,c,idx+1);
//             if (ss.charAt(idx)!=c){
//                 return ss.charAt(idx)+smallpart;
//             }else {
//                 return smallpart;
//             }
//         }
//           public static void main(String[] args) {
//
//             String st = "kolkata";
//               System.out.println(delete_occurence(st,'k',0));
//               }
//}










//
//           // ************* delete occurence not passing index using substring------------------------->>>>>>>>>>>>>>>
//
//
//           public class pw_string_recursions {
//
//            public static String deleteOccurences(String st,char c){
//                if (st.length()==0){
//                    return "";
//                }
//                String small = deleteOccurences(st.substring(1),c); // ex- abcda = bcda = cda = da = a
//                if (st.charAt(0)!=c){
//                    return st.charAt(0)+small;
//                }else {
//                    return small;
//                }
//            }
//               public static void main(String[] args) {
//
//                   String st = "kolkata";
//               System.out.println(deleteOccurences(st,'k'));
//
//               }
//}
















                     //******** reverse a string ---------------->>>>>>>>>>>>

//           public class pw_string_recursions {
//
//       public static String reverse(String ss,int idx){
//           if (idx==ss.length()){
//               return "";
//           }
//           String sampel = reverse(ss,idx+1);
//           return sampel+ss.charAt(idx);
//       }
//               public static void main(String[] args) {
//
//           String ss = "am i";
//                   System.out.println(reverse(ss,0));
//               }
//}





//           //******** reverse a string without passing index using substring ---------------->>>>>>>>>>>>
//
//
//           public class pw_string_recursions {
//             public static String reverse(String ss){
//                 if (ss.length()==0){
//                     return "";
//                 }
//                 String small = reverse(ss.substring(1));
//                 return small+ss.charAt(0);
//             }
//               public static void main(String[] args) {
//                   String ss = "am i";
//                   System.out.println(reverse(ss));
//               }
//}













           // ********* find the string palindrome or not -------->>>>
           // ex- level it's reverse is = level So it is a palindrome--->>>>




//                     //\\//\\ find palindrome reverse or substring approach ---------->>>>>>
//           public class pw_string_recursions {
//    public static String reverse(String  ss){
//        if (ss.length()==0){
//            return "";
//        }
//        String small = reverse(ss.substring(1));
//        return small+ss.charAt(0);
//    }
//           public static void main(String[] args) {
//
//        String ss = "level";
//              // System.out.println(reverse(ss));
//               String ans = reverse(ss);
//               if (ans.equals(ss)){
//                   System.out.println("yes it is a palindrome");
//               }else {
//                   System.out.println("not");
//               }
//          }
//}



//                           //\\//\\//\\ find palindrome string with two pointer approach ----------->>>>>
//
//
//           public class pw_string_recursions {
//
//    public static boolean palindrome(String ss,int i, int j){
//        if (i>=j){
//            return true;
//        }
//        if (ss.charAt(i) != ss.charAt(j)) {
//            return false;
//        }
//        return palindrome(ss,i+1,j-1);
//    }
//               public static void main(String[] args) {
//
//        String name = "mam";
//                   if (palindrome(name,0,name.length()-1)) {
//                       System.out.println("yes palindrome");
//                   }
//                   else {
//                       System.out.println("not");
//                   }
//               }
//}















 //                     // ********** String Subsequences maintain order. ex- "abc"=abc,ab,ac,a,bc,b,c," " -------------------->>>>>>>>>>>>
//
//
//           import java.util.ArrayList;
//
//           public class pw_string_recursions {
//
//    public static ArrayList<String> subsequences(String  ss){
//        ArrayList<String> ans = new ArrayList<>();
//        if (ss.length()==0){
//            ans.add(" ");
//            return ans;
//        }
//
//        ArrayList<String> small = subsequences(ss.substring(1));
//        char c = ss.charAt(0);
//        for (String e: small){
//            ans.add(e);
//            ans.add(c+e);
//        }
//        return ans;
//    }
//               public static void main(String[] args) {
//
//        String ss = "abc";
//                   System.out.println(subsequences(ss));
//               }
//}















//      // ********** String Subsequences maintain order without ArrayList. ex- "abc"=abc,ab,ac,a,bc,b,c," " -------------------->>>>>>>>>>>>
//
//
//
//           public class pw_string_recursions {
//
//    public static void subsequence(String ss,String empty ){
//        if (ss.length()==0){
//            System.out.println(empty);
//            return;
//        }
//       char c = ss.charAt(0);
//       String ans = ss.substring(1);
//       subsequence(ans,empty+c);
//       subsequence(ans,empty);
//    }
//               public static void main(String[] args) {
//
//        String ss = "abc";
//        subsequence(ss," ");
//               }
//}















//                      // integer subsequences sum ------->>>>>
//
//
//           public class pw_string_recursions {
//    public static void subsequencesSum(int[] arr,int sum,int idx){
//        if (idx==arr.length){
//            System.out.println(sum);
//            return;
//        }
//        int current = arr[idx];
//        subsequencesSum(arr,sum+current,idx+1);
//        subsequencesSum(arr,sum,idx+1);
//    }
//               public static void main(String[] args) {
//                   int[]arr={2,4,5};
//                   subsequencesSum(arr,0,0);
//               }
//}











//
//                            // Frog jump minimum cost to arrive the last stone or last index ------------->>>>>>>>>>
//
//    public class pw_string_recursions {
//    public static int sum(int[]arr,int idx){
//        if (idx==arr.length-1){
//            return 0;
//        }
//        int op1 = Math.abs(arr[idx]-arr[idx+1])+sum(arr,idx+1);
//        if (idx==arr.length-2){
//            return op1;
//        }
//        int op2 = Math.abs(arr[idx]-arr[idx+2])+sum(arr,idx+2);
//        return Math.max(op1,op2);
//    }
//        public static void main(String[] args) {
//
//        int[]arr ={10,20,30,40,30};
//            System.out.println(sum(arr,0));
//        }
//}














                  // ****   char - char = integer ex- '2'-'0'=2;


        // keypad posibel combination 2(abc), 4(ghi) = ag,ah,ai , bg,bh,bi , cg,ch,ci ;


           public class pw_string_recursions {
    public static void combinations(String enter , String[] keypad,String ans){
        if (enter.length()==0){
            System.out.println(ans+" ");
            return;
        }
        int current = enter.charAt(0)-'0';
     String alphabets = keypad[current];
     for (int i =0;i<alphabets.length();i++){
         combinations(enter.substring(1),keypad,ans+alphabets.charAt(i));
     }
    }
               public static void main(String[] args) {
             String ss = "23";
             String[] keypad = {" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
             combinations(ss,keypad," ");
               }
}