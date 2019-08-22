public class Main {
    public static void main(String[] args) {

        getDurationString(60,50);
        getDurationString(-1);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("Invalid value");
            return "";
        }

        int totalMins = minutes + (seconds / 60);
        int hours = totalMins / 60;
        int remainingMins = totalMins % 60;
        String theTime = minutes + " mins and " +
                        seconds + " secs = " +
                        hours + "h " +
                        remainingMins + "m " +
                        seconds + "s";
        System.out.println(theTime);
        return theTime;
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0){
            System.out.println("Invalid value");
            return "";
        }

        int mins = seconds / 60;
        int remainingSecs = seconds % 60;
        String minsAndSecs = seconds + "s = " + mins + "m " + remainingSecs + "s.";
        System.out.println(minsAndSecs);
        return getDurationString(mins, remainingSecs);
    }


}
