public class MethodClass {

    //method overloading
    public static void main(String[] args) {
//          Lesson
/*        System.out.println("New score is " + calculateScore("Tim", 500));
        System.out.println(calculateScore(500));*/

//        challenge exercise Inches
        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8));
        System.out.println("68in = " + convertToCentimeters(68));



    }
// Method lesson
    public static int calculateScore(String playerName, int score) {
        System.out.println("player " + playerName + " scored " + score + " points");
        return score * 100;
    }

    public static int calculateScore(int score) {

        return calculateScore("Anonomus", score);
    }

    public static int calculateScore() {
        System.out.println("player and no score");
        return 0;
    }

//    Challenge exercise - inches

    public static double convertToCentimeters(int inches){

        return inches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches){

        int convertHeightInFeet = heightInFeet * 12;
        int totalInches = convertHeightInFeet + heightInInches;

        double result = convertToCentimeters(totalInches);

        return result;

      /*return convertToCentimeters((heightInFeet * 12) + heightInInches);
      return ((heightInFeet * 12) * 2.54);*/

    }



}
