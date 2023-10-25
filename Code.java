//package show;
//
//import java.sql.*;
//
//public class practice {
//
//    public static void main(String[] args) {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("Java Applications");
//            Connection cn = DriverManager.getConnection("jdbc:mysql://root@localhost:3306/xyz","root","Sankha325#@");
//            System.out.println("Get Connections");
//            String s = "create table more(id int(10) not null primary key auto_Increment,name varchar(200) not null,address varchar(500))";
//            Statement st = cn.createStatement();
//            st.executeUpdate(s);
//            System.out.println("Java Applications");
//            cn.close();
//
//
//        }
//        catch(Exception e) {
//            System.out.println(e);
//        }
//
//    }
//
//}








