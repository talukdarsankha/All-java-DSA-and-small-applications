

import java.util.Scanner;


class one{
    Scanner sc = new Scanner(System.in);
    public void   welcome(){
        System.out.println("------------------------------------------------------------------");
        System.out.println("                 welcome to our 24x7 hour service                  ");
        System.out.println("...................................................................");
        System.out.println("   Enter 1 to continue ");
        int a = sc.nextInt();
        if (a==1){
            System.out.println("processing...");
        }else {
            System.out.println("Wrong Entry !!!!!");
            return;

        }

    }
    public void register(){
        System.out.println("****************************************************************************");
        System.out.println("     If you are already Resitared then login or Please Register Your Account");
        System.out.println("           Enter 2 For Register your account.. or 3 for login");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int b = sc.nextInt();
        if (b==2){
            System.out.println("Please wait sometime...........");
            System.out.println("Enter your First Name");
            String  Fn = sc.next();
            System.out.println("Enter your Last Name");
            String  Ln = sc.next();
            System.out.println("Fill your contact Number");
            long ph = sc.nextLong();
            System.out.println("Press * to generate OTP");
            String  star = sc.next();
            System.out.println("Your four dizit OTP is 5523");
            System.out.println("Enter OTP");
            int c =sc.nextInt();
            if (c==5523){
                System.out.println("......");
            }else {
                System.out.println("Wrong OTP");
                return;
            }
            System.out.println("Resitration Successful");
        }else if (b==3){
            System.out.println("Please wait sometime...........");
            System.out.println(" Enter your password");
            int x=sc.nextInt();
            System.out.println(".....");

        }else {
            System.out.println("Invalid Entry !!!!!");
            return;
        }



    }
}

class two{
    Scanner sc = new Scanner(System.in);

   public void   choose(){
       System.out.println("---------------------------------------------------------------------------------------");
       System.out.println("      Contact Us : Helpline:-   2231-1133-440");
       System.out.println("    *********************************************************************************");
       System.out.println("               Main Menu \n 1.Doctor (Press 1 for Doctor) \n 2.Nurse (Press 2 for Nurse) \n 3.Specialist (Press 3 for Specialist) \n 4.Lab (Press $ for Lab) \n 5.Facilities (Press 5 for Facilities) \n Press 9 for exit");
       System.out.println("--------------~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~------------------------------");

       int x = sc.nextInt();
       if (x==1){
           System.out.println("                   ~~~~~~~~~~~~~~~~~~~~~                     ");
           System.out.println("             You are in Doctor Category");
           System.out.println();
           System.out.println("1.Dr.sen (Eye Specialist)\n2.Dr.Amit Halder (Neuron Specialist)\n3. Dr.Priti Jain (Women Speciyalist)\n" +
                   "4.Dr.Roy (Surgeon)");

           System.out.println("       ***********************            \n");
           System.out.println("            Book your Name \n");
           System.out.println("  Select your Preferred Doctor\n");
           System.out.println(" ................................................................................................");
           System.out.println("Press 1 for Dr.sen \n Press 2 for Dr.Amit Halder\n Press 3 for Dr.Priti Jain \n press 4 for Dr.Roy");
           int i = sc.nextInt();
           if (i==1){
               System.out.println("  ------  Dr.Sen Details ------ ");
               System.out.println("Dr.Sen Contact Number:- 4523698745");
               System.out.println("Home Town :- Bengaluru");
               System.out.println("Qualification :- MBBS");
               System.out.println("Fees 1000 per head");
               System.out.println("----------..........----------");
               System.out.println("If you want to book your name press *");
               String st = sc.next();
               System.out.println("Choose date ");
               System.out.println("Enter a date like This pattern:    date-month-year ");
               System.out.println("Enter date without Holidays--");
               int d=sc.nextInt();
               System.out.println("Enter month --");
               int m = sc.nextInt();
               System.out.println("Enter Year--");
               int y = sc.nextInt();
               System.out.println("     Your Entry Has been done you will get a conformation message in your Resistered Mobile number ");

           }else if (i==2){
               System.out.println("  ------ Dr.Amit Halder Details ------ ");
               System.out.println("Dr.Amit Halder Contact Number:- 122458745");
               System.out.println("Home Town :- Delhi");
               System.out.println("Qualification :- Phd In Neuron ex-Dr. At AIMS Hospital");
               System.out.println("Fees 700 per head");
               System.out.println("----------..........----------");
               System.out.println("If you want to book your name press *");
               String st = sc.next();
               System.out.println("Choose date ");
               System.out.println("Enter a date like This pattern:    date-month-year ");
               System.out.println("Enter date without Holidays--");
               int d=sc.nextInt();
               System.out.println("Enter month --");
               int m = sc.nextInt();
               System.out.println("Enter Year--");
               int y = sc.nextInt();
               System.out.println("     Your Entry Has been done you will get a conformation message in your Resistered Mobile number ");

           }else if (i==3){

               System.out.println("  ------ Dr.Priti Jain (Women Speciyalist) ------ ");
               System.out.println("Dr.Priti Jain  Contact Number:- 95868745");
               System.out.println("Home Town :- Delhi");
               System.out.println("Qualification :- MBBS ");
               System.out.println("Fees 1000 per head");
               System.out.println("----------..........----------");
               System.out.println("If you want to book your name press *");
               String st = sc.next();
               System.out.println("Choose date ");
               System.out.println("Enter a date like This pattern:    date-month-year ");
               System.out.println("Enter date without Holidays--");
               int d=sc.nextInt();
               System.out.println("Enter month --");
               int m = sc.nextInt();
               System.out.println("Enter Year--");
               int y = sc.nextInt();
               System.out.println("     Your Entry Has been done you will get a conformation message in your Resistered Mobile number ");


           }else if (i==4){

               System.out.println("  ------ Dr.Roy (Surgeon) ------ ");
               System.out.println(" Dr.Roy (Surgeon)  Contact Number:- 62351745");
               System.out.println("Home Town :- West Bengal");
               System.out.println("Qualification :- MBBS In Surgical Therapy ");
               System.out.println("Fees 2500 per head");
               System.out.println("----------..........----------");
               System.out.println("If you want to book your name press *");
               String st = sc.next();
               System.out.println("Choose date ");
               System.out.println("Enter a date like This pattern:    date-month-year ");
               System.out.println("Enter date without Holidays--");
               int d=sc.nextInt();
               System.out.println("Enter month --");
               int m = sc.nextInt();
               System.out.println("Enter Year--");
               int y = sc.nextInt();
               System.out.println("     Your Entry Has been done you will get a conformation message in your Resistered Mobile number ");

           }


       }else if (x==2){

           System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
           System.out.println("               You are in Nurse Service Section \n");
           System.out.println("  List of Nurses \n 1.Jaya Agarwal \n 2.Priti Madhekar \n 3.Shalini Ghosh \n 4.Madhurima Patel \n 5. Nur Hossein \n 6. Adama Putin \n");
           System.out.println("   >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>************************************<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
           System.out.println("          Press * to See our Nurse Details ");
           String  s = sc.next();
           if (s.equals("*")){
               System.out.println("------ 1.Jaya Agarwal ------ \n Contact Number:- 485654345\nHome Town :- West Bengal\n Qualification:- Bachelor in Nursing\n  ");
               System.out.println("------2.Priti Madhekar ------ \n Contact Number:- 4556654345\nHome Town :- Delhi\n Qualification:- Bachelor in Nursing\n  ");
               System.out.println("------ 3.Shalini Ghosh  ------ \nContact Number:- 585654345\nHome Town :- Delhi\n Qualification:- Bachelor in Nursing\n  ");
               System.out.println("------4.Madhurima Patel------ \n Contact Number:- 1254654345\nHome Town :- Delhi\n Qualification:- Bachelor in Nursing\n  ");
               System.out.println("------ 5. Nur Hossein  ------ \n Contact Number:- 585654345\nHome Town :- Bengaluru \n Qualification:- Bachelor in Nursing\n  ");
               System.out.println("-----6. Adama Putin------ \n Contact Number:- 1564654345\nHome Town :- Bengaluru\n Qualification:- Bachelor in Nursing\n  ");
               System.out.println("******************************************************************************************");
           }else {
               System.out.println("          Please Enter Valid Input");
               return;

           }


       }else if (x==3){

           System.out.println("                   ~~~~~~~~~~~~~~~~~~~~~                     ");
           System.out.println("               You are in Specialist Category");
           System.out.println(".......................................................................................");
           System.out.println("               Our Specialists \n");
           System.out.println("Dr.Mira Gupta (Mental Health Specialist)\nDr.Puskar Pandey (Child Health Specialist)\n Dr.Aman Roy (Psychologist )");

           System.out.println("       ***********************            \n");
           System.out.println("            Book your Name \n\n\n");
           System.out.println("  Select your Preferred Specialist\n");
           System.out.println(" ................................................................................................");
           System.out.println("Press 1 for: Dr.Mira Gupta (Mental Health Specialist)\n Press 2 for: Dr.Puskar Pandey (Child Health Specialist)\n Press 3 for :  Dr.Aman Roy (Psychologist )");
           int i = sc.nextInt();
           if (i==1){
               System.out.println("  ------  Dr.Mira Gupta (Mental Health Specialist) ------ ");
               System.out.println("Dr.Sen Contact Number:- 4523698745");
               System.out.println("Home Town :- Bengaluru");
               System.out.println("Qualification :- Phd in Mental Health ");
               System.out.println("Fees 1000 per head");
               System.out.println("----------..........----------");
               System.out.println("If you want to book your name press *");
               String st = sc.next();
               System.out.println("Choose date ");
               System.out.println("Enter a date like This pattern:    date-month-year ");
               System.out.println("Enter date without Holidays--");
               int d=sc.nextInt();
               System.out.println("Enter month --");
               int m = sc.nextInt();
               System.out.println("Enter Year--");
               int y = sc.nextInt();
               System.out.println("     Your Entry Has been done you will get a conformation message in your Resistered Mobile number ");

           }else if (i==2){
               System.out.println("  ------ Dr.Puskar Pandey (Child Health Specialist) ------ ");
               System.out.println("Dr.Amit Halder Contact Number:- 122458745");
               System.out.println("Home Town :- Delhi");
               System.out.println("Qualification :- Phd In Child Heath Care ");
               System.out.println("Fees 700 per head");
               System.out.println("----------..........----------");
               System.out.println("If you want to book your name press *");
               String st = sc.next();
               System.out.println("Choose date ");
               System.out.println("Enter a date like This pattern:    date-month-year ");
               System.out.println("Enter date without Holidays--");
               int d=sc.nextInt();
               System.out.println("Enter month --");
               int m = sc.nextInt();
               System.out.println("Enter Year--");
               int y = sc.nextInt();
               System.out.println("     Your Entry Has been done you will get a conformation message in your Resistered Mobile number ");


           }
           else if (x==3){

               System.out.println("  ------ Dr.Aman Roy (Psychologist ) ------ ");
               System.out.println("Dr.Amit Halder Contact Number:- 752458745");
               System.out.println("Home Town :- Delhi");
               System.out.println("Qualification :- Phd In Human Psychology ");
               System.out.println("Fees 700 per head");
               System.out.println("----------..........----------");
               System.out.println("If you want to book your name press *");
               String st = sc.next();
               System.out.println("Choose date ");
               System.out.println("Enter a date like This pattern:    date-month-year ");
               System.out.println("Enter date without Holidays--");
               int d=sc.nextInt();
               System.out.println("Enter month --");
               int m = sc.nextInt();
               System.out.println("Enter Year--");
               int y = sc.nextInt();
               System.out.println("     Your Entry Has been done you will get a conformation message in your Resistered Mobile number ");

           }

       }else if (x==4){

           System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
           System.out.println("               You are in Our Lab Service Section \n");
           System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~                      ");
           System.out.println("   >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>************************************<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
           System.out.println("          Press * to See our Nurse Details ");
           String  s = sc.next();
           if (s.equals("*")){
               System.out.println(" 1.Blood Test \n 2.Spit test \n 3.Spam test");
               System.out.println("                 ---------------------------------------------------------------------                ");
           }else {
               System.out.println("Please Press *");
               return;


           }


       }else if (x==5){
           System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
           System.out.println("               You are in Our Facility Service Section \n");
           System.out.println("               ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~                      ");
           System.out.println("   >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>************************************<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
           System.out.println("          Press * to See our Nurse Details ");
           String  s = sc.next();
           if (s.equals("*")){

               System.out.println("  ---------->> Our Facilities <<-------------------\n");
               System.out.println(" -->Food \n -->All time Helpline Service \n -->Atm Service  ");
           }else {
               System.out.println("Please Enter *");
               return;
           }

       }

       else if (x==9){
           System.out.println("THanks for Using Our Service");
          return;
       }else {
           System.out.println("Not a Valid Enter");
           return;
       }
   }



}
public class HospitalMnagementProjecct {

    public static void main(String[] args) {
     one c1= new one();
     c1.welcome();
     c1.register();
two t1 = new two();
t1.choose();


    }
}
