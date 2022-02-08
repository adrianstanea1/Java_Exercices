public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        int firstNum = (int)(first*1000);
        int secondNum = (int)(second*1000);

        return firstNum == secondNum;
    }
}
