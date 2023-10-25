
           //   Dynamic method dispatch --------->>>>>>>

     class parent{

    public void talk(){
        System.out.println("talking");
    }
    public void walk(){
        System.out.println("walking ");
    }
    public void laugh(){
        System.out.println("laughing");
    }
     }

     class child extends  parent{

     @Override
         public void walk(){
             System.out.println("walking fast");
         }
    public void chat(){
        System.out.println("chating someone");
    }
     }


public class cwh_dinamiyc_method_despatch {
    public static void main(String[] args) {
        parent ppp = new child();
        ppp.talk();
        ppp.walk();
      // ppp.chat();
    }
}
