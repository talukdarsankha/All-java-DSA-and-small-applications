import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorCollection {
    public static void main(String[] args) {

        // Heterogeneous

        Vector vv = new Vector();

        vv.add(100);
        vv.add("sa");
        vv.add(233);
        vv.add(400);
        vv.add('c');

        System.out.println(vv);


        Enumeration ee = vv.elements();
        while (ee.hasMoreElements()){
            System.out.println(ee.nextElement());
        }

        // or

       Iterator tt = vv.iterator();
        while (tt.hasNext()){
            System.out.println(tt.next());
        }



        // Homogeneous

        Vector<Integer> vv2 = new Vector<>();
        vv2.add(100);
        vv2.add(200);
        vv2.add(300);
        vv2.add(400);
        vv2.add(500);

       Enumeration em= vv2.elements();
       while (em.hasMoreElements()){
           System.out.println(em.nextElement());
       }
           //or

        Iterator tt2 = vv2.iterator();
       while (tt2.hasNext()){
           System.out.println(tt2.next());
       }


    }
}
