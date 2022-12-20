import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.tournament.*;

public class TestGame {

    Game game = new Game();
    Player player1 = new Player("Zyhka", 10);
    Player player2 = new Player("Oblakova", 15);
    Player player3 = new Player("Agnec", 1);
    Player player4 = new Player("Nagibator228", 1);

    @BeforeEach
    @Test
    public void register() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
    }

    @Test
    public void TestWinPlayer1() {
        Assertions.assertEquals(1, game.round("Oblakova", "Agnec"));
    }

    @Test
    public void TestWinPlayer2() {
        Assertions.assertEquals(2, game.round("Nagibator228", "Zyhka"));
    }

    @Test
    public void TestDraw() {
        Assertions.assertEquals(0, game.round("Nagibator228", "Agnec"));
    }

    @Test
    public void TestNoRegistered1() {
        Assertions.assertThrows(NoRegisteredException.class, () -> game.round("sss", "Agnec"));
    }

    @Test
    public void TestNoRegistered2() {
        Assertions.assertThrows(NoRegisteredException.class, () -> game.round("Zyhka", "qwerty"));
    }

}
