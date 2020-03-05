public class LargestPrimeFactor {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int primeNumBasket = 0;
        for (int questionFactor = 2; questionFactor <= number; questionFactor++) {
            System.out.println("Number is " + number);
            System.out.println("Is question factor " + questionFactor + " a factor of number");
            if (number % questionFactor == 0) {
                for (int primeChecker = 2; primeChecker <= questionFactor; primeChecker++) {
                    if (questionFactor == primeChecker) {
                        primeNumBasket = questionFactor;
                        break;
                    }
                    if (questionFactor % primeChecker == 0) {
                        break;
                    }
                }
            }
        }
        return primeNumBasket;
    }
}
