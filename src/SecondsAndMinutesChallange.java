public class SecondsAndMinutesChallange {

    public static void main(String[] args) {
        //        challenge exercise - seconds and minutes challange
        System.out.println(getDurationString(8900));
        System.out.println(getDurationString(90, 80));

    }

    /* Challenge exercise - second and minute
        2 method - 1 parameter if type int named seconds - 2nd paramete named nunutes and seconds both ints - both methids return a string in the format shown XXh YYm ZZs
    */
    public static String getDurationString(int seconds){

        if(seconds < 0){
            return "Invalid seconds entered (" + seconds + ") need to be positive number.";
        }
        int minute = seconds / 60;

        return getDurationString(minute, seconds % 60);
    }

    public static String getDurationString(int minute, int seconds){

        if(minute < 0 ) {
            return  "Invalid minute (" + minute + ") need to be a positive number";
        }
        if (seconds < 0 || seconds > 59){
            return "Invalid Seconds (" + seconds + ") seconds need to be between 0 and 59";
        }

        int hour = minute /60;

        int remainingMinuets = minute % 60;

        return hour + "h " + remainingMinuets + "m " + seconds + "s";

    }
}
