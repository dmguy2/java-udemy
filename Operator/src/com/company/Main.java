package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;
        System.out.println("\n2 * 10 = " + result);

        result = result / 5;
        System.out.println("\n20 / 5 = " + result);

        result = result % 3;
        System.out.println("\n4 % 3 = " + result);

        //result = result + 1;
        result++; //1 + 1 = 2
        System.out.println("\n1 + 1 = " + result);

        //result = result - 1;
        result--; //2 - 1 = 1
        System.out.println("\n2 - 1 = " + result);

        // result = result + 2
        result += 2; // 1 + 2 = 3
        System.out.println("\n1 + 2 = " + result);

        // result = result * 3
        result *= 10; //3 * 10 = 30
        System.out.println("\n3 * 10 = " + result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("\n30 / 3 = " + result);

        // result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println("\n10 - 2 = " + result);


        // if statements
        boolean isAlien = false;
        if (isAlien == false)
        {
            System.out.println("\nIt is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        // if statements and operators continued
        int topScore = 80;
        if (topScore >= 100)
        {
            System.out.println("You got the high score");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100)
        {
            System.out.println("The top score is greater than second top score and less than 100");
        }
        if ((topScore > 90) || (secondTopScore <= 90))
        {
            System.out.println("Either of both of the conditions are true");
        }

// video 37...operator clarification
        int newValue = 50;
        if (newValue == 50)
        {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar)
        {
            System.out.println("This is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;
        if (wasCar)
        {
            System.out.println("wasCar is true");
        }
// Operator Challenge Lesson 39
        System.out.println("- - - - - - - Operator Challenge Lesson 39 - - - - - - -");
        double FirstDoubleVariable = 20d;
        double SecondDoubleVariable = 80d;
        System.out.println("\nFirstDoubleVariable = " + FirstDoubleVariable);
        System.out.println("\nSecondDoubleVariable = " + SecondDoubleVariable);

        double sumProduct = ((FirstDoubleVariable + SecondDoubleVariable) * 100d);
        System.out.println("\nSum Product of these doubles = " + sumProduct);

        double modSumProduct = (sumProduct % 40d);
        System.out.println("\nWhen we % " + sumProduct + " by 40 we get " + modSumProduct);

        boolean checkRemainder = (modSumProduct == 0) ? true : false;
        System.out.println("Running an if zero test on the modulus operator, well get\na true or false output listed here: " + checkRemainder);

        if (checkRemainder == false)
        {
            System.out.println("\nWoah there! We got some remainder!");
        }

    }
}
