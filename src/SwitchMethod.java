public class SwitchMethod {

    public static void main(String[] args) {

        switchMethod(5);

        String month = "April";
        System.out.println(month + " is in the  " + getQuarter(month) + " quarter ");
    }

    public static void switchMethod(int switchValue){

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Value was neither 1 to 5 number");
        }
    }



    public static String getQuarter(String month) {

        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> {
                String badResponce = month + " is bad";
                yield badResponce;
            }
        };

        /*switch (month) {
            case "January":
            case "February":
            case "March":
                dayOfWeek "1st";
            case "April":
            case "May":
            case "June":
                dayOfWeek "2nd";
            case "July":
            case "August":
            case "September":
                dayOfWeek "3rd";
            case  "October":
            case "November":
            case "December":
                dayOfWeek "4th";
        }
        dayOfWeek "bad";*/
    }
}
