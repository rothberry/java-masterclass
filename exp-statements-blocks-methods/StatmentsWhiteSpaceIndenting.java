/**
 * StatmentsWhiteSpaceIndenting
 */
public class StatmentsWhiteSpaceIndenting {

  public static void main(String[] args) {
    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;
    calcScore(gameOver, score, levelCompleted, bonus);

    score = 10000;
    levelCompleted = 8;
    bonus = 2000;
    calcScore(gameOver, score, levelCompleted, bonus);

    int highScorePosition = calcHighScorePosition(1500);
    displayHighScorePosition("phil", highScorePosition);

    highScorePosition = calcHighScorePosition(900);
    displayHighScorePosition("bill", highScorePosition);

    highScorePosition = calcHighScorePosition(400);
    displayHighScorePosition("jill", highScorePosition);

  }

  public static int calcScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    if (gameOver) {
      int finalScore = score + (levelCompleted + bonus);
      finalScore += 2000;
      System.out.println("Your score is: " + finalScore);
      return finalScore;
    }
    return -1;
  }

  public static void displayHighScorePosition(String playerName, int position) {
    System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
  }

  public static int calcHighScorePosition(int playerScore) {
    if (playerScore >= 1000) {
      return 1;
    } else if (playerScore >= 500) {
      return 2;
    } else if (playerScore >= 100) {
      return 3;
    }
    return 4;
  }
}