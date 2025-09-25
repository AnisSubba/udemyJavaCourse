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

        double d = 20.50;
        double s = 80.50;

        //using Math package I can used round with which I can change the number keytype from double to long
        long sum = Math.round((d + s) * 100.00);
        System.out.println("Total Value " + sum);

        //reminder is % which calculates if dividing the 40 to 10000 gives any reminder
        long reminder = sum % 40;
        System.out.println("total reminder " + reminder);

        boolean assign = reminder <= 0.00 ? true : false;
        System.out.println("isNoReminder " + assign);
        if(!assign){
            System.out.println("got some reminder");
        }




    }
}
