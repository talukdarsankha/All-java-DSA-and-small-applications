import java.util.Arrays;

public class StringExcercise {
    public static void main(String[] args) {

//        String  ss = "  namess  s";
//       // System.out.println(ss.replace("m","mm"));
//       // System.out.println(ss.replace("  ",""));
//        System.out.println(ss);
//        System.out.println(ss.trim());
//
//        String s = "      Sankha talukdar      ";
//        System.out.println(s);
//        System.out.println(s.trim());   // trim korle sider barti space guja jay ga






//        // ***** Palindrome      jodi kono string reverse korleu String oitai thake tale sei ta palindrome
//        String st = "Madam";
//        String ss = "";
//        for (int i=st.length()-1;i>=0;i--){
//            ss+=st.charAt(i);
//        }
//        if (st.equalsIgnoreCase(ss)){
//            System.out.println("it is palindrome");
//        }else {
//            System.out.println("it is not");
//        }







//        //**** Anagram   jodi kono string a jei alphabate gula ase shudhu seigula use koira arekta string toiri kora hoy tale anagram.
//        // Ex- the pot = top the
//
//        String s1 = "Them Top no";
//        String s2 = "pottmhe on";
//
//        // Jehetu immutable tai chage hoy na kintu notun toiri hoy oitake obj dite lage.
//        s1= s1.replace(" ","");
//        s2=s2.replace(" ","");
//
//         s1=  s1.toLowerCase();
//          s2= s2.toLowerCase();
//          char c1[]=s1.toCharArray();
//          char c2[] =s2.toCharArray();
//        Arrays.sort(c1);
//        Arrays.sort(c2);
//
//        if(Arrays.equals(c1,c2)){
//            System.out.println(" yes is it Anagram");
//        }else {
//            System.out.println(" Not is it Anagram");
//        }






        //** Panagram -- if a to z all alphabate are use a string so it is panagram.
        // ex-"The Quick Brown Fox Jumps over the lazy dog"

        boolean flag = true;
        String  ss = "The Quick Brown Fox Jumps over the lazy dog";
        ss=ss.replace(" ","");  // jehehut immutable
        ss=ss.toUpperCase();
        char cc[] =ss.toCharArray();

        int cc1[] =new int[26];   // because a to z alphabates are 26;
        for (int i=0;i<cc.length;i++){
            cc1[cc[i]-65]++;
        }


        for (int i=0;i< cc1.length;i++){
            if (cc1[i]==0) {
                flag=false;
            }
        }

        if (flag==true){
            System.out.println(" it is pangram");
        }else {
            System.out.println("it not a panagram");
        }


    }
}
