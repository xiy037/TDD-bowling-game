import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RoundTest {

  @Test
  public void should_return_ten_plus_next_two_throws_score_when_throwing_bowling_given_stike_in_the_round() {
    //given
    Round thisRound = new Round(10);
    int nextHit1 = 5;
    int nextHit2 = 6;

    //when
    int totalScore = thisRound.calculateScore(nextHit1, nextHit2);

    //then
    assertEquals(21, totalScore);
  }
}
