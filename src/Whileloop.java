public class Whileloop {

    public static void main(String[] args) {
        //    For loop example
        for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }

//      While Loop example for same condition
        int j = 1;
        /*while (j <= 5){
            System.out.println(j);
            j++;
        }*/
//        another example of while loop using the same condition but with while being true and adding additional condition to break the loop
        while (true){
            if (j > 5){
                break;
            }
            System.out.println(j);
            j++;
        }
//        now chekcing do while rule using the same condition
        int a = 1;
        boolean isReady = false;
        do {
            if(a > 5){
                break;
            }
            System.out.println(a);
            a++;
//            if i want to run this condition more that once i need to set the variable isReady so it can run until it meets certain condition
            isReady = (a > 0); // new change made so isReady is set to true and code can run until the if loop is broken
        } while (isReady); // since isready is set to false this condition won't run more than once

//       adding continue in the while loop and seeing how it functions
        int number = 0;
        while (number < 50){
            number += 5;
            if (number % 2 == 0){
                continue; // any number which is divisible by 2 and has no reminder is removed from the result
            }
            System.out.println(number + "_");
        }
    }

}
