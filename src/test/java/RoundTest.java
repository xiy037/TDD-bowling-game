import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RoundTest {

  @Test
  public void should_return_ten_plus_next_two_hits_score_when_throwing_bowling_given_stike_in_the_round() {
    //given
    Round thisRound = new Round(10);
    int nextHit1 = 5;
    int nextHit2 = 6;

    //when
    int totalScore = thisRound.calculateScoreWhenStrike(nextHit1, nextHit2);

    //then
    assertEquals(21, totalScore);
  }

  @Test
  public void should_return_then_plus_next_one_hit_when_throwing_bowling_given_spare_in_this_round() {
    //given
    Round thisRound = new Round(6, 4);
    int nextHit = 8;

    //when
    int totalScore = thisRound.calculateScoreWhenSpare(nextHit);

    //then
    assertEquals(18, totalScore);
  }
}
