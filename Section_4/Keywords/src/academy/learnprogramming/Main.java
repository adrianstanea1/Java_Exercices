package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was: " + highScore);

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was: " + highScore);
        displayHighScorePosition("Mark", 1500);
        displayHighScorePosition("Mark", 900);
        displayHighScorePosition("Mark", 400);
        displayHighScorePosition("Mark", 50);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1e3;
            return finalScore;
        }

        return -1;
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void displayHighScorePosition(String playerName, int highScore) {
        System.out.println(playerName + " managed to get into position: " + calculateHighScorePosition(highScore));
    }
}
