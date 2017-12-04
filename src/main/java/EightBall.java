import java.util.ArrayList;

public class EightBall {
    ArrayList<String> answers;

    public EightBall() {
        this.answers = new ArrayList<>();
        answers.add("None of your business.");
        answers.add("Piss off.");
        answers.add("You suck.");
    }

    public int getWordCount() {
        return this.answers.size();
    }


    public void addEntry(String answer) {
        this.answers.add(answer);
    }
}
