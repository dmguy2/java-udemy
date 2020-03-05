public class LastDigitChecker {


    public static boolean hasSameLastDigit(int a, int b, int c) {


        if (!isValid(a)) {
            return false;
        }
        if (!isValid(b)) {
            return false;
        }
        if (!isValid(c)) {
            return false;
        }


        if ((a % 10) == (b % 10) || (a % 10) == (c % 10) || (b % 10) == (c % 10)) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int test) {
        if (test >= 10 && test <= 1000) {
            return true;
        }
        return false;
    }


}
