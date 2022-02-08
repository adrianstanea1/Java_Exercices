package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        checkNumber(-2);
    }

    public static void checkNumber(int number) {
        if(number > 0 ) {
            System.out.println("positive");
        }
        if(number<0) {
            System.out.println("negative");
        }
        if(number==0) {
            System.out.println("equal to 0");
        }
    }



}
