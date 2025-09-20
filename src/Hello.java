public class Hello {

    public static void main(String[] args){

        boolean isAlien = false;
        if (isAlien == false){
            System.out.println("Alien you are not !");
        }

        int topScore = 100;
        int secondScore = 10;

        if (topScore != 100){
            System.out.println("you score");
        }

        if (topScore < 10){
            System.out.println("you score");
        }

        if ((topScore > secondScore) && (secondScore < 100)){
            System.out.println("both score is high");
        }

        if ((topScore > secondScore) || (secondScore > 100)){
            System.out.println("either score is true");
        }

        boolean isCar = true;
        if (!isCar){
            System.out.println("Print car");
        }


    }
}
