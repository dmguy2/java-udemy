public class SecondsAndMinChallenge {
    public static String getDurationString (int minutes, int seconds){
        if (minutes < 0 || seconds < 0 || seconds > 59){
            return "Invalid value";
        }
        int hours = minutes / 60;
        minutes = minutes % 60;

        String str = String.format("%02d", hours) + // String.format places placeholder zeros dictated by several parameters
                " Hours " +                         // % denotes that it's a formatting instruction
                String.format("%02d", minutes) +    // 0 is a flag which says pad with zero
                " Minutes " +                       // 2 denotes length of formatted String
                String.format("%02d", seconds) +    // d is for decimal which means next argument should be an integral value
                " Seconds ";
        return str;

    }
    public static String getDurationString (int seconds){
        if (seconds < 0){
            return "Invalid value";
        }
    int minutes = seconds / 60;
    seconds = seconds % 60;
    return getDurationString(minutes, seconds);
    }
}
