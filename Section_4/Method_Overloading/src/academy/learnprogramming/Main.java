package academy.learnprogramming;

import java.sql.Time;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int newScore = calculateStorage("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateStorage(300);
        calculateStorage();

//        testing challenge
        double firstVal = calcFeetAndInchesToCentimeters(6,4);



    }






    //    Method overloading ; same signature which is the name of the function but different
    //    definitions based on the number of arguments
    public static int calculateStorage(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateStorage(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static void calculateStorage() {
        System.out.println("No player name, no player score");
    }

//    CHALLENGE
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet<0) return -1;  // valid feet
        if(inches<0 || inches > 12) return -1; //in range for inches

        double inchToCm = 2.54;
        double feetToCm = 30.48;
        double convertedToCm = feet*feetToCm + inches*inchToCm;

        System.out.println(feet + " feet and " + inches +  " inches is = " + convertedToCm + " cm.");

        return convertedToCm;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<0) return -1;

        double numOfFeet = inches/12;
        double remainingInches = inches-numOfFeet*12;

        return  calcFeetAndInchesToCentimeters(numOfFeet, remainingInches);
    }
}
