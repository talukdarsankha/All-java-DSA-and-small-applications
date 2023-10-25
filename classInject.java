////
////
//class car{
//    public void go(engine e){
//        e.start();
//    }
//}
//class  engine{
//    public void start(){
//        System.out.println("start engine");
//    }
//}
//public class classInject {
//    public static void main(String[] args) {
//        car c = new car();
//        engine ee = new engine();
//        c.go(ee);
//    }
//}






class car{

   private engine en;
   public car(engine e){
       this.en = e;
   }

   public void go(){
       en.start();
   }
}
class  engine{
    public void start(){
        System.out.println("start engine");
    }
}
public class classInject {
    public static void main(String[] args) {
      engine e =new engine();
        car c = new car(e);
       c.go();
    }
}
