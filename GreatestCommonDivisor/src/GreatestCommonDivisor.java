public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int greatestCommonFactor = Math.abs(first - second);
        while (greatestCommonFactor > 1) {
            if (((first % greatestCommonFactor) == 0) && ((second % greatestCommonFactor) == 0)) {
                return greatestCommonFactor;
            }
            greatestCommonFactor--;
        }
        return -1;
    }

}

