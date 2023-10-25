public class CodeWithHarryPractice1 {
    public static void main(String[] args) {
        String ss = new String("Harry");
        System.out.println(ss);

        String name = "Sankha";
        System.out.println(name);

        System.out.println(ss.length());

        System.out.println(ss.toLowerCase());
        System.out.println(name.toUpperCase());

        String aa = "     Harry    ";
        System.out.println(aa.trim());

        System.out.println(name.substring(2));
        System.out.println(name.substring(2,name.length()));

        System.out.println(ss.replace('r','p'));
        System.out.println(name.replace("kha","khaaa"));

        System.out.println(name.startsWith("Sa"));
        System.out.println(ss.endsWith("ry"));

        System.out.println(ss.charAt(1));
        System.out.println(ss.indexOf("H"));

        System.out.println(ss.indexOf('r'));
        System.out.println(ss.lastIndexOf('r'));

        System.out.println(ss.equals("Harry"));
        System.out.println(ss.equalsIgnoreCase("haRry"));


        // Escape sequences  ----->>>>>>
        System.out.println("you are \n where");
        System.out.println("you are \\ where");
        System.out.println("you are \' where");
        System.out.println("you are \t where");

    }

}
