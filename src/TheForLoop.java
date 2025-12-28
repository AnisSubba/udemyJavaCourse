public class TheForLoop {

    public static void main(String[] args) {

        int count = 0;

        for (count = 1; count <= 5; count++){
            System.out.println(count);
        }

        for (double rate = 2.0; rate <= 5; rate++){
            double interestAmount = calculateInterest(1000, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }

        for (double i = 7.5; i <= 10.00; i += 0.25){
            double interestAmount = calculateInterest(100, i);
            if (interestAmount > 8.5){
                break;
            }
            System.out.println("100 at " + i + "% interest = $" + interestAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }

}
