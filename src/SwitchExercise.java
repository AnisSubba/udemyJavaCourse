public class SwitchExercise {

    public static void main(String[] args) {

        natoAlphabet('f');

        printDayOfWeek(7);

        printWeekDay(5);
    }

    public static void natoAlphabet(char nato){

        switch (nato){
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println(nato + " not found");
                break;
        }
    }

    public static void printDayOfWeek(int day){

        String dayOfWeek = switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thrusday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> {
                String invalidDay = "The Number " + day + " = Not valid day assigned here";
                yield invalidDay;
            }
        };
        System.out.println(dayOfWeek);
    }

    public static void printWeekDay(int day){

        String dayOfWeek = "Invalid Day";
        
        if (day == 0){
           dayOfWeek = "Sunday";
        } else if (day == 1) {
            dayOfWeek = "Monday";
        } else if (day == 2) {
            dayOfWeek = "Tuesday";
        } else if (day == 3) {
            dayOfWeek = "Wednesday";
        } else if (day == 4) {
            dayOfWeek = "Thrusday";
        } else if (day == 5) {
            dayOfWeek = "Friday";
        } else if (day == 6) {
            dayOfWeek = "Saturday";
        } else {
            dayOfWeek = "The Number " + day + " = No valid day of week";
        }

        System.out.println(dayOfWeek);

    }

}
