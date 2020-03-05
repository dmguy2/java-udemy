public class NumberToWords {
    public static void numberToWords(int number) {
        switch (number){
            case 0:
                System.out.print("zero ");
                break;
            case 1:
                System.out.print("one ");
                break;
            case 2:
                System.out.print("two ");
                break;
            case 3:
                System.out.print("three ");
                break;
            case 4:
                System.out.print("four ");
                break;
            case 5:
                System.out.print("five ");
                break;
            case 6:
                System.out.print("six ");
                break;
            case 7:
                System.out.print("seven ");
                break;
            case 8:
                System.out.print("eight ");
                break;
            case 9:
                System.out.print("nine ");
                break;
        }
    }
    public static int getDigitCount(int number) {
        int digitCount = 0;
        for (int i = 1; number > 0; i++) {
            number /= 10;
            digitCount = i;
        }
        return digitCount;
    }
    public static void reverse(int number) {
        if (number <= 0) {
            System.out.println("Invalid Value");
        } else {
            int newNumber = 0;
            for (int i = getDigitCount(number); i > 0; i--) {
                newNumber = number / (int) (Math.pow(10, i - 1));
                numberToWords(newNumber);
                number = number - ((int) (Math.pow(10, i - 1)) * newNumber);
            }
        }
    }
}
