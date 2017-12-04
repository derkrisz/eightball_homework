import java.util.ArrayList;

public class EightBall {
    ArrayList<String> answers;

    public EightBall() {
        this.answers = new ArrayList<>();
    }

    public int getWordCount() {
        return this.answers.size();
    }
}
