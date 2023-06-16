package dsa.algoexpert.hashing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class P005TournamentWinnerTest {

  private final P005TournamentWinner obj = new P005TournamentWinner();

  @Test
  void testCase1() {
    String[][] competitions = {
      {"HTML", "Java"},
      {"Java", "Python"},
      {"Python", "HTML"},
      {"C#", "Python"},
      {"Java", "C#"},
      {"C#", "HTML"},
      {"SQL", "C#"},
      {"HTML", "SQL"},
      {"SQL", "Python"},
      {"SQL", "Java"}
    };
    Integer[] results = {0, 1, 1, 1, 0, 1, 0, 1, 1, 0};
    assertEquals(
        "C#",
        obj.tournamentWinner(
            Arrays.asList(competitions).stream()
                .map(array -> Arrays.asList(array))
                .collect(Collectors.toList()),
            Arrays.asList(results)));
  }
}
