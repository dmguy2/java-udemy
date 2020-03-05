public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double A, double B) {
        if (Math.abs(A - B) > .0009) {
            return false;
        }
        return true;
    }
}