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

        double d = 20.00;
        double s = 80.00;
        double sum = (d + s) * 100.00d;
        System.out.println("Total Value " + sum);
        //reminder is % which calculates if dividing the 40 to 10000 gives any reminder
        double reminder = sum % 40.00d;
        System.out.println("total reminder " + reminder);
        boolean assign = reminder == 0.00d ? true : false;
        System.out.println("isNoReminder " + assign);
        if(!assign){
            System.out.println("got some reminder");
        }




    }
}
