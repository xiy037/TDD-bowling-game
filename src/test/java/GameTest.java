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

  @Test
  void should_return_sum_of_fallen_balls_when_no_spare_or_strike_occurs() {
    //given
    int[][] countsArray = {{0,8}, {5,3}, {4,2}, {3,4}, {5,0}, {5,1}, {5,2}, {6,2}, {7,2}, {7,1}};
    Game game = new Game(countsArray);

    //when
    int totalScore = game.calculateTotalScore();

    //then
    assertEquals(72, totalScore);
  }

  @Test
  void should_return_all_fallen_balls_count_plus_extra_one_hit_after_spare_when_spare_occurs() {
    //given
    int[][] countsArray = {{0,8}, {5,3}, {4,2}, {3,4}, {5,5}, {5,1}, {5,2}, {6,2}, {7,2}, {7,1}};
    Game game = new Game(countsArray);

    //when
    int totalScore = game.calculateTotalScore();

    //then
    assertEquals(82, totalScore);
  }


  @Test
  void should_return_all_fallen_balls_count_plus_extra_two_hits_after_strike_when_strike_occurs() {
    //given
    int[][] countsArray = {{0,8}, {5,3}, {4,2}, {3,4}, {10}, {5,1}, {5,2}, {6,2}, {7,2}, {7,1}};
    Game game = new Game(countsArray);

    //when
    int totalScore = game.calculateTotalScore();

    //then
    assertEquals(83, totalScore);
  }

}
