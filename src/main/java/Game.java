import lombok.Data;

import java.util.ArrayList;

@Data
public class Game {
  private int[][] countsArray;
  private ArrayList<Round> rounds = new ArrayList<>();

  public Game(int[][] countsArr) {
    this.countsArray = countsArr;
  }

  public int calculateTotalScore() {
    int sum = 0;
    for (int[] roundCounts : this.countsArray) {
      if (roundCounts.length == 2) {
        Round thisRound = new Round(roundCounts[0], roundCounts[0]);
        if (thisRound.getFirstHit() + thisRound.getSecondHit() < 10) {
          sum += thisRound.calculateNormalScore();
        }
      }
    }
    return sum;
  }
}
