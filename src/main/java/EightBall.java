import java.util.ArrayList;

public class EightBall {
    ArrayList<String> answers;

    public EightBall() {
        this.answers = new ArrayList<>();
        answers.add("blah");
        answers.add("blah2");
        answers.add("blah3");
    }

    public int getWordCount() {
        return this.answers.size();
    }
}
