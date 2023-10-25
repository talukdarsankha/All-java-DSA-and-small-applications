


public class JavaCourseTernaryOprater {

    public static void main(String[] args) {

        int a =20;
        int b= 40;
        // normal condition
        if (a<b){
            System.out.println("b is gretter");
        }else {
            System.out.println("a is geter");
        }


        // Ternary Operator Approach

         String ans =  (a<b)? "b is gretter" : "a is gretter";
        System.out.println(ans);

              // Or

        int i = (a<b)? b : a;
        System.out.println(i);

    }
}
