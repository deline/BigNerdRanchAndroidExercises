package delineneo.com.geoquiz;

/**
 * Created by deline on 31/08/2016.
 */
public class Question {

    private int textResourceId;
    private boolean answerCorrect;

    public Question(int textResourceId, boolean answerCorrect) {
        this.textResourceId = textResourceId;
        this.answerCorrect = answerCorrect;
    }

    public int getTextResourceId() {
        return textResourceId;
    }

    public void setTextResourceId(int textResourceId) {
        this.textResourceId = textResourceId;
    }

    public boolean isAnswerCorrect() {
        return answerCorrect;
    }

    public void setAnswerCorrect(boolean answerCorrect) {
        this.answerCorrect = answerCorrect;
    }
}
