

     // Duplicate elements are allowed in arraylist

     //*** Homogeneous data store in arraylist

//import java.util.ArrayList;
//
//public class arraylist {
//    public static void main(String[] args){
//        ArrayList<Integer> aa = new ArrayList<>();
//        ArrayList<Integer> llll = new ArrayList<>();
//        llll.add(32);
//        llll.add(4);
//        llll.add(2);
//
//        aa.add(52);
//        aa.add(7);
//        aa.add(3);
//        aa.add(72);
//        aa.add(95);
//
//
//       // aa.addAll(llll);
//        aa.addAll(0,llll);
//
//        aa.add(0,10);
//
//        aa.set(1,20);
//        System.out.println(aa);
//
//        System.out.println(aa.size());
//
//        for (int i=0;i<aa.size();i++){
//            System.out.println(aa.get(i));
//        }
//
//        System.out.println(aa.get(2));
//
//        System.out.println(aa.contains(7));
//
//        System.out.println(aa.indexOf(7));
//
//        aa.remove(aa.size()-1);
//
//        System.out.println(aa);
//
////        aa.clear();
////        System.out.println(aa);
//    }
//}



           //********** Heterogeneous data store in Arraylist


     import java.util.ArrayList;

     public class arraylist {
    public static void main(String[] args) {

        ArrayList aa=new ArrayList();

        aa.add(23);
         aa.add("pw ");
         aa.add(45.00215);

        System.out.println(aa);

       aa.add(2,200);
       aa.add(200);
        System.out.println(aa);

        System.out.println(aa.lastIndexOf(200));
        System.out.println(aa.indexOf(200));

        System.out.println(aa.get(4));


    }
}
