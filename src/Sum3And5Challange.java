public class Sum3And5Challange {

    public static void main(String[] args) {

        int count = 0;
        int sumOfMatches = 0;

        for (int i = 1; count < 5 && i <= 1000; i++){
            if ((i % 3 == 0) && (i % 5 ==0)){
                sumOfMatches += i;
                System.out.println(i + " is divisible by 3 and 5");
                count++;
            }
        }
        System.out.println("Total Count presennt is " + count + " Existing query");
        System.out.println("total sum of matches is equal to = " + sumOfMatches);


    }
}
