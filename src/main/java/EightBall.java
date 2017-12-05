import java.util.ArrayList;
import java.util.Collections;

public class EightBall {        //class declaration (like class Eightball in ruby)
   private ArrayList<String> answers; //declaring a variable of type ArrayList (like @answers in ruby)

    public EightBall() {
        this.answers = new ArrayList<>();
        answers.add("None of your business."); //constructor. this method gets called when we use 'new'
        answers.add("Piss off.");               //like ruby initialize
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
