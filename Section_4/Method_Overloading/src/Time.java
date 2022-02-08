public class Time {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static String getDurationString(int minutes, int seconds) {
        if (seconds < 0 || seconds > 59 || minutes < 0) return INVALID_VALUE_MESSAGE;

        int totalMinutes = minutes % 60;
        int totalHours = minutes / 60;

        String outputString = totalHours + "h " + totalMinutes + "m " + seconds + "s";
        if (totalHours == 1 && totalMinutes == 1) {
            outputString = "0" + totalHours + "h " + "0" + totalMinutes + "m " + seconds + "s";
        }
        return outputString;
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) return INVALID_VALUE_MESSAGE;

        int totalMinutes = seconds / 60;
        return getDurationString(totalMinutes, seconds % 60);
    }
}
