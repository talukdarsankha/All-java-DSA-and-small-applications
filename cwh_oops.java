
      //   class , constructor, getr,seter, methods in class --------->>>>


//class normal{
//    int x;
//    int y;
//
//    public void setX(int x){
//        this.x=x;
//    }
//    public void setY(int y){
//        this.y=y;
//    }
//    public int getX(){
//        return x;
//    }
//    public int getY(){
//        return y;
//    }
//}
//public class cwh_oops {
//    public static void main(String[] args) {
//        normal n = new normal();
//        n.setX(5);
//        n.setY(10);
//        System.out.println(n.getX());
//        System.out.println(n.getY());
//    }
//}






//class sample{
//    int x;
//    int y;
//
//    public sample(int x, int y){
//        this.x=x;
//        this.y = y;
//    }
//
//    public int getX() {
//        return x;
//    }
//
//    public int getY() {
//        return y;
//    }
//}
//public class cwh_oops {
//    public static void main(String[] args) {
//        sample ss = new sample(5,10);
//        System.out.println(ss.getX());
//        System.out.println(ss.getY());
//    }
//}








      // inheritance  -------->>>>>




//      class parent{
//    int x;
//
//          public void setX(int x) {
//              this.x = x;
//          }
//
//          public int getX(){
//        return x;
//    }
//      }
//
//      class  child extends parent{
//      int y =38;
//
//          public int getY() {
//              return y;
//          }
//
//          public void setY(int y) {
//              this.y = y;
//          }
//      }
//      public class cwh_oops {
//          public static void main(String[] args) {
//              parent pp = new parent();
//              pp.setX(465);
//              System.out.println(pp.getX());
//              System.out.println(pp.getClass());
//
//
//              child cc= new child();
//              cc.setY(7);
//              System.out.println(cc.getY());
//
//              System.out.println(pp.getX());
//          }
//}





//      class base{
//     public base(){
//         System.out.println("iam am a contructor of base class");
//     }
//
//     public base(int a){
//         System.out.println("iam am a contructor of base class with tahe valive of a as :"+a);
//     }
//      }
//
//      class derived extends base{
//     public derived(){
//         super(785);
//         System.out.println("i am a derived class constructor");
//     }
//
//     public derived(int c, int w){
//         super(56);
//         System.out.println("i am a derived class constructor with the value of c,w as : "+c+" "+w);
//     }
//      }
//
//
//      class child_of_derived extends derived{
//
//    public child_of_derived(int a,int s,int b){
//        super(4,8);
//        System.out.println("i am a constructor of child_of_derived with the values a,s,c as :"+a+" "+s+" "+b);
//    }
//      }
//      public class cwh_oops {
//          public static void main(String[] args) {
////              base bb = new base();
////
////              base bs = new base(74);
//         //     derived dd = new derived();
//             // derived dd = new derived();
//        // derived dd= new derived(2,6);
//
// child_of_derived  cod = new child_of_derived(4,5,5);
//          }
//}








          //  method override ----->>>>

      class phone {
    public void call(){
        System.out.println("calling in phone");
    }

    public void camera(){
        System.out.println("taking photos");
    }
      }

      class smartphone extends phone{
      @Override
    public void call(){
        System.out.println("calling for smartphone");
    }
    public void see(){
        System.out.println("see youtube");
    }
      }
      public class cwh_oops {
          public static void main(String[] args) {
              phone pp = new phone();
              pp.call();
              pp.camera();
              smartphone ss = new smartphone();
              ss.call();
              ss.camera();
              ss.see();
          }
}