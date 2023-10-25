import java.awt.*;
import java.util.Scanner;

abstract class shape{
    float area;
   abstract public void input();
   abstract public void area();
    abstract public void displayArea();


}

class circle extends shape{
    float radius;


    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter circle radius");
        radius = sc.nextFloat();
    }
    @Override
    public void area() {
        area= (float) (Math.PI*radius*radius);
    }

    @Override
    public void displayArea() {
        System.out.println(area);
    }
}
class rectangel extends shape{
    float length;
    float width;

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rectangel length");
        length=sc.nextFloat();
        System.out.println("enter rectangel width");
        width= sc.nextFloat();
    }

    @Override
    public void area() {
        area=length*width ;
    }

    @Override
    public void displayArea() {
        System.out.println(area);
    }
}


class despatch{
    public void meth(shape ref){
        ref.input();
        ref.area();
        ref.displayArea();
    }
}

public class NormalApplicationUsingOpps {
    public static void main(String[] args) {

//        circle c = new circle();
//        rectangel r = new rectangel();


//        shape ss = new circle();
//
//         ss.input();
//         ss.area();
//         ss.displayArea();
//     shape ss2 =new rectangel();
//     ss2.input();
//     ss2.area();
//     ss2.displayArea();




        circle c = new circle();
        rectangel r = new rectangel();
       despatch dd =new despatch();
       dd.meth(c);
       dd.meth(r);

    }
}
