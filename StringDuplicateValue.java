public class StringDuplicateValue {
    public static void main(String[] args) {

        String ss = new String(" hello");
        String ss2 ="";
        for (int i=0;i<ss.length();i++){
            for (int j=i+1;j<ss.length();j++){
                if (ss.charAt(i)==ss.charAt(j)){
                    ss2+=ss.charAt(i);
                }
            }
        }
        System.out.println(" the duplicate char is :"+ss2);
    }
}
