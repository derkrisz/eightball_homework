import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEightBall {
    EightBall eightBall;

    @Before
    public void before() {
        eightBall = new EightBall();
    }

    @Test
    public void hasThreeEntries() {
        assertEquals(3, eightBall.getWordCount());
    }

    @Test
    public void canAddEntry() {
        eightBall.addEntry("Leave me be.");
        assertEquals(4, eightBall.getWordCount());
    }
}