package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    double firstDouble = 20;
        double secondDouble = 80;
        double result = 100*(firstDouble + secondDouble);
        double remainder = result%40;

        boolean hasRemainder = (remainder!=0);
        System.out.println(hasRemainder);
        System.out.println(result);
        System.out.println(remainder);

        if(!hasRemainder) {
            System.out.println("Got no remainder, the number is EVEN");
        }
        else {
            System.out.println("Got some remainder which is " + remainder);
        }
    }
}
