import java.util.ArrayDeque;

public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dd = new ArrayDeque<>();
        dd.size();
        dd.add(2);
        dd.size();
        dd.addFirst(1);
        dd.add(3);
        dd.addLast(5);
        dd.add(4);


        System.out.println(dd);
    }
}
