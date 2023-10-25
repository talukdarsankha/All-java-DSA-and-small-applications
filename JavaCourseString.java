



  //***** String are two type Immutable and mutable

public class JavaCourseString {
    public static void main(String[] args) {


        //*** Example of Immutable String

             // String Declaration
        String s1 = "pw skills";
        System.out.println(s1);
             // Or
        String s2 = new String("pw skills");
        System.out.println(s2);



             //*** Example of Mutable String
           // StringBuffer and StringBuilder
       StringBuffer ss = new StringBuffer("pw");
       ss.append("skills");
        System.out.println(ss);

        StringBuilder ss2 = new StringBuilder("pw ");
        ss2.append("Skills");
        System.out.println(ss2);





        // String references
        String sss1 = "pw skills";
        String sss2 = "Pw skills";
        String sss3 = new String("pw skills");
        String sss4 = new String("pw skills");
        //    == use for check the is objs are same String's or not
        System.out.println(sss1==sss2);
        System.out.println(sss3==sss4);





            // String concatenation using  concat and +

        String s= "pw";
        s1 =s.concat("skills");
             System.out.println(s);
        System.out.println(s1);

        String st = s+"Ski";
        System.out.println(st);
           // Examples on mutable Strings
        StringBuffer stt = new StringBuffer("sun");
        stt.append("shine");
        System.out.println(stt);
    }
}
