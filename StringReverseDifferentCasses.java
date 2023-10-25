public class StringReverseDifferentCasses {
    public static void main(String[] args) {



//             // Ex- "pw java" = "avaj wp"
//        String ss = "pw java";
//       //        System.out.println(ss.indexOf('a'));
//       //        System.out.println(ss.lastIndexOf('a'));
//
//        String ss1 = "";
//        for (int i=ss.length()-1;i>=0;i--){
//            ss1+=ss.charAt(i);
//        }
//        System.out.println(ss1);



//        // Ex- "pw java course" = "course java pw"
//        String ss = "pw java course";
//        String str="";
//       String st[] = ss.split(" ");
//       for (int i = st.length-1;i>=0;i--){
//           str+=st[i];
//           str+=" ";
//       }
//        System.out.println(str);






            //Reverse in same position Ex-"pw java"= "wp avaj"
        String ss= "pw java course";
        String ss1 = "";
        String []st = ss.split(" ");          // [pw,java,course]
         for (String e: st){
               for (int i = e.length()-1;i>=0;i--) {
                     ss1+=e.charAt(i);
               }
               ss1+=" ";
         }

        System.out.println(ss1);


    }
}
