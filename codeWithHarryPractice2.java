import java.util.Scanner;

public class codeWithHarryPractice2 {
    public static void main(String[] args) {
        //  switch case --------->>>>>>>


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice !");
        String day = sc.nextLine();

        switch (day) {
            case "Sunday":
                System.out.println("Sunday today");
                break;
            case "Monday" :
                System.out.println("Monday Today");
                break;
            case "Tuesday" :
                System.out.println("Tuesday Today");
                break;
            default:
                System.out.println("No Mache");
        }


    }
}
