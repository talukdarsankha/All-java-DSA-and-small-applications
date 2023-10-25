//
//class parent1 {
//    public void sleep(){
//        System.out.println("sleep parent");
//    }
//}
//class child1 extends parent1{
//    @Override
//    public void sleep() {
//        System.out.println("sleep child");
//    }
//}
//
//public class JavaCourseInheritance {
//    public static void main(String[] args) {
//        child1 cc = new child1();
//        cc.sleep();
//        parent1 p = new child1();
//        p.sleep();
//
//        parent1 pp = new parent1();
//        pp.sleep();
//
//    }
//}






class parent1 {
    public void sleep(){
        System.out.println("sleep parent1");
    }
}
class child1 extends parent1{
    @Override
    public void sleep() {
        System.out.println("sleep child1");
    }
}
class child2 extends parent1{
    @Override
    public void sleep() {
        System.out.println("sleep child2");

    }
}
class other{
    public  void meth(parent1 p){
        p.sleep();
    }
}
public class JavaCourseInheritance {
    public static void main(String[] args) {
//     parent1 p = new parent1();
//     p.sleep();
//     child1 c1 = new child1();
//     c1.sleep();
//     child2 c2 =new child2();
//     c2.sleep();



//        parent1 pp1 = new child1();
//        pp1.sleep();
//        parent1 pp2 = new child2();
//        pp2.sleep();



        parent1 pp1 = new child1();
        parent1 pp2 = new child2();

        other ot = new other();
        ot.meth(pp1);
        ot.meth(pp2);

    }
}
