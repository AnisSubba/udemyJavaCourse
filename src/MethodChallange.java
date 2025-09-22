public class MethodChallange {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        dispplayHighScorePosition("Anis", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        dispplayHighScorePosition("Geoff", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        dispplayHighScorePosition("Nik", highScorePosition);

       highScorePosition = calculateHighScorePosition(100);
        dispplayHighScorePosition("Rob", highScorePosition);

        highScorePosition = calculateHighScorePosition(20);
        dispplayHighScorePosition("lor", highScorePosition);
    }

    public static void dispplayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore){

        int position = 4;

        if(playerScore >= 1000){
            position = 1;
        } else if(playerScore >= 500){
            position = 2;
        } else if(playerScore >= 100 ){
            position = 3;
        }

        return position;
    }


}
