
          // Lamda expreesion use only for functional interface mean one method interface.


   interface aa1{
    //public void meth();

    //   public void meth(int age);

       public void meth(int age1,int age2);
   }

public class LamdaExpression {
    public static void main(String[] args) {
//        aa1 a = new aa1() {
//            @Override
//            public void meth() {
//                System.out.println("meth...");
//            }
//        }  ;
//        a.meth();


         // 0 parameter
//        aa1 a = ()-> System.out.println("meth..");
//        a.meth();

        // 1 parameter
//   aa1 a = age -> System.out.println(age);
//
//   a.meth(19);



        aa1 a = (age1,age2)-> System.out.println(age1 + " "+age2);
        a.meth(12,11);

    }
}
