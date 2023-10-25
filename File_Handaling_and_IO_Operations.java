


                    // ****** File and directory creating


//import java.io.*;
//
//public class File_Handaling_and_IO_Operations {
//    public static void main(String[] args) throws IOException {
//
//        File fl = new File("pw.txt");
//
//        System.out.println(fl.exists());
//
//        fl.createNewFile();
//        System.out.println(fl.exists());
//        fl.delete();
//
//
//
//
//
//
//
//
//        File fe = new File("canvas");
//        System.out.println(fe.exists());
//
//        fe.mkdir();
//        System.out.println(fe.exists());
//        System.out.println(fe.delete());
//
//    }
//}









//import  java.io.*;
//
//public class File_Handaling_and_IO_Operations {
//      public static void main(String[] args) {
//
//
//          File  fid = new File("photo");
//          // System.out.println(fid.exists());
//                    // or
//          System.out.println(fid.isDirectory());
//          fid.mkdir();
//          System.out.println(fid.isDirectory());
//
//
//
//          File fe = new File(fid,"myFile");
//            // System.out.println(fe.exists());
//                      // or
//          System.out.println(fe.isFile());
//
//          try {
//              fe.createNewFile();
//
//          } catch (IOException e) {
//              throw new RuntimeException(e);
//          }
//
//          System.out.println(fe.isFile());
//
//
//
//
//          int count=0;
//          String[] nameofFile =fid.list();
//          for (String e: nameofFile){
//              System.out.println(e);
//              count++;
//          }
//          System.out.println(count);
//
//                  fe.delete();
//                  fid.delete();
//
//
//
//
//
//
//
//
//          File lf = new File("IO");
////          System.out.println(lf.exists());
//         String[] nameOfIoFiles  = lf.list();
//               for (String f: nameOfIoFiles){
//                   System.out.println(f);
//               }
//
//
//
//      }
//}







                    // ****** File writer



//import java.io.*;
//
//public class File_Handaling_and_IO_Operations {
//     public static void main(String[] args) throws IOException {
//
//
//          File dir = new File("PW");
//         System.out.println(dir.isDirectory());
//         dir.mkdir();
//
//         File fl = new File(dir,"Pw.txt");
//        fl.createNewFile();
//
//
////        FileWriter fw = new FileWriter(fl);
////        fw.write("skill set");
////        fw.write("\n");
////        fw.write(100);
////         fw.write("\n");
////        char c[] = {'j','a','v','a'};
////        fw.write(c);
////         fw.write("\n");
////
////        fw.close();
//              // or              it is mandatory to invoke close or flush
// //        fw.flush();
//
//
//
//
//         FileWriter fw = new FileWriter(fl,true);       // for non override the values
//         fw.write("skill share to openly ");
//         fw.write("\n");
//         fw.write(100);
//         fw.write("\n");
//         char c[] = {'j','a','v','a'};
//         fw.write(c);
//         fw.write("\n");
//
//
//         fw.close();
//
//
//
//
//     }
//}







                    // ****** File Reader


//import  java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class File_Handaling_and_IO_Operations {
//    public static void main(String[] args) throws IOException {
//
//        File fil = new File("PW");
//        System.out.println(fil.exists());
//
//        File ff = new File(fil,"Pw.txt");
//        System.out.println(ff.exists());
//
//
//        FileReader fre = new FileReader(ff);
//
////       int a= fre.read();
////        System.out.println( (char) a);
////
////        while (a!=-1){
////            System.out.println((char) a);
////            a= fre.read();
////        }
//
//
//
//                //or
//
//        char ca[] = new char[(int) ff.length()];
//        fre.read(ca);
//
//        for (char e: ca){
//            System.out.print(e);
//        }
//
//
//
//
//
//    }
//}







                    // **** Buffered Writer


//        import java.io.*;
//
//    public class File_Handaling_and_IO_Operations {
//    public static void main(String[] args)  throws IOException{
//
//
//        File dir = new File("PW");
//        System.out.println(dir.exists());
//
//        File file = new File(dir,"Pw.txt");
//        System.out.println(file.exists());
//
//        FileWriter fw = new FileWriter(file,true);
//        BufferedWriter bfw = new BufferedWriter(fw);
//
//        bfw.write("java");
//        bfw.newLine();
//        bfw.write("dsa");
//        bfw.newLine();
//        char[] cr = {'a','g','e','n','c','y'};
//        bfw.write(cr);
//        bfw.newLine();
//        bfw.write("course");
//
//        bfw.close();
//
//    }
//}







                    // *****  Buffered Reader



//import java.io.*;
//
//public class File_Handaling_and_IO_Operations {
//    public static void main(String[] args) throws IOException {
//
//        File dir = new File("PW");
//
//        File file = new File(dir,"Pw.txt");
//
//        FileReader fireader  = new FileReader(file);
//        BufferedReader bureader = new BufferedReader(fireader);
//
////        int i=bureader.read();
////        System.out.println((char) i);
//
//
//       String li= bureader.readLine();
//        while (li!=null){
//            System.out.println(li);
//            li=bureader.readLine();
//        }
//
//
//    }
//}










             // ****** PrintWritter
  //****   If we write in file int,string ,float,long  or any type of value then we use printwriter.


// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.PrintWriter;
//
//                    public class File_Handaling_and_IO_Operations{
//         public static void main(String[] args)  throws IOException   {
//
//             File dir = new File("Note");
//             System.out.println(dir.exists());
//             dir.mkdir();
//
//             File file = new File(dir,"notes");
//             System.out.println(file.exists());
//             file.createNewFile();
//
//
//             FileWriter fw = new FileWriter(file);
//             PrintWriter pw = new PrintWriter(fw);
//
//             pw.write(59);
//             pw.write("lanuch  ");
//
//             pw.print("tree  ");
//             pw.print(96+" ");
//             pw.print(0.23+" ");
//             pw.print(452132.2365+" ");
//             pw.print(true+" ");
//
//                //or
//             pw.println(100);
//             pw.println('d');
//             pw.println("number");
//             pw.println(523.103);
//
//             pw.close();
//
//
//
//         }
//}











                    // ***** Serialize  and DeSerialize


//        import java.io.*;
//
// class cricket implements Serializable {  // Serializable is  a marker interface so is it not mandatory to give the interface body implementation.
//    String name;
//    int age;
//    int runs;
//
//    public cricket(String name, int age,int runs){
//        this.name=name;
//        this.age=age;
//        this.runs=runs;
//    }
//
//    public void disp(){
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(runs);
//    }
//}
//
//  public class File_Handaling_and_IO_Operations       {
//     public static void main(String[] args) throws IOException, ClassNotFoundException {
//
//         // Serialize
//
////         File file= new File("page.txt");
////         file.createNewFile();
////
////         cricket ck = new cricket("rahul",22,106);
////         ck.disp();
////
////         FileOutputStream fos = new FileOutputStream("page.txt");
////         BufferedOutputStream bs = new BufferedOutputStream(fos);
////         ObjectOutputStream  oos = new ObjectOutputStream(bs);
////         oos.writeObject(ck);
////         oos.flush();
////         oos.close();
//
//
//
//            //Deserialize
//
////         FileInputStream fs = new FileInputStream("page.txt");
////         BufferedInputStream bfs =new BufferedInputStream(fs);
////         ObjectInputStream ois = new ObjectInputStream(bfs);
////
////         cricket cr = (cricket) ois.readObject();
////
////         cr.disp();
////         ois.close();
//
//
//
//
//
//
//
//         // Selective serialization
//
//
//
//
//
//
//     }
//}





                    // Selective serialization (transient keyword)


//
//  import java.io.*;
//
//  class cricket implements Serializable {  // Serializable is  a marker interface so is it not mandatory to give the interface body implementation.
//  String name;
//   transient int age;      // using the transient  keyword we can achive selective serialization
//                             // so here age is not participate serialization so in deserialization age is not print
// int runs;
//
// public cricket(String name, int age,int runs){
//  this.name=name;
//   this.age=age;
// this.runs=runs;
//  }
//
// public void disp() {
//     System.out.println(name);
//     System.out.println(age);
//     System.out.println(runs);
//          }
//  }
//
//  public class File_Handaling_and_IO_Operations       {
// public static void main(String[] args) throws IOException, ClassNotFoundException {
//
//                            // Serialize
//
////         File file= new File("page.txt");
////         file.createNewFile();
////
////         cricket ck = new cricket("rahul",22,106);
////         ck.disp();
////
////         FileOutputStream fos = new FileOutputStream("page.txt");
////         BufferedOutputStream bs = new BufferedOutputStream(fos);
////         ObjectOutputStream  oos = new ObjectOutputStream(bs);
////         oos.writeObject(ck);
////         oos.flush();
////         oos.close();
//
//
//
//                            //Deserialize
//
//         FileInputStream fs = new FileInputStream("page.txt");
//         BufferedInputStream bfs =new BufferedInputStream(fs);
//         ObjectInputStream ois = new ObjectInputStream(bfs);
//
//         cricket cr = (cricket) ois.readObject();
//
//         cr.disp();
//         ois.close();
//
//
//
//     }
//   }
















//   import java.io.*;
//
//                    public class File_Handaling_and_IO_Operations {
//         public static void main(String[] args) throws IOException {
//
//             File dir = new File("MyDir");
//             System.out.println(dir.isDirectory());
//             System.out.println(dir.exists());
//             dir.mkdir();
//
//
//
//             File fl = new File(dir,"myfile");
//             System.out.println(fl.isFile());
//             System.out.println(dir.exists());
//             fl.createNewFile();
//
//
//
//
////             // file counting
////
////             int count =0;
////           String[] namesofFile= dir.list();
////           for (String e: namesofFile){
////               System.out.println(e);
////               count++;
////           }
////             System.out.println(count);
//
//
//
//
//
//
////             // file write
////
////             FileWriter fw = new FileWriter(fl,true);
////             fw.write("java");
////             fw.write("\n");
////             fw.write('u');
////
////             fw.close();
////
////             // File Reader
////
////          FileReader fr = new FileReader(fl);
////         int i= fr.read();
////             System.out.println((char) i);
////
////         while (i!=-1){
////             System.out.println((char)i);
////             i=fr.read();
////         }
////
////
////         // or
////
////    char ca [] = new char[(int) fl.length()]  ;
////         fr.read(ca);
////
////         for (char e: ca){
////             System.out.println(e);
////         }
//
//
//
//
//
//
//
////
////             // Buffered writer
////
////
////       FileWriter fw = new FileWriter(fl,true);
////       BufferedWriter bw = new BufferedWriter(fw);
////
////       bw.write("pw");
////       bw.newLine();
////       bw.write('g');
////       bw.newLine();
////       bw.write("skills");
////
////       bw.close();
////
////
////
////
////                //  Buffered Reader
////
////      FileReader fr = new FileReader(fl);
////      BufferedReader br = new BufferedReader(fr);
////
////        int e =br.read();
////        System.out.println((char) e);
////
////       String  str= br.readLine();
////        System.out.println(str);
////
////
////       String  st= br.readLine();
////       while (st!=null){
////           System.out.println(st);
////           st=br.readLine();
////       }
//
//
//
//
//
//
//
////                  // Print Writer
////
////
////           FileWriter fw = new FileWriter(fl);
////           PrintWriter pw = new PrintWriter(fw);
////
////           pw.println("hello");
////           pw.println('a');
////           pw.print(2.01);
////           pw.println(true);
////
////           pw.print(485965.26655);
////
////              pw.close();
////
////
////
////            FileReader fr = new FileReader(fl);
////            BufferedReader br = new BufferedReader(fr);
////
////           String ss = br.readLine();
////           while (ss!=null){
////               System.out.println(ss);
////               ss=br.readLine();
////           }
//
//
//
//
//
//
//
//
//
//
//
//
//
//        }
//}










            // Serialize , Deserialize and Selective Serialize(transient keyword)


                    import java.io.*;

        class  myclass implements Serializable{

            String name ;
            int age;
          transient   int id;

            public myclass(String  name,int age,int id){
                this.name=name;
                this.age=age;
                this.id=id;
            }

            public void disp(){
                System.out.println( name+" "+age +" "+id);
            }
        }


                    public class File_Handaling_and_IO_Operations {
                        public static void main(String[] args) throws IOException, ClassNotFoundException {

                           File fil = new File("Myfile.txt");
                            System.out.println(fil.exists());
                            fil.createNewFile();
                            System.out.println(fil.exists());



                            myclass mcls = new myclass("Sankha",19,1101);
                           mcls.disp();


                            // Serialize

                   FileOutputStream fos = new FileOutputStream(fil);
                   BufferedOutputStream bos = new BufferedOutputStream(fos);
                   ObjectOutputStream oos = new ObjectOutputStream(bos);

                  oos.writeObject(mcls);

                  oos.close();


                  // Deserialize


                FileInputStream fis = new FileInputStream(fil);
                BufferedInputStream bis = new BufferedInputStream(fis);
                ObjectInputStream ois  = new ObjectInputStream(bis);

              myclass mycl= (myclass) ois.readObject();
              mycl.disp();







           }
     }