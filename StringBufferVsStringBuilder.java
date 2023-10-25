public class StringBufferVsStringBuilder {
    public static void main(String[] args) {

        StringBuffer ss1 = new StringBuffer("course");

   // It is the differences between StringBuffer and StringBuilder
  // StringBuffer cannot run many thred at a time but StringBuilder can run many thred at a time.

        StringBuilder ss = new StringBuilder("course");

    }
}
