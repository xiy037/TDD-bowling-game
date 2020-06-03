import lombok.Data;

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
      } else if (countsArray[i].length == 1){
        Round thisRound = new Round(countsArray[i][0]);
        if (countsArray[i+1].length == 1) {
          sum += thisRound.calculateScoreWhenStrike(countsArray[i+1][0], countsArray[i+2][0]);
        } else {
          sum += thisRound.calculateScoreWhenStrike(countsArray[i+1][0], countsArray[i+1][1]);
        }
      } else {
        Round thisRound = new Round(countsArray[i][0], countsArray[i][1]);
        sum += thisRound.calculateNormalScore() + countsArray[i][2];
      }
    }
    return sum;
  }
}
