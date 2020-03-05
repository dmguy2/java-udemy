public class FirstAndLastSum {
    public static int findSum (int number){
        if (number < 0){
            return -1;
        }
        int howLong = 0;
        int newNumber = number;
        int numberLength = 0;
        int firstDigit = 0;
        int lastDigit = 0;
        int sum = 0;
        while (newNumber > 0){
            newNumber = newNumber / 10;
            numberLength++;
        }
        // number length found
        lastDigit = number % 10;
        //lastDigitFound
        firstDigit = number / ((int) (Math.pow(10, (numberLength - 1))));
        //firstDigitFound
        return firstDigit + lastDigit;
    }
}
