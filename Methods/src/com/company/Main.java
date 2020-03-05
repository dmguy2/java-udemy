package com.company;

public class Main {

    public static void main(String[] args) {


//        int highscore = calculateScore(true, 800, 5, 100);
//        System.out.println("Your final score was " + highscore);
//
//        calculateScore(true, 10000, 8, 200);

        int ranking = calculateHighScorePosition(1500);
        displayHighScorePosition("David Guy", ranking);

        ranking = calculateHighScorePosition(900);
        displayHighScorePosition("Penguin Man", ranking);

        ranking = calculateHighScorePosition(400);
        displayHighScorePosition("Batman", ranking);

        ranking = calculateHighScorePosition(50);
        displayHighScorePosition("Robin", ranking);


    }
//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
//            return finalScore;
//        }
//        return -1;
//    }

    public static void displayHighScorePosition (String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition +
                " on the high score table.\n");

    }
    public static int calculateHighScorePosition (int playerScore){
        if (playerScore >= 1000){
            return 1;
        }
        else if (playerScore >= 500){
            return 2;
        }
        else if (playerScore >= 100)
        {
            return 3;
        }
        return 4;
    }



}
