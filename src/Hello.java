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

        String makeOfCar = "Volkswagen";
        //if makeOfCar is equal to volkswagen it is assigned to false or else true
        boolean isDomestice = makeOfCar == "Volkswagen" ? false : true;
        // since makeOfCar is equal to volkswagen it is assigned to false

        //this if statement is asking if isDomestice is true, than print the statement
        //or else no print
        if(isDomestice){
            System.out.println(" it is domestic of our country");
        }


    }
}
