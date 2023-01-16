import java.util.ArrayList;
import java.util.List;

public class QARep {

    private final List<Question> questions;
    private final List<Answer> answers;


    public QARep() {
        questions = new ArrayList<>();
        answers = new ArrayList<>();

    }

    public Question getStart(){
        return questions.get(0);
    }
}
