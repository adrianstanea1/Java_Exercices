public class Main {

    public static void main(String[] args) {
        long result = SpeedConverter.toMilesPerHour(10.5);

        System.out.println(result);
        SpeedConverter.printConversion(10.5);

        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }
}
