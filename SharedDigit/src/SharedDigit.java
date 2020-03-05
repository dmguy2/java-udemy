public class SharedDigit {
    public static boolean hasSharedDigit(int numA, int numB) {
        int newNumA = numA % 10;
        int newNumB = numB % 10;
        if (newNumA == newNumB) {
            return true;
        }
        numA /= 10;
        numB /= 10;
        int newNewNumA = numA % 10;
        int newNewNumB = numB % 10;

        if (newNewNumA == newNewNumB
                || newNewNumA == newNumA
                || newNewNumB == newNumB
                || newNewNumA == newNumB
                || newNewNumB == newNumA)
        {
            return true;
        }
        return false;
    }
}
