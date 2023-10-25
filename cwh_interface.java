
            // interface --------->>>>>
            // interface a body theke na override korte lage------>
            // onek gula interface diya akta class toiri kora jay kintu akta class extend koira aktai class banano jay------->>>
             // onek gula interface ar akta class extend koirau akta class ke toiri kora jay ----->>>>

//interface rickshaw {
//    public void wheel();
//    public void handel();
//}
//
//class toto implements rickshaw{
//    @Override
//    public void handel() {
//        System.out.println("control and move ");
//    }
//
//    @Override
//    public void wheel() {
//        System.out.println("go ");
//    }
//
//    public void light(){
//        System.out.println("light on road");
//    }
//}
//public class cwh_interface {
//    public static void main(String[] args) {
//        toto tt= new toto();
//        tt.handel();
//        tt.wheel();
//        tt.light();
//    }
//}



//            interface cellphone{
//             public void call();
//
//            }
//            interface Phone {
//    public void camera();
//    public void music();
//            }
//
//            class touchphone{
//     public void wifi(){
//         System.out.println("net");
//     }
//     public void gps(){
//         System.out.println("locations");
//     }
//            }
//
//            class Smartphone  extends touchphone implements cellphone,Phone{
//                @Override
//                public void call() {
//                    System.out.println("calling");
//                }
//
//                @Override
//                public void camera() {
//                    System.out.println("take photos");
//                }
//
//                @Override
//                public void music() {
//                    System.out.println("play songs");
//                }
//
//
//            }
//            public class cwh_interface {
//                public static void main(String[] args) {
//                    Smartphone ss= new Smartphone();
//                    ss.call();
//                    ss.camera();
//                    ss.music();
//                    ss.gps();
//                    ss.wifi();
//                }
//}


            // default interface --------->>>>
            // interface ar body thake na override korte lage kintu samne default dile body deyoya jay ar override na korleu hoy------>>>>>

//            interface bycycel{
//         public void horn();
//        default public void light(){
//            System.out.println("light of onn");
//        }
//            }
//
//            class car implements bycycel{
//                @Override
//                public void horn() {
//                    System.out.println("horn");
//                }
//            }
//            public class cwh_interface {
//                public static void main(String[] args) {
//                    car cc= new car();
//                    cc.horn();cc.light();
//                }
//}






//     interface superclass {
//    public void talk();
//    public void walk();
//
//     private void greet(){
//         System.out.println("good morning");
//     }
//     default  void smile(){
//         greet();
//         System.out.println("smiling!!!");
//     }
//            }
//
//            class subclass implements superclass{
//                @Override
//                public void talk() {
//                    System.out.println("talk");
//
//                }
//
//                @Override
//                public void walk() {
//                    System.out.println("walking");
//                }
//
////
//            }
//
//            public class cwh_interface {
//                public static void main(String[] args) {
//                   subclass sc = new subclass();
//                   sc.talk();
//                   sc.walk();
//                   sc.smile();
//                }
//}






//            interface one{
//    public void meth1();
//    public void meth2();
//            }
//            interface two extends one{
//                public void meth3();
//                public void meth4();
//            }
//
//            class three implements two{
//                @Override
//                public void meth1() {
//                    System.out.println("meth1");
//                }
//                @Override
//                public void meth2() {
//                    System.out.println("meth2");
//                }
//                @Override
//                public void meth3() {
//                    System.out.println("meth3");
//                }
//                @Override
//                public void meth4() {
//                    System.out.println("meth4");
//                }
//            }
//            public class cwh_interface {
//                public static void main(String[] args) {
//                   three tt = new three();
//                   tt.meth1();tt.meth2();tt.meth3();tt.meth4();
//                }
//}






            // dynamic dispatch interface -------------->>>>>

            interface superclass{
     public void talk();
     public void walk();
            }

            class subclass implements superclass{
                @Override
                public void walk() {
                    System.out.println("walk");
                }

                @Override
                public void talk() {
                    System.out.println("talk");
                }
            }
            public class cwh_interface {
                public static void main(String[] args) {
                    superclass obj = new subclass();
                    obj.talk();
                    obj.walk();
                }
}

