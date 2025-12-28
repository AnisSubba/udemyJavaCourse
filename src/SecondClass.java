public class SecondClass {

    /**
     * The main function prints a greeting, checks if a boolean variable is true or false, and then
     * calls a method to print years and days based on a given number of minutes.
     */
    public static void main(String[] args){
        System.out.println("Hi Anis");

        boolean isAlien = true;
        if (isAlien == false)
            System.out.println("It is not an alien!");
        else if (isAlien == true)
            System.out.println("It is an Alien");

        System.out.println(printYearsAndDays(1440));

    }
 /**
  * The function calculates and prints the equivalent number of years and days based on the input
  * minutes.
  * 
  * @param minutes The given code snippet is a Java method that calculates the number of years and days
  * from a given number of minutes. It first checks if the input minutes is less than 0 and prints
  * "Invalid Value" if true. Then, it calculates the number of days and years from the minutes input.
  * @return The method `printYearsAndDays` returns a String that represents the input `minutes`
  * converted into years and remaining days.
  */
    public static String printYearsAndDays(long minutes){

        if(minutes < 0){
            System.out.println("Invalid Value");
        }

            long days = (minutes / 60) / 24;
            System.out.println(days);
            long years = days / 365;

            long dayRemining = (minutes / 1440) % 365;

        return minutes + " min = " + years + " y and " + dayRemining + " d";
    }
}