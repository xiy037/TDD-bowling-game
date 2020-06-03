import lombok.Data;

@Data
public class Round {
  private int firstHit;
  private int secondHit;
  private int roundScore;

  public Round(int a) {
    this.firstHit = a;
  }

  public Round(int a, int b) {
   this.firstHit = a;
   this.secondHit = b;
  }

  public int calculateScoreWhenStrike(int nextHit1, int nextHit2) {
     this.roundScore = this.firstHit + nextHit1 + nextHit2;
     return roundScore;
  }

  public int calculateScoreWhenSpare(int nextHit) {
    this.roundScore = this.firstHit + this.secondHit + nextHit;
    return roundScore;
  }

  public int calculateNormalScore() {
    this.roundScore = this.firstHit + this.secondHit;
    return roundScore;
  }
}
