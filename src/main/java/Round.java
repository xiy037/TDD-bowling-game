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

  public int calculateScore(int nextHit1, int nextHit2) {
    int result = 0;
    if (this.firstHit == 10) {
      result = this.firstHit + nextHit1 + nextHit2;
    }
    return result;
  }
}
