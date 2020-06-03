import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

  @Test
  void should_return_zero_when_neither_throw_hits_any_ball() {
    //given
    int[][] countsArray = {{0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}, {0,0}};
    Game game = new Game(countsArray);

    //when
    int totalScore = game.calculateTotalScore();

    //then
    assertEquals(0, totalScore);
  }
}
