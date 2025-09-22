public class KeyWords {

    public static void main(String[] args){
        //expression is block of code without the keywords and ; counting in the code below the expression is int2 = 50
        //statement is all the code including the keyword varible and ;

        int int2 = 50;

        int2++;

        //checking if statement
        boolean gameOver = true;
        int score = 10000;
        int levelComplete = 8;
        int bonues = 200;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelComplete * bonues);
            finalScore += 100;
            System.out.println(
                    " Your final score was " + finalScore
            );
        }


        if (score <= 5000){
            System.out.println("Your score is less 5000");

        } else if (score < 1000) {
            System.out.println("Your score is less than 1000");
        }
        else {
            System.out.println("Your score is higher than 5000 ");
        }


    }
}
