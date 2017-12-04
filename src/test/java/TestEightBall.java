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
    public void hasThreeAnswers() {
        assertEquals(3, eightBall.getAnswerCount());
    }

    @Test
    public void canAddAnswer() {
        eightBall.addAnswer("Leave me be.");
        assertEquals(4, eightBall.getAnswerCount());
    }

    @Test
    public void canRemoveAnswer() {
        eightBall.removeAnswer("Piss off.");
        assertEquals(2, eightBall.getAnswerCount());
    }
}