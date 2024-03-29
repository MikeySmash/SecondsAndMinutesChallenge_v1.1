public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {

        System.out.println(getDurationString(610, 4));
        System.out.println( getDurationString(3600));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {

            return INVALID_VALUE_MESSAGE;
        }

        int totalMins = minutes + (seconds / 60);
        int hours = totalMins / 60;
        int remainingMins = totalMins % 60;

        String hoursString = hours + "h";

        if (hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMins + "m";

        if (remainingMins < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";

        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        String theTime =
                hoursString + " " +
                minutesString + " " +
                secondsString;
        return theTime;
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int mins = seconds / 60;
        int remainingSecs = seconds % 60;

        return getDurationString(mins, remainingSecs);
    }


}
