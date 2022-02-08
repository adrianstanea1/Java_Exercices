public class MinutesToYearsDaysCalculator {
    private static final String ERROR_MESSAGE = "Invalid Value";

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println(ERROR_MESSAGE);
        } else {
            long totalDays = minutes / 60 / 24;

            long yearsValue = totalDays / 365;
            long daysValue = totalDays%365;

            System.out.println(minutes + " min = " + yearsValue + " y and " + daysValue + " d");
        }
    }
}
