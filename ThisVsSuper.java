






            // this() method use to call same class's constructor
            // But super() method use to call parent class's constructor
class first{
    public first(){
        System.out.println("default constructor");
    }
    public first(int a,int b){
        this(4,5.3f);
        System.out.println(a+b);
    }
    public first(int a,float b){
          this();
        System.out.println(a+b);
    }
}

public class ThisVsSuper {
    public static void main(String[] args) {
        first ff= new first(2,3);
        first ff1= new first(2,47.2f);
    }
}
