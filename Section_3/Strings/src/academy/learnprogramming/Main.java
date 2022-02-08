package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        byte
//        short
//        int
//        long
//        float
//        double
//        char
//        boolean

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ". and this is more.";
        System.out.println("myString is equal to " + myString);

        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; //convert int to String and then append it
        System.out.println("Last string is equal to " + lastString);

        double doubleNumber = 120.5;
        lastString += doubleNumber;
        System.out.println("Last string is equal to " + lastString);


//        CONDITIONAL LOGIC

        boolean isAlien = true;
        if(!isAlien) {
            System.out.println("It is not an alien!");
        } else {
            System.out.println("It IS an alien!");
        }

        int topScore = 80 ;
        if(topScore != 100) {
            System.out.println("You did NOT got the highest score");
        }

        int secondTopScore = 60;

        if(topScore>secondTopScore && topScore<100){
            System.out.println("Greater than second top score and less than 100");
        }

        int newValue = 50;
        if(newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;

        if(isCar) {
            System.out.println("this is actually a car");
        }

        boolean wasCar = isCar? true:false;
        if(wasCar) {
            System.out.println("wasCar is true");
        }
    }

}
