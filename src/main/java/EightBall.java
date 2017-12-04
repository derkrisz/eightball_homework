import java.util.ArrayList;
import java.util.Collections;

public class EightBall {
    ArrayList<String> answers;

    public EightBall() {
        this.answers = new ArrayList<>();
        answers.add("None of your business.");
        answers.add("Piss off.");
        answers.add("You suck.");
    }

    public int getAnswerCount() {
        return this.answers.size();
    }


    public void addAnswer(String answer) {
        this.answers.add(answer);
    }

    public void removeAnswer(String answer) {
        this.answers.remove(answer);
    }

    public String firstAnswer() {
        return answers.get(0);
    }

    public String shuffleAnswers() {
        Collections.shuffle(answers);
         return answers.get(0);
    }
}
