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
    public void hasNoEntries() {
        assertEquals(0, eightBall.getWordCount());
    }
}
