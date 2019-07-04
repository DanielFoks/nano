import com.poh.game.SinglePlayerGame;
import com.poh.playObjects.NumberSquare;
import org.junit.Assert;
import org.junit.Test;


public class AlgorithmTest {

    @Test
    public void firstTest(){
        Assert.assertEquals(NumberSquare.builder().value(1).build(), NumberSquare.builder().value(1).build());
    }

    @Test
    public void gameTest(){
        SinglePlayerGame singlePlayerGame = new SinglePlayerGame();
        singlePlayerGame.play();
        Assert.assertEquals(1, 1);
    }
}
