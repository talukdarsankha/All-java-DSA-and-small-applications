//      ****     methods is a function which is written in class----------->>>



//public class Cwh_Methods {
//    static int sum(int x,int y){
//        return x+y;
//    }
//
//    static void sum1(int x,int y){
//        System.out.println(x+y);
//    }
//
//
//
//    public static void main(String[] args) {
//
//        System.out.println(sum(1,2));
//        sum1(1,2);
//    }
//}



//
//          // without static ------->>>>>>>>>>
//
//
//public class Cwh_Methods{
//    public int sum(int x,int y){
//        return x+y;
//    }
//
//    public void sum1(int x,int y){
//        System.out.println(x+y);
//    }
//
//    public static void main(String[] args) {
//
//        Cwh_Methods cc = new Cwh_Methods();
//        System.out.println(cc.sum(1,2));
//        cc.sum1(1,2);
//    }
//}





//
//      //     **    methods overloding ------------->>>>>>>>>>
//          /*     method overloading a method name change korira overloading kora jay na
//         jemon foo take foo2 amon kora jabe na  ----->>>>>>>>>> */
//
//public class Cwh_Methods {
//    public static void foo(){
//        System.out.println("good morning");
//    }
//
//    public static void foo(int a){
//        System.out.println("good morning"+a);
//    }
//
//    public static void foo(int a,int b){
//        System.out.println("good morning"+a+" "+b);
//    }
//    public static void main(String[] args) {
//        foo();
//        foo(2);
//        foo(2,78);
//    }
//}





         //  varargs --------->>>>>>>>>  example (int ...arr)
public class Cwh_Methods {
    public static int sum(int ...arr){
        int ans =0;
        for (int e: arr){
            ans+=e;
        }
        return ans;
    }

    public static float floatsum(float ...mmn){
        int result =0;
        for (float e:mmn){
            result+=e;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(4,5));
        System.out.println(sum(7,1,4));
        System.out.println(sum(4,1,2,5,3,6,21));

        // floatsum

        System.out.println(floatsum(4.2f,2.1f));
    }
}