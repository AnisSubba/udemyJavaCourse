public class KeyWords {

    // this is a method
    // it doesn't return any data as it has void on it
    public static void main(String[] args){
        //expression is block of code without the keywords and ; counting in the code below the expression is int2 = 50
        //statement is all the code including the keyword varible and ;
        int int2 = 50;


        //checking if statement
        boolean gameOver = true;
        int score = 10000;
        int levelComplete = 8;
        int bonues = 200;

//        Calling a different method with argument attaached
        calculateScore(true, 1000, 9, 100);
        int highScore = returnStatement(gameOver, score, levelComplete, bonues);
        System.out.println(" The High Score Is " + highScore);

//      As this variable is already called no need to recall them with keywords, just using it will update the number for the execution below
        score = 4000;
        levelComplete = 4;
        bonues = 50;

        System.out.println(" The High Score Is " + returnStatement(gameOver, score, levelComplete, bonues));

        example();

    }
//    (boolean .., int .., int .., int ..) this is argument and it gets passed when this method is called
    public static void calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {

        int finalScore = score;

        if(gameOver) {
            finalScore += (levelComplete * bonus);
            finalScore += 1000;
            System.out.println("Your Final Score was " + finalScore);
        }

    }
//    example we can define the type and add varibale
    public static void example() {
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

        if (finalScore <= 5000){
            System.out.println("Your score is higher than 1000 but less 5000");

        } else if (finalScore < 1000) {
            System.out.println("Your score is less than 1000");
        }
        else {
            System.out.println("Your score is higher than 5000 ");
        }
    }

//    example of returning data in this case final score
    public static int returnStatement(boolean gameOver, int score, int levelComplete, int bonus){
        int finalScore = score;

        if(gameOver) {
            finalScore += (levelComplete * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }



}
