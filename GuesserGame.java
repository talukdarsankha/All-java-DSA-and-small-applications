import java.util.Scanner;

class guesser{

    Scanner sc = new Scanner(System.in);
    int guesserGuess;
    public int doGuess(){
        System.out.println("Guesser chose your choise");
        guesserGuess=sc.nextInt();
        return guesserGuess;

    }
}

class players{

    int playersGuess;
    Scanner sc = new Scanner(System.in);
    public int dochoose(){
        System.out.println("Player choose your choise");
        playersGuess= sc.nextInt();
        return playersGuess;
    }

}

class umpire{

    int guesserNum;
    int player1Num;
    int player2Num;
    int player3Num;

    public void storeGuesserNum(){
        guesser gg = new guesser();
        guesserNum= gg.doGuess();
    }

    public void storePlayersNum() {
        players p1 = new players();
       player1Num= p1.dochoose();

        players p2 = new players();
       player2Num= p2.dochoose();

        players p3 = new players();
        player3Num=p3.dochoose();
    }

    public void compare(){
        if (guesserNum==player1Num){
            if (guesserNum==player2Num&&guesserNum==player3Num){
                System.out.println("all of you won");
            }else if (guesserNum==player2Num){
                System.out.println(" 1 and 2 won");
            }else if (guesserNum==player3Num){
                System.out.println(" 1 and 3 won");
            }else {
                System.out.println("player1 won");
            }
        }else if (guesserNum==player2Num){
            if (guesserNum==player3Num){
                System.out.println("2 and 3 won");
            }else {
                System.out.println("player2 won");
            }
        }else if (guesserNum==player3Num){
            System.out.println("player3 won");
        }else {
            System.out.println("all of you fail");
        }
    }


}
public class GuesserGame {
    public static void main(String[] args) {
        umpire uu = new umpire();

        uu.storeGuesserNum();
        uu.storePlayersNum();
        uu.compare();

    }
}




//import java.util.Scanner;
//
//
//
//class range{
//    Scanner sc = new Scanner(System.in);
//
//    int range;
//    public int defineRange(){
//        System.out.println("Choose first which range you will play");
//        range=sc.nextInt();
//        return range;
//
//    }
//}
//
//class guesser{
//
//    Scanner sc = new Scanner(System.in);
//
//
//
//        int guesserNum;
//
//    public int guessing(){
//        System.out.println("Guesser please choose yor choise in defiend range ");
//        guesserNum=sc.nextInt();
//        return guesserNum;
//    }
//}
//
//class players{
//    Scanner sc = new Scanner(System.in);
//
//
//
//    int PlayerNum;
//    public int guessPlayer(){
//        System.out.println("Players kindly chosse yor num in the defined range of");
//        PlayerNum=sc.nextInt();
//        return PlayerNum;
//    }
//}
//
//
//class umpire{
//
//    int boundry ;
//
//    int orginalNum;
//    int player1Num;
//    int player2Num;
//    int player3Num;
//
//
//    public  void createRange(){
//        range rr = new range();
//        boundry=rr.defineRange();
//    }
//
//   public void storeGuesserNum(){
//       guesser gg = new guesser();
//      orginalNum= gg.guessing();
//   }
//
//    public void storePlayersNum(){
//        players p1 = new players();
//        player1Num = p1.guessPlayer();
//
//        players p2 = new players();
//        player2Num = p2.guessPlayer();
//
//        players p3 = new players();
//        player3Num = p3.guessPlayer();
//    }
//
//
//    public void compare(){
//       if (orginalNum==player1Num){
//           if (orginalNum==player1Num&&orginalNum==player2Num&&orginalNum==player3Num){
//               System.out.println("All of you won this match");
//           }else if (orginalNum==player1Num&&orginalNum==player2Num){
//               System.out.println("Player1 and player2 won this match");
//           }else if (orginalNum==player1Num&&orginalNum==player3Num){
//               System.out.println("player1 and player3 won this match");
//           }else {
//               System.out.println("Player1 won this match");
//           }
//       } else if (orginalNum==player2Num) {
//           if (orginalNum==player2Num&&orginalNum==player3Num){
//               System.out.println("player2 and player3 won this match");
//           }else {
//               System.out.println("Player2 won this match");
//           }
//       }else if (orginalNum==player3Num){
//           System.out.println("Player3 won this match");
//       }else {
//           System.out.println("no one won this match");
//       }
//
//
//    }
//
//}
//
//public class GuesserGame {
//    public static void main(String[] args) {
//        umpire um= new umpire();
//
//        um.createRange();
//        um.storeGuesserNum();
//        um.storePlayersNum();
//        um.compare();
//    }
//}
