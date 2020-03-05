public class NumberPalindrome {
    public static boolean isPalindrome(int number){
     number = Math.abs(number);
     int newNum = number;
     int lastDigit = 0;
     int reverse = 0;


     while (newNum >= 1){
         lastDigit = newNum % 10;
         reverse = (reverse + lastDigit) * 10;
         newNum /= 10;
     }
        return reverse == (number * 10);
    }
}
//    Find the the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse.
//
//        If both are the the same then the number is a palindrome otherwise it is not.
//
//        Tip: Logic to reverse a number
//
//        Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
//
//        Extract the last digit of the given number by performing the modulo division (remainder).
//        Store the last digit to some variable say lastDigit = num % 10.
//        Increase the place value of reverse by one.
//        To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
//        Add lastDigit to reverse.
//        Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10.
//        Repeat steps until number is not equal to (or greater than) zero.
//
//        A while loop would be good for this coding exercise.
//
//
//        Tip: Be careful with negative numbers. They can also be palindrome numbers.
//
//        Tip: Be careful with reversing a number, you will need a parameter for comparing a reversed number with the starting number (parameter).
//
//        NOTE: The method isPalindrome needs to be defined as public static like we have been doing