import lombok.Data;

import java.util.ArrayList;

@Data
public class Game {
  private int[][] countsArray;

  public Game(int[][] countsArr) {
    this.countsArray = countsArr;
  }

  public int calculateTotalScore() {
    int sum = 0;
    for (int i = 0; i < countsArray.length; i++) {
      if (countsArray[i].length == 2) {
        Round thisRound = new Round(countsArray[i][0], countsArray[i][1]);
        if (thisRound.getFirstHit() + thisRound.getSecondHit() < 10) {
          sum += thisRound.calculateNormalScore();
        } else {
          sum += thisRound.calculateScoreWhenSpare(countsArray[i+1][0]);
        }
      }
    }
    return sum;
  }
}
