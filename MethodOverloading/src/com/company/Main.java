package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(202));
    }
//	int newScore = calculateScore("Tim", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);
//        calculateScore();
//    }
//
//    public static int calculateScore(String playerName, int score){
//        System.out.println("Player " + playerName + " scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore( int score){
//        System.out.println("Unnamed player scored " + score + " points");
//        return score * 1000;
//    }
//    public static int calculateScore(){
//        System.out.println("No player name, no player score");
//        return 0;
//    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches)
    {
        if ((feet < 0) || inches < 0 || inches > 12){
            return -1;
        }
        double centimeters = ((inches * 2.54) + (feet * 30.48));
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters (double inches){
        if (inches < 0){
            return -1;
        }
        double feet = (inches / 12);
        inches = Math.round(((feet - (int)(feet)) * 12) * 100) / 100;
        System.out.println(inches + "\n");
        feet = (int)(feet);
        System.out.println(feet + "\n");
        return calcFeetAndInchesToCentimeters(feet, inches);
    }

}
