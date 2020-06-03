import lombok.Data;

@Data
public class Round {
  private int firstHit;
  private int secondHit;

  public Round(int a) {
    this.firstHit = a;
  }

  public Round(int a, int b) {
   this.firstHit = a;
   this.secondHit = b;
  }

  public int calculateScoreWhenStrike(int nextHit1, int nextHit2) {
     return this.firstHit + nextHit1 + nextHit2;
  }

  public int calculateScoreWhenSpare(int nextHit) {
    return this.firstHit + this.secondHit + nextHit;
  }

  public int calculateNormalScore() {
    return this.firstHit + this.secondHit;
  }
}
