public class DigitSumChallenge {
    public static int SumDigits(int number) {
//        if (number < 0) {
//            return -1;
//        }
//        int multiplier = 10;
//        int counter = 0;
//        int sum = 0;
//        int passer = 0;
//        number = number * multiplier;
//
//        while (number / multiplier > 1) {
//            multiplier = multiplier * 10;
//        }
//
//        while (multiplier > 9) {
//
//            passer = (number / multiplier);
//            sum = sum + passer;
//            number = number - (passer * multiplier);
//            multiplier = multiplier / 10;
//
//        }
//        return sum;

 // 125 -- > 125 / 10 = 120; 125 - 120 = 5

        int digit = 0;
        int sum = 0;

while(digit > 9){

digit = number / 10;
 sum = sum + (number - digit);
number /= 10;
}
return sum;

//never finished this solution ^
        //                     |





  }


}
