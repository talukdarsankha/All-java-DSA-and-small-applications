
class student{

    int id;
    {
        id=101;
    }

    //static varriabel
    static int age;

    //static block

    static
    {
        age=20;
        System.out.println(age);
        System.out.println("static block's method");
    }

    public static void run(){
        System.out.println("running");
    }
    public void jump(){
        System.out.println("jump");
    }

}

public class StaticJavaCourse {
    public static void main(String[] args) {

        System.out.println("main method");

         student.run();
       student ss = new student();
       ss.jump();





    }
}
