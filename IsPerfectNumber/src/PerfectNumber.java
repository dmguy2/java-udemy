public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        for (int i = 1; i < number && i > 0; i++) {
            if (number % i == 0) {
                sum = sum + i;
                if (sum == number) {
                    return true;
                }
            }
        }
        return false;
    }
}

