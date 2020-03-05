public class largestPrime {
    public static int getLargestPrime(int number) {
        int primeCarrier = 1;
        if (number < 1) {
            return -1;
        }
        for (int questionNumber = 3; questionNumber < number; questionNumber++) {
            System.out.println("Question Number is " + questionNumber);


            for (int testPrime = 2; testPrime <= questionNumber; testPrime++) {
                System.out.println("testing... " + testPrime);

                if (testPrime == questionNumber) {
                    primeCarrier = questionNumber;
                    System.out.println("Current Highest Prime is " + primeCarrier);
                    break;
                }
                if (questionNumber % testPrime == 0) {
                    System.out.println("questionNumber: " + questionNumber + " divides by testPrime: " + testPrime + " evenly so lets stop here.");
                    break;
                }

            }
        }

        return primeCarrier;
    }


}
