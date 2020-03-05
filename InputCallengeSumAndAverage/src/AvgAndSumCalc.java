import java.util.Scanner;

public class AvgAndSumCalc {
    public static void inputThenPrintSumAndAverage() {
        int sum      = 0;
        int average  = 0;
        int number   = 0;
        int i           = 0;
        System.out.println("Use this calc to find sum and average of a set of numbers. Enter 'r' to run the calculator\nEnter Numbers Here:");
        Scanner input = new Scanner(System.in);
        do {
            i ++;
            number = input.nextInt();
            sum += number;
            average = sum / i;
        }
        while (input.hasNextInt());
        System.out.println("SUM = " + sum + "\n" + "AVG = " + average);
        input.close();

    }
}
