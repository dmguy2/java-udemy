public class EvenDigitSum {
    public static int evenDigitSum(int number) {
        if (number < 0){
            return -1;
        }
        int newNumber = 0;
        int sum = 0;

        while (number > 0) {
            newNumber = number % 10;
            number /= 10;

            if (newNumber % 2 == 0) {
                sum = sum + newNumber;
            }
        }
        return sum;
    }
}
