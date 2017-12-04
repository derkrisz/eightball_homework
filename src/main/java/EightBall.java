import java.util.ArrayList;

public class EightBall {
    ArrayList<String> sentences;

    public EightBall() {
        this.sentences = new ArrayList<>();
    }

    public int getWordCount() {
        return this.sentences.size();
    }
}
