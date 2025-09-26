public class SecondClass {

    public static void main(String[] args){
        System.out.println("Hi Anis");

        boolean isAlien = true;
        if (isAlien == false)
            System.out.println("It is not an alien!");
        else if (isAlien == true)
            System.out.println("It is an Alien");

        System.out.println(printYearsAndDays(1440));

    }
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