public class SumOdd {
    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 != 0) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        if (start > end || start < 0 || end < 1){
            return -1;
        }
        int sum = 0;
        for (int i = start; start <= end; start++){
            if (isOdd(start) == true){
                sum = sum + start;
            }
        }
        return sum;
    }


}



